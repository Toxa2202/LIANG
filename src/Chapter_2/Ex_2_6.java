package Chapter_2;
import java.util.Scanner;

public class Ex_2_6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int hundreds = number / 100;
		int decimals = (number - hundreds * 100) / 10;
		int ones = number % 10;
		int sum = hundreds + decimals + ones;
		System.out.println("The sum of the digits is -> " + sum);
	}
}