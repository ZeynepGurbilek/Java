import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Please enter your weight in kg : ");
        weight = input.nextDouble();

        System.out.print("Please enter your height in m : ");
        height = input.nextDouble();

        bmi = (weight)/(height*height);
        System.out.print(" Your BMI : " + bmi);

    }
}
