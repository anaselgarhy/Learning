package jradioButton1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JRadioButton example 2");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 16);

        JRadioButton radioButton1 = new JRadioButton("Red", true);
        JRadioButton radioButton2 = new JRadioButton("Blue");
        JRadioButton radioButton3 = new JRadioButton("Gray");

        // Set font for all radio buttons
        radioButton1.setFont(font);
        radioButton2.setFont(font);
        radioButton3.setFont(font);

        // Set color for all radio buttons
        radioButton1.setForeground(Color.red);
        radioButton2.setForeground(Color.blue);
        radioButton3.setForeground(new Color(128, 128, 128)); // Look here

        // Set Bounds for all radio buttons
        radioButton1.setBounds(40, 40, 100, 30);
        radioButton2.setBounds(40, 70, 100, 30);
        radioButton3.setBounds(40, 100, 100, 30);

        // Add all radio buttons to frame
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);

        // show frame
        frame.setVisible(true);
    }
}
