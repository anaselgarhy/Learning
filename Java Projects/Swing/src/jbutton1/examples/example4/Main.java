package jbutton1.examples.example4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int counter = 0;
    public static void main(String[] args){

        // Create frame
        JFrame frame = new JFrame("JButton example 4");
        frame.setSize(300, 90);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Serif", Font.PLAIN, 35);
        JLabel label = new JLabel("0");
        label.setFont(font);

        JButton btnPlus = new JButton("+1");
        JButton btnMines = new JButton("-1");

        btnPlus.setSize(50, 50);
        btnMines.setSize(50, 50);

        btnPlus.setFont(font);
        btnMines.setFont(font);

        btnPlus.setForeground(Color.green);
        btnMines.setForeground(Color.RED);

        btnPlus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                label.setText("" + (++counter));
            }
        });
        btnMines.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                label.setText("" + (--counter));
            }
        });

        // add elements in frame
        frame.add(btnPlus);
        frame.add(label);
        frame.add(btnMines);

        // show frame
        frame.setVisible(true);



    }
}
