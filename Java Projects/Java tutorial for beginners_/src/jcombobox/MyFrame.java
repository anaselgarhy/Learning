package jcombobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JComboBox comboBox;

    public MyFrame() {
        super.setTitle("JComboBox");
        super.setLayout(new FlowLayout());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"pizza", "hamburger", "fries", "chicken"};
        comboBox = new JComboBox(items);
        comboBox.addActionListener(this);

        super.add(comboBox);
        super.pack();
        super.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            JOptionPane.showMessageDialog(null, "You selected " + comboBox.getSelectedItem(),
                    "Selection", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
