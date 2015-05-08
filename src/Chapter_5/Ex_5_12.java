package Chapter_5;

/**
 * Created by Toxa on 30.04.2015.
 */
public class Ex_5_12 {
    public static void main(String[] args) {
        //Vnosumo dani. Programa povunna vuvestu na ekran vsi charu vid 1 do Z
        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerLine = 10;
        //Peredajem dani metody
        printChars(ch1, ch2, numberPerLine);
    }
    //Metod tupy VOID rahyje charu i vuvodutj na ekran po 10 v rjadok
    public static void printChars(char ch1, char ch2, int numberPerLine){
        for (char ch = ch1; ch <= ch2; ch++) {
            System.out.print(ch + ((ch - ch1 + 1) % 10 == 0 ? "\n" : "\t"));
        }
    }
}
