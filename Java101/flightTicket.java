import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age, distance, tripType;

        System.out.print("Your age : ");
        age = input.nextInt();
        System.out.print("Enter the distance in km : ");
        distance = input.nextInt();
        System.out.print("Enter trip type (1:one way/2:round trip) : ");
        tripType = input.nextInt();

        double totalPrice = distance * 0.10;


        if((age > 0 && distance > 0) && (tripType == 1 || tripType == 2)){

            if(age >= 65){
                totalPrice *= 0.7; 
            }else if(age >= 12 && age <= 24){
                totalPrice *= 0.9;
            }else if(age < 12){
                totalPrice *= 0.5;
            }if(tripType == 2){
                totalPrice *= 0.8*2;
            }
            System.out.print("Total : " + totalPrice + " TL");

        }else{
            System.out.print("You entered an invalid value.");
        }





    }
}
