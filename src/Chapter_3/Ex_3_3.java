package Chapter_3;
import java.util.*;

public class Ex_3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Enter 6 digits from console
		System.out.println("Enter a, b, c, d, e, f:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		//Compute x and y
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		//User try to guess the answer(if statement)
		if (a * d - b * c == 0){
			System.out.println("The equation has no solution!");
		}
		else {
			System.out.println("x is " + x + " and y is " + y);
		}

	}

}
