package Chapter_2;
import java.util.*;

public class Ex_2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your time zone:");
		int zone = sc.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24 + zone;
		System.out.println("Current time is " + currentHour + ":" + currentMinute 
				+ ":" + currentSecond);
	}

}
