import java.util.Scanner;

public class CapitalOrSmallOrDigit {
    public static void main(String args[]) {

        Scanner sc  = new Scanner(System.in);
        char ch  = sc.next().charAt(0);

        if(ch >= '0' && ch <='9'){
            System.out.println(
              "IS DIGIT"
            );
        }else{
            if(ch >= 'A' && ch <='Z'){
                System.out.println(
                        "ALPHA\nIS CAPITAL"
                );
            }else{
                System.out.println("ALPHA\nIS SMALL");
            }
        }


    }
}
