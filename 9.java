import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(in)); //Scanner

        int T = Integer.parseInt(br.readLine());
        br.close();
        int sum = 0;

        for (int i = 1; i <= T; i++)
            sum += i;

        System.out.println(sum);
      
/*
        Scanner sc = new Scanner(in);
        int t = sc.nextInt();
        sc.close();
        int sum=0;

        for(int i =1; i<=t ; i++) {
            sum += i;
        }
        System.out.println(sum);
*/
    }
}
