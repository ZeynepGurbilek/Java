import java.util.Scanner;
public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number will you enter :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter 0 as a divisor.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Base :");
        int base = scan.nextInt();
        System.out.print("Exponent :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void modulus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        System.out.print("Mod : ");
        int m = scan.nextInt();
        int result = n % m;
        if(n < m){
            System.out.print("Result : " + n);
        }else{
            System.out.println("Result : " + result);
        }

    }

    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("a : ");
        int a = scan.nextInt();
        System.out.print("b : ");
        int b = scan.nextInt();
        int area = a*b;
        int perimeter = 2*(a + b);

        if (a<=0 && b<=0) {
            System.out.println("Invalid value.");
        }else if (a==b) {
            System.out.println("It's a square.");
        }else {
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Plus\n"
                + "2- Minus\n"
                + "3- Multiply\n"
                + "4- Divide\n"
                + "5- Exponentiate\n"
                + "6- Factorial\n"
                + "7- Mod\n"
                + "8- Perimeter and area of rectangle\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Select :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid value, please try again.");
            }
        } while (select != 0);


    }
}