package joptionPane1.examples.example3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JOptionPane example 3");
        // Set up the frame
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Enter value");
        JButton button2 = new JButton("Select value");
        JLabel label = new JLabel("Returned value");

        // Set bounds for all components
        button1.setBounds(95, 30, 200, 30);
        button2.setBounds(95, 70, 200, 30);
        label.setBounds(95, 110, 200, 30);

        // Add all components to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(label);

        // Show the frame
        frame.setVisible(true);

        // Add button 1 action listener
        // btn1 عند النقر على الـ Input Dialog هنا قلنا أنه سيتم إظهار
        button1.addActionListener(event -> {
            // result ثم تخزين القيمة التي قام المستخدم بإدخالها في المتغير Input Dialog سيتم إظهار
            String value = JOptionPane.showInputDialog(frame, "Enter value",null, JOptionPane.PLAIN_MESSAGE);

            // Label في حال قام المستخدم بإدخال قيمة في مربع النص فإنه سيتم عرضها في الـ
            if(value != null) // Set text of label
                label.setText(value);
        });

        // Add button 2 action listener
        // btn2 عند النقر على الـ Input Dialog هنا قلنا أنه سيتم إظهار
        button2.addActionListener(event -> {
            // Input Dialog في الـ Combo Box هنا قمنا بتعريف مصفوفة من الخيارات التي نريد عرضها كـ
            Object[] values = {"Java", "C++", "C", "Lua", "Python", "Kotlin"};

            // result ثم تخزين القيمة التي قام المستخدم بإدخالها في المتغير Input Dialog سيتم إظهار
            String value =
                    (String)JOptionPane.showInputDialog(frame, "Select value", "",
                            JOptionPane.PLAIN_MESSAGE, null,
                            values, values[0]);

            // Set text of label
            // Label سيتم عرض القيمة التي قام المستخدم بإختيارها في الـ
            label.setText(value);
        });
    }
}
