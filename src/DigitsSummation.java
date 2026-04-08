import java.util.Scanner;
public class DigitsSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((sc.nextLong() % 10) + (sc.nextLong() %10));
    }
}
