import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		School n7 = new School();
		n7.addStudent("S01", "Bob");
		n7.addStudent("S02", "Alice");
		n7.addStudent("S03", "Shmulic");
		n7.addCourse("C01", "Blackmailing and extortion explained");
		n7.addCourse("C02", "Kidnapping");
		n7.addCourse("C03", "Assasination, practical course");

        int options = 0;
        Scanner scan = new Scanner(System.in); // Capturing the input
        do {
        	printMenu();
        	options = scan.nextInt();
        	scan.nextLine();
            switch (options) {
                case 1:
                    // Add student
                    System.out.println("Enter student ID");
                    String ID = scan.nextLine();
                    System.out.println("Enter student name");
                    String name = scan.nextLine();
                    n7.addStudent(ID, name);
                    break;
                case 2:
                    // Add course
                    System.out.println("Enter course ID");
                    String courseID = scan.nextLine();
                    System.out.println("Enter course name");
                    String courseName = scan.nextLine();
                    n7.addCourse(courseID, courseName);
                    break;
                case 3:
                    // Assign grade
                    System.out.println("Enter student's name");
                    String studentName = scan.nextLine();
                    System.out.println("Enter student's grade");
                    int grade = scan.nextInt();
                    scan.nextLine();
                    String studentID = n7.findStudentByName(studentName);
                    n7.assignGrade(studentID, "", grade);
                    // I struggle to keep both grade and couese ID without Record datatype
                    break;
                case 4:
                	// Search student by name
                	System.out.println("Enter student name");
                	name = scan.nextLine();
                	System.out.println(n7.findStudentByName(name));
                	break;
                case 5:
                	n7.displayAllStudents();
                    break;
                case 6:
                	n7.displayAllCourses();
                	break;
                    // Add the rest of your cases
            }
        } while (options != 10); // quitting the program
    }

    private static void printMenu() {
    	System.out.println("Main menu");
		System.out.println("1.\tAdd Student");
        System.out.println("2.\tAdd Course");
        System.out.println("3.\tAssign Grade");
        System.out.println("4.\tSearch Student by Name");
        System.out.println("5.\tList All Students");
        System.out.println("6.\tList All Courses");
        System.out.println("7.\tShow Failing Students");
        System.out.println("8.\tFind Top-Performing Student");
        System.out.println("9.\tFind Most Popular Course");
        System.out.println("10.\tQuit");
    }

}