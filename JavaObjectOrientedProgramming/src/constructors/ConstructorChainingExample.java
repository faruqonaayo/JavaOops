package constructors;

import java.util.Scanner;

class Student {
	// Data Members
	private int studentId;
	private String studentName;
	private int studentAge;

	Scanner scanner = new Scanner(System.in);

	// Default constructor
	public Student() {
		this(54663, "name", 43);
		this.studentId = 6636;
		this.studentName = "Faruq";
		this.studentAge = 21;
	}

	// Parameterized constructor
	public Student(int sId, String sName, int sAge) {
		this.studentId = sId;
		this.studentName = sName;
		this.studentAge = sAge;
	}

	void displayDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Age: " + studentAge);
	}

}

public class ConstructorChainingExample {
	public static void main(String[] args) {

		Student studentObj1 = new Student();

		studentObj1.displayDetails();

		Student studentObj2 = new Student(434, "Musab", 17);

		studentObj2.displayDetails();

	}
}