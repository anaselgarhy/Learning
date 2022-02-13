package jlable;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hey bro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        JLabel label = new JLabel(); // Create a label
        label.setText("Bro, do you even code?"); // Set the text

        ImageIcon image = new ImageIcon("emoji.png");

        label.setIcon(image); // Set the image

        label.setHorizontalAlignment(JLabel.CENTER); // Set the alignment of the label

        label.setHorizontalTextPosition(JLabel.CENTER); // Set the alignment of the text
        label.setVerticalTextPosition(JLabel.TOP); // Set the alignment of the text
        label.setForeground(new Color(0x00ff00)); // Set the color of the text
        label.setFont(new Font("MV Boli", Font.PLAIN, 35)); // Set the font of the text

        label.setIconTextGap(-25); // Set the gap between the image and the text

        label.setBackground(Color.black); // Set the background color
        label.setOpaque(true); // Set the background color to be opaque (not transparent)

        // Border
        Border border = BorderFactory.createLineBorder(Color.green,  6);

        label.setBorder(border); // Set the border



        frame.getContentPane().setBackground(new Color(0x000000)); // Set the background color of the frame

        frame.add(label); // Add the label to the frame


        frame.setVisible(true);
    }
}
