package jlabel1.examples.example4;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main implements Runnable {
    private static JLabel timeLabel = new JLabel();
    @Override
    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
            timeLabel.setText(formatter.format(date));
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                timeLabel.setForeground(Color.RED);
                timeLabel.setText(e.getMessage());
            }
        }

    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Time");
        frame.setSize(350, 150);
        frame.setLayout(new CardLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Cairo", Font.BOLD, 35);
        timeLabel.setFont(font);
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(timeLabel);
        frame.setVisible(true);
        Thread t = new Thread(new Main());
        t.start();
    }
}
