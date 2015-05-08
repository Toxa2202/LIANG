package Chapter_5;

/**
 * Created by Toxa on 29.04.2015.
 */
import java.util.Scanner;

public class Ex_5_05 {
    public static void main(String[] args) {
        //VVodumo zna4ennja
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        //Peredajem vukonannja metody
        displaySortedNumbers(a, b, c);
    }
    //Metod prujmaje tru 4usla i sortyje ih v porjadky zrostannja. VOID ne povertaje zna4ennja
    public static void displaySortedNumbers(double num1, double num2, double num3){
        //Vukorustalu metod Math.max
        double max = Math.max(Math.max(num1, num2), num3);
        //Vukorustalu metod Math.min
        double min = Math.min(Math.min(num1, num2), num3);
        //Dlja vuzna4ennja serednjogo 4usla vukorustalu tsukl
        double mid = 0;
        if (num1 != min && num1 != max) {
            mid = num1;
        } else if (num2 != min && num2 != max){
            mid = num2;
        } else {
            mid = num3;
        }
        //Vuvelu na ekran
        System.out.println("Your numbers in increase order: " + min + " " + mid + " " + max);
    }
}
