package jslider1.examples.example2;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JSlider example 2");
        // Set Up the frame
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 10); // أفقي, قيمته تترواح بين 0 و 20, و قميته الأولية هي 10 JSlider هنا أنشأنا كائن من الكلاس

        slider.setMinorTickSpacing(1);  // هنا جعلنا المسافة بين كل خطين صغيرين تساوي 1
        slider.setMajorTickSpacing(5); // هنا جعلنا المسافة بين كل خطين كبيرين تساوي 5
        slider.setPaintTicks(true); // هنا جعلنا الخطوط تظهر
        slider.setPaintLabels(true);  // هنا جعلنا الترقيم يظهر تحته الخطوط الكبيرة

        // Set bounds for the slider
        slider.setBounds(40, 80, 200, 50);

        // Add the slider to the frame
        frame.add(slider);

        // Show the frame
        frame.setVisible(true);
    }
}
