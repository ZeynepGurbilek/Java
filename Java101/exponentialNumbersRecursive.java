import java.util.Scanner;
public class Main {
    static int exponentialNumbers(int b, int e){
        if(b == 0){
            return 0;
        }else if(e == 0){
            return 1;
        }else
            return b*exponentialNumbers(b,e-1);
    }

    public static void main(String[] args) {
        int b,e;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        b=scan.nextInt();
        System.out.print("Enter the exponent: ");
        e=scan.nextInt();
        System.out.print("Result : " + exponentialNumbers(b,e));
    }
}
