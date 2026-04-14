import java.util.Scanner;

public class TheLastTwoDigits {
    public static void main(String []args ){
        Scanner sc  = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long n3 = sc.nextLong();
        long n4 = sc.nextLong();

        long lastTwoDigits = ((n1 % 100) * (n2 % 100)) % 100;
        lastTwoDigits = (lastTwoDigits * (n3 % 100)) % 100;
        lastTwoDigits = (lastTwoDigits * (n4 % 100)) % 100;

        System.out.printf("%02d\n", lastTwoDigits);
    }
}
