package animation;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("Game");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.add(new MyPanel());
        super.pack();
        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }
}
