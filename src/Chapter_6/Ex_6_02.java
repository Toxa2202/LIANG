package Chapter_6;

/**
 * Created by Toxa on 01.05.2015.
 */

import java.util.Scanner;

public class Ex_6_02 {
    public static void main(String[] args) {
        //Vvodumo zna4ennja
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        //Stvorjyemo masuv i zanosumo tydu zna4ennja
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        //$erez cukl vuvodumo masuv na ekran v perevernytomy vogljadi
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
