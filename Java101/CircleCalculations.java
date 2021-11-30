import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14,area,perimeter;

        System.out.print("Please enter the radius of the circle : ");
        r = input.nextInt();

        perimeter = 2*pi*r;
        System.out.println("Perimeter of the Circle : " + perimeter);

        area = pi*r*r;
        System.out.print("Area of the Circle : " + area);

    }
}