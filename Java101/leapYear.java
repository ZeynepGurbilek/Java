import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : ");
        int leapYear = input.nextInt();

        if(leapYear % 4 == 0){
            if(leapYear % 100 == 0){
                if(leapYear % 400 == 0){
                    System.out.print(leapYear + " is a leap year.");
                }else{
                    System.out.print(leapYear + " is not a leap year");
                }
            }else{
                System.out.print(leapYear + " is a leap year.");
            }

        }else{
            System.out.print(" is not a leap year.");
        }


    }

}






