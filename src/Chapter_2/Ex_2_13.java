package Chapter_2;
import java.util.*;

public class Ex_2_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount:");
		double amount = input.nextDouble();
		double rate = 0.05 / 12;
		double value1 = amount * (1 + rate);
		double value2 = (amount + value1) * (1 + rate);
		double value3 = (amount + value2) * (1 + rate);
		double value4 = (amount + value3) * (1 + rate);
		double value5 = (amount + value4) * (1 + rate);
		double value6 = (amount + value5) * (1 + rate);
		
		System.out.println("After the sixth month, the account value is " + (int)(value6 * 100) / 100.0);
	}

}
