package jfream1.j2;
import javax.swing.*;
public class MainWindow extends JFrame {
    public MainWindow (String title, int width, int height){
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
