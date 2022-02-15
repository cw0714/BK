import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int a[] = new int[10];
        boolean b;
        int count = 0;

        for (int i = 0; i < 10; i++)    //값 입력 후 42로 나눈 나머지 배열에 저장
            a[i] = sc.nextInt() % 42;

        for (int i = 0; i < a.length; i++) {
            b = false;
            for (int k = i + 1; k < a.length; k++) {    
                if (a[i] == a[k]) { //배열 n번지 n+1번지 비교
                    b = true;   //true = 서로 같다
                    break;
                }
            }
            if (b == false) //b값이 false일때 1증가
                count++;    
        }
        System.out.println(count);
    }
}
