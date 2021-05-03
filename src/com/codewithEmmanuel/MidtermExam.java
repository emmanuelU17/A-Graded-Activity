
/*
This function should accept the address of a PassFailExam object as its argument.
This object should already hold the student’s score for the pass/fail exam.
Element 1 of the grades array should reference this object.
A sample of the PassFailExam output is shown below:
How many questions are on the exam? 100 [Enter]
How many questions did the student miss? 25 [Enter]
Enter the minimum passing score for this test: 60 [Enter]
Each question counts 1.0 points.
The minimum passing score is 60.0
The student's exam score is 75.0
The student's grade is P
 */


package com.codewithEmmanuel;

public class MidtermExam extends LetterGrade{
    private final int hundred = 100;

    private double no_of_questions; private double MissedQuestions; private double minScore;
    public MidtermExam(double score, double no_of_questions, double missedQuestions, double minScore) {
        super(score);
        this.no_of_questions = no_of_questions;
        this.MissedQuestions =  missedQuestions;
        this.minScore = minScore;
    }

    public void setNo_of_questions(double no_of_questions) {
        this.no_of_questions = no_of_questions;
    }
    public double getNo_of_questions() {
        return no_of_questions;
    }

    public void setMissedQuestions(double missedQuestions) {
        MissedQuestions = missedQuestions;
    }
    public double getMissedQuestions() {
        return MissedQuestions;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }
    public double getMinScore() {
        return minScore;
    }

    public char getPass_Fail(){
        if (((no_of_questions-MissedQuestions) / no_of_questions) * hundred >= minScore){
            return 'P';
        }else
            return 'F';
    }

    @Override
    public String toString() {
        return "\nMidterm Exam"+
                "\nEach question counts for 1.0 point"+
                "\nMinimum passing score is " + getMinScore() +
                "\nThe student's midterm exam score is " +((getNo_of_questions() - getMissedQuestions()) / getNo_of_questions())*hundred+
                "\nThe student's grade is "+getPass_Fail();
    }
}
