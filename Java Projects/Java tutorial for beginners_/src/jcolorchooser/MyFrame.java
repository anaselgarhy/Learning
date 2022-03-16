package jcolorchooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;

    public MyFrame() {
        super("JColorChooser");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());

        label = new JLabel();
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setBackground(new Color(0xFFFFFF));
        label.setOpaque(true);
        button = new JButton("Pick a color");
        button.addActionListener(this);

        super.add(button);
        super.add(label);
        super.pack();
        super.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            Color color = JColorChooser.showDialog(null, "Pick a color ... i guss", label.getForeground());
            if (color != null) {
                label.setForeground(color);
            }
        }
    }
}
