import javax.swing.*;
import java.awt.*;

public class BarmejFrame extends JFrame {
    private JLabel titleLabel;
    private JLabel imgLabel;
    public BarmejFrame(){
        super("برمج");
        setLayout(new FlowLayout());
        titleLabel = new JLabel("مسار تعلم لغة الجافا");
        add(titleLabel);
        Icon image = new ImageIcon(getClass().getResource("img/barmej.jpg"));
        imgLabel = new JLabel();
        imgLabel.setIcon(image);
        add(imgLabel);
    }
}
