import java.util.ArrayList; // import the ArrayList class

public class Course {
	private String courseName;
	private String courseID;
	private ArrayList<Student> enrolledStudents = new ArrayList<Student>(); 

	void addStudent(Student student) {
		enrolledStudents.add(student);
	}

	ArrayList<Student> getStudentList() {
		return this.enrolledStudents;
	}

	Course(String ID, String name) {
		this.courseName = name;
		this.courseID = ID;
	}

	public String toString() {
		return "Course ID: " + this.courseID + "\t\t, course name: " + this.courseName;
	}
}