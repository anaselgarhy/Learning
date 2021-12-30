package jtabbedPane1.examples.example6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTabbedPane example 6");
        // Set Up the frame
        frame.setSize(420, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<JPanel> panels = new ArrayList<>();

        // Create 6 panels
        for(byte b = 0; b < 6; b++)
            panels.add(new JPanel());

        // Set random background color for all panels
        for(JPanel panel : panels)
            panel.setBackground(new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));

        // عند الحاجة Scroll Bar و جعله يضيف Tabs و تحديد مكان ظهور الـ Frame مع تحديد موقعه و حجمه في الـ Tabbed Pane هنا قمنا بتعريف
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);

        // Set bounds for the tabbed pane
        tabbedPane.setBounds(50, 30, 300, 200);

        // Add all panels to the tabbed pane
        // منهم فيه Panel مع تحديد عنوان كل Tabbed Pane في الـ Panels هنا وضعنا جميع الـ
        for(JPanel panel : panels)
            tabbedPane.addTab("Tab " + (panels.indexOf(panel) + 1), panel);

        // حتى يتم إضافة زر للخروج لكل واحد منهم SpecialTab إلى tabbedPane الموجودة بداخل الـ Tabs هنا أنشأنا حلقة تقوم بتحويل جميع الـ
        for(int i = 0; i < tabbedPane.getTabCount(); i++)
            tabbedPane.setTabComponentAt(i, new SpecialTab(tabbedPane));

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Show the frame
        frame.setVisible(true);
    }
}
