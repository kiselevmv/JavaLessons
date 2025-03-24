// UserFormView.java - GUI for user input
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserFormView extends JFrame {
    private JTextField nameField, ageField, emailField;
    private JRadioButton maleButton, femaleButton;
    private JButton submitButton;
    private UserController userController;

    public UserFormView(UserController userController) {
        this.userController = userController;
        
        setTitle("User Form");
        setSize(300, 250);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Gender:"));
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        add(genderPanel);

        submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String email = emailField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";

                User user = new User(name, age, email, gender);
                userController.addUser(user);
                
                new UserListView(userController).setVisible(true);
                dispose();
            }
        });
    }
}