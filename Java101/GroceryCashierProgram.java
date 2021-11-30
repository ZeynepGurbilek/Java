import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pear, apple, tomato,banana,eggplant,total;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of pears in kilograms : ");
        pear = input.nextDouble();
        System.out.print("Enter the amount of apples in kilograms : ");
        apple = input.nextDouble();
        System.out.print("Enter the amount of tomatoes in kilograms : ");
        tomato = input.nextDouble();
        System.out.print("Enter the amount of bananas in kilograms : ");
        banana = input.nextDouble();
        System.out.print("Enter the amount of eggplants in kilograms : ");
        eggplant = input.nextDouble();

        total = pear*2.14 + apple*3.67 + tomato*1.11 + banana*0.95 + eggplant*5.0;
        System.out.print("Total : " + total + " TL");


    }
}