package jradioButton1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JRadioButton example 1");
        frame.setSize(300, 250);
        frame.setLayout(null);  // في النافذة بنفسنا Radio Button لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  و قمنا بإختياره أيضاً Radio Button أي قمنا بإنشاء JRadioButton هنا أنشأنا كائن من الكلاس
        JRadioButton radioButton = new JRadioButton("Radio Button", true);

        // Set bounds of radio button
        radioButton.setBounds(40, 40, 100, 30);

        // Add radio button to frame
        frame.add(radioButton);

        // Show frame
        frame.setVisible(true);
    }
}
