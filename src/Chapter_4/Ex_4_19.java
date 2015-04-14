package Chapter_4;
import java.util.Scanner;

public class Ex_4_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of lines:");
		int dig;
		//stvorulu tyt zminny dlja povnogo dostypy do nei
		int lines = input.nextInt();
		
		//Zagaljnuj for dlja vidobrazhennja rjadkiv
		for (int dec = 1; dec <= lines; dec++) {
			
			//Ymova dlja vidobrazhennja stovpciv
			for (int col = 1; col <= lines - dec; col++) { 
				System.out.print("  ");
				//vidobrazhaje chusla v rjadkah do seredunu
				for (dig = lines; dig <= dec; dig--) { 
					System.out.print(" ");
					System.out.print(dig + " ");
				}
			}
			
			
			//vidobrazhaje chusla v rjadkah pislja seredunu
//			for (int n = (dig + 1); ((n != dec) && (n >= 1)); n++) {
//				System.out.print((n + 1) + " ");
//			}
			System.out.println();
		}
	}
}