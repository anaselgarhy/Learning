package jprogressBar.examples.example4;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JProgressBar example 4");

        JLabel label1 = new JLabel("Password");
        JLabel label2 = new JLabel("Strength");
        JPasswordField passwordField = new JPasswordField();
        JProgressBar passwordStrength = new JProgressBar(0, 10);

        // Set bounds for all components
        label1.setBounds(20, 20, 60, 30);
        passwordField.setBounds(90, 20, 140, 30);
        label2.setBounds(20, 60, 60, 30);
        passwordStrength.setBounds(90, 68, 140, 15);

        // Add all components to the frame
        frame.add(label1);
        frame.add(passwordField);
        frame.add(label2);
        frame.add(passwordStrength);

        // Set Up the frame
        frame.setSize(300, 150);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Show the frame
        frame.setVisible(true);

        // password هنا نضع الأوامر التي نريد تنفيذها عند كتابة أو حذف أي حرف موجود في مربع الـ
        passwordField.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){}
            @Override
            public void keyPressed(KeyEvent e){}
            @Override
            public void keyReleased(KeyEvent e){
                int passwordLength = passwordField.getPassword().length;
                // Set value of the progress bar
                passwordStrength.setValue(passwordLength);
                if(passwordLength < 5) // Set the color of the progress bar to red
                    passwordStrength.setForeground(Color.red);
                else if(passwordLength < 10) // Set the color of the progress bar to yellow
                    passwordStrength.setForeground(Color.yellow);
                else // Set the color of the progress bar to green
                    passwordStrength.setForeground(Color.green);
            }
        });
    }
}
