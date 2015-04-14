package Chapter_3;
import java.util.*;

public class Ex_3_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit:");
		double temp = input.nextDouble();
		System.out.println("Enter the wind speed in miles per hour:");
		int speed = input.nextInt();
		
		if ((temp + 58 >= 0) && (temp < 42)) {
			if (speed >= 2) {
				double wind_chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) 
						+ 0.4275 * temp * Math.pow(speed, 0.16);
				System.out.println("Wind-chill temperature is ->" + wind_chill);
			}
			else {
				System.out.println("Wind speed is out of range!");
			}
		}
		else {
			System.out.println("Temperature is out of range!");
		}

	}

}
