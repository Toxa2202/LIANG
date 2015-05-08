package Chapter_5;

/**
 * Created by Toxa on 29.04.2015.
 */
import java.util.Scanner;

public class Ex_5_07 {
    public static void main(String[] args) {
        //Vvodumo dani v programy dlja obrobku
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment amount (e.g., 1000): ");
        double amount = input.nextDouble();
        System.out.println("Enter the interest rate (e.g., 9%): ");
        double rate = input.nextDouble();
        System.out.println("Enter the number of years : ");
        int years = input.nextInt();
        System.out.println("Years\t\tFuture Value");
        //Tsukl pruzna4enuj dlja vuvedennja dannuh v formi tablu4ku
        for (int i = 1; i <= years; i++) {
            //Vuvid 4erez PRINTF dlja korektnogo vidobrazhennja kopijok
            System.out.printf("%d\t\t\t%.2f", i, futureInvestmentValue(amount, rate, i));
            System.out.println();
        }
    }
    //Metod vurahovyje futureValue prujmajy4u potribni dani
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double futureValue = investmentAmount * (Math.pow((1 + (monthlyInterestRate / 1200)), years * 12));
        return futureValue;
    }
}
