package checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JCheckBox checkBox;
    private JButton button;
    private ImageIcon checked;
    private ImageIcon unchecked;

    public MyFrame() {
        Font font = new Font("Consolas", Font.PLAIN, 36);
        checkBox = new JCheckBox("I'm not robot");
        button = new JButton("Ok!");
        checked = new ImageIcon("true.png");
        unchecked = new ImageIcon("false.png");

        checkBox.setFont(font);
        checkBox.setFocusable(false);
        checkBox.setIcon(unchecked);
        checkBox.setSelectedIcon(checked);

        button.setFont(font);
        button.setFocusable(false);
        button.addActionListener(this);


        super.add(checkBox);
        super.add(button);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.pack();
        super.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
