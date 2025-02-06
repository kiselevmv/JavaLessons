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
    private JMenu fileMenu = new JMenu("File");
    private JMenu x = new JMenu("Menu"); 

    // Menu items
    private JMenuItem m1 = new JMenuItem("Add student");
    private JMenuItem m2 = new JMenuItem("Add course");
    private JMenuItem m3 = new JMenuItem("Assign grade");
    private JMenuItem m4 = new JMenuItem("List Student's");

    private JMenuItem f1 = new JMenuItem("Save");

    private JButton btnAddStudent = new JButton("Add student");
    private JButton btnAddCourse = new JButton("Add course");
    private JButton asSubmit = new JButton("Submit");
    private JButton asBack = new JButton("Back");

    // create a label
    private JLabel l = new JLabel("no task "); 
    private JLabel asID = new JLabel("Student's ID");
    private JLabel asName = new JLabel("Student's name");

    // Create data input
    private JTextField id = new JTextField(4);
    private JTextField name = new JTextField(16);

    private ActionListener addStudentListener = new addStudentListener();
    private ActionListener listStudentsListener = new listStudentsListener();

    private School n7 = new School();

    // Use the panel to group elements
    private JPanel panel = new JPanel();
    private JPanel addStudentPanel = new JPanel();

    private CardLayout cardlayout = new CardLayout();

    public SchoolMS() {

        n7.addStudent("S01", "Bob");
        n7.addStudent("S02", "Alice");
        n7.addStudent("S03", "Shmulic");
        n7.addCourse("C01", "Blackmailing and extortion explained");
        n7.addCourse("C02", "Kidnapping");
        n7.addCourse("C03", "Assasination, practical course");

        // Add menu to a window
        x.add(m1);
        x.add(m2);
        x.add(m3);
        x.add(m4);
        fileMenu.add(f1);
        mb.add(fileMenu);      
        mb.add(x);

        setJMenuBar(mb);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(cardlayout);

        // Add panel to a frame
        contentPane.add(panel, "Panel 1");
        contentPane.add(addStudentPanel, "Panel 2");

        // Show main panel
        // panel.setVisible(true);
        // addStudentPanel.setVisible(false);

        // Setting box layout 
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        // Add buttons to a panel
        panel.add(btnAddStudent);
        panel.add(btnAddCourse);
        panel.add(l);

        // Setting panel layout
        addStudentPanel.setLayout(new GridLayout(0, 2));

        // Add buttons to a panel
        addStudentPanel.add(asID);
        addStudentPanel.add(id);
        addStudentPanel.add(asName);
        addStudentPanel.add(name);
        addStudentPanel.add(asSubmit);
        addStudentPanel.add(asBack);
        

        // add ActionListener to control items
        btnAddStudent.addActionListener(addStudentListener);
        m1.addActionListener(addStudentListener);
        m4.addActionListener(listStudentsListener);
        asSubmit.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed( ActionEvent e ) {
                        n7.addStudent(id.getText(),name.getText());
                        id.setText("");
                        name.setText("");
                    }
                });
        asBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ) {
                // cardlayout.next(contentPane);
                addStudentPanel.setVisible(false);
                panel.setVisible(true);
            }
        });
        // m2.addActionListener(m);
        // m3.addActionListener(m);
    }

    public void showAddStudent() {
        this.panel.setVisible(false);
        this.addStudentPanel.setVisible(true);
    }


	public static void main(String[] args) {
		
        // create an object of the class
        SchoolMS m = new SchoolMS();
        m.setTitle("School management system");
        m.setLocationRelativeTo(null); // Center the frame
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the size of the frame
        // m.setSize(300, 500);
        // m.setPreferredSize(new Dimension(200, 300));
        // show the frame
        m.pack();
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
        }
    }

    class addStudentListener implements ActionListener { // inner class
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setVisible(false);
            addStudentPanel.setVisible(true);
        }
    }
}

