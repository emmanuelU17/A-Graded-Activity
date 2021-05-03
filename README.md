JAVA HOMEWORK ASSIGNMENT 3 FOR COMP 2477 AT LAKEHEAD UNIVERISTY HERE IS THE QUESTION IF YOU CARE TO READ

Q1: A graded activity can consist of a numeric score such as 70, 85, 90, and so on, and a letter grade such as A, B, C, D, or F.

In a course, a teacher gives the following tests and assignments:

• A lab activity that is observed by the teacher and assigned a numeric score.
• A pass/fail exam that has 10 questions. The minimum passing score is 70.
• An essay that is assigned a numeric score.
• A final exam that has 50 questions.

Design an Essay class that is derived from the of LetterGrade class presented above. The Essay class should determine the grade a student receives on an essay. 
The student’s essay score can be up to 100, and is determined in the following manner:

Grammar, Spelling, Correct length and content

Write a class named CourseGrades. The class should have a member named grades that is an array of LetterGrade pointers
The grades array should have four elements, one for each of the assignments previously described. The class should have the following member functions:

setLab: This function should accept the address of a LetterGrade object as its argument. This object should already hold the student’s score for the lab activity. 
Element 0 of the grades array should reference this object.

setPassFailExam: This function should accept the address of a PassFailExam object as its argument. This object should already hold the student’s score for the pass/fail exam. 
Element 1 of the grades array should reference this object.

setEssay: This function should accept the address of an Essay object as its argument. Use a LetterGrade object. This object should already hold the student’s score for the essay.
Element 2 of the grades array should reference this object.

setPassFailExam: This function should accept the address of a FinalExam object as its argument. This object should already hold the student’s score for the final exam. 
Element 3 of the grades array should reference this object. The FinalExam class should inherit methods setScore(double) , getScore(), and getLetterGrade() from LetterGrade.

Q2: Modify the courseGrades class you created in the previous question so it implements the following interface:

getAverage method should return the average of the numeric scores stored in the grades array.

getHighest method should return a reference to the element of the grades array that has the highest numeric score.

getLowest method should return a reference to the element ofthe grades array that has the lowest numeric score

