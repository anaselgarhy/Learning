package jtextFiled1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextFiled example 1");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField textField = new JTextField();
        textField.setBounds(40, 40, 200, 40);
        
        frame.add(textField);
        frame.setVisible(true);
    }
}
