package Chapter_5;

/**
 * Created by Toxa on 30.04.2015.
 */
public class Ex_5_13 {
    public static void main(String[] args) {
        //Stvorulu shapky tablu4ku
        System.out.println("i\t\tm(i)");
        System.out.println("--------------");
        //LOOP perebrav rezyljtat
        for (int i = 1; i <= 20; i++) {
            //PRINTF vuviv chusla i obrizav lushni hvostu
            System.out.printf("%d\t\t%.4f\n", i, computeNum(i));
        }
    }
    //Metod obrahyvav m(i)
    public static double computeNum(int n){
        double num = 0;
        for (int j = 1; j <= n; j++) {
            //YVAGA! PRU ROBOTI Z double OBOVJAZKOVO VKAZYVATU 4USLO Z KRAPKOJY, INAKSHE PROGA NOT WORKING!
            num += j / (j + 1.0);//TYT 1.0 A NE 1
        }
        return num;
    }
}
