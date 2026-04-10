import java.util.Scanner;

public class PrintMinAndMax {
    public static  void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long n1  = sc.nextLong() ;
        long n2  = sc.nextLong() ;
        long n3  = sc.nextLong() ;


        if(n1 == n2  && n2 == n3 ){
            System.out.println( n1 +" " + n2 );
        }
        if(n1 == n2  && n2 > n3){
            System.out.println( n3 +" " + n2 );
        }
        if(n1 == n3  && n3 > n2){
            System.out.println( n2 +" " + n3 );
        }
        if(n3 == n2  && n3 > n1){
            System.out.println( n1 +" " + n3 );
        }
        if(n1>n2 && n1>n3){
            if(n2>n3){
                System.out.println( n3 +" " + n1 );
            }else{
                System.out.println( n2 +" " + n1 );
            }
        }
        if(n2>n1 && n2>n3){
            if(n1>n3){
                System.out.println( n3 +" " + n2 );
            }else{
                System.out.println( n1 +" " + n2 );

            }
        }

        if(n3>n1 && n3>n2){
            if(n1>n2){
                System.out.println( n2 +" " + n3 );
            }else{
                System.out.println( n1 +" " + n3 );

            }
        }

    }
}
