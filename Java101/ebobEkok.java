import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n1 = scann.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scann.nextInt();
        int ebob = 1;
        int ekok = 1;
        int i = n1;
        int k = 1;

        if( n1 < n2){
            while(i >= 0){
                if(n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    System.out.println("Ebob : " + ebob);
                    break;

                }
                i--;
            }

        }else{
            while(i >= 0){
                if(n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    System.out.println("Ebob : "+ ebob);
                    break;
                }
                i--;
            }


        }

        while(k <= n1*n2){
            if(k % n1 == 0 && k % n2 == 0){
                ekok = k;
                System.out.print("Ekok : " + ekok);
                break;
            }
            k++;
        }


    }
}
