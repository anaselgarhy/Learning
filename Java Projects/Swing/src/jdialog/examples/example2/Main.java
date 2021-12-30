package jdialog.examples.example2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Main {
    private static final JFrame frame = new JFrame("JDialog example 2");
    private static final Font mainFont = new Font("Tajawal", Font.PLAIN, 18);
    private static final DefaultTableModel tableModel = new DefaultTableModel();
    private static final AddDataDialog addDataDialog = new AddDataDialog(frame, tableModel, mainFont);
    private static int columnNonNameCount = 0;
    public static void main(String[] args){
        final byte buttonsNumber = 4;
        final String[] buttonsText = {"Add column", "Add row", "Add data", "Search", "Delete row", "Delete data"};
        // Set Up the frame
        frame.setSize(615, 440);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTable table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);


        JButton[] buttons = new JButton[buttonsNumber];

        // Create buttons and set bounds and set font and add to the frame
        for(byte b = 0; b < buttonsNumber; b++) {
            (buttons[b] = new JButton(buttonsText[b]))
                    .setBounds((b == 0 ? 24 : buttons[b - 1].getX() + buttons[b - 1].getWidth() + 27), 362, 118, 35);
            buttons[b].setFont(mainFont);
            frame.add(buttons[b]);
        }

        // Set bounds for table
        tableScrollPane.setBounds(14, 17, 573, 327);

        // Set font for table
        table.setFont(mainFont);

        // Add scroll pane (table)
        frame.add(tableScrollPane);


        // Show the frame
        frame.setVisible(true);

        // Add add column button action listener
        buttons[0].addActionListener(event -> {
            String colName = JOptionPane.showInputDialog(frame, "Enter column name", null, JOptionPane.QUESTION_MESSAGE);
            tableModel.addColumn(colName.equals("")? ("Non Name" + ++columnNonNameCount) : colName);
        });

        // Add add row button action listener
        buttons[1].addActionListener(event -> tableModel.addRow(new JLabel[]{}));

        // Add data button action listener
        buttons[2].addActionListener(event ->  addDataDialog.setVisible(true));


    }
}
