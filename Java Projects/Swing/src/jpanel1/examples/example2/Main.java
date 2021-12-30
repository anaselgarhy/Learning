package jpanel1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JPanel example 2");
        // Set Up the frame
        frame.setSize(300, 240);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // Set the background of the panel
        panel.setBackground(Color.gray);

        // Set the bounds for the panel
        panel.setBounds(50, 50, 180, 110);

        // Add the panel in the frame
        frame.add(panel);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        // Set background of all buttons
        button1.setBackground(Color.orange);
        button2.setBackground(Color.yellow);
        button3.setBackground(Color.green);
        button4.setBackground(Color.pink);

        // Add all buttons in the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // Show the frame
        frame.setVisible(true);
    }
}
