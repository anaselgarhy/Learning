package jcheckBox1.examples.example4;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JCheckBox example 4");
        frame.setSize(440, 150);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField();
        JCheckBox showPasswordCheckBox = new JCheckBox("Show characters");

        // Set bounds for all components
        label.setBounds(40, 40, 100, 30);
        passwordField.setBounds(120, 40, 130, 30);
        showPasswordCheckBox.setBounds(270, 40, 150, 30);

        // Add all components to frame
        frame.add(label);
        frame.add(passwordField);
        frame.add(showPasswordCheckBox);

        // show frame
        frame.setVisible(true);

        // Add showPasswordCheckBox ItemListener
        showPasswordCheckBox.addItemListener(event -> { // Look here
            if(showPasswordCheckBox.isSelected())
                passwordField.setEchoChar('\0'); // show password
            else
                passwordField.setEchoChar('•');
        });
    }
}
