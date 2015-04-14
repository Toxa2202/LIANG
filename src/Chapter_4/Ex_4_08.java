package Chapter_4;

import java.util.Scanner;

public class Ex_4_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int num = input.nextInt();
			//Maksumaljne znachennja spochatky rivne 0
		int max = 0;
			//Vvelu stroky z imenem kozhnogo stydenta
		String name = " ";
			//Stroka byde trumatu imja peremozhtsja
		String winner = " ";
			//zminna z balamu stydentiv
		int score;
		
		/*
		 * Оскільки вся процедура встановлення переможця і занесення балів в базу відбуваєтсья в циклі FOR, 
		 * то необхідно спочатку створити в шапці програми потрібні змінні, так як якщо вони будуть створені
		 * в циклі, то не будуть видимі поза межами цього циклу.
		 */
		
			//Цей цикл запитує дані в користувача щодо імені і балів
		for (int i = 1; i <= num; i++) {
			System.out.print("Enter student's name:");
			name = input.next();
			System.out.print("Enter student's score:");
			score = input.nextInt();
				//Цей цикл обчислює максимальний бал і ім"я власника
			if(score > max) {
				max = score;
				winner = name;				
			}
		}
			//Виводимо потрібні результати на екран
		System.out.println(winner + " has max score that is " + max);
	}

}
