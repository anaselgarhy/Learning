package graphics2d;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    private Image image;

    public MyPanel() {
        image = new  ImageIcon("sky.jpg").getImage();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));
        // g2D.drawLine(0, 0, super.getWidth(), super.getHeight());

        g2D.setPaint(new Color(0xFFAA65));
        // g2D.drawRect(20, 12, 100, 200);
        // g2D.fillRect(20, 12, 100, 200);

        g2D.setPaint(new Color(126, 36, 44));
        // g2D.drawOval(105, 30, 50, 50);
        // g2D.drawOval(20, 60, 30, 60);

        g2D.setPaint(Color.orange);
        // g2D.fillOval(2, 5, 70, 70);

//        g2D.drawArc(0, 0, 60, 60, 0, 180);

        int drawScale = 250;
        // Draw bokymon
        // g2D.setPaint(Color.red);
        // g2D.fillArc(10, 10, drawScale, drawScale, 0, 180);

        // g2D.setPaint(new Color(0xFFFFFF));
        // g2D.fillArc(10, 10, 120, drawScale, drawScale, 180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        // g2D.drawPolygon(xPoints, yPoints, 3);
        // g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.setPaint(new Color(0xEE4324));
        g2D.setFont(new Font("MS Comic Sans", Font.BOLD, 50));
        // g2D.drawString("U R A WiNER! :D", 1, 200);

        g2D.drawImage(image, 0, 0, null);

    }
}
