package jcomboBox.examples.example2;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JComboBox example 2");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"JAva", "Kotlin", "Python", "C++", "C", "Lua"};

        JComboBox<String> langComboBox = new JComboBox<>(items);

        // Set bounds in frame for combo box
        langComboBox.setBounds(40, 40, 100, 30);

        // Add combo box in frame
        frame.add(langComboBox);

        // Show frame
        frame.setVisible(true);
    }
}
