package jspinner1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Main {
    private static final JTextArea textArea = new JTextArea();
    private static final JComponent[] components = {new JScrollPane(textArea),
            new JLabel("Font size"), new JSpinner(new SpinnerNumberModel(16, 6, 72, 1)),
            new JLabel("Font color"), new JSpinner(new SpinnerListModel(new String[]{"Black", "Gray", "Red", "Green", "Blue"})),
            new JLabel("Font style"), new JSpinner(new SpinnerListModel(new String[]{"Plain", "Bold", "Italic"}))};
    public static void main(String[] args){
        JFrame frame = new JFrame("JSpanner");
        frame.setSize(760, 390);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set font for all components until text area
        for (JComponent component : components)
            component.setFont(new Font("Tajawal", Font.PLAIN, 20));
        // set font for text area
        textArea.setFont(new Font("Tajawal", Font.PLAIN, 16));

        // Set bounds for all components
        components[0].setBounds(18, 23, 714, 264); // the bounds for scroll pane (text area)
        components[1].setBounds(25, 305, 74, 28); // the bounds for label1 (Font size)
        components[2].setBounds(112, 307, 49, 28); // the bounds for spinner1
        components[3].setBounds(197, 305, 86, 28); // the bounds for label2 (Font color)
        components[4].setBounds(296, 307, 139, 28); // the bounds for spinner2
        components[5].setBounds(471, 305, 82, 28); // the bounds for label3 (Font style)
        components[6].setBounds(566, 307, 139, 28); // the bounds for spinner3

        // Add all components to the frame
        for(JComponent component : components)
            frame.add(component);

        // Show the frame
        frame.setVisible(true);

        // Spinner1 event
        ((JSpinner)components[2]).addChangeListener(new ChangeListener() { // Look here
            @Override
            public void stateChanged(ChangeEvent e) {
                textArea.setFont(new Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(),
                        (int)((JSpinner)components[2]).getValue()));
            }
        });

        // Spinner2 event
        ((JSpinner)components[4]).addChangeListener(event -> { // Look here
            Color color = null;
            switch((String)((JSpinner)components[4]).getValue()){
                case "Black" -> color = new Color(0, 0, 0);
                case "Gray" -> color = new Color(128, 128, 128);
                case "Red" -> color = new Color(255, 0, 0);
                case "Blue" -> color = new Color(0, 0, 255);
                case "Green" -> color = new Color(0, 255, 0);
            }
            textArea.setForeground(color);
        });

        // spinner3 event
        ((JSpinner)components[6]).addChangeListener(event -> { // Look here
            int style = -1;
            switch((String)((JSpinner)components[6]).getValue()){
                case "Plain" -> style = Font.PLAIN;
                case "Bold" -> style = Font.BOLD;
                case "Italic" -> style = Font.ITALIC;
            }
            textArea.setFont(new Font(textArea.getFont().getName(), style, textArea.getFont().getSize()));
        });

    }
}
