import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("%.9f\n" ,(r*r) * 3.141592653 );
    }
}
