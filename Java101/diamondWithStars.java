import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scann.nextInt();


        for (int i = 0; i <= n ; i++) {
        for (int j = 0; j < (n - i); j++) {
            System.out.print(" ");
        }
        for (int l = 1; l <= (2 * i + 1); l++) {
            System.out.print("*");
        }
            System.out.println(" ");
        }

        for (int i = n-1; i >= 0 ; i--) {
        for (int j = (n - i); j > 0 ; j--) {
            System.out.print(" ");
        }
        for (int l = (2 * i + 1); l >= 1; l--) {
            System.out.print("*");
        }
            System.out.println(" ");
        }

    }

}