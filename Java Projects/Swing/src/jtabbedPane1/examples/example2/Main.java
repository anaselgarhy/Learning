package jtabbedPane1.examples.example2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTabbedPane example 2");
        // Set Up the frame
        frame.setSize(320, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<JPanel> panels = new ArrayList<>();

        // Create 6 panels in arrayList
        for(byte b = 0; b < 6; b++)
            panels.add(new JPanel());

        // Set random background color of all panels
        for(JPanel panel : panels)
            panel.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));

        JTabbedPane tabbedPane = new JTabbedPane();

        // Set the bounds of tabbed pane
        tabbedPane.setBounds(50, 30, 200, 200);

        // Add all panels in the tabbed pane
        for(JPanel panel : panels)
            tabbedPane.addTab("Tab " + (panels.indexOf(panel) + 1), panel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Show the frame
        frame.setVisible(true);
    }
}
