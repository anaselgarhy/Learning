package jColorChooser1.examples.example3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JColorChooser example 3");
        // Set Up the frame
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change background color");
        // Set the bounds for the button
        button.setBounds(90, 70, (int)button.getPreferredSize().getWidth(), (int)button.getPreferredSize().getHeight()); // Look here

        // Add button to the frame
        frame.add(button);

        JColorChooser colorChooser = new JColorChooser();

        // Set default color
        colorChooser.setColor(0, 15, 255);

        // مع تحديد خصائصه colorChooser هنا قمنا بتعريف الذي سنضعه بداخل الـ
        JLabel previewLabel = new JLabel("Selected color");
        // Set the font for the preview label
        previewLabel.setFont(new Font("Serif", Font.BOLD, 34));
        // Set the size for the preview label
        previewLabel.setSize(previewLabel.getPreferredSize());

        // Add the preview label to the color chooser
        colorChooser.setPreviewPanel(previewLabel);

        // Show the frame
        frame.setVisible(true);

        // colorChooser الموجود في الـ Ok و الذي سنضع فيه ما سيحدث عند النقر على الزر ActionListener هنا قمنا بتعريف كائن من الكلاس
        ActionListener okListener = event -> {
            frame.getContentPane().setBackground(colorChooser.getColor());
        };

        // colorChooser الموجود في الـ Cancel و الذي سنضع فيه ما سيحدث عند النقر على الزر ActionListener هنا قمنا بتعريف كائن من الكلاس
        ActionListener cancelListener = event -> {
            // هنا يمكنك وضع أي أوامر تريد
        };

        // كمحتواه الوحيد colorChooser و سيتم وضع الـ dialog هنا سيتم إنشاء الـ
        JDialog colorDialog = JColorChooser.createDialog(
                frame,
                "Color piker",
                false,
                colorChooser,
                okListener,
                cancelListener
                );

        // Button action listener
        button.addActionListener(event ->{
            // Show the color dialog
            colorDialog.setVisible(true);
        });


    }
}
