package Chapter_4;
import java.util.Scanner;

public class Ex_4_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first positive integer:");
		int n1 = input.nextInt();
		System.out.print("Enter second positive integer:");
		int n2 = input.nextInt();
		
		int gdc = 0;
		int d = 1;
		while(d <= n1 && d <= n2){
			if(n1 % d == 0 && n2 % d == 0){
				gdc = d;
			}
			d++;
		}
		System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + gdc);
	}

}
