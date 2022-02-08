import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        int count = 0;
        int b = a;
        //a=26
        while (true) {
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            //(a % 10) * 10 :10 의 자리수 -- > 6
            //((a / 10) + (a % 10)) % 10) :1 의 자리수 -- > 2 +
            count++;
            if (b == a)
                break;
        }
        System.out.println(count);
      
    }
}
