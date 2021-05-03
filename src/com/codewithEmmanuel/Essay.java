/*
This function should accept the address of an Essay object as its argument.
Use a LetterGrade object.
This object should already hold the student’s score for the essay.
Element 2 of the grades array should reference this object.
 */

package com.codewithEmmanuel;

public class Essay extends LetterGrade{

    private double grammar; private double spelling; private double correct_length; private double content;

    public Essay(double score, double grammar,double spelling,double correct_length,double content ) {
        super(score);
        this.grammar = grammar;
        this.spelling = spelling;
        this.correct_length = correct_length;
        this.content = content;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }
    public double getGrammar() {
        return grammar;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }
    public double getSpelling() {
        return spelling;
    }

    public void setCorrect_length(double correct_length) {
        this.correct_length = correct_length;
    }
    public double getCorrect_length() {
        return correct_length;
    }

    public void setContent(double content) {
        this.content = content;
    }
    public double getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "\nESSAY"+
                "\nGrammar: " + getGrammar() +
                "\nSpelling: " + getSpelling() +
                "\nCorrect length: " + getCorrect_length() +
                "\nContent: " + getContent() +
                "\nStudents essay score is "+getScore()+" and grade is "+getGrade();

    }
}
