import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month,day;
        String horoscope = "";
        boolean isError = false;

        System.out.print("Month : ");
        month = input.nextInt();

        System.out.print("Day : ");
        day = input.nextInt();

        switch (month){
            case 1:
                if (day >= 1 && day <= 31){
                    if ( day <= 21){
                        horoscope = "capricorn";
                    }else{
                        horoscope = "aquarius";
                    }
                }else{
                    isError = true;
                }
                break;
            case 2:
                if(day >=1 && day <= 28){
                    if (day <= 19){
                        horoscope = "aquarius";
                    }else{
                        horoscope = "pisces";
                    }
                }else{
                    isError = true;
                }
                break;
            case 3:
                if(day >=1 && day<= 31){
                    if(day <= 20){
                        horoscope = "pisces";
                    }else{
                        horoscope = "aries";
                    }
                }else{
                    isError = true;
                }
                break;
            case 4:
                if(day >= 1 && day<= 30){
                    if(day <= 20){
                        horoscope = "aries";
                    }else{
                        horoscope = "taurus";
                    }
                }else{
                    isError = true;
                }
                break;
            case 5:
                if(day >=1 && day <=31){
                    if(day <=21){
                        horoscope = "taurus";
                    }else{
                        horoscope = "gemini";
                    }
                }else{
                    isError = true;
                }
                break;
            case 6:
                if(day >= 1 && day <=30){
                    if(day <= 22){
                        horoscope = "gemini";
                    }else{
                        horoscope = "cancer";
                    }
                }else{
                    isError = true;
                }
                break;
            case 7:
                if(day >= 1 && day <= 31){
                    if(day <= 22){
                        horoscope = "cancer";
                    }else{
                        horoscope = "leo";
                    }
                }else{
                    isError = true;
                }
                break;
            case 8:
                if(day >= 1 && day <= 31){
                    if(day <= 22){
                        horoscope = "leo";
                    }else{
                        horoscope = "virgo";
                    }
                }else{
                    isError = true;
                }
                break;
            case 9:
                if(day >=1 && day <= 30){
                    if(day <=22){
                        horoscope = "virgo";
                    }else{
                        horoscope = "libra";
                    }
                }else{
                    isError = true;
                }
                break;
            case 10:
                if(day >=1 && day <= 31){
                    if(day <= 22){
                        horoscope = "libra";
                    }else{
                        horoscope = "scorpio";
                    }
                }else{
                    isError = true;
                }
                break;
            case 11:
                if(day >= 1 && day <= 30){
                    if(day <= 21){
                        horoscope = "scorpio";
                    }else{
                        horoscope = "sagittarius";
                    }
                }else{
                    isError = true;
                }
                break;
            case 12:
                if(day >= 1 && day <= 31){
                    if(day <= 21){
                        horoscope = "sagittarius";
                    }else{
                        horoscope = "capricorn";
                    }
                }else{
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if(isError){
            System.out.println("Please try again considering the month/day intervals.");
        }else{
            System.out.print("Your horoscope is : " + horoscope);
        }














    }
}
