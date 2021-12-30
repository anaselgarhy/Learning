package jcheckBox1.examples.example2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JCheckBox example 2");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 16);  // حجمه 16 Arial يمثل نوع خط عريض إسمه Font هنا أنشأنا كائن من الكلاس

        JCheckBox checkBox1 = new JCheckBox("Red", true);  // مع وضع علامة صح عليه checkBox1 إسمه Check Box أي قمنا بإنشاء JCheckBox هنا أنشأنا كائن من الكلاس
        JCheckBox checkBox2 = new JCheckBox("Green");  // checkBox2 إسمه Check Box أي قمنا بإنشاء JCheckBox هنا أنشأنا كائن من الكلاس
        JCheckBox checkBox3 = new JCheckBox("Blue");  //checkBox3 إسمه Check Box أي قمنا بإنشاء JCheckBox هنا أنشأنا كائن من الكلاس

        JLabel label = new JLabel("The text color are red");

        
        // Set Font for all components
        checkBox1.setFont(font);
        checkBox2.setFont(font);
        checkBox3.setFont(font);
        label.setFont(font);

        // Set color for all components
        checkBox1.setForeground(Color.red); // أحمر checkBox1 هنا جعلنا لون خط
        checkBox2.setForeground(Color.green); // هنا جعلنا لون خط checkBox2 اخضر
        checkBox3.setForeground(Color.blue); // هنا جعلنا لون خط checkBox3 ازرق
        label.setForeground(Color.red);

        // Set Bounds for all components
        checkBox1.setBounds(40, 40, 100, 30);
        checkBox2.setBounds(40, 70, 100, 30);
        checkBox3.setBounds(40, 100, 100, 30);
        label.setBounds(40, 150, 200, 30);

        // Add all components to frame
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(label);

        // show frame
        frame.setVisible(true);

        // action listener for check box 1
        checkBox1.addActionListener(event -> {
            if(checkBox1.isSelected()){
                label.setForeground(Color.red);
                label.setText("The text color are red");
                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
            } else {
                label.setForeground(Color.BLACK);
                label.setText("The text color are black");
            }
        });
        // action listener for check box 2
        checkBox2.addActionListener(event -> {
            if(checkBox2.isSelected()){
                label.setForeground(Color.green);
                label.setText("The text color are green");
                checkBox1.setSelected(false);
                checkBox3.setSelected(false);
            } else {
                label.setForeground(Color.BLACK);
                label.setText("The text color are black");
            }
        });
        // action listener for check box 3
        checkBox3.addActionListener(event -> {
            if(checkBox3.isSelected()){
                label.setForeground(Color.blue);
                label.setText("The text color are blue");
                checkBox1.setSelected(false);
                checkBox2.setSelected(false);
            } else {
                label.setForeground(Color.BLACK);
                label.setText("The text color are black");
            }
        });
    }
}
