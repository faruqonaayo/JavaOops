package inheritance;

import java.util.Scanner;

class Student {
	// Data Members
	private int studentId;
	private String studentName;
	private int studentAge;

	Scanner scanner = new Scanner(System.in);

	// Member Function
	void acceptDetails() {
		System.out.println("Enter your student ID: ");
		studentId = scanner.nextInt();

		System.out.println("Enter your name: ");
		studentName = scanner.next();

		System.out.println("Enter your age: ");
		studentAge = scanner.nextInt();
	}

	void displayDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Age: " + studentAge);
	}

}

class Marks extends Student {
	protected float objectiveMarks;
	protected float subjectiveMarks;

	// Member Function
	void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter Objective Marks: ");
		objectiveMarks = scanner.nextFloat();

		System.out.println("Enter Subjective Marks: ");
		subjectiveMarks = scanner.nextFloat();
	}

	void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks " + objectiveMarks);
		System.out.println("Subjective Marks: " + subjectiveMarks);
	}
}

class Sports extends Marks {
	protected float score;

	// Member Function
	void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter Score: ");
		score = scanner.nextFloat();
	}

	void displayDetails() {
		super.displayDetails();
		System.out.println("Score: " + score);
		;
	}
}

class Result extends Sports {
	private float totalMarks, averageMarks;

	// Member Function
	public void calculate() {
		super.acceptDetails();
		super.displayDetails();
		totalMarks = objectiveMarks + subjectiveMarks + score;
		averageMarks = totalMarks / 3;
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Marks: " + averageMarks);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		Result obj = new Result();

		obj.calculate();
	}
}