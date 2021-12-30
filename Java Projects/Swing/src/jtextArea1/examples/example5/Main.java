package jtextArea1.examples.example5;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextArea example 5");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel charsNum = new JLabel("Chars: 0");
        JLabel linesNum = new JLabel("Lines: 1");
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Set Bounds for all components
        scrollPane.setBounds(40, 40, 310, 150);
        charsNum.setBounds(40, 210, 70, 30);
        linesNum.setBounds(160, 210, 70, 30);

        // Add all components to frame
        frame.add(scrollPane);
        frame.add(charsNum);
        frame.add(linesNum);

        // show frame
        frame.setVisible(true);
        
        // key event
        // textArea يتم إستدعاء هذه الدالة بشكل تلقائي كلما تم إدخال أو حذف حرف في كائن الـ
        textArea.addKeyListener(new KeyListener(){
            // Override لسنا بحاجة هذه الدالة لكننا مجبرين على أن نفعل لها
            // يتم تنفيذ أي أوامر نضعها هنا مباشرةً عندما يقوم المستخدم بالنقر على أي حرف من لوحة المفاتيح و قبل أن يرفع إصبعه
            @Override
            public void keyTyped(KeyEvent e) {}
            // Override لسنا بحاجة هذه الدالة لكننا مجبرين على أن نفعل لها
            // يتم تنفيذ أي أوامر نضعها هنا في حال أبقى المستخدم إصبعه على زر معين مما جعل هذا الزر يطبع الحرف أكثر من مرة
            @Override
            public void keyPressed(KeyEvent e) {}
            // يتم تنفيذ أي أوامر نضعها هنا بعد أن يتم كتابة الحرف الذي قام المستخدم بالنقر عليه من لوحة المفاتيح. أو عندما يرفع إصبعه عن أي زر
            @Override
            public void keyReleased(KeyEvent e) {
                charsNum.setText("Chars: " + textArea.getText().length()); // chars كنص للكائن JTextArea هنا وضعنا عدد أحرف الكائن
                linesNum.setText("Lines: " + textArea.getLineCount());   // lines كنص للكائن JTextArea هنا وضعنا عدد أسطر الكائن
            }
        });
    }
}
