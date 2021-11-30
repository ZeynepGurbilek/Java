import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner input =new Scanner(System.in);

        System.out.print("Enter the first side : ");
        a = input.nextInt();

        System.out.print("Enter the second side : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse :" + c);

        double perimeter = a + b + c;
        System.out.println(" Perimeter : " + perimeter);

        double u = ( a + b + c) / 2;

        double areaxarea = u * (u - a) * (u - b) * (u - c);

        double area = Math.sqrt(areaxarea);

        System.out.print("Area of the Triangle: " + area);












    }
}
