import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("Enter number : ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i*=4 ){
            System.out.println("Power of 4 : "+ i);
        }
        for (int s = 1; s <= n; s*=5 ){
            if(s <= n){
                System.out.println("Power of 5 : "+ s);
            }

        }
    }

}




