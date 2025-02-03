import java.util.Scanner;
// Java program to construct 
// Menu bar to add menu items
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SchoolMS extends JFrame {  

    // create a menubar
    private JMenuBar mb = new JMenuBar();

    // create a menu
    private JMenu x = new JMenu("Menu"); 

    // Menu items
    private JMenuItem m1 = new JMenuItem("Add student");
    private JMenuItem m2 = new JMenuItem("Add course");
    private JMenuItem m3 = new JMenuItem("Assign grade");
    private JMenuItem m4 = new JMenuItem("List Student's");

    private JButton btnAddStudent = new JButton("Add student");
    private JButton btnAddCourse = new JButton("Add course");

    // create a label
    private JLabel l = new JLabel("no task ");

    private ActionListener addStudentListener = new addStudentListener();
    private ActionListener listStudentsListener = new listStudentsListener();

    private School n7 = new School();

    public SchoolMS() {

        n7.addStudent("S01", "Bob");
        n7.addStudent("S02", "Alice");
        n7.addStudent("S03", "Shmulic");
        n7.addCourse("C01", "Blackmailing and extortion explained");
        n7.addCourse("C02", "Kidnapping");
        n7.addCourse("C03", "Assasination, practical course");

        // Use the panel to group elements
        JPanel panel = new JPanel();

        // Setting box layout 
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        // Add menu to a menu bar
        panel.add(btnAddStudent);
        panel.add(btnAddCourse);
        panel.add(l);
        this.add(panel); // Add buttons to the frame
        x.add(m1);
        x.add(m2);
        x.add(m3);
        x.add(m4);
        mb.add(x);
        this.setJMenuBar(mb);
        

        // add ActionListener to control items
        btnAddStudent.addActionListener(addStudentListener);
        m1.addActionListener(addStudentListener);
        m4.addActionListener(listStudentsListener);
        // m2.addActionListener(m);
        // m3.addActionListener(m);
    }

	public static void main(String[] args) {
		
        // create an object of the class
        SchoolMS m = new SchoolMS();
        m.setTitle("School management system");
        m.setLocationRelativeTo(null); // Center the frame
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the size of the frame
        m.setSize(200, 400);
        // show the frame
        m.setVisible(true);


        /*
        int options = 0;
        do {
        	// menu.printMenu();
            Scanner scan = new Scanner(System.in);
            options = 8;
            switch (options) {

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

                case 6:
                	n7.displayAllCourses();
                	break;
                    // Add the rest of your cases
            }
        } while (options != 10); // quitting the program
        */
    }

    public void listAllStudents(String list) {
        this.l.setText(list);
    }

    class listStudentsListener implements ActionListener { // inner class
        @Override
        public void actionPerformed(ActionEvent e) {
            listAllStudents(n7.listAllStudents());
            //n7.displayAllStudents();
        }
        
    }

    class addStudentListener implements ActionListener { // inner class
        @Override
        public void actionPerformed(ActionEvent e) {
            // create a dialog Box
            JFrame f = new JFrame();
            JDialog d = new JDialog(f, "Add student");
            JPanel p = new JPanel();
            p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS)); 
            // create a label
            JLabel l1 = new JLabel("Student's ID");
            JTextField id = new JTextField(4);
            JLabel l2 = new JLabel("Student's name");
            JTextField name = new JTextField(16);
            // create a new button
            JButton b = new JButton("submit");
            b.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed( ActionEvent e ) {
                        n7.addStudent(id.getText(),name.getText());
                        d.dispose();
                    }
                });
            // create a object of the text class
            p.add(l1);
            p.add(id);
            p.add(l2);
            p.add(name);
            p.add(b);
            d.add(p);
            // set size of dialog
            d.setSize(200, 200);
            // set visibility of dialog
            d.setVisible(true);
        }
    }
}

