import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {  //행
            for (int j = 1; j <= i; j++) {  //열
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
