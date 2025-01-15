import java.util.ArrayList; // import the ArrayList class

public class School {
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Course> courses = new ArrayList<Course>();

	void addStudent(String id, String name) {
		students.add(new Student(id, name));
	}

	void addCourse(String id, String name) {
		courses.add(new Course(id, name));
	}

	void displayAllStudents() {
		for (Student i : students) {
			System.out.println(i.toString());
		}
	}

	void displayAllCourses() {
		for (Course i : courses) {
			System.out.println(i.toString());
		}
	}

	String findStudentByName(String name) {
		String ID = "";
		for (Student i : students) {
			if (i.getStudentName().equals(name)) {
				ID = i.getStudentID();
			}
		}
		return ID;
	}
}