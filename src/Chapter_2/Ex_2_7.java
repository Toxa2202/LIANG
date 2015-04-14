package Chapter_2;
import java.util.*;

public class Ex_2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some minutes:");
		int minutes = sc.nextInt();
		
		int years = minutes / 60 / 24 / 365;
		int days = minutes / 60 / 24 - (years * 365);
		
		System.out.println(minutes + " minutes approximatelly " + years 
				+ " years and " + days + " days.");
	}

}
