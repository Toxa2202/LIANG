package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_04 {
    public static void main(String[] args) {
        //Vvodumo dani i zanosumo v masuv
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: ");
        int[] mass = new int[100];
        //Zminna vuzna4aje zerednje zna4ennja elementiv masuvy
        int average = 0;
        //Zminna shykaje zna4ennja, jaki >= average
        int above = 0;
        //Zminna shykaje zna4ennja, jaki < average
        int below = 0;
        //FOR zanosutj dani v masuv, rahyje average, above i below.
        for (int i = 0; i < mass.length; i++) {
            mass[i] = input.nextInt();
            //Pri minysovomy 4usli vuhid
            if (mass[i] < 0) {
                break;
            }
            average = (mass[0] + (mass.length - 1) / 2);
            if (mass[i] >= average) {
                above++;
            } else {
                below++;
            }
        }
        System.out.println(above + " scores are above or equals the average.");
        System.out.println(below + " scores are below the average.");
    }
}
