import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int sum = 0;

        do{
            System.out.print("Enter number : ");
            n = scan.nextInt();
            if(n % 4 == 0){
                sum += n;
            }
        }while ( n % 2 == 0);


        System.out.print("Sum : " + sum);

    }
}
