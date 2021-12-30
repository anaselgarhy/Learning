package jcomboBox.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JComboBox example 1");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // لا يحتوي على عناصر Combo Box بإستخدام الكونستركتور الإفتراضي. أي قمنا بإنشاء JComboBox هنا أنشأنا كائن من الكلاس
        JComboBox emptyComboBox = new JComboBox();

        emptyComboBox.setBounds(40, 40, 100, 30);  // frame في الـ Combo Box هنا قمنا بتحديد حجم و موقع الـ

        frame.add(emptyComboBox);

        frame.setVisible(true);
    }
}
