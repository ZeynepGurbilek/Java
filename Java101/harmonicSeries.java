import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n = scann.nextInt();
        double result = 0.0;

        for (double i = 1; i <= n; i++){
            result += (1/i);

        }
        System.out.print(result);




    }
}
