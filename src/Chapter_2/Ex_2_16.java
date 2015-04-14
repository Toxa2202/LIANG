package Chapter_2;
import java.util.*;

public class Ex_2_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double s = input.nextDouble();
		
		double Area = (3 * Math.sqrt(3)) / 2 * Math.pow(s, 2);
		System.out.println("The area of the triangle is: " + Area);
	}

}
