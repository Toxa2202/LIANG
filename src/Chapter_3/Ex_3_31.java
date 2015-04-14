package Chapter_3;
import java.util.*;

public class Ex_3_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB:");
		double rate = input.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int choice = input.nextInt();
		double RMB;
		double dollar;
		
		if (choice == 0) {
			System.out.println("Enter the dollar amount: ");
			dollar = input.nextDouble();
			RMB = dollar * rate;
			//System.out.println("$" + dollar + " is " + RMB + " yuan");
			System.out.printf("$%10.2f  is %10.2f uyan", dollar, RMB);
		}
		else if (choice == 1) {
			System.out.println("Enter the RMB amount: ");
			RMB = input.nextDouble();
			dollar = RMB / rate;
			//System.out.println(RMB + " uyan" + " is " + "$" + dollar);
			System.out.printf(" %10.2f uyan  is  $%10.2f", RMB, dollar);
		}
		else {
			System.out.println("Wrong answer!");
		}

	}

}
