package Chapter_2;
import java.util.*;

public class Ex_2_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter balance and interest rate: ");
		double balance = input.nextDouble();
		double rate = input.nextDouble();
		
		double interest = balance * (rate / 1200);
		System.out.println("The interest is: " + interest);

	}

}
