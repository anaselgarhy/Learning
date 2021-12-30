package jlabel1.examples.example3;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JLabel example 3");
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Aria", Font.BOLD, 35);

        JLabel label1 = new JLabel("Anas ");
        JLabel label2 = new JLabel("Elgarhy");

        label1.setFont(font);
        label2.setFont(font);

        // Set color
        label1.setForeground(Color.RED);
        label2.setForeground(Color.green);

        // add labels in window
        frame.add(label1);
        frame.add(label2);

        frame.setVisible(true);
    }
}
