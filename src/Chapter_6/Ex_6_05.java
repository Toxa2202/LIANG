package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] mass = new int[10];
        int count = 0;//Zminna dopomozhe skorotutu masuv na vuhodi
        int num;
        //Vnesennja danuh i napovnennja masuvy nepovtorjyvanumu zna4ennjamu
        for (int i = 0; i < mass.length; i++) {
            num = input.nextInt();
            if (!isDistinct(num, mass)) {
                mass[count++] = num;
            }
        }
        //Vuvedennja ne povtorjyvanuh 4usel zavdjaku COUNT
        System.out.println("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    //Perevirka na povtorne 4uslo
    public static boolean isDistinct(int num, int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == num) {
                return true;
            }
        }
        return false;
    }
}
