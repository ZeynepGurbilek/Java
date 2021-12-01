import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Enter the air temperature : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Skiing might be a good option.");
        }else if (heat <= 25){
            if (heat <= 15){
                System.out.println("You can go to cinema.");
            }
            if (heat >= 10){
                System.out.println("You can go on a picnic.");
            }

        }else {
            System.out.println("You can go swimming.");
        }





    }
}
