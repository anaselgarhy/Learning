package joptionPane1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JOptionPane example 1");
        // Set Up the frame
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Display plan dialog");
        JButton button2 = new JButton("Display information dialog");
        JButton button3 = new JButton("Display warning dialog");
        JButton button4 = new JButton("Display error dialog");
        JButton button5 = new JButton("Display question dialog");

        // Set the bounds for all buttons
        button1.setBounds(95, 10, 200, 30);
        button2.setBounds(95, 50, 200, 30);
        button3.setBounds(95, 90, 200, 30);
        button4.setBounds(95, 130, 200, 30);
        button5.setBounds(95, 170, 200, 30);

        // Add all buttons in the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        // Show the frame
        frame.setVisible(true);

        // Add button 1 action listener
        button1.addActionListener(event ->
                JOptionPane.showMessageDialog(null, "This is a plain message", "Plain massage", JOptionPane.PLAIN_MESSAGE));

        // Add button 2 action listener
        button2.addActionListener(event ->
                JOptionPane.showMessageDialog(null, "This is an information message", "Information message", JOptionPane.INFORMATION_MESSAGE));

        // Add button 3 action listener
        button3.addActionListener(event ->
                JOptionPane.showMessageDialog(null, "This is a warning message", "Warning message", JOptionPane.WARNING_MESSAGE));

        // Add button 4 action Listener
        button4.addActionListener(event ->
                JOptionPane.showMessageDialog(null, "This is an error message", "Warning message", JOptionPane.ERROR_MESSAGE));

        // Add button 5 action listener
        button5.addActionListener(event ->
                JOptionPane.showMessageDialog(null, "This ia a question message", "Question message", JOptionPane.QUESTION_MESSAGE));
    }
}
