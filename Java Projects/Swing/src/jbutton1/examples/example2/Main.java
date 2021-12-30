package jbutton1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JButton example 2");
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        Font font = new Font("Arial", Font.BOLD, 16);

        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);


        // Set font color
        button1.setForeground(Color.cyan);
        button2.setForeground(Color.red);
        button3.setForeground(Color.orange);

        // set background color
        button1.setBackground(Color.darkGray);
        button2.setBackground(Color.darkGray);
        button3.setBackground(Color.darkGray);

        // Add buttons to frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // show frame
        frame.setVisible(true);
    }
}
