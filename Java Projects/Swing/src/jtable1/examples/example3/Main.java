package jtable1.examples.example3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    private static final JFrame frame = new JFrame("JTable example 3");
    private static final DefaultTableModel tableModel = new DefaultTableModel();
    private static final JTable table = new JTable(tableModel);
    private static final JScrollPane tableScrollPane = new JScrollPane(table);
    private static final JTextArea textArea = new JTextArea();
    private static final JScrollPane textScrollPane = new JScrollPane(textArea);
    private static final JButton button = new JButton("Display selected cals");
    public static void main(String[] args){
        // Set Up the frame
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set Up the text area
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // بدل تحديد السطر كله دفعة واحدة ( cell ) هنا جعلنا المستخدم قادر على تحديد خلية
        table.setCellSelectionEnabled(true); // Look here

        // Add data in table model
        String[] columns = {"ID", "First Name", "Last name", "Phone"};
        String[][] data = {
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
        tableModel.setDataVector(data, columns);

        // Set bounds for all components
        tableScrollPane.setBounds(0, 0, 585, 200);
        button.setBounds(20, 220, 200, 30);
        textScrollPane.setBounds(20, 260, 535, 80);

        // Add all components to the frame
        frame.add(tableScrollPane);
        frame.add(button);
        frame.add(textScrollPane);

        // Show the frame
        frame.setVisible(true);

        // Button action listener
        button.addActionListener(event -> {
            // Clean the text area
            // textArea سيتم أولاً مسح أي نص موجود في الـ
            textArea.setText("");
            if(table.getSelectedRowCount() > 0)
                // textArea بعدها سيتم المرور على جميع القيم الموجودة في الجدول و وضع المحدد منها في الـ
                for(int row =0; row<table.getRowCount(); row++)
                    for(int col = 0; col<table.getColumnCount(); col++)
                        textArea.append(table.isCellSelected(row, col)? table.getValueAt(row, col) + " + " : ""); // Look here
        });
    }
}
