package jtextFiled1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextFiled");
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Cairo", Font.PLAIN, 35);
        JTextField textField = new JTextField("Enter your name");
        textField.setFont(font);
        
        // add text filed in frame
        frame.add(textField);
        
        // show frame
        frame.setVisible(true);
    }
}
