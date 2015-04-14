package Chapter_2;
import java.util.Scanner;

public class Ex_2_5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity_rate = input.nextDouble();
		double gratuity = subtotal / 100 * gratuity_rate;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}
}