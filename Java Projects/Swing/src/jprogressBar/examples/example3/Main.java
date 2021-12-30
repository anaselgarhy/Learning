package jprogressBar.examples.example3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JProgressBar example 3");
        // Set Up the frame
        frame.setSize(300, 150);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar();

        // Show progress bar string
        progressBar.setStringPainted(true);

        // Set bounds of the progress bar
        progressBar.setBounds(70, 40, 140, 30);

        // Add the progress bar to the frame
        frame.add(progressBar);

        // Show the frame
        frame.setVisible(true);

        //
        while(!Thread.currentThread().isInterrupted() && progressBar.getValue() != progressBar.getMaximum()){ // Look here
            // Set value of progress bar
            // كل 0.1 ثانية Progress Bar هنا سيتم إضافة 10 على قيمة الـ
            progressBar.setValue(progressBar.getValue() + 10); // Look here
            try{
                Thread.sleep(100);
            } catch(InterruptedException ignored){} // Look here
        }
    }
}
