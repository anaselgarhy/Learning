package draganddrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragAndDropPanel extends JPanel {
    private final ImageIcon image;
    private Point imageCorner, prevPt;

    public DragAndDropPanel() {
        image = new ImageIcon("grinning-face.png");
        imageCorner = new Point(0, 0);

        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
            System.out.println("prevPt = " + prevPt);
        }

    }

    private class DragListener extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPoint = e.getPoint();
            imageCorner.translate(
                    (int) (currentPoint.getX() - prevPt.getX()),
                    (int) (currentPoint.getY() - prevPt.getY())
            );
            prevPt = currentPoint;
            repaint();
        }
    }
}
