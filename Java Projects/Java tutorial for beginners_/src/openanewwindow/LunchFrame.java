package openanewwindow;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LunchFrame extends JFrame {
    private JButton lunchButton;

    public LunchFrame() {
        lunchButton = new JButton("New Window");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(300, 200);
        super.add(lunchButton);
        super.setVisible(true);

        AtomicInteger i = new AtomicInteger();
        lunchButton.addActionListener(l -> new NewWindow(i.getAndIncrement()));
    }
}
