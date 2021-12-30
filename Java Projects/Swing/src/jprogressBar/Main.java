package jprogressBar;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JProgressBar");
        // Set Up the frame
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar();

        progressBar.setIndeterminate(true);

        // Set bounds of the progress bar
        progressBar.setBounds(70, 40, 140, 30);

        // Add progress bar to the frame
        frame.add(progressBar);

        // Show the frame
        frame.setVisible(true);

    }
}
