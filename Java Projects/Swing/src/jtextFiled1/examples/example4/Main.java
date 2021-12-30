package jtextFiled1.examples.example4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextFiled example 4");
        frame.setSize(550, 120);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Tajawal", Font.PLAIN, 20);

        JTextField num1Filed = new JTextField();
        JTextField num2Filed = new JTextField();
        num1Filed.setFont(font);
        num2Filed.setFont(font);

        num1Filed.setBounds(40, 40, 80, 30);
        num2Filed.setBounds(160, 40, 80, 30);

        JLabel label = new JLabel("+");
        label.setFont(font);
        label.setBounds(135, 40, 50, 30);

        JLabel resultLabel = new JLabel();
        resultLabel.setFont(font);
        resultLabel.setBounds(340, 40, 180, 30);

        JButton button = new JButton("=");
        button.setFont(font);
        button.setBounds(270, 40, 50, 30);

        // Add elements to frame
        frame.add(num1Filed);
        frame.add(num2Filed);
        frame.add(label);
        frame.add(button);
        frame.add(resultLabel);

        button.addActionListener(event -> {
            try{
                resultLabel.setForeground(Color.green.darker());
                resultLabel.setText(
                        "" + (Double.parseDouble(num1Filed.getText()) + Double.parseDouble(num2Filed.getText()))
                );
            } catch (Exception e){
                resultLabel.setForeground(Color.red);
                resultLabel.setText("Error in the inputs!");
            }
        });
        // show frame
        frame.setVisible(true);

    }
}
