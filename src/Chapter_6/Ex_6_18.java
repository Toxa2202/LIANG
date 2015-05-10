package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_18 {
    public static void main(String[] args) {
        //Dovzhuna masuvy
        final int NUMBER_OF_ELEMENTS = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten double numbers: ");
        //Vnosumo zna4ennja v masuv
        double[] mass = new double[NUMBER_OF_ELEMENTS];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = input.nextDouble();
        }
        //Peredajem na metod sortyvannja
        bubbleSort(mass);
        //Vuvodumo posortovanuj masuv
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    public static void bubbleSort(double[] mass) {
        //Vkladenuj FOR pereburaje elementu masuvy i sortyje ih 4erez bubbleSort
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                //Jaksho elem1 > elem2 = minjaem ih miscjamu
                if (mass[j] > mass[j + 1]) {
                    double tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
    }
}