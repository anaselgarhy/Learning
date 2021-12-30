package jtextArea1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextArea example 1");
        frame.setSize(300, 250);
        frame.setLayout(null); // في النافذة بنفسنا Text Area لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea("Enter anything"); // Text Area أي قمنا بإنشاء JTextArea هنا أنشأنا كائن من الكلاس
        textArea.setBounds(40, 40, 200, 100); // frame في الـ Text Area هنا قمنا بتحديد حجم و موقع الـ

        frame.add(textArea);

        frame.setVisible(true);
    }
}