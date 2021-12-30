package jcomboBox.examples.example3;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JComboBox example 3");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"Java", "Kotlin", "Python", "C++", "Lua", "C"};

        Font font = new Font("Arial", Font.BOLD, 16);

        JComboBox<String> langComboBox = new JComboBox<>(items);

        // Set font for combo box
        langComboBox.setFont(font);

        // Set bounds
        langComboBox.setBounds(90, 40, 100, 30);

        // Set font color for combo box
        langComboBox.setForeground(new Color(255, 255, 255));

        // Set background color for combo box
        langComboBox.setBackground(new Color(3, 169, 244));

        // Add combo box to frame
        frame.add(langComboBox);

        // Show frame
        frame.setVisible(true);
    }
}
