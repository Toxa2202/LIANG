package Chapter_6;

/**
 * Created by Toxa on 02.05.2015.
 */

import java.util.Scanner;

public class Ex_6_17 {
    public static void main(String[] args) {
        //Vvodumo dani
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String[] studentsName = new String[numberOfStudents];
        int[] studentsScores = new int[numberOfStudents];
        //FOR vukorustovyje vkazany kiljkistj stydentiv i dlja kozhnogo zburaje dani
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student's name: ");
            studentsName[i] = input.next();
            System.out.print("Enter student's score: ");
            studentsScores[i] = input.nextInt();
        }
        //FOR sortyje dani po balam v porjadky zrostannja
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = i + 1; j < numberOfStudents; j++) {
                if (studentsScores[j] < studentsScores[i]) {
                    //Jaksho 2-j elem < 1-go = minjajem miscjamu kozhen tup danuh, prusvojenuj tomy elem.
                    int tmpScore = studentsScores[i];
                    studentsScores[i] = studentsScores[j];
                    studentsScores[j] = tmpScore;
                    String tmpname = studentsName[i];
                    studentsName[i] = studentsName[j];
                    studentsName[j] = tmpname;
                }
            }
        }
        //FOR vuvodutj dani po kozhnomy stydenty
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentsName[i] + ": " + studentsScores[i]);
        }
    }
}
