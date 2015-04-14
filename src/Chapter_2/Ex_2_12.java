package Chapter_2;
import java.util.*;

public class Ex_2_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed and acceleration: ");
		int v = input.nextInt();
		double a = input.nextDouble();
		
		double length = Math.pow(v, 2) / (2 * a);
		
		System.out.println("The minimum runway length for this airplane is: " + (int)(length * 100) / 100.0);

	}

}
