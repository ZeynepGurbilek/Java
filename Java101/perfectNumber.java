import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scann.nextInt();
        int total = 0;

        for(int i = 1;i < n;i++){
            if(n % i == 0){
                total += i;
            }
        }

        if(total == n){
            System.out.print(n + " is a perfect number.");
        }else{
            System.out.print(n + " is not a perfect number.");
        }
    }
}
