import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }
        sc.close();
    }
}
