package jtabbedPane1.examples.example3;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTabbedPane example 3");
        // Set Up the frame
        frame.setSize(320, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // Set background color of all panels
        panel1.setBackground(Color.white);
        panel2.setBackground(Color.cyan);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.green);
        panel5.setBackground(Color.red);

        // عند الحاجة Scroll Bar و جعله يضيف Tabs و تحديد مكان ظهور الـ Frame مع تحديد موقعه و حجمه في الـ Tabbed Pane هنا قمنا بتعريف
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);

        // Set the bounds of the tabbed pane
        tabbedPane.setBounds(50, 30, 200, 200);

        // Add all panels to tha tabbed pane
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);
        tabbedPane.addTab("Tab 4", panel4);
        tabbedPane.addTab("Tab 5", panel5);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Show the frame
        frame.setVisible(true);
    }
}
