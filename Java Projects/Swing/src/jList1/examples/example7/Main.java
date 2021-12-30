package jList1.examples.example7;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JList example 7");
        frame.setSize(530, 280);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> listModel = new DefaultListModel<>();

        // Model أي ثلاث قوائم. و كلها مبنية تستخدم نفس الـ ,JList هنا قمنا بتعريف ثلاث كائنات من الكلاس
        JList<String> list1 = new JList<>(listModel);
        JList<String> list2 = new JList<>(listModel);
        JList<String> list3 = new JList<>(listModel);

        JScrollPane list1ScrollPane = new JScrollPane(list1);
        JScrollPane list2ScrollPane = new JScrollPane(list2);
        JScrollPane list3ScrollPane = new JScrollPane(list3);

        // Add elements into model
        String[] elements = {"Mohamad", "Ahmad", "Salem", "Khaled", "Omar", "Said", "Anas", "Mostafa",
                            "Nadal", "Samir", "Mahmoud", "Rida", "Raja", "Ziad", "Fouad", "Mounir",
                            "Wassim", "Mansour", "Majd", "Kassem", "Ali", "Yahya", "Jamal"};
        for(String element : elements)
            listModel.addElement(element);

        // Set layout orientation for all lists
        // هنا قمنا بتحديد طريقة ظهور العناصر بداخل كل قائمة
        list1.setLayoutOrientation(JList.VERTICAL);
        list2.setLayoutOrientation(JList.VERTICAL_WRAP);
        list3.setLayoutOrientation(JList.HORIZONTAL_WRAP);

        // Set bounds for all scroll panes
        list1ScrollPane.setBounds(40, 40, 100, 150);
        list2ScrollPane.setBounds(200, 40, 120, 150);
        list3ScrollPane.setBounds(360, 40, 120, 150);

        // Add all components to the frame
        frame.add(list1ScrollPane);
        frame.add(list2ScrollPane);
        frame.add(list3ScrollPane);

        // Show th frame
        frame.setVisible(true);
    }
}
