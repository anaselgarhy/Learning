package jList1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JList example 1");
        frame.setSize(320, 360);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Model أي كأننا قمنا بتعريف .DefaultListModel هنا قمنا بإنشاء كائن من الكلاس
        DefaultListModel<String> listModel = new DefaultListModel<>();
        // أي قمنا بتعريف القائمة .model مبنية على الكائن JList هنا قمنا بتعريف كائن من الكلاس
        JList<String> list = new JList<>(listModel);
        // عند الحاجة Scroll Bar لضمان ظهور JScrollPane بداخل كائن من الكلاس list هنا وضعنا الـ
        JScrollPane scrollPane = new JScrollPane(list);

        // Add elements in model
        // و التي بدورها ستظهر في القائمة model هنا أضفنا عدة عناصر في الـ
        listModel.addElement("Java");
        listModel.addElement("Kotlin");
        listModel.addElement("C++");
        listModel.addElement("Python");
        listModel.addElement("JavaScript");
        listModel.addElement("C");
        listModel.addElement("Lua");

        // Set bounds for scroll pane(list)
        scrollPane.setBounds(100, 40, 100, 230);

        // Add scroll pane to frame
        frame.add(scrollPane);

        // Show frame
        frame.setVisible(true);
    }
}
