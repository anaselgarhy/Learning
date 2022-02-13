package jpanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hey!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(720, 720);

        JPanel firstPanel = new JPanel();
        firstPanel.setBackground(Color.red);
        firstPanel.setBounds(0, 0, 250, 250);

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.blue);
        secondPanel.setBounds(250, 0, 250, 250);

        JPanel thirdPanel = new JPanel();
        thirdPanel.setBackground(Color.green);
        thirdPanel.setBounds(0, 250, 500, 250);

        frame.add(firstPanel);
        frame.add(secondPanel);
        frame.add(thirdPanel);

        frame.setVisible(true);
    }
}
