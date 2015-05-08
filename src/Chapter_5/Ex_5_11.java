package Chapter_5;

/**
 * Created by Toxa on 30.04.2015.
 */
public class Ex_5_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\tCommision");
        System.out.println("-------------------------------");
        //LOOP dlja vidobrazhennja dannuh v formi table
        for (int i = 10_000; i <= 100_000; i+=5000) {
            System.out.print(i + "\t\t\t" + computeCommission(i));
            System.out.println();
        }
    }
    //Metod dlja obrahynky danuh. Modelj vzjato z Ex_4_39
    public static double computeCommission(double salesAmount){
        double commission = 0;
        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
            return commission;
        } else if (salesAmount > 5000 && salesAmount <= 10000){
            commission = salesAmount * 0.10;
            return commission;
        } else {
            commission = salesAmount * 0.12;
            return commission;
        }
    }
}
