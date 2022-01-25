import java.io.*;
import java.io.BufferedReader;
import java.util.StringTokenizer;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(in)); //Scanner
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //println

        int T = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= T; i++) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();

    }
}
