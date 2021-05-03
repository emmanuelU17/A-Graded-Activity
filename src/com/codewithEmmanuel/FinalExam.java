/*
This function should accept the address of a FinalExam object as its argument.
This object should already hold the student’s score for the final exam.
Element 3 of the grades array should reference this object.
The FinalExam class should inherit methods setScore(double) , getScore(), and getLetterGrade() from LetterGrade.
A sample of the FinalExam output is shown below:
How many questions are on the final exam? 20 [Enter]
How many questions did the student miss? 3 [Enter]
Each question counts 5 points.
The exam score is 85
The exam grade is B
 */

package com.codewithEmmanuel;

public class FinalExam extends LetterGrade{
    private double no_of_finalQuestions; private double mQuestions;

    public FinalExam(double score, double no_of_finalQuestions, double mQuestions) {
        super(score);
        this.no_of_finalQuestions = no_of_finalQuestions;
        this.mQuestions = mQuestions;
    }

    public void setNo_of_finalQuestions(double no_of_finalQuestions) {
        this.no_of_finalQuestions = no_of_finalQuestions;
    }
    public double getNo_of_finalQuestions() {
        return no_of_finalQuestions;
    }

    public void setMissed_questions(double mQuestions) {
        this.mQuestions = mQuestions;
    }
    public double getMissed_questions() {
        return mQuestions;
    }


    @Override
    public String toString() {
        return "\nFINAL EXAM"+
                "\nEach question counts for 5 points"+
                "\nThe exam score is "+getScore()+
                "\nThe exam grade is "+getGrade();
    }
}
