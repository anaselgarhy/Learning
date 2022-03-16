package openanewwindow;

import javax.swing.*;

public class NewWindow extends JFrame {
    public NewWindow(int andIncrement) {
        super("New Window " + andIncrement);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }
}
