package Chapter_6;

import java.util.Arrays;

/**
 * Created by Toxa on 02.05.2015.
 */
public class Ex_6_07 {
    public static void main(String[] args) {
        //Stvorulu masuv 10 elementiv
        int[] mass = new int[10];
        //Vuklukalu cukl, zgeneryvalu 100 elementiv vid 0 do 9, povtoru cufr zapamjatalu v masuvi
        for (int i = 0; i < 100; i++) {
            int dig = (int) (Math.random() * 10);//Obovjazkovo zakljy4atu MATH v dyzhku!!!
            //Zapusyje v masuv povtor zna4ennja
            mass[dig]++;
        }
        //Vuvid povtoriv na ekran 4erez cukl(treba perebratu vsi 10 zna4enj)
        System.out.println("The count of each number is: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " repeats " + mass[i] + " times");
        }
    }
}
