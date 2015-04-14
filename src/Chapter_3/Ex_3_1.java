package Chapter_3;
import java.util.*;

public class Ex_3_1 {

	public static void main(String[] args) {
		//Create scanner 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b and c:");
		//Enter three digits
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		//main formula 
		double r1 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a;
		double r2 = (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a;
		//if statement 
		if ((Math.pow(b, 2) - 4 * a * c) > 0) {
			System.out.println("The roots are: " + r1 + " " + r2);
		}
		else if(((Math.pow(b, 2) - 4 * a * c) == 0)) {
			System.out.println("The root is: " + r1);
		}
		else {
			System.out.println("The equation has no real roots.");
		}
	}

}
