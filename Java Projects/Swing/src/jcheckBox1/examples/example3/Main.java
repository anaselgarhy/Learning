package jcheckBox1.examples.example3;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JCheckBox");
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox = new JCheckBox("Check box");
        JLabel label = new JLabel("Check box is not checked");

        // Set bounds for all components
        checkBox.setBounds(40, 40, 100, 30);
        label.setBounds(40, 70, 200, 30);

        // add all components to frame
        frame.add(checkBox);
        frame.add(label);

        // frame show
        frame.setVisible(true);

        // check box item listener
        // ItemListener is a functional interface (interface have a one function only)
        checkBox.addItemListener(new ItemListener(){   // checkBox هنا نضع الأوامر التي نريد تنفيذها عند النقر على الـ
            @Override
            public void itemStateChanged(ItemEvent event){
                if(checkBox.isSelected())
                    label.setText("Check box is checked"); // سيتم طباعة النص التالي checkBox إذا كان يوجد علامة صح على الـ
                else
                    label.setText("Check box is not checked");   // سيتم طباعة النص التالي checkBox إذا كان لا يوجد علامة صح على الـ
            }
        });
    }
}
