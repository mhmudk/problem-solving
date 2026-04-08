import java.util.Scanner;

public class SummationNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  = sc.nextLong();
        long law = ((n*n)  + n ) / 2 ;
        System.out.println(law);
    }
}
