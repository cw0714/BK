import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int a, b;

        while (sc.hasNextInt()) {   //sc.hasNext / hasNextInt 아무거나 사용 가능
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a + b);
        }

    }
}
