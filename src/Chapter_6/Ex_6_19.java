package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list: ");
        int massSize = input.nextInt();
        int[] mass = new int[massSize];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = input.nextInt();
        }
        //Vuvodutu rizni pividomlennja v zalezhnosti vid togo vidsortovanuj masuv 4u ni
        if (isSorted(mass)) {
            System.out.println("The list is already sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }
    }

    //Perevirka 4u posortovanuj masuv
    //JAKSHO 1-J ELEMENT > ZA 2-J = MASUV NE VIDSORTOVANUJ
    public static boolean isSorted(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
