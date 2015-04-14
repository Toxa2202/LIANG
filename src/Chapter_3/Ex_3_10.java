package Chapter_3;
import java.util.*;

public class Ex_3_10 {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		System.out.println("What is " + number1 + " + " + number2 + " ?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if (number1 + number2 == answer){
			System.out.println("You are correct!");
		}
		else 
			System.out.println("Your answer is wrong!\n" + number1 + " + " + number2 + " is " + (number1 + number2));

	}

}
