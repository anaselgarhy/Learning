package jlabel1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JLabel example 2");
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Serif", Font.BOLD, 35); // Create font object

        JLabel label = new JLabel("Anas Ahmed");
        label.setFont(font);
        frame.add(label);
        frame.setVisible(true);
    }
}
