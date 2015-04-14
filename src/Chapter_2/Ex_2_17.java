package Chapter_2;
import java.util.*;

public class Ex_2_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		double temp = input.nextDouble();
		System.out.println("Enter the wind speed in miles per hour: ");
		int speed = input.nextInt();
		
		double wind_chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) 
				+ 0.4275 * temp * Math.pow(speed, 0.16);
		System.out.println("The wind chill index is: " + wind_chill);
	}

}
