package Chapter_5;

/**
 * Created by Toxa on 29.04.2015.
 */
import java.util.Scanner;

public class Ex_5_02 {
    public static void main(String[] args) {
        //Create Scanner and ask User for input an integer
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        //Vuvid result na ekran i vukluk metody ob4uslennja symu znakiv v 4usli
        System.out.println("The sum of all digits of " + number + " is " + sumDigits(number));
    }
    //Metod rozburaje 4uslo i symyje jogo digits
    public static int sumDigits(long n){
        long dig = 0;
        long sum = 0;
        //Stvorulu cukl FOR tomy sh4o ne znajem dovzhunu vvedenogo chusla
        for (long i = 20; i >= 0; i--) {
            dig = n % 10;
            n = n / 10;
            sum += dig;
        }
        //Povertajem zna4ennja na misce vukluky
        return (int)sum;
    }
}
