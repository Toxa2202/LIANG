package Chapter_2;
import java.util.Scanner;

public class Ex_2_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters.");
	}
}