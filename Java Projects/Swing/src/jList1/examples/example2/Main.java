package jList1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JList example 2");
        frame.setSize(320, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Tajawal", Font.PLAIN, 16);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);

        // Set Background color for list
        list.setBackground(new Color(33, 150, 243));

        // Set font for list
        list.setFont(font);

        // Set bounds for scroll pane
        scrollPane.setBounds(100, 40, 100, 230);

        // Set font color
        list.setForeground(Color.white);

        // add elements for model
        listModel.addElement("red");                                  // و التي بدورها ستظهر في القائمة listModel هنا أضفنا عدة عناصر في الـ
        listModel.addElement("blue");
        listModel.addElement("green");
        listModel.addElement("yellow");
        listModel.addElement("orange");
        listModel.addElement("brown");
        listModel.addElement("pink");
        listModel.addElement("purple");
        listModel.addElement("gray");
        listModel.addElement("black");
        listModel.addElement("white");

        // add scroll pane to frame
        frame.add(scrollPane);

        // Show frame
        frame.setVisible(true);
    }
}
