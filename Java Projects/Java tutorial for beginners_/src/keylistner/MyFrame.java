package keylistner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    private final JLabel label;

    public MyFrame() {
        setTitle("KeyListener");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        addKeyListener(this);

        label = new JLabel();
        label.setIcon(new ImageIcon("rocket.png"));
        label.setBounds(0, 0, label.getPreferredSize().width, label.getPreferredSize().height);

        getContentPane().setBackground(new Color(0x000000));

        add(label);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Point newPoint = new Point(label.getLocation());
        switch (e.getKeyChar()) {
            case 'a' -> newPoint.setLocation(label.getX() - 5, label.getY());
            case 'd' -> newPoint.setLocation(label.getX() + 5, label.getY());
            case 'w' -> newPoint.setLocation(label.getX(), label.getY() - 5);
            case 's' -> newPoint.setLocation(label.getX(), label.getY() + 5);
        }
        label.setLocation(newPoint);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char: " + e.getKeyChar()   );
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
