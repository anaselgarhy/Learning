package jtextArea1.examples.example4;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextArea example 4");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter anything");
        JLabel resultLabel = new JLabel();
        JTextArea textArea = new JTextArea();
        // بداخله textArea و وضعنا الـ Scroll Pane أي قمنا بإنشاء JScrollPane هنا أنشأنا كائن من الكلاس
        JScrollPane scrollPane = new JScrollPane(textArea);
        JButton getResultButton = new JButton("Get text");
        // ينزل على سطر جديد في حال كان عدد الأحرف المدخلة أكبر من عدد الأحرف التي يستطيع السطر إستيعابها textArea هنا جعلنا النص الذي ندخله في كائن الـ
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);  // هنا جعلنا الكلمة تظهر على سطر جديد في حال كانت لا تسع في السطر

        // Set bounds for all components
        label.setBounds(40, 40, 100, 30);
        scrollPane.setBounds(150, 40, 200, 100);
        getResultButton.setBounds(40, 160, 80, 30);
        resultLabel.setBounds(40, 200, 340, 30);

        // Add all components to frame
        frame.add(label);
        frame.add(scrollPane);
        frame.add(getResultButton);
        frame.add(resultLabel);

        // show frame
        frame.setVisible(true);

        // button click event
        // button عند النقر على الـ label و وضعه كنص للكائن textArea سيتم جلب النص الموجود في الكائن
        getResultButton.addActionListener(event -> resultLabel.setText(textArea.getText()));
    }
}
