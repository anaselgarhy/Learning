package jtextFiled1.examples.example3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextField example 3");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter any thing");
        label.setBounds(40, 40, 100, 30);
        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(150, 120, 150, 30);
        JTextField textField = new JTextField();
        textField.setBounds(150, 40, 150, 30);
        JButton button = new JButton("Get text");
        button.setBounds(40, 120, 80, 30);

        // Add elements to frame
        frame.add(label);
        frame.add(resultLabel);
        frame.add(textField);
        frame.add(button);

        button.addActionListener(evt -> resultLabel.setText(textField.getText())); // I use lambda expiration here
        frame.setVisible(true);
    }
}
