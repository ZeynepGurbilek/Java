import java.util.Scanner;
public class Main {

    static boolean isPrime(int n, int i) {

        if (n == 1) {
            return false;

        }else if (n == i) {
            return true;

        }else if (n % i == 0) {
            return false;

        }
        return isPrime(n,i+1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        if(isPrime(n,2)){
            System.out.println(n + " is a prime number.");
        }
        else
            System.out.println(n + " is not a prime number.");
    }

}