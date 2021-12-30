package jSplitPane1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JSplitPane example 1");
        // Set Up the  frame
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSplitPane splitPane = new JSplitPane();

        // Set location of the split pane
        splitPane.setDividerLocation(184); // splitPane في الـ Splitter هنا قمنا بتحديد موقع الـ

        // Add the split pane to the frame
        frame.add(splitPane); // لتقسيمها إلى قسمين أساسيين frame في الـ splitPane هنا أضفنا الـ

        // Show the frame
        frame.setVisible(true);
    }
}
