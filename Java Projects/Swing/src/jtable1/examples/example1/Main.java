package jtable1.examples.example1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTable example 1");
        // Set Up the frame
        frame.setSize(500, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columns = {"ID", "First name", "Last name"};  // هنا قمنا بتعريف مصفوفة و التي سنستخدمها كأسماء للجدول
        String[][] data = {                             // هنا قمنا بتعريف مصفوفة و التي سنستخدمها كبيانات في الجدول
                {"1", "Mhamad", "Harmush" },
                {"2", "Ahmad", "Mousally" },
                {"3", "Hala", "Hassan" },
                {"4", "Rim", "Al Mouhandes" },
                {"5", "Said", "Al Kurdy" },
                {"6", "Abdullah", "Saadi" },
                {"7", "Ibrahim", "Marhaba" },
                {"8", "Omar", "El Koussa" },
                {"9", "Riad", "Asaad" },
                {"10", "Rawan", "Hoblos" }
        };

        DefaultTableModel tableModel = new DefaultTableModel();  // Model أي كأننا قمنا بتعريف .DefaultTableModel هنا قمنا بإنشاء كائن من الكلاس
        // Add data in model
        tableModel.setDataVector(data, columns);  // Model هنا قمنا بوضع المصفوفات بداخل الـ

        JTable table = new JTable(tableModel);  // model هنا قمنا بتعريف جدول مبني على البيانات الموجودة في الـ
        JScrollPane scrollPane = new JScrollPane(table); // عند الحاجة Scroll Bar لضمان ظهور JScrollPane بداخل كائن من الكلاس table هنا وضعنا الـ

        // Set bounds of scroll pane
        scrollPane.setBounds(60, 40, 370, 140);

        // Add scroll pane to the frame
        frame.add(scrollPane);

        // show the frame
        frame.setVisible(true);

    }
}
