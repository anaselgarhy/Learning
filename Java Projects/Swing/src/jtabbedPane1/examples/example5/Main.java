package jtabbedPane1.examples.example5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTabbedPane example 5");
        // Set Up the frame
        frame.setSize(320, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final int numOfTabs = 5;
        JPanel[] panels = new JPanel[numOfTabs];

        // Create 5 panels
        for(byte b = 0; b < numOfTabs; b++)
            panels[b] = new JPanel();

        // Set the background color of all panels
        Color[] colors = {Color.white, Color.cyan, Color.yellow, Color.green, Color.red};
        for(byte b = 0; b < numOfTabs; b++)
            panels[b].setBackground(colors[b]);

        // عند الحاجة Scroll Bar و جعله يضيف Tabs و تحديد مكان ظهور الـ Frame مع تحديد موقعه و حجمه في الـ Tabbed Pane هنا قمنا بتعريف
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);

        // Set the bounds for tabbed pane
        tabbedPane.setBounds(50, 30, 200, 200);

        // Tabs و الذي بدوره سيمثل الأيقونة التي سنضعها للـImageIcon هنا قمنا بتحديد رابط الأيقونة ثم قمنا بتعريف كائن من الكلاس
        URL tabIconUrl = Main.class.getResource("./resources/icon.png");
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(tabIconUrl));

        // Add all panels to the tabbed pane
        for(byte b = 0; b < numOfTabs; b++)
            tabbedPane.addTab("Tab" + (b + 1), icon, panels[b]);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Show the frame
        frame.setVisible(true);
    }
}
