import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 1, b, p;

        System.out.println("Enter the base : ");
        b = input.nextInt();
        System.out.println("Enter the power : ");
        p = input.nextInt();

        for (int i = 1; i <= p; i++){

                total = total*b;
        }
        System.out.println("Result : " + total);
    }

}

