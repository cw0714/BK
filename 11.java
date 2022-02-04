import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
