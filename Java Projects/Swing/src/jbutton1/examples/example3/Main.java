package jbutton1.examples.example3;

import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JButton example 3");
        frame.setSize(230, 215);
        frame.setLayout(null); // Look here
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btnPlay = new JButton("Play" , new ImageIcon(Main.class.getResource("./resources/play.png"))); // Look here
        JButton btnSetting = new JButton(new ImageIcon(Objects.requireNonNull(Main.class.getResource("./resources/settings.png")))); // Look here

        btnPlay.setBounds(54, 30, 120, 50);
        btnSetting.setBounds(54, 100, 120, 50);

        // Add buttons to frame
        frame.add(btnPlay);
        frame.add(btnSetting);

        // show frame
        frame.setVisible(true);
    }
}
