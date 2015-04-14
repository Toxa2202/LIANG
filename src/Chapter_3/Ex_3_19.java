package Chapter_3;

import java.util.*;

public class Ex_3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of a triangle:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if (a + b > c && a + c > b && b + c > a) {
			double perimeter = a + b + c;
			System.out.println("Perimeter is " + perimeter);
		}
		else{
			System.out.println("Input is invalid!");
		}
	}
}
