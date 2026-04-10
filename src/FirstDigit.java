import java.util.Scanner;

public class FirstDigit {
    public static void main (String args[]){
        Scanner sc =  new Scanner(System.in);
        long number  = sc.nextLong();
        if((number/1000) %2==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}
