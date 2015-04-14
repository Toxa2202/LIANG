package Chapter_3;
import java.util.*;

public class Ex_3_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of month and year:");
		int month = input.nextInt();
		int year = input.nextInt();
		int days;
				
		if (month == 1){
			days = 31;
			System.out.println("January " + year + " is " + days);
		}
		else if (month == 2){
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && month == 2){
				days = 29; 
				System.out.println("February " + year + " is " + days);
			}
			else {
				days = 28;
				System.out.println("February " + year + " is " + days);
			}
		}
		else if(month == 3){
			days = 31;
			System.out.println("March " + year + " is " + days);
		}
		else if(month == 4){
			days = 30;
			System.out.println("April " + year + " is " + days);
		}
		else if(month == 5){
			days = 31;
			System.out.println("May " + year + " is " + days);
		}
		else if(month == 6){
			days = 30;
			System.out.println("June " + year + " is " + days);
		}
		else if(month == 7){
			days = 31;
			System.out.println("July " + year + " is " + days);
		}
		else if(month == 8){
			days = 31;
			System.out.println("August " + year + " is " + days);
		}
		else if(month == 9){
			days = 30;
			System.out.println("September " + year + " is " + days);
		}
		else if(month == 10){
			days = 31;
			System.out.println("October " + year + " is " + days);
		}
		else if(month == 11){
			days = 30;
			System.out.println("November " + year + " is " + days);
		}
		else if(month == 12){
			days = 31;
			System.out.println("December " + year + " is " + days);
		}
		else {
			System.out.println("Something is wrong! Try again!");
		}
				
	}

}
