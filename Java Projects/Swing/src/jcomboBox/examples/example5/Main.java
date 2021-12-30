package jcomboBox.examples.example5;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    private static final JTextField textField = new JTextField();
    private static final JComboBox<String> comboBox = new JComboBox<>();
    private static final JButton addItemBtn = new JButton("Add");
    private static final JButton removeItemBtn = new JButton();
    private static final JButton removeAllItemsBtn = new JButton("Remove all");
    private static final JLabel countLabel = new JLabel();
    public static void main(String[] args){
        JFrame frame = new JFrame("JComboBox example 5");
        frame.setSize(500, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set remove item button text
        setRemoveItemBtnText();
        // set counter label text
        setCounterLabel();

        // Set bounds for all components
        textField.setBounds(40, 40, 110, 30);
        addItemBtn.setBounds(170, 40, 120, 30);
        removeItemBtn.setBounds(40, 80, 250, 30);
        removeAllItemsBtn.setBounds(40, 120, 250, 30);
        comboBox.setBounds(310, 40, 140, 30);
        countLabel.setBounds(310,80, 140, 30);

        // Add all components to frame
        frame.add(textField);
        frame.add(addItemBtn);
        frame.add(removeItemBtn);
        frame.add(removeAllItemsBtn);
        frame.add(comboBox);
        frame.add(countLabel);

        // disable remove buttons because the combo box are empty in the start program
        removeItemBtn.setEnabled(false);
        removeAllItemsBtn.setEnabled(false);

        // disable add button because the text filed are empty in the start program
        addItemBtn.setEnabled(false);

        // show frame
        frame.setVisible(true);

        // add item button event
        addItemBtn.addActionListener(event -> {
            comboBox.addItem(textField.getText());
            // Clean text field
            textField.setText("");
            // Set counter
            setCounterLabel();
            // enable remove buttons
            removeItemBtn.setEnabled(true);
            removeAllItemsBtn.setEnabled(true);
            // set Remove item button text
            setRemoveItemBtnText();
            // disable add item button
            addItemBtn.setEnabled(false);
        });

        // add remove item button event(Action)
        removeItemBtn.addActionListener(event -> {
            comboBox.removeItem(comboBox.getSelectedItem());
            // set count label
            setCounterLabel();
            //Set remove item button text
            setRemoveItemBtnText();
            if(comboBox.getItemCount() == 0){
                // disable remove buttons
                removeItemBtn.setEnabled(false);
                removeAllItemsBtn.setEnabled(false);
            }
        });

        // add remove all items button event
        removeAllItemsBtn.addActionListener(event -> {
            comboBox.removeAllItems();
            // Set count label
            setCounterLabel();
            // Set remove item button text
            setRemoveItemBtnText();
            // disable remove buttons
            removeItemBtn.setEnabled(false);
            removeAllItemsBtn.setEnabled(false);
        });

        // add text field event
        textField.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                addItemBtn.setEnabled(textField.getText().length() > 0); //
            }
        });
        // add combo box event
        comboBox.addItemListener(event -> setRemoveItemBtnText());
    }
    private static void setRemoveItemBtnText(){
        removeItemBtn.setText("Remove: " + (comboBox.getSelectedItem() == null? "None":comboBox.getSelectedItem()));
    }
    private static void setCounterLabel(){
        countLabel.setText("Number of items: " + comboBox.getItemCount());
    }
}
