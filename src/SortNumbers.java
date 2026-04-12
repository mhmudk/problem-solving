import java.util.Scanner;

public class SortNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && b <= c) {
            System.out.println(a + "\n" + b + "\n" + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + "\n" + c + "\n" + b);
        } else if (b <= a && a <= c) {
            System.out.println(b + "\n" + a + "\n" + c);
        } else if (b <= c && c <= a) {
            System.out.println(b + "\n" + c + "\n" + a);
        } else if (c <= a && a <= b) {
            System.out.println(c + "\n" + a + "\n" + b);
        } else {
            System.out.println(c + "\n" + b + "\n" + a);
        }

        System.out.println();

        System.out.println(a + "\n" + b + "\n" + c);
    }
}