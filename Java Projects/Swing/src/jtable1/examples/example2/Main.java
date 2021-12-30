package jtable1.examples.example2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    private static final JFrame frame = new JFrame("JTable example 2");
    private static final JLabel label1 = new JLabel("ID");
    private static final JLabel label2 = new JLabel("Name");
    private static final JLabel label3 = new JLabel("Phone");
    private static final JTextField idTextField = new JTextField();
    private static final JTextField nameTextField = new JTextField();
    private static final JTextField phoneTextField = new JTextField();
    private static final JButton addButton = new JButton("Add");
    private static final JButton clearButton = new JButton("Clear");
    private static final DefaultTableModel tableModel = new DefaultTableModel();
    private static final JTable table = new JTable(tableModel);
    private static final JScrollPane tableScrollPane = new JScrollPane(table);
    private static final JButton deleteButton = new JButton("Delete");
    private static final JButton deleteAllButton = new JButton("Delete all");
    public static void main(String[] args){
        // Set Up the frame
        frame.setSize(710, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set columns for table model
        for(String columnName : new String[]{"ID", "Name", "Phone"})
            tableModel.addColumn(columnName);

        // Set bounds for all components
        label1.setBounds(40, 50, 50, 20);
        label2.setBounds(40, 90, 50, 20);
        label3.setBounds(40, 130, 50, 20);
        idTextField.setBounds(100, 50, 120, 20);
        nameTextField.setBounds(100, 90, 120, 20);
        phoneTextField.setBounds(100, 130, 120, 20);
        addButton.setBounds(150, 180, 70, 30);
        clearButton.setBounds(70, 180, 70, 30);
        tableScrollPane.setBounds(280, 50, 370, 160);
        deleteButton.setBounds(315, 250, 140, 30);
        deleteAllButton.setBounds(470, 250, 140, 30);

        // Add All components to the frame
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(idTextField);
        frame.add(nameTextField);
        frame.add(phoneTextField);
        frame.add(addButton);
        frame.add(clearButton);
        frame.add(tableScrollPane);
        frame.add(deleteButton);
        frame.add(deleteAllButton);

        // Show the frame
        frame.setVisible(true);

        // Add button action listener
        addButton.addActionListener(event -> {
            if(!idTextField.getText().equals("") && !nameTextField.getText().equals("") && !phoneTextField.getText().equals(""))
                tableModel.addRow(new String[]{idTextField.getText(), nameTextField.getText(), phoneTextField.getText()});
        });

        // Clear button action listener
        clearButton.addActionListener(event -> {
            idTextField.setText("");
            nameTextField.setText("");
            phoneTextField.setText("");
        });

        // Delete button action listener
        deleteButton.addActionListener(event -> {
            if(table.getSelectedRowCount() > 0){
                int[] rowInduces = table.getSelectedRows();
                // Delete rows from bottom to top
                for(int i = rowInduces.length - 1; i >= 0; i--) // Look here
                    tableModel.removeRow(rowInduces[i]);
            }
        });

        // Delete all button action listener
        deleteAllButton.addActionListener(event -> tableModel.setRowCount(0));
    }
}
