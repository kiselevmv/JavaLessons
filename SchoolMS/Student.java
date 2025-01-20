import java.util.ArrayList; // import the ArrayList class

/*
Attributes:
- name (String): The student's name.
- id (String): A unique identifier for the student.
- grades (Array of Integers): Grades of the student in all enrolled courses.
Methods:
- addGrade(int grade): Adds a grade to the grades array.
- calculateAverage(): Returns the average of all grades.
- toString(): Returns a string representation of the student (e.g., name and ID).
*/

public class Student {
private String name;
public final String ID;
private static int idCounter = 0;
ArrayList<Integer> grades = new ArrayList<Integer>(); 

	public void addGrade(int grade) {
		if (grade >0 && grade <101) {
			grades.add(grade);
		} else { System.out.println("Grade is in illegal range"); }
		// TODO Use exception throw here
	}

	public boolean isFailed () {
		boolean isFail = false;
		for (Integer g : grades) {
			if (g<60) { isFail = true; }
		}
		return isFail;
	}

	public int calculateAverage() {
		int sum = 0;
		for (int i : this.grades) {
			sum = sum + i;
		}
		return sum/grades.size();
		// This is possible to keep average in the separate parameter
		// But lazy calculations are more CPU effective 
		// https://stackoverflow.com/questions/24704503/lazy-evaluation-why-is-it-faster-advantages-vs-disadvantages-mechanics-why-i
	}

	Student() {
		this.ID=Integer.toString(idCounter++);
		this.name="";
	}

	Student(String name) {
		this.ID=Integer.toString(idCounter++);
		this.name=name;
	}

	Student(String ID, String name) {
		this.ID=ID;
		this.name=name;
	}

	public String toString() {
		return "Student ID: " + this.ID + ",\t\tstudent name: " + this.name;
	}

	public String getStudentName() {
		return this.name;
	}

	public String getStudentID() {
		return this.ID;
	}
}
