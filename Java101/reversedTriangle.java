import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        int i, l, j;

        for (i = n-1; i >= 0; i--){
            for(l = n-i; l > 0;l--){
                System.out.print(" ");
            }
            for(j = (2*i +1); j >= 1; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
