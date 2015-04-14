package Chapter_4;

import java.util.Scanner;

public class Ex_4_22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount:");
		double loanAmmount = input.nextDouble();
		System.out.println("Number Of Years:");
		int numberOfYears = input.nextInt();
		System.out.println("Annual Interest Rate:");
		double annualInterestRate = input.nextDouble();
		
		double balance = loanAmmount;
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = (int)((loanAmmount * monthlyInterestRate / (1 - 1/Math.pow(1+monthlyInterestRate, numberOfYears * 12)))*100)/100.0;
		double totalPayment = (int)((monthlyPayment * numberOfYears * 12)*100)/100.0;
		System.out.println("Monthly payment: " + monthlyPayment);
		System.out.println("Total payment: " + totalPayment);
		System.out.println();
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + (int)(interest*100)/100.0 + "\t\t" + (int)(principal*100)/100.0 + "\t\t" + (int)(balance*100)/100.0);
		}
	}

}
