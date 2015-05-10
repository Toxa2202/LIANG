package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

public class Ex_6_13 {
    public static void main(String[] args) {
        //Vvodumo 4usla i vuvodumo result
        System.out.println("Random number from 1 to 54 is --> " + getRandom(2, 3, 4, 5, 34, 45, 23));
    }

    //Metod prujmaje nevidomy kiljkistj 4usel i na ih osnovi stvorjye masuv
    public static int getRandom(int... numbers) {
        //FOR pereburaje zna4ennja masuvy, generyje vupadkove 4uslo i porivnjye jogo na shozhistj
        //Jaksho ne shozhuj - vuvodutj v return. Jaksho shozhuj - bere nove vupadkove 4uslo
        for (int i = 0; i < numbers.length; i++) {
            int rand = (int) (1 + Math.random() * 55);
            if (rand != numbers[i]) {
                return rand;
            }
        }
        return -1;
    }
}
