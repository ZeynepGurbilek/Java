import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);


        System.out.print("Enter a number : ");
        int n = scann.nextInt();
        int digit, result=0;

        while(n != 0){
            digit = n % 10;
            result += digit;
            n /= 10;
        }

        System.out.print(result);

    }
}
