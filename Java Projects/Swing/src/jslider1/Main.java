package jslider1;

import javax.swing.*;
import java.awt.Font;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JSlider");
        // Set Up the frame
        frame.setSize(500, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider();
        JLabel label = new JLabel("Size: " + slider.getValue());

        // Set font for label
        label.setFont(new Font("Cairo", Font.PLAIN, slider.getValue()));

        // Set minor tick spacing for slider
        slider.setMinorTickSpacing(1);

        // Set major ticks spacing for slider
        slider.setMajorTickSpacing(10);

        // Sow tack spacing
        slider.setPaintTicks(true);

        // Show number major tick spacing
        slider.setPaintLabels(true);

        // Set bounds for all components
        slider.setBounds(50, 40, 400, 50);
        label.setBounds(50, 90, 400, 200);

        // Add all components to the frame
        frame.add(slider);
        frame.add(label);

        // Show the frame
        frame.setVisible(true);

        // Slider change listener
        slider.addChangeListener(event -> {
            label.setFont(new Font(label.getFont().getFontName(), label.getFont().getStyle(), slider.getValue()));
            label.setText("Size: " + slider.getValue());
        });

    }
}
