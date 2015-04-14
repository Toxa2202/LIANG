package Chapter_3;
import java.util.*;

public class Ex_3_15 {

	public static void main(String[] args) {
		int lottery = (int)(Math.random() * 1000);
		if (lottery < 100) {
			lottery += 100;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (three digits):");
		int guess = input.nextInt();
		
		int lotteryDigitOne = lottery / 100;
		int remain = lottery % 100;
		int lotteryDigitTwo = remain / 10;
		int lotteryDigitThree = lottery % 10;
		
		int guessDigitOne = guess / 100;
		int remainGuess = guess % 100;
		int guessDigitTwo = remainGuess / 10;
		int guessDigitThree = guess % 10;
		
		if (guess >= 1000){
			System.out.println("Must be less than 1000.");
		}
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess == lottery){
			System.out.println("Exact match. You win $10 000");
		}
		
		else if ((guessDigitOne == lotteryDigitTwo || guessDigitOne == lotteryDigitThree || guessDigitOne == lotteryDigitOne)
			 	&& (guessDigitTwo == lotteryDigitOne || guessDigitTwo == lotteryDigitThree || guessDigitTwo == lotteryDigitTwo)
			 	&& (guessDigitThree == lotteryDigitOne || guessDigitThree == lotteryDigitTwo || guessDigitThree == lotteryDigitThree)) {
					System.out.println("Match all digits! You win $3 000");
		}
		
		else if ((guessDigitOne == lotteryDigitTwo || guessDigitOne == lotteryDigitThree || guessDigitOne == lotteryDigitOne)
			  || (guessDigitTwo == lotteryDigitOne || guessDigitTwo == lotteryDigitThree || guessDigitTwo == lotteryDigitTwo)
			  || (guessDigitThree == lotteryDigitOne || guessDigitThree == lotteryDigitTwo || guessDigitThree == lotteryDigitThree)) {
					System.out.println("Match one digit! You win $1 000");
		}
	
		else {
			System.out.println("Sorry, no match!");
		}
		
	}
}
