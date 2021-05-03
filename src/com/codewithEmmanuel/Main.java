//Emmanuel Uluabuike 0657464 Comp 2477 Assignment 4

/*

This program is a grading system.
In a course, a teacher gives the following tests and assignments:
• A lab activity that is observed by the teacher and assigned a numeric score.
• A pass/fail exam that has x amount of questions. The minimum passing score is decided by the user.
• An essay that is assigned a numeric score.
• A final exam that is decided by the user.

NOTE: I changed setPassFailExam to midterm exam because the name was confusing me
 */

package com.codewithEmmanuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Creating setLab
        System.out.print("Enter Lab score: ");
        double lab_score = input.nextDouble();
        Lab lab = new Lab(lab_score);
        System.out.println(lab);

        //Creating midterm exam
        System.out.print("\nHow many questions are on the midterm Exam?: ");
        double Que = input.nextDouble();
        System.out.print("How many questions did the student miss?: ");
        double missed = input.nextDouble();
        System.out.print("Enter the minimum passing score for the test: ");
        double passing = input.nextDouble();
        //difference does the math to get the midterm score.
        //difference is stored in the object the private data score which in-turn will help when I need to get the highest and lowest values of scores.
        //This logic goes for every object I create for every class
        double difference = Que - missed;
        MidtermExam midtermExam = new MidtermExam(difference,Que, missed,passing);
        midtermExam.setNo_of_questions(Que);
        midtermExam.setMissedQuestions(missed);
        midtermExam.setMinScore(passing);
        System.out.println(midtermExam);

        //Creating setEssay
        System.out.print("\nGrammar:");
        double grammar = input.nextDouble();
        System.out.print("Spelling: ");
        double spelling = input.nextDouble();
        System.out.print("Correct length: ");
        double len = input.nextDouble();
        System.out.print("Content: ");
        double con = input.nextDouble();
        //total calculates all of the categories that add to the grading of an essay
        //and then stores in the private data scores in Essay class
        double total = grammar+spelling+len+con;
        Essay essay = new Essay(total,grammar,spelling,len,con);
        essay.setGrammar(grammar);
        essay.setSpelling(spelling);
        essay.setCorrect_length(len);
        essay.setContent(con);
        essay.setScore(total);
        System.out.println(essay);

        //Creating FinalExam
        System.out.print("\nHow many questions are on the final Exam?: ");
        double fin = input.nextDouble();
        System.out.print("How many questions did the students miss?: ");
        double stud = input.nextDouble();
        //finale calculates the difference considering each question is worth 5 marks and then stores in score
        double finale = fin*5 - stud*5;
        FinalExam finalExam = new FinalExam(finale,fin,stud);
        finalExam.setNo_of_finalQuestions(fin);
        finalExam.setMissed_questions(stud);
        finalExam.setScore(finale);
        System.out.println(finalExam);

        //Creating courseGrades so I can set the other classes into the array of grades
        CourseGrades courseGrades = new CourseGrades();
        //Like I said earlier the word set is use to set the values for for the different classes in the array
        courseGrades.setLab(lab);
        courseGrades.setPassFailExam(midtermExam);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);

        System.out.println();
        System.out.println("Average is "+courseGrades.getAverage());
        System.out.println("\nThe highest score is: "+courseGrades.getHighest());
        System.out.println("\nThe lowest score is: "+courseGrades.getLowest());
    }


}
