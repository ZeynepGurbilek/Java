import java.util.Scanner;

public class Main {

    static int minus(int n) {
        System.out.print(n + " ");
        if (n <= 0) {
            return n;
        }
        int temp = minus(n - 5) + 5;

        System.out.print(temp + " ");

        return temp;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        System.out.print("Output : ");
        minus(n);

    }

}