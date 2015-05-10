package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_12 {
    public static void main(String[] args) {
        //Stvorumo masuv i vvedemo zna4ennja
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        //Peredajemo poboty metody dlja stvorennja rozvernytogo masuvy
        reverse(array);
    }

    //Metod rozvertaje masuv i vuvodutj zna4ennja na ekran. Tup VOID
    public static void reverse(int[] array) {
        int[] reverse = new int[10];
        //FOR prusvojye zna4ennja masuvy v novuj v rozvernenomy vogljadi
        for (int i = 0, j = reverse.length - 1; i < array.length; i++, j--) {
            reverse[j] = array[i];
        }
        //FOR vidobrazhaje na ekrani novuj masuv
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}
