package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] mass = new double[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(mass));
        System.out.println("The deviation is " + deviation(mass));
    }

    public static double deviation(double[] mass) {
        double deviation = 0;
        double mean = mean(mass);
        for (double data : mass) {
            deviation += (data - mean) * (data - mean);
        }
        return Math.sqrt((deviation) / (mass.length - 1));
    }

    public static double mean(double[] mass) {
        double mean = 0;
        for (double data : mass) {//ROZIBRATUSJ Z FOREACH LOOP
            mean += data;
        }
        return mean / mass.length;
    }
}
