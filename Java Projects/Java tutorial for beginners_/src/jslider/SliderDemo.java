package jslider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JSlider slider;

    public SliderDemo() {
        frame = new JFrame("Slider demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.setMajorTickSpacing(25);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);
        slider.setForeground(Color.magenta);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 16));
        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);

        label.setText("°C = " + slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN,  25));
        panel.setPreferredSize(new Dimension(420, 250));
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            label.setText("°C = " + slider.getValue());
            if (slider.getValue() < 40) {
                label.setForeground(Color.blue);
            } else if (slider.getValue() < 70) {
                label.setForeground(Color.orange);
            } else {
                label.setForeground(Color.red);
            }
        }
    }
}
