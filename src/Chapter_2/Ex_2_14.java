package Chapter_2;
import java.util.*;

public class Ex_2_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		System.out.println("Enter height in inches:");
		double height = input.nextDouble();
		
		double BMI = (weight * 0.45359237) / Math.pow((height * 0.0254), 2);
		System.out.println("BMI is: " + BMI);
		
		
	}

}
