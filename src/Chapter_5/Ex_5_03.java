package Chapter_5;

/**
 * Created by Toxa on 29.04.2015.
 */

import java.util.Scanner;

public class Ex_5_03 {
    public static void main(String[] args) {
        //Stvorjyem Scanner i vvodumo zna4ennja
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        //Ymova vuvody riznuh povidomlenj na ekran
        if (isPalindrome(number, reverse(number))){
            System.out.println("The number " + number + " is Palindrome.");
        } else {
            System.out.println("The reverse number of " + number + " is " + reverse(number));
        }
    }
    //Metod perevertaje 4uslo dogoru nogamu
    public static int reverse(int number){
        //Dlja vnesennja v pamjatj perevernytogo 4usla vukorustalu String
        String rev = "";
        while (number > 0){
            rev += number % 10;
            number /= 10;
        }
        //Peretvorulu String na Integer
        int reverseNumber = Integer.parseInt(rev);
        return reverseNumber;
    }
    //Metod perevirjaje 4u 4usla ne odnakovi
    //Boolean povertaje lushe true abo false
    public static boolean isPalindrome(int number, int reverseNumber){
        if (reverseNumber == number){
            return true;
        } else {
            return false;
        }
    }
}
