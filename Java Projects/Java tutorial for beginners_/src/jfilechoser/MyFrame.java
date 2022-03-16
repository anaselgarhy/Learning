package jfilechoser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    private JButton openButton, saveButton;

    public MyFrame() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("JFileChooser");
        super.setLayout(new FlowLayout());

        openButton = new JButton("Chose file");
        saveButton = new JButton("Save");
        openButton.addActionListener(this);
        saveButton.addActionListener(this);

        openButton.setPreferredSize(new Dimension(200, 50));
        saveButton.setPreferredSize(new Dimension(200, 50));

        super.add(openButton);
        super.add(saveButton);
        super.pack();
        super.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openButton) {
            JFileChooser fileChooser = new JFileChooser();
            int responce = fileChooser.showOpenDialog(null);
            if (responce == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.print(file);
            }
        } else if (e.getSource() == saveButton) {
            JFileChooser fileChooser = new JFileChooser();
            int responce = fileChooser.showSaveDialog(null);
            if (responce == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
