package jtextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton button;

    public MyFrame() {
        textField = new JTextField();
        button = new JButton("Send");

        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(new Color(0x000000));
        textField.setCaretColor(Color.white);

        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
        button.setForeground(new Color(0xFFFFFF));
        button.setBackground(new Color(0x000000));
        button.setFocusable(false);

        button.addActionListener(this);


        super.add(textField);
        super.add(button);

        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.pack();
        super.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(textField.getText());
        }
    }
}
