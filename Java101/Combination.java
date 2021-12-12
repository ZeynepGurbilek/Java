import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int n = scann.nextInt();

        System.out.print("Enter second number : " );
        int r = scann.nextInt();

        int total = 1, sum = 1, totalextract = 1;



        for (int i = 1; i <= n; i++){
            total *= i;
        }
        for (int k = 1; k <= r; k++){
            sum *= k;
        }
        for (int s = 1; s <= (n-r); s++){
            totalextract *= s;
        }

        // Formula: C(n,r) = n! / (r! * (n-r)!)
        int comb = total/(sum*totalextract);

        if (n > r){
            System.out.print("Result : " + comb);
        } else {
            System.out.print("The second number cannot be greater than the first.");
        }

    }
}
