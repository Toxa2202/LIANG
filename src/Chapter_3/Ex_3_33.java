package Chapter_3;
import java.util.*;

public class Ex_3_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1:");
		double firstWeight = input.nextDouble();
		double firstPrice = input.nextDouble();
		System.out.println("Enter weight and price for package 2:");
		double secondWeight = input.nextDouble();
		double secondPrice = input.nextDouble();
		
		double firstBetter = firstPrice / firstWeight;
		double secondBetter = secondPrice / secondWeight;
		
		if (firstBetter < secondBetter) {
			System.out.println("Package 1 has a better price.");
		}
		else if (firstBetter > secondBetter) {
			System.out.println("Package 2 has a better price.");
		}
		else {
			System.out.println("Package 1 and 2 has a same price.");
		}
	}

}
