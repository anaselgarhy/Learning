package jcheckBox1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JCheckBox example 1");
        frame.setSize(300, 250);
        frame.setLayout(null);  // في النافذة بنفسنا Check Box لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // مع وضع علامة صح عليه Check Box أي قمنا بإنشاء JCheckBox هنا أنشأنا كائن من الكلاس
        JCheckBox checkBox = new JCheckBox("uncheck me", true);
        checkBox.setBounds(40, 40, 100, 30);

        frame.add(checkBox);

        frame.setVisible(true);
    }
}
