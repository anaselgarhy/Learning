package jspinner1.examples.example4;

import javax.swing.*;

public class Main {
    private static final JComponent[] components = {new JSpinner(new SpinnerListModel(new String[]{"Easy", "Medium", "Hard"})), new JLabel()};
    public static void main(String[] args){
        JFrame frame = new JFrame("JSpinner example 4");
        // Setup the frame
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set label text
        ((JLabel)components[1]).setText("Level: Easy");
        // Set bounds for all components
        components[0].setBounds(100, 40, 100, 30);
        components[1].setBounds(100, 80, 100, 30);

        // Add all components to the frame
        for(JComponent component : components)
            frame.add(component);

        // Show the frame
        frame.setVisible(true);

        // Spinner change listener
        ((JSpinner)components[0]).addChangeListener(event -> ((JLabel)components[1]).setText("Level: " + ((JSpinner)components[0]).getValue()));
    }
}
