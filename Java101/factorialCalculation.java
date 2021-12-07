import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        /*

        System.out.print("Enter a factorial number : ");
        int n = scann.nextInt();
        int total = 1;
        for (int i=1;i <= n; i++){
            total = total * i;

        }
        System.out.println(total);

         */

        int i = 1, total = 1;
        System.out.print("Enter a factorial number : ");
        int n =scann.nextInt();

        while(i<n){
            i++;
            total = total * i;
        }
        System.out.print(n + "!" + " is equal to   "+ total);


    }
}
