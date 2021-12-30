package jSplitPane1.examples.example2;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JSplitPane example 2");
        // Set Up the frame
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSplitPane splitPane = new JSplitPane();

        // Set divider location of split pane
        splitPane.setDividerLocation(184);

        // Set divider(splitter) of split pane size
        // 9px و جعلناه يساوي Splitter هنا قمنا بتحديد حجم الـ
        splitPane.setDividerSize(9); // 9 px

        // Splitter هنا قمنا بإضافة أسهم التحريك السريع على الـ
        splitPane.setOneTouchExpandable(true);

        // جعلنا الفريم يتم اعادة رسمة مباشرة اثناء التحريك)Splitter هنا قمنا بإخفاء اللون الأسود الذي يظهر عند تحريك الـ
        splitPane.setContinuousLayout(true);

        // Add the split pane to the frame
        frame.add(splitPane);

        // Show the frame
        frame.setVisible(true);
    }
}
