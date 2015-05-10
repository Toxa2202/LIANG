package Chapter_6;

/**
 * Created by Toxa on 01.05.2015.
 */

import java.util.Scanner;

public class Ex_6_01 {
    public static void main(String[] args) {
        //Stvorulu scaner
        Scanner input = new Scanner(System.in);
        //Prosumo usera vvestu neobhidni dani
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter " + numberOfStudents + " scores: ");
        //Stvorjyemo masuv vkazanoi dovzhunu
        int[] scores = new int[numberOfStudents];
        //Cukl FOR zabuvaje v masuv zna4ennja
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        //Peredajem ypravlinnja metody
        printGrade(scores);
    }

    //Metod povunen vuvestu na ekran rezyljtat
    public static void printGrade(int[] scores) {
        //Cukl dlja vuvedennja rezyljtaty
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore(scores) - 10) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
            } else if (scores[i] >= maxScore(scores) - 20) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
            } else if (scores[i] >= maxScore(scores) - 30) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
            } else if (scores[i] >= maxScore(scores) - 40) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
            }
        }
    }

    //Metod dlja vuzna4ennja maksumaljnogo baly
    public static int maxScore(int[] scores) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

}