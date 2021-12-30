package jtable1.examples.example4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    private static final JFrame frame = new JFrame("JTable example 4");
    private static final DefaultTableModel tableModel = new DefaultTableModel();
    private static final JTable table = new JTable(tableModel);
    private static final JScrollPane tableScrollPane = new JScrollPane(table);
    private static final JLabel label = new JLabel("Selected cells");
    private static final JTextArea textArea = new JTextArea();
    private static final JScrollPane textAreaScrollPane = new JScrollPane(textArea);
    public static void main(String[] args){
        // Set up the frame
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
                {"11", "Naya", "Asmar", "03654173" },
                {"12", "Mahmoud", "Mawwas", "70040300" },
                {"13", "Elena", "Shbib", "71199113" }
        };

        // Set up the text area
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // بدل تحديد السطر كله دفعة واحدة ( cell ) هنا جعلنا المستخدم قادر على تحديد خلية
        table.setCellSelectionEnabled(true);

        // Set bounds for all components
        tableScrollPane.setBounds(0, 0, 585, 200);
        label.setBounds(20, 220, 200, 20);
        textAreaScrollPane.setBounds(20, 260, 553, 80);

        // Add all components to the frame
        frame.add(tableScrollPane);
        frame.add(label);
        frame.add(textAreaScrollPane);

        // Show the frame
        frame.setVisible(true);

        // لأنه يتيح لنا معرفة إذا قام المستخدم بتحديد أو إلغاء تحديد قيم من الجدول selectionModel هنا قمنا بوضع أي قيم سيتم تحديدها في الكائن
        ListSelectionModel selectionModel = table.getSelectionModel();

        // Selection model list selection listener
        selectionModel.addListSelectionListener(event -> {
            // Clear text area
            textArea.setText("");
           for(int row = 0; row < table.getRowCount(); row++)
               for(int col = 0; col <table.getColumnCount(); col++)
                   textArea.append(table.isCellSelected(row, col)? table.getValueAt(row, col) + " + " : "");
        });
    }
}
