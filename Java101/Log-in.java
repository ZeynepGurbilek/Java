import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String userName, password, select="",newPassword = "";


        System.out.print("Username : ");
        userName = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("Java123")){
            System.out.print("Successfully logged in ! ");
        } else {
        System.out.println("Username or password is incorrect.");
        System.out.println("Do you want to reset your password? Yes No ");
        System.out.print("Enter your choice : ");
        select = input.nextLine();

        } if (select.equals("No")){
            System.out.print("");

        } else if (select.equals("Yes")) {
            System.out.print("Your new password :");
            newPassword = input.nextLine();

            if (newPassword.equals("Java123")) {
                System.out.print("Your password cannot be the same as your old password, please try a new password instead.");

            } else {
                System.out.print("Your password has been successfully changed.");
            }

        }

    }
}
