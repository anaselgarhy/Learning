package jgridlayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3));

        Button[] buttons = new Button[9];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button(i + 1 + "");
            frame.add(buttons[i]);
        }


        frame.setVisible(true);
    }
}
