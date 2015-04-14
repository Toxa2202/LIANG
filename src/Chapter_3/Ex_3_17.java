package Chapter_3;
import java.util.*;

public class Ex_3_17 {

	public static void main(String[] args) {
		//Enter your choice
		Scanner input = new Scanner(System.in);
		System.out.println("Scissors (0), rock (1), paper (2): ");
		int user = input.nextInt();
		
		//Generate computers choice from 0 to 2
		int pc = (int)(Math.random() * 3);
		
		//First if for finding computers choice
		if (pc == 0) {
			System.out.print("The computer is scissors. ");
		}
		else if(pc == 1) {
			System.out.print("The computer is rock. ");
		}
		else if (pc == 2) {
			System.out.print("The computer is paper. ");
		}
		else {
			System.out.print("Something is wrong! ");
		}
		
		//Second if for users choice
		if (user == 0) {
			System.out.print("You are scissors. ");
		}
		else if(user == 1) {
			System.out.print("You are rock. ");
		}
		else if (user == 2) {
			System.out.print("You are paper. ");
		}
		else {
			System.out.print("Something is wrong!");
		}
		
		
		//Finding the result of the game
		if (user == 0 && pc == 2) {
			System.out.print("You won!");
		}
		else if (user == 1 && pc == 0) {
			System.out.print("You won!");
		}
		else if (user == 2 && pc == 1) {
			System.out.print("You won!");
		}
		else if (pc == 0 && user == 2){
			System.out.print("Computer won!");
		}
		else if (pc == 1 && user == 0) { 
			System.out.print("Computer won!");
		}
		else if (pc == 2 && user == 1) {
			System.out.print("Computer won!");
		}
		else {
			System.out.println("Same choice!");
		}
	}

}
