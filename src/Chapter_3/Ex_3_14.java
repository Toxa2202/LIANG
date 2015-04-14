package Chapter_3;
import java.util.*;

public class Ex_3_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the side: head (0) or tail (1)?");
		double side = input.nextDouble();
		String num;
		
		double number = Math.random();
		if (number <= 0.5){
			number = 0;
			num = "Head";
		}
		else {
			number = 1;
			num = "Tail";
		}
		
		if (side == number) {
			System.out.println("Correct!\nIt's " + num);
		}
		else if (side != number) {
			System.out.println("You lose!\nIt's " + num);
		}
		else {
			System.out.println("Something is wrong. Try again!");
		}
		
	}

}
