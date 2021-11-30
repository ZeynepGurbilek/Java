import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int distance;
        double total,startfee = 10;

        System.out.print("Enter the distance in km : ");
        distance = input.nextInt();

        total = ((distance*2.20) + startfee);

        boolean condition = total < 20;
        String result = (condition) ? "Total : 20 TL" :  "Total : " + total +"TL";
        System.out.println(result);
    }
}
