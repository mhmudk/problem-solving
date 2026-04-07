import java.util.Scanner;
public class BasicDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long l = sc.nextLong();
        char c = sc.next().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        System.out.print(i + "\n" + l + "\n" + c + "\n" + f + "\n" + d);

    }
}
