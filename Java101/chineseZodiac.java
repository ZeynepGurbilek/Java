import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth : ");
        int birthYear = input.nextInt();
        int remainder = (birthYear % 12);
        String chineseZodiac="";

        if( birthYear >= 0){
            if (remainder == 0){
                chineseZodiac = "Monkey";
            }else if(remainder == 1){
                chineseZodiac = "Rooster";
            }else if(remainder == 2){
                chineseZodiac = "Dog";
            }else if(remainder == 3){
                chineseZodiac = "Pig";
            }else if(remainder == 4){
                chineseZodiac = "Rat";
            }else if(remainder == 5){
                chineseZodiac = "Ox";
            }else if(remainder == 6){
                chineseZodiac = "Tiger";
            }else if(remainder == 7){
                chineseZodiac = "Rabbit";
            }else if(remainder == 8){
                chineseZodiac = "Dragon";
            }else if(remainder == 9){
                chineseZodiac = "Snake";
            }else if(remainder == 10){
                chineseZodiac = "Horse";
            }else if(remainder == 11){
                chineseZodiac = "Goat";
            }
            System.out.print("Your Chinese Zodiac is : " + chineseZodiac);

        }else{
            System.out.print("İnvalid value.");
        }

        }





    }

