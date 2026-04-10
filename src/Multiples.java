import java.util.Scanner;

public class Multiples {
    public static  void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long n1  = sc.nextLong() ;
        long n2  = sc.nextLong() ;

        if(n1 % n2 ==0  || n2 % n1 ==0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }

    }
}
