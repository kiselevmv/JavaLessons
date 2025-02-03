// Java program using swing
// to display the GUI 
import java.io.*;
import java.awt.*;
import javax.swing.*;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JMenu;

public class userGraphicInterface {
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

	userGraphicInterface() {
		//Create and set up the window.
        JFrame frame = new JFrame("School management system");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}

	public static void addComponentsToPane(Container pane) {
		if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        JButton button;
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;

		//Create the menu bar.
        menuBar = new JMenuBar();
        //Build the first menu.
		menu = new JMenu("A Menu");
		menu.getAccessibleContext().setAccessibleDescription(
        "The only menu in this program that has menu items");
		menuBar.add(menu);

        pane.setLayout(new GridBagLayout());
   		GridBagConstraints c = new GridBagConstraints();
    	if (shouldFill) {
    		//natural height, maximum width
    		c.fill = GridBagConstraints.HORIZONTAL;
    	}

    	button = new JButton("Add student");
    	if (shouldWeightX) {
   			c.weightx = 0.5;
    	}
    	c.fill = GridBagConstraints.VERTICAL;
    	c.gridx = 0;
    	c.gridy = 0;
    	pane.add(button, c);
 
    	button = new JButton("Add course");
    	c.fill = GridBagConstraints.VERTICAL;
   		c.weightx = 0.5;
    	c.gridx = 0;
    	c.gridy = 1;
    	pane.add(button, c);
 
    	button = new JButton("Assign grade");
    	c.fill = GridBagConstraints.VERTICAL;
    	c.weightx = 0.5;
    	c.gridx = 0;
    	c.gridy = 2;
    	pane.add(button, c);
 
    	button = new JButton("Search Student by Name");
    	c.fill = GridBagConstraints.VERTICAL;
    	c.ipady = 1;      //make this component tall
    	c.weightx = 0.5;
    	c.gridx = 0;
    	c.gridy = 3;
   		pane.add(button, c);
 
    	button = new JButton("List All Students");
    	c.fill = GridBagConstraints.VERTICAL;
    	c.ipady = 1;       //reset to default
    	c.weighty = 1.0;   //request any extra vertical space
    	// c.anchor = GridBagConstraints.PAGE_END; //bottom of space
    	// c.insets = new Insets(10,0,0,0);  //top padding
    	c.gridx = 0;       //aligned with button 2
    	// c.gridwidth = 2;   //2 columns wide
    	c.gridy = 4;       //third row
    	pane.add(button, c);
	}
}

