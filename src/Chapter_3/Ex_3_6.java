package Chapter_3;
import java.util.Scanner;

public class Ex_3_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		int weight = input.nextInt();
		System.out.println("Enter feet:");
		int feet = input.nextInt();
		System.out.println("Enter inches:");
		int inches = input.nextInt();
		
		double height = feet * 12 + inches;
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double BMI = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.printf("BMI is %4.2f\n", BMI);
		
		if (BMI < 18.5){
			System.out.println("Underweight");
		}
		else if(BMI < 25){
			System.out.println("Normal");
		}
		else if(BMI < 30){
			System.out.println("Overweight");
		}
		else 
			System.out.println("Obese");

	}

}
