package animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private int HEIGHT, WIDTH;
    private Image BACKGROUND, ANIME;
    private int xVelocity, yVelocity;
    private int x, y;
    private Timer timer;

    public MyPanel() {
        init();
        super.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        super.setBackground(Color.black);
        timer.start();
    }

    private void init() {
        HEIGHT = 500;
        WIDTH = 500;
        BACKGROUND = new ImageIcon("sky.jpg").getImage();
        ANIME = new ImageIcon("key.png").getImage();
        xVelocity = 2;
        yVelocity = 2;
        x = 0;
        y = 0;
        timer = new Timer(10, this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        // Draw background
        g2D.drawImage(BACKGROUND, 0, 0, null);

        // Draw the anime
        g2D.drawImage(ANIME, x, y,  null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= WIDTH - ANIME.getWidth(null)) {
            xVelocity = -xVelocity;
        } else if (x <= 0) {
            xVelocity = Math.abs(xVelocity);
        }
        if (y >= HEIGHT - ANIME.getHeight(null)) {
            yVelocity = -yVelocity;
        } else if (y <= 0) {
            yVelocity = Math.abs(yVelocity);
        }
        x += xVelocity;
        y += yVelocity;
        super.repaint();
    }
}
