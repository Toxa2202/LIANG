package Chapter_3;
import java.util.*;

public class Ex_3_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer:");
		int a = input.nextInt();
				
		if (a % 5 == 0 && a % 6 == 0){
			System.out.println(a + " is divisible by both 5 and 6.");
		}
		else if (a % 5 == 0 || a % 6 == 0){
			System.out.println(a + " is divisible by 5 or 6, but not both.");
		}
		else if (a % 5 != 0 || a % 6 != 0){
			System.out.println(a + " is not divisible by either 5 or 6.");
		}
	}

}
