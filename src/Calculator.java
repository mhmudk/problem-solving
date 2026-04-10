import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        char s = sc.next().charAt(0);
        long b = sc.nextLong();

    if(s =='+'){
        System.out.println(a+b);
    }else if (s =='-'){
        System.out.println(a-b);
    }else if (s=='*'){
        System.out.println(a*b);
    }else{
        System.out.println(a/b);
    }

    }
}
