package jspinner1.examples.example3;

import javax.swing.*;

public class Main {
    private static final JFrame frame = new JFrame("JSpinner example 3");
    private static final JSpinner spinner = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
    private static final JLabel label = new JLabel("Value: " + spinner.getValue());

    public static void main(String[] args){
        // Setup the frame
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set bounds for all components
        spinner.setBounds(100, 40, 100, 30);
        label.setBounds(100, 80, 100, 30);

        // Add all components to the frame
        frame.add(spinner);
        frame.add(label);

        // Show the frame
        frame.setVisible(true);

        // Spinner change listener
        spinner.addChangeListener(event -> label.setText("Value: " + spinner.getValue()));
    }
}
