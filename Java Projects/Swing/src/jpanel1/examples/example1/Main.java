package jpanel1.examples.example1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JPanel example 1");
        // Set up the frame
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); // Panel أي قمنا بإنشاء JPanel هنا أنشأنا كائن من الكلاس

        // Set background of the panel
        panel.setBackground(Color.lightGray); // رمادي Panel هنا جعلنا لون خلفية الـ

        // Set bounds of the panel
        panel.setBounds(50, 50, 180, 110); // frame في الـ Panel هنا قمنا بتحديد حجم و موقع الـ

        // Add the panel to the frame
        frame.add(panel);

        // Show the frame
        frame.setVisible(true);
    }
}
