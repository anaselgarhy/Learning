package jList1.examples.example3;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JList example 3");
        frame.setSize(550, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel itemsSelected = new JLabel("Selected items: ");
        JLabel numberItemSelected = new JLabel("Number of item selected: 0");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(list);

        // Set bounds
        listScrollPane.setBounds(20, 40, 100, 230);
        numberItemSelected.setBounds(140, 40, 340, 30);
        itemsSelected.setBounds(140, 80, 340, 30);

        // Add elements to model
        listModel.addElement("- Red");
        listModel.addElement("- Blue");
        listModel.addElement("- green");
        listModel.addElement("- yellow");
        listModel.addElement("- orange");
        listModel.addElement("- brown");
        listModel.addElement("- pink");
        listModel.addElement("- purple");
        listModel.addElement("- gray");
        listModel.addElement("- black");
        listModel.addElement("- white");

        // Add all components to frame
        frame.add(listScrollPane);
        frame.add(numberItemSelected);
        frame.add(itemsSelected);

        // Show frame
        frame.setVisible(true);

        // list event
        // list هنا نضع الأوامر التي نريدها أن تتنفذ عند إختيار أي عنصر موجود في القائمة
        list.addListSelectionListener(new ListSelectionListener(){ // Look here
            @Override
            public void valueChanged(ListSelectionEvent e) {
                numberItemSelected.setText("Number of items selected: " + list.getSelectedIndices().length);
                itemsSelected.setText("Items selected: " + list.getSelectedValuesList());
            }
        });
    }
}
