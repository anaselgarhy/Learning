package jList1.examples.example5;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JList example 5");
        frame.setSize(350, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Select language");
        DefaultListModel<String> listModel1 = new DefaultListModel<>();
        JList<String> list1 = new JList<>(listModel1);
        JScrollPane scrollPane1 = new JScrollPane(list1);

        JLabel label2 = new JLabel("Select level");
        JList<Byte> list2 = new JList<>(new Byte[]{101, 102, 103, 104});
        JScrollPane scrollPane2 = new JScrollPane(list2);

        JButton button = new JButton("View selected");
        JLabel selectedLabel = new JLabel("", JLabel.CENTER); // Look here

        // Add elements to list model 1
        listModel1.addElement("Java");
        listModel1.addElement("Kotlin");
        listModel1.addElement("Dart");
        listModel1.addElement("C++");
        listModel1.addElement("C");
        listModel1.addElement("Lua");
        listModel1.addElement("Python");

        // set selection mode for list1
        // هنا جعلنا المستخدم لا يستطيع إختيار أكثر من قيمة منها في وقت واحد
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Set selection mode for list2
        // هنا جعلنا المستخدم لا يستطيع إختيار أكثر من قيمة منها في وقت واحد
        list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Set default selection for list 1
        list1.setSelectedIndex(0);

        // Set default section for list 2
        list2.setSelectedIndex(0);

        // Set bounds for all components
        label1.setBounds(50, 25, 100, 30);
        scrollPane1.setBounds(50, 60, 100, 94);
        label2.setBounds(190, 25, 100, 30);
        scrollPane2.setBounds(190, 60, 100, 94);
        button.setBounds(100, 200, 130, 30);
        selectedLabel.setBounds(0, 250, 350, 30);


        // Add all components to frame
        frame.add(label1);
        frame.add(scrollPane1);
        frame.add(label2);
        frame.add(scrollPane2);
        frame.add(button);
        frame.add(selectedLabel);

        // show frame
        frame.setVisible(true);
        // Button event
        button.addActionListener(event -> selectedLabel.setText("You Select: " + list1.getSelectedValue() + " language, and select: " + list2.getSelectedValue()));
    }
}
