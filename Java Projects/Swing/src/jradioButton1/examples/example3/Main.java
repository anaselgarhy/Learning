package jradioButton1.examples.example3;

import javax.swing.*;

public class Main {
    public static void  main(String[] args){
        JFrame frame = new JFrame("JRadioButton example 3");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Select your language");
        JLabel resultLabel = new JLabel("Hello");
        JButton button = new JButton("Chang");

        JRadioButton radioButtonArabic = new JRadioButton("Arabic");
        JRadioButton radioButtonEnglish = new JRadioButton("English", true);

        // ضمن مجموعة واحدة JRadioButton و الذي سنسخدمه لوضع كائنات الـ ButtonGroup هنا أنشأنا كائن من الكلاس
        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(radioButtonArabic);
        buttonGroup.add(radioButtonEnglish);

        // Set bounds for all components
        label.setBounds(40, 10, 150, 30);
        radioButtonEnglish.setBounds(40, 40, 100, 30);
        radioButtonArabic.setBounds(40, 70, 100, 30);
        button.setBounds(40, 110, 100, 30);
        resultLabel.setBounds(40, 150, 100, 30);

        // Add all components to frame
        frame.add(label);
        frame.add(radioButtonEnglish);
        frame.add(radioButtonArabic);
        frame.add(button);
        frame.add(resultLabel);

        // Show frame
        frame.setVisible(true);

        button.addActionListener(event -> {
           if(radioButtonEnglish.isSelected()){
               resultLabel.setText("Hello");
               button.setText("Chang");
           } else if(radioButtonArabic.isSelected()){
               resultLabel.setText("مرحبا");
               button.setText("تغيير");
           }
        });
    }
}
