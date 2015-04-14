package Chapter_2;
import java.util.*;

public class Ex_2_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in centa:");
		int amount = input.nextInt();
		
		int dollars = amount / 100;
		int remainingAmount = amount % 100;
		int quarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int dimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int nickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int pennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of \n" 
				+ "\t" + dollars + " dollars \n"
				+ "\t" + quarters + " quarters \n"
				+ "\t" + dimes + " dimes \n" 
				+ "\t" + nickels + " nickels \n"
				+ "\t" + pennies + " pennies");
		
	}

}
