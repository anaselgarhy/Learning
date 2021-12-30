package jcomboBox.examples.example4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JComboBox example 4");
        frame.setSize(360, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"Java", "Kotlin", "Python", "C++", "Lua", "C"};

        Font font = new Font("Tajawal", Font.PLAIN, 16);

        JComboBox<String> langComboBox = new JComboBox<>(items);
        JButton button = new JButton("Get");
        JLabel label = new JLabel("You select: " + items[0]);

        // Set font for all components
        langComboBox.setFont(font);
        button.setFont(font);
        label.setFont(font);

        // Set bounds for all components
        langComboBox.setBounds(40, 40, 100, 30);
        button.setBounds(160, 40, 100, 30);
        label.setBounds(40, 80, 200, 30);

        // Add all components to frame
        frame.add(langComboBox);
        frame.add(button);
        frame.add(label);

        // Show frame
        frame.setVisible(true);

        // button event listener
        button.addActionListener(event -> label.setText("You select: " + langComboBox.getSelectedItem()));
    }
}
