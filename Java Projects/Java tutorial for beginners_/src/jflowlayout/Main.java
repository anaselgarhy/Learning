package jflowlayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] ars) {
        JFrame frame = new JFrame("FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);

        JButton[] buttons = new JButton[9];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(i + 1 + "");
            frame.add(buttons[i]);
        }

        frame.setVisible(true);
    }
}
