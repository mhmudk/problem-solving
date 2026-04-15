import java.util.Scanner;

public class HardCompare {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong() ;
        long b = sc.nextLong() ;
        long c = sc.nextLong() ;
        long d = sc.nextLong() ;

        double right = b*Math.log(a);
        double left = d*Math.log(c);
        if(right > left){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
