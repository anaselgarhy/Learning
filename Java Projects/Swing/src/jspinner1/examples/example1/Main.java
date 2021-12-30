package jspinner1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JSpinner example 1");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSpinner spinner = new JSpinner();

        // Set bounds of spinner
        spinner.setBounds(100, 40, 100, 30);

        // Add spinner to frame
        frame.add(spinner);

        // Show frame
        frame.setVisible(true);
    }
}
