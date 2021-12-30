package jpasswordFiled1;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Main {
    private static boolean isHide = true;
    public static void main(String[] args){
        JFrame frame = new JFrame("JPasswordFiled");
        frame.setSize(515, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Cairo", Font.PLAIN, 20);

        JLabel label = new JLabel("Enter Your password");
        label.setFont(font);
        label.setBounds(23, 97, 180, 27);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(font);
        passwordField.setBounds(227, 97, 219, 27);
        passwordField.setEchoChar('*');

        JButton showPassBtn = new JButton(new ImageIcon(Objects.requireNonNull(Main.class.getResource("./resources/show.png"))));
        showPassBtn.setBounds(460, 97, 34, 27);

       JButton loginBtn = new JButton("Login");
       loginBtn.setFont(font);
       loginBtn.setBounds(158, 175, 185, 36);
       // Add Elements to frame
        frame.add(label);
        frame.add(passwordField);
        frame.add(showPassBtn);
        frame.add(loginBtn);

        // show frame
        frame.setVisible(true);

        showPassBtn.addActionListener(event -> {
            showPassBtn.setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getResource("./resources/" + (isHide? "hide" : "show") + ".png"))));
            passwordField.setEchoChar(isHide? '\0' : '*');
            isHide = !isHide;
        });
    }
}
