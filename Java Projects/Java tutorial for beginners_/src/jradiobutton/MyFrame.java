package jradiobutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JRadioButton radioButton1, radioButton2, radioButton3;

    public MyFrame() {
        setTitle("JRadioButton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        radioButton1 = new JRadioButton("Pizza");
        radioButton2 = new JRadioButton("Burger");
        radioButton3 = new JRadioButton("Hot Dog");

        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton3.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);


        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == radioButton1) {
            System.out.println("You ordered Pizza");
        } else if (e.getSource() == radioButton2) {
            System.out.println("You ordered Burger");
        } else if (e.getSource() == radioButton3) {
            System.out.println("You ordered Hot Dog");
        }
    }
}
