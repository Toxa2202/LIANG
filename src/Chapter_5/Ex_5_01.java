package Chapter_5;

/**
 * Created by Toxa on 29.04.2015.
 */
public class Ex_5_01 {
    public static void main(String[] args) {
        //Vvodumo kilkistj i peredajemo metody na vovid resyltaty
        int kilkistj = 100;
        printPentagonalNumber(kilkistj);
    }
    //Metod vuvodutj result na screen
    public static void printPentagonalNumber(int kilkistj){
        //Ymova pro vuvid v odun rjad 10 zna4enj
        final int NUM_PER_LINE = 10;
        //Bezposerednjo vuvid na ekran. Jaksho >10 znakiv v rjadky = perenos na nastypnuj rjadok
        for (int i = 1; i < kilkistj; i++) {
            if (i % NUM_PER_LINE == 0) {
                System.out.println();
            } else {
                System.out.print(getPentagonalNumber(i) + " ");
            }
        }
    }
    //Metod ob4uslennja "pentagonal number"
    public static int getPentagonalNumber(int i){
            return i * (3 * i - 1) / 2;
    }
}