import java.util.Scanner;

public class MathematicalExpression {
    public static void main(String []args ){
        Scanner sc  = new Scanner(System.in);
        long n1 = sc.nextLong();
        char s = sc.next().charAt(0);
        long n2 = sc.nextLong();
        char equal = sc.next().charAt(0);
        long n3 = sc.nextLong();

        if(s=='+'){
            if((n1+n2) == n3){
                System.out.println("Yes");
            }else{
                System.out.println(n1+n2);
            }
        }

        if(s=='-'){
            if((n1-n2) == n3){
                System.out.println("Yes");
            }else{
                System.out.println(n1-n2);
            }
        }
        if(s=='*'){
            if((n1*n2) == n3){
                System.out.println("Yes");
            }else{
                System.out.println(n1*n2);
            }
        }

    }
}
