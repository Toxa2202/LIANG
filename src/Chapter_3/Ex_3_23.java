package Chapter_3;
import java.util.*;

public class Ex_3_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x1 = 0;
		double y1 = 0;
		//Obchuslennja tochku v prjamokytnuky po goruzontali i vertukali
		double HD = Math.sqrt(Math.pow((x2 - x1), 2));
		double WD = Math.sqrt(Math.pow((y2 - y1), 2));
		
		if (HD <= 10/2 && WD <= 5.0/2) {
			System.out.println("Point (" + x2 + ", " + y2 + ") is in the rectangle.");
		}
		else {
			System.out.println("Point (" + x2 + ", " + y2 + ") is not in the rectangle.");
		}
		

	}

}
