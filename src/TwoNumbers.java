import java.util.Scanner;
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  nO  = sc.nextDouble();
        double  nT  = sc.nextDouble();

        int floor  = (int) (nO / nT);
        System.out.println("floor " + (int)nO + " / "  +(int) nT + " = " + floor);



        double  checkModule   =  nO %  nT    ;
        int  ceil  = (int) (nO / nT) ;
        if(checkModule >0 ){
            ceil++;
        }
        System.out.println("ceil " + (int)nO + " / "  +(int) nT + " = " + ceil);

        int round  = (int) (nO / nT);
        int roundModulo = (int) (((nO / nT) * 10) % 10);
        if(roundModulo >= 5 ){
            round ++ ;
        }
        System.out.println("round " +(int) nO + " / "  +(int) nT + " = " + round);


    }
}
