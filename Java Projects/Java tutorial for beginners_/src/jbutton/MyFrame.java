package jbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JButton button;

    public MyFrame() {
        ImageIcon icon = new ImageIcon("ok-hand.jpg");
        button = new JButton();
        button.setBounds(50, 100, 200, 100);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setIcon(icon);
        button.setFocusable(false);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.TOP);
        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan);
        button.setBackground(Color.black);
        button.setBorder(BorderFactory.createEtchedBorder());


        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Poo");
            button.setEnabled(false);
        }
    }
}
