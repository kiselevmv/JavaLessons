import java.util.ArrayList; // import the ArrayList class

/*
Attributes:
- courseName (String): The name of the course.
- courseId (String): A unique identifier for the course.
- enrolledStudents (List of Students): A list of students enrolled in the course.
Methods:
- addStudent(Student student): Adds a student to the course.
- getStudentList(): Returns a list of all enrolled students.
- toString(): Returns a string representation of the course (e.g., name and ID).
*/

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