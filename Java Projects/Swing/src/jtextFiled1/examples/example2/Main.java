package jtextFiled1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextFiled example 2");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 16);

        JTextField textField1 = new JTextField("Red text");
        JTextField textField2 = new JTextField("Blue text");
        JTextField textField3 = new JTextField("Gray text");

        textField1.setFont(font);
        textField2.setFont(font);
        textField3.setFont(font);

        textField1.setBounds(40, 40, 200, 30);
        textField2.setBounds(40, 80, 200, 30);
        textField3.setBounds(40, 120, 200, 30);

        textField1.setForeground(Color.red);
        textField2.setForeground(Color.blue);
        textField3.setForeground(Color.gray);

        // Add texts fields
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);

        // show frame
        frame.setVisible(true);


    }
}
