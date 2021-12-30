package jspinner1.examples.example5;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    private static final JFrame frame = new JFrame("JSpinner example 5");
    private static final JLabel label = new JLabel("Enter the time");
    private static final JSpinner hoursSpinner = new JSpinner(new SpinnerNumberModel(12, 1, 12, 1));
    private static final JSpinner minuteSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 59, 1));
    private static final JSpinner secondSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 59, 1));
    private static final JSpinner amORpm = new JSpinner(new SpinnerListModel(new String[]{"AM", "PM"}));
    private static final JButton button = new JButton("Get time");
    private static final JLabel enteredTime = new JLabel("You entered time: 12:00:00 AM");
    public static void main(String[] args){
        // Setup the frame
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set bounds for all components
        label.setBounds(40, 40, 100, 22);
        hoursSpinner.setBounds(130, 40, 36, 22);
        minuteSpinner.setBounds(180, 40, 36, 22);
        secondSpinner.setBounds(230, 40, 36, 22);
        amORpm.setBounds(280, 40, 36, 22);
        button.setBounds(40, 100, 110, 30);
        enteredTime.setBounds(170, 100, 200, 30);

        // Add all components to the frame
        frame.add(label);
        frame.add(hoursSpinner);
        frame.add(minuteSpinner);
        frame.add(secondSpinner);
        frame.add(amORpm);
        frame.add(button);
        frame.add(enteredTime);

        // Show the frame
        frame.setVisible(true);

        // button event
        button.addActionListener(event -> {
            DecimalFormat ft = new DecimalFormat("00");
           enteredTime.setText("You entered time: " + ft.format(hoursSpinner.getValue()) + ":"
                                + ft.format(minuteSpinner.getValue()) + ":"
                                + ft.format(secondSpinner.getValue()) + " " + amORpm.getValue());
        });
    }
}
