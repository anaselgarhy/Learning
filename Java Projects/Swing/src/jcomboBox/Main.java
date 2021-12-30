package jcomboBox;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JComboBox");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<String> comboBox = new JComboBox<>();

        comboBox.addItem("Arabic");
        comboBox.addItem("English");

        comboBox.setBounds(40, 40, 100, 30);

        frame.add(comboBox);

        frame.setVisible(true);
    }
}
