package Chapter_3;
import java.util.*;

public class Ex_3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Enter three random digits(0...9)
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		int c = (int)(Math.random() * 10);
		System.out.println("Enter the summ of " + a + " + " + b + " + " + c);
		//User try to guess
		int user = input.nextInt();
		//Statement for user's answer
		if (a + b + c != user){
			System.out.println("Wrong!");
			System.out.println("The summ of " + a + " + " + b + " + " + c + " is " + (a + b + c));
		}
		else {
			System.out.println("Correct!");
			System.out.println("The summ of " + a + " + " + b + " + " + c + " is " + (a + b + c));
		}
		
	}

}
