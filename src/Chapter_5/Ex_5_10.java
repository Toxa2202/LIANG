package Chapter_5;

/**
 * Created by Toxa on 30.04.2015.
 */
import java.util.Scanner;
public class Ex_5_10 {
    public static void main(String[] args) {
        //Vvodumu zna4ennja i peredajem
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some integer: ");
        int num = input.nextInt();
        int count = 0;
        int numPerLine = 10;//10 4usel v rjadky
        System.out.println("This programm find number of prime numbers less than " + num);
        //Vuvid primeNumbers. Perebir v zalezhnosti vid vvedenogo 4usla
        for (int i = 1; i < num; i++) {
            if (isPrime(i)) {//V metov vvodutjsja i
                count++;
                if (count % numPerLine == 0) {
                    System.out.print(i + "\n");//Vuvodutjsja takozh i, bo same vono pereburajetjsja na primeNum
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("The number of primes less than " + num + " is " + count);
    }
    //Metod shykaje 4u 4uslo prime. Tup BOOLEAN
    public static boolean isPrime(int num){
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
