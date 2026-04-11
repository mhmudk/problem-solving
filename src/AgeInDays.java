import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int yearAqu = n /365;
        int monthAqu = (n - (365 * yearAqu)) / 30;
        int dayAqu = (n - (365 * yearAqu)) % 30 ;

        System.out.println(yearAqu +" years");
        System.out.println(monthAqu +" months");
        System.out.println(dayAqu +" days");
    }
}
