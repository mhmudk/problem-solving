import java.util.Scanner;

public class FloatOrInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        if (x == (int)x) {
            System.out.println("int " + (int)x);
        } else {
            System.out.println("float " + (int)x + " " + (x - (int)x));
        }
    }
}