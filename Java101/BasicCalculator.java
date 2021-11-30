import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        n1 = input.nextInt();
        System.out.print("Enter second number : ");
        n2 = input.nextInt();

        System.out.println("1-add\n2-subtract\n3-multiply\n4-divide");
        System.out.print("Enter your choice : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("Add : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Subtract : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Multiply : " + (n1 * n2));
                break;
            case 4:
                //if (n2 == 0){
                // System.out.print("A number cannot be divided by 0");
                // }
                // else {
                // System.out.print("Divide : " + (n1 / n2));
                // }
                // break;
                boolean condition = (n2 == 0);
                String result = condition ? "do not divide" : "divide";
                switch (result){
                    case "divide":
                        System.out.print("Divide : " + (n1 / n2));
                        break;
                    default:
                        System.out.println("A number cannot be divided by 0.");
                }
                break;

            default:
                System.out.print("You made an invalid choice.Please try again. ");
        }

    }
}
