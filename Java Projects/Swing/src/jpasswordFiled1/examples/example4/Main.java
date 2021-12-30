package jpasswordFiled1.examples.example4;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JPasswordField example 4");
        frame.setSize(460, 340);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name");
        JLabel passwordLabel = new JLabel("Password");
        JLabel userInfo = new JLabel();
        JTextField nameTextField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton button = new JButton("Get data");

        // Set bounds of elements (set location in frame and set size)
        nameLabel.setBounds(40, 40, 100, 30);
        passwordLabel.setBounds(40, 100, 100, 30);
        userInfo.setBounds(150, 220, 300, 30);
        nameTextField.setBounds(150, 40, 150, 30);
        passwordField.setBounds(150, 100, 150, 30);
        button.setBounds(150, 160, 150, 30);

        // Add elements to frame
        frame.add(nameLabel);
        frame.add(passwordLabel);
        frame.add(userInfo);
        frame.add(nameTextField);
        frame.add(passwordField);
        frame.add(button);

        // Show frame
        frame.setVisible(true);

        button.addActionListener(event -> userInfo.setText("Name: " + nameTextField.getText()
                + "     Password: " + String.valueOf(passwordField.getPassword())));
    }
}
