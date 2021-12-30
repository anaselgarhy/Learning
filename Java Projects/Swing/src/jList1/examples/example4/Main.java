package jList1.examples.example4;

import javax.swing.*;

public class Main {

    private static final JLabel selectedItems = new JLabel();
    private static final JLabel numOfSelectedItems = new JLabel();
    private static final JList<String> list = new JList<>(new String[]{"Red", "Blue", "Green", "Yellow", "Orange",
                                                                        "Brown", "Pink", "Purple", "Gray", "Black",
                                                                    "White"}); // Look here
    private static final JScrollPane scrollPane = new JScrollPane(list);
    private static final JButton button = new JButton("View selected");
    public static void main(String[] args){
        JFrame frame = new JFrame("JList example 4");
        frame.setSize(550, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set selected items label text
        setSelectedItems();
        // Set number of selected items label text
        setNumOfSelectedItems();

        // Set bounds for all components
        scrollPane.setBounds(20, 40, 100, 230);
        button.setBounds(140, 40, 150, 30);
        selectedItems.setBounds(140, 80, 340, 30);
        numOfSelectedItems.setBounds(140, 120, 340, 30);

        // Add all components to frame
        frame.add(scrollPane);
        frame.add(button);
        frame.add(selectedItems);
        frame.add(numOfSelectedItems);

        //Show frame
        frame.setVisible(true);

        // button event
        button.addActionListener(event -> {
            // Set selected items values
            setSelectedItems();
            // Set number of selected items
            setNumOfSelectedItems();
        });

    }
    private static void setSelectedItems(){
        selectedItems.setText("Selected items: " +
                (list.getSelectedValuesList().toArray().length == 0 ? "none": list.getSelectedValuesList()));
    }
    private static void setNumOfSelectedItems(){
        numOfSelectedItems.setText("Number of select: " + list.getSelectedIndices().length);
    }
}
