package Chapter_2;
import java.util.*;

public class Ex_2_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int years = input.nextInt();
		
		int birth = 60 * 60 * 24 * 365 / 7;
		int death = 60 * 60 * 24 * 365 / 13;
		int immigrant = 60 * 60 * 24 * 365 / 45;
		
		int population = 312_032_486;
		
		int new_pop = population + (birth - death + immigrant) * years;
		System.out.println("The population in " + years + " years is: " + new_pop);
		
	}

}
