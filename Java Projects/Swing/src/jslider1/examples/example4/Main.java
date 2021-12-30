package jslider1.examples.example4;

import javax.swing.*;

public class Main {
    private static final JFrame frame = new JFrame("JSlide example 4");
    private static final JSlider slider = new JSlider(0, 20, 10);
    private static final JLabel label = new JLabel("Selected value");
    private static final JTextField textField = new JTextField();
    public static void main(String[] args){
        // Set up the frame
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set Up the text field
        textField.setText(String.valueOf(slider.getValue()));

        // Set Up the slider
        // تحته Slider هنا قمنا بعرض الخطوط و قيم الـ
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Set bounds for all components
        slider.setBounds(40, 50, 200, 50);
        label.setBounds(80, 130, 100, 30);
        textField.setBounds(175, 134, 20, 22);

        // Add all components to the frame
        frame.add(slider);
        frame.add(label);
        frame.add(textField);

        // Show the frame
        frame.setVisible(true);

        // Slider change listener
        // slider هنا نضع الأوامر التي نريد تنفيذها في كل مرة يتم فيها تغيير قيمة الـ
        slider.addChangeListener(event -> textField.setText(String.valueOf(slider.getValue())));
    }
}
