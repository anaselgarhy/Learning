package keybindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    private JFrame frame;
    private JLabel label;
    private Action upAction, downAction, leftAction, rightAction;;
    public Game() {
        frame = new JFrame("Keybindings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        label =  new JLabel();
        label.setBounds(100, 100, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);


        frame.add(label);
        frame.setVisible(true);

    }

    private class UpAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    private class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    private class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    private class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
