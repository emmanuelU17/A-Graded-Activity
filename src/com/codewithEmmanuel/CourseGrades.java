/*

Write a class named CourseGrades.
The class should have a member named grades that is an array of LetterGrade pointers.
The grades array should have four elements, one for each of the assignments previously described.

 */

package com.codewithEmmanuel;

import java.util.Arrays;

public class CourseGrades implements Analyzable {

    private final LetterGrade []grades;

    public CourseGrades(){
        this.grades = new LetterGrade[4];
    }

    public void setLab(Lab lab){
        this.grades[0] = lab;
    }
    public void setEssay(Essay essay){
        this.grades[1] = essay;
    }
    public void setPassFailExam(MidtermExam midtermExam){
        this.grades[2]=midtermExam;
    }
    public void setFinalExam(FinalExam finalExam){
        this.grades[3]=finalExam;
    }

    @Override
    public String toString() {
        return "\n"+Arrays.toString(grades);
    }

    @Override
    public double getAverage() {
        double average = 0;
        for (int i = 0; i < 4; i++) {
            average += this.grades[i].getScore();
        }
        return average/4;
    }

    @Override
    public LetterGrade getHighest() {
        LetterGrade highest = grades[0];

        //for loop compares the 1st score in grades with the other scores in the array and then prints it out the highest score
        for (int i = 0; i < 4; i++) {
            if (this.grades[i].getScore() > highest.getScore()) {
                highest = grades[i];
            }
        }
        return highest;
    }

    @Override
    public LetterGrade getLowest() {
        LetterGrade lowest = grades[0];

        //for loop checks compares the 1st score in grades with the other scores in the array and then prints it out the lowest score
        for (int i=0; i<4; i++){
            if (this.grades[i].getScore() < lowest.getScore()){
                lowest = grades[i];
            }
        }
        return lowest;
    }

}
