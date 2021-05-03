package com.codewithEmmanuel;

public class LetterGrade {
    private double score;

    public LetterGrade (double score){
        this.score = score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public double getScore() {
        return score;
    }

    public char getGrade(){
        if (getScore() >= 90){
            return 'A';
        }else if (getScore() >= 80) {
            return  'B';
        }else if (getScore() >= 70) {
            return 'C';
        }else if (getScore() >= 60) {
            return 'D';
        }else if (getScore() <= 59) {
            return 'F';
        }
        return (char) getScore();
    }
}
