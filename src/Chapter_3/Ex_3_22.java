package Chapter_3;
import java.util.*;

public class Ex_3_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		//Vvodumo koordunatu tochku
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		//Vidlik ide vid centra kola (0, 0)
		double x1 = 0;
		double y1 = 0;
		//Formyla obchuslennja tochku v koli
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
						
		//Obchusljyemo chu nalezhutj koly tochka
		if (distance <= 10) {
			System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle.");
		}
		else {
			System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle.");
		}
		
	}

}
