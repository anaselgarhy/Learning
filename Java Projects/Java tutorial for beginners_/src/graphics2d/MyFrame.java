package graphics2d;

import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("Graphics2D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        MyPanel panel = new MyPanel();

        add(panel);
        setVisible(true);
    }
}
