package jtextArea1.examples.example3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextArea example 3");
        frame.setSize(300, 250);
        frame.setLayout(null); // في النافذة بنفسنا Text Area لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        // ينزل على سطر جديد في حال كان عدد الأحرف المدخلة أكبر من عدد الأحرف التي يستطيع السطر إستيعابها textArea هنا جعلنا النص الذي ندخله في كائن الـ
        textArea.setLineWrap(true);
        // هنا جعلنا الكلمة تظهر على سطر جديد في حال كانت لا تسع في السطر
        textArea.setWrapStyleWord(true);
        // بداخله textArea و وضعنا الـ Scroll Pane أي قمنا بإنشاء JScrollPane هنا أنشأنا كائن من الكلاس
        JScrollPane scrollPane = new JScrollPane(textArea); // Look here
        // أيضاً textArea و بالتالي كأننا قمنا بتحديد حجم الـ .frame في الـ scrollPane هنا قمنا بتحديد حجم و موقع الـ
        scrollPane.setBounds(40, 40, 200, 100); // Look here

        frame.add(scrollPane); // Look here   // frame في الـ scrollPane هنا أضفنا الـ
        frame.setVisible(true);
    }
}
