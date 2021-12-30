package jtabbedPane1.examples.example4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTabbedPane example 4");
        // Set Up the frame
        frame.setSize(320, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<JPanel> panels = new ArrayList<>();

        // Create 5 panels
        for(byte b = 0; b < 5; b++)
            panels.add(new JPanel());

        // Set the background color of all panels
        Color[] colors = {Color.white, Color.cyan, Color.yellow, Color.green, Color.red};
        for(JPanel panel : panels)
            panel.setBackground(colors[panels.indexOf(panel)]);


        // عند الحاجة Scroll Bar و جعله يضيف Tabs و تحديد مكان ظهور الـ Frame مع تحديد موقعه و حجمه في الـ Tabbed Pane هنا قمنا بتعريف
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM, JTabbedPane.SCROLL_TAB_LAYOUT);

        // Set the bounds for the tabbed pane
        tabbedPane.setBounds(50, 30, 200, 200);

        // Add all panels to the tabbed pane
        for(JPanel panel : panels)
            tabbedPane.addTab("Tab " + (panels.indexOf(panel) + 1), panel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Show the frame
        frame.setVisible(true);
    }
}
