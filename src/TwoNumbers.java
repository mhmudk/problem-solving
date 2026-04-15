import java.util.Scanner;
/*

floor 10 / 3 = 3
ceil 10 / 3 = 4
round 10 / 3 = 3



 */
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberOne = sc.nextDouble();
        double numberTwo = sc.nextDouble();

        double floor =( numberOne / numberTwo) /10;
        double ceil  =( numberOne  / numberTwo )   % 10 ;

        // TODO floor will take the first  like that --->   10/3 = 3.3 ---> 3
        // TODO

        System.out.println("floor is " + floor );
        System.out.println("ceil is " + ceil );


    }
}
