package lamda.ex;

import javax.swing.*;

public class MyFrame extends JFrame {
    private JButton button1, button2;

    public MyFrame() {
        super.setTitle("Lambda");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(null);

        button1 = new JButton("MY BUTTON ONE");
        button1.setBounds(100, 100, 200, 100);

        button2 = new JButton("MY BUTTON TOW");
        button2.setBounds(100, 200, 200, 100);

        button1.addActionListener((event) -> System.out.println("You Preseed on button one :D"));

        button2.addActionListener((event) -> System.out.println("You pressed on button tow :R"));

        super.add(button1);
        super.add(button2);
        super.setSize(450, 450);
        super.setVisible(true);
    }
}
