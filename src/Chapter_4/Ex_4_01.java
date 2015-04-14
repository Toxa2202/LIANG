package Chapter_4;

/*
 (Count positive and negative numbers and compute the average of numbers) Write
 a program that reads an unspecified number of integers, determines how many
 positive and negative values have been read, and computes the total and average of
 the input values (not counting zeros). Your program ends with the input 0. Display
 the average as a floating-point number. Here is a sample run.
 	Enter an integer, the input ends if it is 0: 1 2 -1 3 0 "Enter"
 	The number of positives is 3
 	The number of negatives is 1
 	The total is 5
 	The average is 1.25
 */

import java.util.*;

public class Ex_4_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0:");
		int data = input.nextInt();
		int positive = 0;
		int negative = 0;
		int number = 0;
		float sum = 0;
		float average = 0;
		
		if (data == 0){
			System.out.println("No numbers are entered except 0");
		} else if(data != 0) {		
			while (data != 0) {
				
				if (data > 0){
					positive ++;
				}
				else if (data < 0){
					negative ++;
				}
				else {
					number++;
				}
					
				sum += data;
				data = input.nextInt();	
			}
			
			System.out.println("The number of positives is " + positive);	
			System.out.println("The nomber of negatives is " + negative);
			System.out.println("The total is " + (number + positive + negative));
			average = sum / (positive + negative);
			System.out.println("The average is " + average);
		}
		
	}

}
