import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 2; i <= number; i++) {
            int counter =0;

            for (int k=1; k <= i;k++) {

                if(i % k == 0) { // not prime.
                    counter++;
                }
            }
            if(counter == 2) {
                System.out.print(i + " ");
            }
            else
                counter = 0;

        }

    }

}
