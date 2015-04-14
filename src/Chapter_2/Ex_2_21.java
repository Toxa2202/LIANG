package Chapter_2;
import java.util.*;

public class Ex_2_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double rate = input.nextDouble();
		System.out.println("Enter number of years:");
		double years = input.nextDouble();
		
		double futureValue = amount * (Math.pow((1 + (rate / 1200)), years * 12));
		System.out.println("Accumulated value is: " + futureValue);

	}

}
