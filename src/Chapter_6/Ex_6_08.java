package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_08 {
    public static void main(String[] args) {
        //Stvorulu masuv. Zaneslu zna4ennja
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten values: ");
        double[] mass = new double[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = input.nextDouble();
        }
        //Vuvid rezyljtaty
        System.out.println("The average is " + average(mass));
    }

    //Obrahynok serednjogo 4usla dlja tupy INT
    public static int average(int[] mass) {
        int average = 0;
        for (int i = 0; i < mass.length; i++) {
            average += mass[i];
        }
        return average / mass.length;
    }

    //Obrahynok 4usla dlja tupy DOUBLE
    public static double average(double[] mass) {
        double average = 0;
        for (int i = 0; i < mass.length; i++) {
            average += mass[i];
        }
        return average / mass.length;
    }
}
