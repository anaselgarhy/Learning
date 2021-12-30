package jprogressBar.examples.example2;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JProgressBar example 2");
        // Set Up the frame
        frame.setSize(300, 150);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar(); // Progress Bar أي قمنا بإنشاء JProgressBar هنا أنشأنا كائن من الكلاس

        // Set string of the progress bar
        progressBar.setString("Please wait");  // Progress Bar هنا قمنا بتحديد النص الذي سيظهر في الـ

        // Show string of progress bar
        progressBar.setStringPainted(true);  // ظاهراً Progress Bar هنا جعلنا نص الـ

        // infinity move
        progressBar.setIndeterminate(true);  // تتحرك يميناً و يساراً Progess Bar هنا جعلنا قيمة الـ

        // Set bounds of the progress bar
        progressBar.setBounds(70, 40, 140, 30);

        // Add the progress bar to the frame
        frame.add(progressBar);

        // Show the frame
        frame.setVisible(true);

    }
}
