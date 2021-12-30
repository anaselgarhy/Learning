package jtable1.examples.example5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    private static final JFrame frame = new JFrame("JTable example 5");
    private static final DefaultTableModel tableModel = new DefaultTableModel();
    private static final JTable table = new JTable(tableModel);
    private static final JScrollPane tableScrollPane = new JScrollPane(table);
    private static final JLabel label1 = new JLabel("Selection mode");
    private static final JRadioButton radioButtonSelectionMode1 = new JRadioButton("Multiple selection", true);
    private static final JRadioButton radioButtonSelectionMode2 = new JRadioButton("Interval selection");
    private static final JRadioButton radioButtonSelectionMode3 = new JRadioButton("Single selection");
    private static final JLabel label2 = new JLabel("Selection option");
    private static final JRadioButton radioButtonOption1 = new JRadioButton("Row selection", true);
    private static final JRadioButton radioButtonOption2 = new JRadioButton("Column selection");
    private static final JRadioButton radioButtonOption3 = new JRadioButton("Cell selection");
    public static void main(String[] args){
        // Set Up the frame
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add data in table model
        // الخاصة فيه model هنا قمنا بتخزين أسماء أعمدة الجدول و القيم التي ستظهر فيه ثم وضعناها في الـ
        String columns[] = {"ID", "First Name", "Last Name", "Phone"};
        String data[][] = {
                {"1", "Mhamad", "Harmush", "70123456" },
                {"2", "Ahmad", "Mousally", "76454532" },
                {"3", "Hala", "Hassan", "03555124" },
                {"4", "Rim", "Al Mouhandes", "01321123" },
                {"5", "Said", "Al Kurdy", "07445599" },
                {"6", "Abdullah", "Saadi", "71001234" },
                {"7", "Ibrahim", "Marhaba", "04555666" },
                {"8", "Omar", "El Koussa", "01357894" },
                {"9", "Riad", "Asaad", "76887123" },
                {"10", "Rawan", "Hoblos", "01200500" },
                {"11", "Naya", "Asmar", "03654123" },
                {"12", "Mahmoud", "Mawwas", "70040300" },
                {"13", "Elena", "Shbib", "71199113" }
        };
        // Add
        tableModel.setDataVector(data, columns);

        // Creat radio buttons group 1
        ButtonGroup group1 = new ButtonGroup();
        // Add radio buttons in group
        group1.add(radioButtonSelectionMode1);
        group1.add(radioButtonSelectionMode2);
        group1.add(radioButtonSelectionMode3);

        // Create radio buttons group 2
        ButtonGroup group2 = new ButtonGroup();
        // Add Radio buttons in group
        group2.add(radioButtonOption1);
        group2.add(radioButtonOption2);
        group2.add(radioButtonOption3);

        // Set bounds for all components
        tableScrollPane.setBounds(0, 0, 585, 200);
        label1.setBounds(20, 220, 150, 20);
        label2.setBounds(200, 220, 150, 20);
        radioButtonSelectionMode1.setBounds(20, 250, 150, 20);
        radioButtonSelectionMode2.setBounds(20, 280, 150, 20);
        radioButtonSelectionMode3.setBounds(20, 310, 150, 20);
        radioButtonOption1.setBounds(200,  250, 150, 20);
        radioButtonOption2.setBounds(200, 280, 150, 20);
        radioButtonOption3.setBounds(200, 310, 150, 20);

        // Add all components to the frame
        frame.add(tableScrollPane);
        frame.add(label1);
        frame.add(radioButtonSelectionMode1);
        frame.add(radioButtonSelectionMode2);
        frame.add(radioButtonSelectionMode3);
        frame.add(label2);
        frame.add(radioButtonOption1);
        frame.add(radioButtonOption2);
        frame.add(radioButtonOption3);

        // Show the frame
        frame.setVisible(true);

        // Radio button selection mode 1 action listener
        radioButtonSelectionMode1.addActionListener(event -> table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION));

        // Radio button selection mode 2 action listener
        radioButtonSelectionMode3.addActionListener(event -> table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION));

        // Radio button selection mode 3 action listener
        radioButtonSelectionMode3.addActionListener(event -> table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION));

        // Radio button option 1 action listener
        radioButtonOption1.addActionListener(event -> {
            table.setRowSelectionAllowed(true);
            table.setColumnSelectionAllowed(false);
        });

        // Radio button option 2 action listener
        radioButtonOption2.addActionListener(event -> {
            table.setRowSelectionAllowed(false);
            table.setColumnSelectionAllowed(true);
        });

        // Radio button option 3 action listener
        radioButtonOption3.addActionListener(event -> table.setCellSelectionEnabled(true));
    }
}
