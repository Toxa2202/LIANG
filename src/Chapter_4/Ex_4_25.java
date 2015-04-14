package Chapter_4;

/**
 * Created by Anthony Saint on 14.04.2015.
 */
public class Ex_4_25 {
    public static void main(String[] args) {
        //Pershuj for - li4uljnuk vid 10 000 do 100 000
        for (int count = 10000; count <= 100000; count += 10000) {
            double pi = 0;
            //dryguj for - rahyje PI za 4astkovojy formylojy
            for (int i = 1; i <= count; i ++) {
                pi +=  Math.pow(-1, i + 1)/ (2 * i - 1);
            }
            //Vuvodutj rezult dlja vsih li4uljnukiv
            System.out.println("P for i = " + count + ": " + 4 * pi);
        }
    }
}
