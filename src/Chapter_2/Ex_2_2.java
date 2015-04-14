package Chapter_2;
import java.util.Scanner;

public class Ex_2_2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and lenght of a cylinder: ");
		double radius = input.nextDouble();
		double lenght = input.nextDouble();
		double PI = 3.14156;
		double area = radius * radius * PI;
		double volume = area * lenght;
		System.out.println("The area is: " + area);
		System.out.println("The volume is: " + volume);
	}
}