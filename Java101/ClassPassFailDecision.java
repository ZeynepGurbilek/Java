import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade : ");
        math = input.nextInt();
        System.out.print("Physics Grade : ");
        physics = input.nextInt();
        System.out.print("Turkish Grade : ");
        turkish = input.nextInt();
        System.out.print("Chemistry Grade : ");
        chemistry = input.nextInt();
        System.out.print("Music Grade : ");
        music = input.nextInt();

        double avg = (math + turkish + physics + chemistry + music) / 5.0;

        if (avg <= 55){
            System.out.println("You failed the class.");

        }else{
            System.out.println("You passed the class.");

        }

        System.out.print("Your average : " + avg);


    }
}
