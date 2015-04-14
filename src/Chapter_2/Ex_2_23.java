package Chapter_2;
import java.util.*;

public class Ex_2_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code:");
		int code = input.nextInt();
		
		if (code >= 0 && code < 128) {
			char kod = (char) code;
			System.out.println("The character is: " + kod);
		}
		else {
			System.out.println("Wrong code, try from 0 to 127!");
		}
	}

}
