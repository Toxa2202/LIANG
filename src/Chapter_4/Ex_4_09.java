package Chapter_4;
import java.util.Scanner;
public class Ex_4_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int num = input.nextInt();
		int score = 0;
		int firstMax = 0;
		int secondMax = 0;
		String name = " ";
		String t = " ";
		String firstWinner = " ";
		String secondWinner = " ";
		int temp = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print("Enter student's name:");
			name = input.next();
			System.out.print("Enter student's score:");
			score = input.nextInt();
		
			if(score > secondMax) {
				secondMax = score;
				secondWinner = name;
				if (secondMax > firstMax) {
					temp = secondMax;
					secondMax = firstMax;
					firstMax = temp;
					
					firstWinner = secondWinner;
					secondWinner = t;
					t = firstWinner;
				}
			}
		}
		
		System.out.println(firstWinner + " has max score that is " + firstMax);
		System.out.println(secondWinner + " has second max score that is " + secondMax);
	}
}
