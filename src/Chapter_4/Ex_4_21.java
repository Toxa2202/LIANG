package Chapter_4;

import java.util.Scanner;

public class Ex_4_21 {
	public static void main(String[] args) {
		//������� ���� � ��������
		double annualInterestRate;
		double monthlyPayment;
		double totalPayment;
		
		//�������� ������ � ������� �������� ��� ��� � ���������
		Scanner input = new Scanner (System.in);
		System.out.println("Loan amount:");
		double loanAmount = input.nextDouble();
		System.out.println("Number of Years:");
		int numberOfYears = input.nextInt();
		//��������� ����������� �������
		System.out.println("Interest Rate \tMonthly Payment \tTotal Payment");
		
		//������� ������� ��� ���������� ������ �� ���� �����(���� 1/8 �������)
		//������� �� FOR, �� ������� ���� �������
		for (annualInterestRate = 5; annualInterestRate <= 8; annualInterestRate += 0.125) {
			//�������� ��������� ������� �� �����
			double monthlyInterestRate = annualInterestRate / 1200;
			//��� ����� ������ �����
			monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/Math.pow(1+monthlyInterestRate, numberOfYears * 12));
			//�� ����� ������ ����� ���������� ���� �����
			totalPayment = monthlyPayment * numberOfYears * 12;
		
			System.out.println();
			//�������� ��������� �� ����� � ������������� ������ �� ���� � ����� ������� ���� ����
			System.out.println((int)(annualInterestRate*1000)/1000.0 + "%\t\t" + (int)(monthlyPayment*100)/100.0 + "\t\t\t" + (int)(totalPayment*100)/100.0);
		}

	}
}
