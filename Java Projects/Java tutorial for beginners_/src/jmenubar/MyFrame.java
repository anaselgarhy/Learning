package jmenubar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenuItem loadItem, saveItem, exitItem;

    public MyFrame() {
        super("Menu bar");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 500);
        super.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        Font itemsFont = new Font("MS Boli", Font.PLAIN, 35);
        loadItem.setFont(itemsFont);
        saveItem.setFont(itemsFont);
        exitItem.setFont(itemsFont);

        loadItem.setIcon(new ImageIcon("folder.png"));
        saveItem.setIcon(new ImageIcon("floppy.png"));
        exitItem.setIcon(new ImageIcon("cross-mark.png"));

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        super.setJMenuBar(menuBar);
        super.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("*beep boop* you loaded item");
        } else if (e.getSource() == saveItem) {
            System.out.println("*beep boop* you saved item");
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
