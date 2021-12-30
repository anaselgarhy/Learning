package jspinner1.examples.example6;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JSpinner example 6(me)");
        // Set Up the frame
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSpinner spinner = new JSpinner(new SpinnerDateModel());
        JLabel label = new JLabel("" + spinner.getValue());

        // Set bounds for all components
        spinner.setBounds(50, 40, 150, 30);
        label.setBounds(50, 80, 250, 30);

        // Add all components to the frame
        frame.add(spinner);
        frame.add(label);

        // Show the frame
        frame.setVisible(true);

        // Spinner change listener
        spinner.addChangeListener(event -> label.setText("" + spinner.getValue()));
    }
}
