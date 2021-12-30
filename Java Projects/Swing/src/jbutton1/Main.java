package jbutton1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JButton");
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Cairo", Font.PLAIN, 35);
        JButton button = new JButton("Click me!");
        button.setSize(250, 240);
        button.setFont(font);

        // Add button to frame
        frame.add(button);

        // show
        frame.setVisible(true);

    }
}
