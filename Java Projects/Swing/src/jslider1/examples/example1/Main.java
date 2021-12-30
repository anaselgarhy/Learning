package jslider1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JSlider example 1");
        // Set Up the frame
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider();

        // Set bounds of slider
        slider.setBounds(40, 80, 200, 30);

        // Add slider to the frame
        frame.add(slider);

        // Show frame
        frame.setVisible(true);
    }
}
