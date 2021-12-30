package jlabel1.examples.example1;

import javax.swing.*;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JLabel example 1");
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to swing", SwingConstants.CENTER);
        frame.add(label);
        frame.setVisible(true);

    }
}
