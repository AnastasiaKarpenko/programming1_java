/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anastasia
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Grading {

    private final Scanner scanner;
    private ArrayList<Integer> results;
    private int[] grades;

    public Grading(Scanner scanner) {
        results = new ArrayList<Integer>();
        this.scanner = scanner;
        this.grades = new int[6];
        for (int i = 0; i < this.grades.length; i++) {
            this.grades[i] = 0;
        }
    }

    public void getResults() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int res = Integer.parseInt(scanner.nextLine());
            if (res == -1) {
                break;
            }
            if (res >= 0 && res <= 60) {
                results.add(res);
            }
        }
    }

    public int giveGrade(int score) {

        if (score < 30) {
            return 0;
        }
        if (score < 35) {
            return 1;
        }
        if (score < 40) {
            return 2;
        }
        if (score < 45) {
            return 3;
        }
        if (score < 50) {
            return 4;
        }
 
        return 5;
    }

    public void countGrades() {
        for (int score : this.results) {
            int grade = giveGrade(score);
            for (int i = 0; i < grades.length ; i++) {
                if (grade == i) {
                    this.grades[i]++;
                }
            }
        }
    }

    public boolean isAccepted(int grade) {
        return !(grade == 0);
    }

    public double getAcceptancePercentage() {
        double numberOfScores = 0;
        for (int i = 0; i < this.grades.length; i++) {
            numberOfScores += this.grades[i];
        }
        if (numberOfScores == 0) {
            return 0.0;
        }
        return (numberOfScores - this.grades[0])*100 / numberOfScores;
    }

    public void printGrades() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Acceptance percentage: " + getAcceptancePercentage());
    }
}
