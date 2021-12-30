package jList1.examples.example8;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JList example 8");
        frame.setSize(580, 230);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> listModel = new DefaultListModel<>();

        // Add elements to the list model
        for(String element: new String[]{"Mohamad", "Ahmad", "Salem", "Khaled", "Omar", "Said", "Anas", "Mostafa",
                "Nadal", "Samir", "Mahmoud", "Rida", "Raja", "Ziad", "Fouad", "Mounir",
                "Wassim", "Mansour", "Majd", "Kassem", "Ali", "Yahya", "Jamal"})
            listModel.addElement(element);

        JList<String> list1 = new JList<>(listModel);
        JList<String> list2 = new JList<>(listModel);
        JList<String> list3 = new JList<>(listModel);

        // Set selection mode for all lists
        // هنا قمنا بتحديد الطريقة التي يسمح فيها للمستخدم بإختيار العناصر في كل قائمة
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //  تستطيع فقط إختيار عنصر واحد منها
        list2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); // تستطيع إختيار قدر ما شئت من العناصر بشرط أن تكون كلها وراء بعضها
        list3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // تستطيع إختيار قدر ما شئت من العناصر بدون قيود

        // Create the scroll panes
        JScrollPane[] scrollPanes = {new JScrollPane(list1), new JScrollPane(list2), new JScrollPane(list3)}; // Look here

        // Set bounds for all components
        scrollPanes[0].setBounds(40, 40, 100, 150);
        scrollPanes[1].setBounds(200, 40, 120, 150);
        scrollPanes[2].setBounds(360, 40, 120, 150);

        // Add all components to the frame
        for(JScrollPane scrollPane : scrollPanes) // Look here
            frame.add(scrollPane);

        // Show the frame
        frame.setVisible(true);
    }
}
