import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int t = A * B * C;
        int result[] = new int[10];

        while (t > 0) { //
            result[t % 10]++;
            t /= 10;
        }
        for (int i = 0; i < result.length ; i++)
            System.out.println(result[i]);
    }
}
