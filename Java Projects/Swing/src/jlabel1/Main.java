package jlabel1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame("Welcome");
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        JLabel label = new JLabel("Text");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        window.add(label);
    }
}
