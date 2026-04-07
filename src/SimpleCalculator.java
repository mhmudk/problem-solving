import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numberOne = sc.nextLong();
        long numberTwo = sc.nextLong();
        System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo) + "\n" +
                numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo) + "\n" +
                numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo) + "\n");


    }
}
