package jprogressbar;

import javax.swing.*;
import java.awt.*;

public class ProgressBar {
    private JFrame frame;
    private JProgressBar progressBar;

    public ProgressBar() {
        frame = new JFrame("Progress Bar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420, 420);

        progressBar = new JProgressBar();
        progressBar.setBounds(2, 10, 400, 30);
        progressBar.setStringPainted(true);
        progressBar.setValue(0);
        progressBar.setFont(new Font("MV Boli", Font.PLAIN, 25));
        progressBar.setForeground(new Color(0xFAA61A));

        frame.add(progressBar);
        frame.setVisible(true);

        fillProgressBar();
    }

    private void fillProgressBar() {
        int count = 0;
        while (count <= 100) {
            progressBar.setValue(count);
            count++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        progressBar.setString("Done :)");
    }
}
