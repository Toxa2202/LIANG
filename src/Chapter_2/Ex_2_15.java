package Chapter_2;
import java.util.*;

public class Ex_2_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double Side1 = Math.sqrt ((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        double Side2 = Math.sqrt ((x3-x2) * (x3-x2) + (y3-y2) * (y3-y2));
        double Side3 = Math.sqrt ((x3-x1) * (x3-x1) + (y3-y1) * (y3-y1));
        double s = ((Side1 + Side2 + Side3) / 2);
        
		double area = Math.sqrt(s * (s - Side1) * (s - Side2) * (s - Side3));
		
		System.out.println("The area of the triangle is: " + area);
	}

}
