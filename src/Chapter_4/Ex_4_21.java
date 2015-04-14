package Chapter_4;

import java.util.Scanner;

public class Ex_4_21 {
	public static void main(String[] args) {
		//ВВодимо змінні в програму
		double annualInterestRate;
		double monthlyPayment;
		double totalPayment;
		
		//Запускаєм сканер і вносимо необхідні нам дані з клавіатури
		Scanner input = new Scanner (System.in);
		System.out.println("Loan amount:");
		double loanAmount = input.nextDouble();
		System.out.println("Number of Years:");
		int numberOfYears = input.nextInt();
		//Заголовок результуючої таблиці
		System.out.println("Interest Rate \tMonthly Payment \tTotal Payment");
		
		//Основна формула для обчислення місячної та річної плати(крок 1/8 відсотка)
		//Оскільки це FOR, то значень буде декілька
		for (annualInterestRate = 5; annualInterestRate <= 8; annualInterestRate += 0.125) {
			//Спочатку обраховуєм відсоток за місяць
			double monthlyInterestRate = annualInterestRate / 1200;
			//Далі рахуєм місячну плату
			monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/Math.pow(1+monthlyInterestRate, numberOfYears * 12));
			//На основі місячної плати обраховуємо річну плату
			totalPayment = monthlyPayment * numberOfYears * 12;
		
			System.out.println();
			//Виводимо результат на екран з форматуванням тексту та цифр з двома знаками після коми
			System.out.println((int)(annualInterestRate*1000)/1000.0 + "%\t\t" + (int)(monthlyPayment*100)/100.0 + "\t\t\t" + (int)(totalPayment*100)/100.0);
		}

	}
}
