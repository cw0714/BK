import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        int b[] = new int[a];
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
            if (b[i] < min)
                min = b[i];
            if (b[i] > max)
                max = b[i];
        }
        System.out.println(min + " " + max);

    }
}
