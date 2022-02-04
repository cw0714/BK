import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int N = sc.nextInt(); //정수 입력
        int X = sc.nextInt(); //수열 입력
        int arr[] = new int[N]; //수열 저장

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] < X)
                System.out.print(arr[i]+" ");
        }


    }
}
