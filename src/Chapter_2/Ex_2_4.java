package Chapter_2;
import java.util.Scanner;

public class Ex_2_4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of pounds: ");
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}