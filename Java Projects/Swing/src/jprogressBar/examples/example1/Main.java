package jprogressBar.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JProgressBar example 1");
        // Set Up the frame
        frame.setSize(300, 150);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar(0, 1000); // قيمه بين 0-1000 Progress Bar أي قمنا بإنشاء JProgressBar هنا أنشأنا كائن من الكلاس

        // Set value of progress bar
        // Progress Bar هنا قمنا بتحديد قيمة الـ
        progressBar.setValue(250); // 25%

        // Show value of progress bar
        progressBar.setStringPainted(true); // ظاهرة Progress Bar هنا جعلنا قيمة الـ

        // Set bounds of progress bar
        progressBar.setBounds(70, 40, 140, 30);

        // Add the progress bar to the frame
        frame.add(progressBar);

        // Show the frame
        frame.setVisible(true);
    }
}
