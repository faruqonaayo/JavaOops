package oops;

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

public class ClassesAndObjects {

	public static void main(String[] args) {
		// Creating an object of class Student
		Student studentObj = new Student();
		studentObj.acceptDetails();
		studentObj.displayDetails();

		Student student1Obj = new Student();
		student1Obj.acceptDetails();
		student1Obj.displayDetails();
	}
}