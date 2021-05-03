/*
This function should accept the address of a LetterGrade object as its argument.
This object should already hold the student’s score for the lab activity.
Element 0 of the grades array should reference this object.
 */

package com.codewithEmmanuel;

public class Lab extends LetterGrade {

    public Lab(double score) {
        super(score);
    }

    @Override
    public String toString() {
        return "LAB"+"\nLab score is "+getScore()+ " and grade is "+getGrade();
    }
}
