import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println(1);  //윤년
        else
            System.out.println(0);  //윤년X


}
