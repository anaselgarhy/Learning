package jdialog.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JDialog example 1");
        // Set Up the frame
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CustomDialog customDialog = new CustomDialog(frame);

        JButton button = new JButton("Show the custom dialog");

        // Set the bounds for the button
        button.setBounds(40, 80, 200, 30);

        // Add the button to the frame
        frame.add(button);

        // Show the frame
        frame.setVisible(true);

        // Add button action listener
        button.addActionListener(event -> customDialog.show());
    }
}
