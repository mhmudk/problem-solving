import java.util.Scanner;

public class Comparison {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        char s = sc.next().charAt(0);
        long b = sc.nextLong();

        if(s =='>'){
            if(a>b) {
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
            }
        }else if (s=='<'){
            if(a<b) {
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
            }
        }else if (s=='='){
            if(a==b){
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
            }
        }

    }
}
