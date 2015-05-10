package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Stvorulu masuv 100 elementiv
        int[] array = new int[100];
        //Poprosulu usera vvestu 4uslo
        System.out.println("Enter the integers between 1 and 100: ");
        int num = input.nextInt();
        //WHILE shykaje povtoru 4usel i vnosutj ih v masuv. Zypunka pru vvedenni 0
        while (num != 0) {
            array[num]++;
            num = input.nextInt();
        }
        //FOR vuvodutj zna4ennja ta kiljkistj ih povtoriv na ekran. Jaksho povtoriv > 1 to time --> times
        for (int i = 0; i < 100; i++) {
            if (array[i] != 0) {
                System.out.println(i + " occurs " + array[i] + " time" + (array[i] > 1 ? "s" : ""));
            }
        }
    }
}
