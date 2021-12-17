import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.print("How many numbers will you enter ? ");
        int count = scann.nextInt();
        int number;
        int min = 0;
        int max = 0;

        for (int i = 1; i <= count;i++){
            System.out.print( i + ". number : ");
            number = scann.nextInt();

            if(i == 1){
                min = number;
                max = number;

            }
            if(number > max){
                max = number;

            }

            if(number < min){
                min = number;
            }

        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

    }
}
