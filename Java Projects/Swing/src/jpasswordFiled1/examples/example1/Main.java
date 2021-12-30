package jpasswordFiled1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JPasswordFiled example 1");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(40, 40, 200, 30);

        frame.add(passwordField);

        frame.setVisible(true);
    }
}
