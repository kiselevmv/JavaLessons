// UserListView.java - GUI to display user data

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class UserListView extends JFrame {
    private JTextArea userTextArea;
    private JButton addUserButton, toggleViewButton;
    private UserController userController;
    private boolean showAll;

    public UserListView(UserController userController) {
        this.userController = userController;
        this.showAll = false;
        
        setTitle("User List");
        setSize(300, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userTextArea = new JTextArea();
        add(new JScrollPane(userTextArea), BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        addUserButton = new JButton("Add New User");
        toggleViewButton = new JButton("Show All Users");
        buttonPanel.add(addUserButton);
        buttonPanel.add(toggleViewButton);
        add(buttonPanel, BorderLayout.SOUTH);
        
        addUserButton.addActionListener(e -> {
            new UserFormView(userController).setVisible(true);
            dispose();
        });
        
        toggleViewButton.addActionListener(e -> {
            showAll = !showAll;
            toggleViewButton.setText(showAll ? "Show Latest User" : "Show All Users");
            updateUserTextArea();
        });
        
        updateUserTextArea();
    }

    private void updateUserTextArea() {
        userTextArea.setText("");
        if (showAll) {
            for (User user : userController.getUsers()) {
                userTextArea.append(user.toString() + "\n");
            }
        } else if (!userController.getUsers().isEmpty()) {
            userTextArea.append(userController.getUsers().get(userController.getUsers().size() - 1).toString());
        }
    }
}
