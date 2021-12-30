package jtextArea1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextArea example 2");
        frame.setSize(300, 250);
        frame.setLayout(null); // في النافذة بنفسنا Text Area لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 16);  // حجمه 16 Arial يمثل نوع خط عريض إسمه Font هنا أنشأنا كائن من الكلاس

        JTextArea textArea = new JTextArea();
        textArea.setFont(font);
        textArea.setForeground(Color.blue);  // أزرق textArea هنا جعلنا لون خط الـ
        textArea.setBounds(40, 40, 200, 100);  // frame في الـ Text Area هنا قمنا بتحديد حجم و موقع الـ

        textArea.setText("Blue\nText\nArea"); //  textArea هنا قمنا بإدخال نص بداخل الـ

        frame.add(textArea);
        frame.setVisible(true);
    }
}
