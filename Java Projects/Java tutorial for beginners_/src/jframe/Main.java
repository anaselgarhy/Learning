package jframe;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame"); // create a new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        frame.setSize(450, 450); // set the size of the frame
        frame.setResizable(false); // set the frame to not be resizable
        frame.setLocationRelativeTo(null); // set the location of the frame to the center of the screen
        ImageIcon icon = new ImageIcon("icon.jpg"); // create a new image icon
        frame.setIconImage(icon.getImage()); // set the icon of the frame to the image icon
        frame.getContentPane().setBackground(Color.red); // set the background color of the frame to red
        frame.setVisible(true); // set the frame to be visible
    }
}
