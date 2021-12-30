package jList1.examples.example6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    private static final JFrame frame = new JFrame("JList example 6");
    private static final JLabel label = new JLabel("Enter item");
    private static final JTextField textField = new JTextField();
    private static final JButton addItemButton = new JButton("Add item");
    private static final JButton removeItemButton = new JButton("Remove item");
    private static final JButton removeAllItemsButton = new JButton("Remove all items");
    private static final DefaultListModel<String> listModel = new DefaultListModel<>();
    private static final JList<String> list = new JList<>(listModel);
    private static final JScrollPane listScrollPane = new JScrollPane(list);
    private static final JLabel totalItems = new JLabel();
    public static void main(String[] args){
        frame.setSize(590, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //
        setItemCounter();

        // Set bounds for all components
        label.setBounds(20, 80, 70, 30);
        textField.setBounds(100, 80, 100, 30);
        addItemButton.setBounds(220, 80, 140, 30);
        removeItemButton.setBounds(220, 120, 140, 30);
        removeAllItemsButton.setBounds(220, 160, 140, 30);
        listScrollPane.setBounds(390, 40, 150, 180);
        totalItems.setBounds(390, 230, 100, 30);

        // Add all components to frame
        Component[] components = {label, textField, addItemButton, removeItemButton, removeAllItemsButton, listScrollPane, totalItems};
        for(Component c : components)
            frame.add(c);

        // Disable add item and remove item and remove all items buttons
        addItemButton.setEnabled(false);
        removeItemButton.setEnabled(false);
        removeAllItemsButton.setEnabled(false);

        // show frame
        frame.setVisible(true);

        // if user start write in the text field enable tha add item button
        textField.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {
                    addItemButton.setEnabled(textField.getText().length() > 0);
            }
        });

        // Add item button event
        addItemButton.addActionListener(event -> {
           // add item to model
           listModel.addElement(textField.getText());
           // Set total items number
            setItemCounter();
           // Clean the text field
            textField.setText("");
            // Disable the add item button
            addItemButton.setEnabled(false);
            // Enable a remove item and remove all items buttons
            removeItemButton.setEnabled(true);
            removeAllItemsButton.setEnabled(true);
        });

        // Remove button event
        removeItemButton.addActionListener(event -> {
            if(list.getSelectedIndex() != -1){
                int[] temp = list.getSelectedIndices();
                for(int i = temp.length - 1; i>=0; i--)
                    listModel.removeElementAt(i);
                // set item counter
                setItemCounter();
            }
        });

        // Remove all items button event
        removeAllItemsButton.addActionListener(event -> {
           listModel.removeAllElements();
           setItemCounter();
        });
    }
    private static void setItemCounter(){
    totalItems.setText("Total items: " + listModel.getSize());
    }
}
