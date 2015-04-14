package Chapter_3;
import java.util.*;

public class Ex_3_4 {

	public static void main(String[] args) {
		int rand1 = (int) (Math.random() * 1000);
		int rand2 = (int) (Math.random() * 1000);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the summ of " + rand1 + " and " + rand2 + ": ");
		int sum = input.nextInt();
		int result = rand1 + rand2;
		
		if (sum == rand1 + rand2){
			System.out.println(true);
			System.out.println("You are wright! The sum of " + rand1 + " and " + rand2 + " is " + sum + "!");
		}
		else {
			System.out.println(false);
			System.out.println("Not wright! The sum of " + rand1 + " and " + rand2 + " is " + result + "!" + false);
		}

	}

}
