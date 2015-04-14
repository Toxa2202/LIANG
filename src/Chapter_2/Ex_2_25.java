package Chapter_2;
import java.util.*;

public class Ex_2_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name:");
		String name = input.nextLine();
		System.out.println("Enter numbers of hours worked in a week:");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double pay = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double tax = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTax = input.nextDouble();
		
		double federal = hours * pay * 0.2;
		double state = hours * pay * 0.09;
		double total = hours * pay - federal - state;
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay Rate: " + "$" + pay);
		System.out.println("Deduction:");
		System.out.println("   Federal withholding (20.0%): " + "$" + (int)(federal * 100) / 100.0);
		System.out.println("   State withholding (9.0%): " + "$" + (int)(state * 100) / 100.0);
		System.out.println("   Total Deduction: " + "$" + (int)((federal + state) * 100) / 100.0);
		System.out.println("Net Pay: " + "$" + (int)(total * 100) / 100.0);
	}

}
