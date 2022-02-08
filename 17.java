import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int a, b;

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a == 0 && b == 0)
                break;
            System.out.println(a + b);
        }

    }
}
