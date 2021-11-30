import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double withoutVatPrice,vatAmount,withVatPrice,vatRatio = 0.18;

        Scanner input =new Scanner(System.in);
        System.out.print("Enter the amount: ");
        withoutVatPrice = input.nextDouble();

        vatAmount = (withoutVatPrice*18)/100;
        withVatPrice = vatAmount + withoutVatPrice;


        System.out.println("With Vat Price: " + withVatPrice);
        System.out.println("Amount of Vat: " + vatAmount);
        System.out.println("Vat Ratio: " + vatRatio);
        System.out.println("Without Vat Price: " + withoutVatPrice);



    }
}