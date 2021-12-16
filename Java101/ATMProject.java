import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1500;
        String password, userName;
        int right = 3;
        int select, price;

        while(right > 0) {
            System.out.print("Username : ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Successfully logged in.");

                do {
                    System.out.println("1-Deposit money\n" +
                            "2-Withdraw money\n" +
                            "3-balance inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select the option you want to do : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Enter the amount : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Enter the amount : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                    }
                }while(select != 4);
                System.out.println("Logged out.");
                break;

            }else{
                right--;
                System.out.println("Wrong username or password.");
                switch (right){
                    case 0:
                        System.out.println("Your account has been blocked. Please contact the bank.");
                        break;
                    default:
                        System.out.println("Remaining attempt: " + right);
                        break;
                }
            }
        }
    }
}








