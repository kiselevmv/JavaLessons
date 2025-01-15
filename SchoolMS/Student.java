import java.util.ArrayList; // import the ArrayList class

public class Student {
private String name;
public final String ID;
private static int idCounter = 0;
ArrayList<Integer> grades = new ArrayList<Integer>(); 

	public void addGrade(int grade) {
		if (grade >0 && grade <101) {
			grades.add(grade);
		}
	}

	public int calculateAverage() {
		int sum = 0;
		for (int i : this.grades) {
			sum = sum + i;
		}
		return sum/grades.size();
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
