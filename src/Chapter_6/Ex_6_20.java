package Chapter_6;

/**
 * Created by Toxa on 03.05.2015.
 */

import java.util.Scanner;

public class Ex_6_20 {
    public static void main(String[] args) {
        //Stvorulu scanner
        Scanner input = new Scanner(System.in);
        //Poprosulu vvestu dani
        System.out.println("Enter ten double numbers: ");
        double[] mass = new double[10];
        //Zabulu dani v masuv
        for (int i = 0; i < mass.length; i++) {
            mass[i] = input.nextDouble();
        }
        //Peredalu ypravlinnja metody sortyvannja
        sorting(mass);
        //Vuvodumo rezyljtat na ekran
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    public static double[] sorting(double[] mass) {
        //Pereburajem masuv
        for (int i = mass.length - 1; i >= 0; i--) {
            //Stvorulu tum4asovi zminni dlja zberezhennja MAX zna4ennja i komirku de vono znahodutjsja
            double currentMax = mass[i];
            int currentMaxIndex = i;
            //Shykajem max zna4ennja i  pereprusvojyem nashi tum4asovi zminni
            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < mass[j]) {
                    currentMax = mass[j];
                    currentMaxIndex = j;
                }
            }
            //Jaksho treba, minjaem mistsjamu komirku masuvy
            if (currentMaxIndex != i) {
                mass[currentMaxIndex] = mass[i];
                mass[i] = currentMax;
            }
        }
        //Povertajemsja na mistse vukluky
        return mass;
    }
}