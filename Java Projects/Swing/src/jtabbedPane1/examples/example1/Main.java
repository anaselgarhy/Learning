package jtabbedPane1.examples.example1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTabbedPane example 1");
        // Set Up the frame
        frame.setSize(320, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        // Set background of all panels
        panel1.setBackground(new Color(247, 83, 77));
        panel2.setBackground(new Color(125, 77, 247));
        panel3.setBackground(new Color(123, 166, 240));

        JTabbedPane tabbedPane = new JTabbedPane();

        // Set the bounds for the tabbed pane
        tabbedPane.setBounds(50, 30, 200, 200);

        // Add all panels in the tabbed pane
        // منهم فيه Panel مع تحديد عنوان كل Tabbed Pane في الـ Panels هنا وضعنا الثلاثة
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Show the frame
        frame.setVisible(true);
    }
}
