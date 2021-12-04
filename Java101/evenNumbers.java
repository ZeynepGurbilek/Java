import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = input.nextInt();

        int i = 0, sum = 0, count = 0;

        while (i <= n){
            i++;
            if ( i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }
        System.out.print("Average : " + sum/count);
    }

}