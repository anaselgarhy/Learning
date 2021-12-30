package jfream1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true); // true = show, false = hide
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // = 3 // to exit if click on X button
        new Thread(){
            @Override
            public void run(){
                for(;;){
                    f.setVisible(f.isVisible()? false: true);
                    try {
                        super.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.run();
    }
}
