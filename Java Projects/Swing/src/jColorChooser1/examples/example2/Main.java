package jColorChooser1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JColorChooser example 2");
        // Set Up the frame
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change background color");

        // Set bounds for the button
        button.setBounds(90, 70, 200, 30);

        // Add the button to the frame
        frame.add(button);

        // Show the frame
        frame.setVisible(true);

        // Add the action listener to the button
        button.addActionListener(event -> {
            // frame فوق الـ Color Chooser Dialog سيتم إظهار الـ
            // كلون إفتراضي له frame سيتم وضع لون خلفية الـ
            // c في الكائن null بعد أن يتم إغلاقه سيتم تخزين اللون الذي إختاره المستخدم أو القيمة
            Color newColor = JColorChooser.showDialog(frame, "Color piker", frame.getContentPane().getBackground());

            // Set background for the frame
            if(newColor != null)
                frame.getContentPane().setBackground(newColor); // Look here
        });
    }
}
