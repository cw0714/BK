import java.io.*;
import java.io.BufferedReader;
import java.util.StringTokenizer;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(in)); //Scanner
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //println
        //BufferReader은 Enter로만 경계 인식 + String으로 고정
        //readLine은 리턴값을 String으로 고정되어서 다른 타입으로 받으려면 형변환해야 함
        //그래서 try&catch 해야되는데, 그냥 main옆에 throws IOException하면 됨
        /*
         * Read한 데이터는 Line 단위로만 나눠짐 -> 공백단위로 하려면
         * 1. StringTokenizer에서 nextToken()함수 쓰면 readLine()통해 입력받은 값을 공백 단위로 구분하여 순서대로 호출
         * 2. String.split()함수 활용해서 배열에 공백단위로 귾어서 데이터 넣고 사용
         * */
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());    //입력 받은 br을 공백 단위로 구분
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n"); //int로 형변환
        }
        bw.flush();
        bw.close();
        /*
         * BufferedWriter은 버퍼를 잡아놨기 때문에 flush() / close()를 반드시 호출해서 뒤처리 해야한다
         * bw.write는 \n이 없어서 따로 해주어야 함.
         * */
    }
}
