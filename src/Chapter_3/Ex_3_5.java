package Chapter_3;
import java.util.*;

public class Ex_3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day:");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int next = input.nextInt();
		String day1 = null;
		String day2 = null;
		
		switch (today){
			case 0: day1 = "Sunday";
					break;
			case 1: day1 = "Monday";
					break;
			case 2: day1 = "Tuesday";
					break;
			case 3: day1 = "Wednesday";
					break;
			case 4: day1 = "Thursday";
					break;
			case 5: day1 = "Friday";
					break;
			case 6: day1 = "Saturday";
					break;
			default: System.out.println("We have only 7 days in a week!");
					System.exit(1);
		}
		
		switch (next % 7){
		case 0: day2 = "Sunday";
				break;
		case 1: day2 = "Monday";
				break;
		case 2: day2 = "Tuesday";
				break;
		case 3: day2 = "Wednesday";
				break;
		case 4: day2 = "Thursday";
				break;
		case 5: day2 = "Friday";
				break;
		case 6: day2 = "Saturday";
				break;
		default: System.out.println("We have only 7 days in a week!");
				System.exit(1);
	}
		
		System.out.println("Today is " + day1 + " and the future day is " + day2);

	}

}
