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
		 * ������� ��� ��������� ������������ ��������� � ��������� ���� � ���� ���������� � ���� FOR, 
		 * �� ��������� �������� �������� � ����� �������� ������ ����, ��� �� ���� ���� ������ �������
		 * � ����, �� �� ������ ����� ���� ������ ����� �����.
		 */
		
			//��� ���� ������ ��� � ����������� ���� ���� � ����
		for (int i = 1; i <= num; i++) {
			System.out.print("Enter student's name:");
			name = input.next();
			System.out.print("Enter student's score:");
			score = input.nextInt();
				//��� ���� �������� ������������ ��� � ��"� ��������
			if(score > max) {
				max = score;
				winner = name;				
			}
		}
			//�������� ������ ���������� �� �����
		System.out.println(winner + " has max score that is " + max);
	}

}
