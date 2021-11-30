import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Define variables.
        int math, physics, chemistry, turkish, history, music;
        // Scanner class is defined.
        // Get the values from user.

        System.out.print("Math : ");
        math = input.nextInt();
        System.out.print("Physics : ");
        physics = input.nextInt();
        System.out.print("Chemistry : ");
        chemistry = input.nextInt();
        System.out.print("Turkish : ");
        turkish = input.nextInt();
        System.out.print("History : ");
        history = input.nextInt();
        System.out.print("Music : ");
        music = input.nextInt();

        int total = (math + physics + chemistry + turkish + history + music);
        double result = total/6.0;

        boolean breakpoint = result > 60;
        String decision = (breakpoint) ? "Passed" : "Failed";
        System.out.print(decision);



    }
}
