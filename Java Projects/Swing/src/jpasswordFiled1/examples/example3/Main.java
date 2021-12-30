package jpasswordFiled1.examples.example3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JPasswordField example 3");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(40, 40, 200, 30);
        passwordField.setEchoChar('\0');  // frame في الـ Password Field هنا قمنا بإظهار أي أحرف يتم إدخالها في الـ

        frame.add(passwordField);

        frame.setVisible(true);
    }
}
