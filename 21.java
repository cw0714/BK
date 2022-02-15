import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(in);
        int a[] = new int[9];
        int max = a[0];
        int max_index = 0;
        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
            if (max < a[i]) {
                max = a[i];
                max_index = i + 1;
            }

        }
        System.out.println(max + "\n" + max_index);
    }
}
