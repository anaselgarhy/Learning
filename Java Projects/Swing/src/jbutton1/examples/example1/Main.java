package jbutton1.examples.example1;

import javax.swing.*;
import java.awt.FlowLayout;
public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JButton example 1");
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Button");

        // Add button to frame
        frame.add(button);
        // Show frame
        frame.setVisible(true);
    }
}
