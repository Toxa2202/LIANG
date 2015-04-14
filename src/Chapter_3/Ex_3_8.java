/*
 * (Sort three integers). Write a program that sorts three integers. The integers are
 * entered from input dialogs and sorted in variables num1, num2 and num3, respectively.
 * The program sorts the numbers so that num1 <= num2 <= num3.
 */

package Chapter_3;
import java.util.*;

public class Ex_3_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three integers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		//finding lowest decimal
		if (num1 <= num2 && num1 <= num3){
			System.out.print(num1 + " <= ");
		}
		else if(num2 <= num1 && num2 <= num3){
			System.out.print(num2 + " <= ");
		}
		else if(num3 <= num1 && num3 <= num2){
			System.out.print(num3 + " <= ");
		}
		else {
			System.out.print("You are entered same digits!");
		}
		
		//finding middle decimal
		if ((num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2)){
			System.out.print(num1 + " <= ");
		}
		else if((num2 >= num1 && num2 <= num3) || (num2 >= num3 && num2 <= num1)){
			System.out.print(num2 + " <= ");
		}
		else if((num3 >= num2 && num3 <= num1) || (num3 >= num1 && num3 <= num2)){
			System.out.print(num3 + " <= ");
		}
		else {
			System.out.print("You are entered same digits!");
		}
		
		//finding biggest decimal
		if (num1 >= num2 && num1 >= num3){
			System.out.print(num1);
		}
		else if(num2 >= num1 && num2 >= num3){
			System.out.print(num2);
		}
		else if(num3 >= num1 && num3 >= num2){
			System.out.print(num3);
		}
		else {
			System.out.print("You are entered same digits!");
		}
	}

}
