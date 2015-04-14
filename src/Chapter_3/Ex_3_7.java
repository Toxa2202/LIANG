package Chapter_3;
import java.util.*;

public class Ex_3_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount, for example, 11.56:");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		
		if (numberOfDollars % 20 == 1){
			System.out.println("You have " + numberOfDollars + " dollar");
		}
		else {
			System.out.println("You have " + numberOfDollars + " dollars");
		}
		
		
		if (numberOfQuarters % 20 == 1){
			System.out.println("\t  " + numberOfQuarters + " quarter");
		}
		else {
			System.out.println("\t  " + numberOfQuarters + " quarters");
		}
		
		
		if (numberOfDimes % 20 == 1){
			System.out.println("\t  " + numberOfDimes + " dime");
		}
		else {
			System.out.println("\t  " + numberOfDimes + " dimes");
		}
		
		if (numberOfNickels % 20 == 1){
			System.out.println("\t  " + numberOfNickels + " nickel");
		}
		else {
			System.out.println("\t  " + numberOfNickels + " nickels");
		}
		
		
		if (numberOfPennies % 20 == 1){
			System.out.println("\t  " + numberOfPennies + " penny");
		}
		else {
			System.out.println("\t  " + numberOfPennies + " pennies");
		}
		
	}

}
