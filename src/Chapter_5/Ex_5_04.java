package Chapter_5;

/**
 * Created by Toxa on 29.04.2015.
 */
import java.util.Scanner;
public class Ex_5_04 {
    public static void main(String[] args) {
        //Stvorulu Scanner i vvelu zna4ennja
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        //Vuklukalu metod reverse tupy VOID
        reverse(number);
    }
    //Metod ne povertaje zna4ennja. Vuvodutj sam perevernyte 4uslo
    public static void reverse(int num){
        String rev = "";
        int number = num;//Stvorulu she odny zminny, bo num = 0
        while(num > 0){
            rev += num % 10;
            num /= 10;
        }
        //Parsumo String v Integer
        int reverseNumber = Integer.parseInt(rev);
        //Vuvid na ekran potribnogo zna4ennja
        System.out.println("The reverse number of " + number + " is " + reverseNumber);
    }
}
