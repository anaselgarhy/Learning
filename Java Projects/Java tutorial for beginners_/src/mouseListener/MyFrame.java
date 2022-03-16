package mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    private final JLabel label;

    public MyFrame() {
        this.setTitle("mouseListener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setResizable(false);

        label = new JLabel();
        label.setFont(new Font(null, Font.PLAIN, 400));
        label.setText("🙂");
        label.setBounds(0, 0, label.getPreferredSize().width, label.getPreferredSize().height);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("😆");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("😣");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("😃");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("🙄");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("😃");
    }
}
