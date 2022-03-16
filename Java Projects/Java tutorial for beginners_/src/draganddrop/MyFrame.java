package draganddrop;

import javax.swing.*;

public class MyFrame extends JFrame {
    private DragAndDropPanel dragAndDropPanel;
    public MyFrame() {
        dragAndDropPanel = new DragAndDropPanel();
        add(dragAndDropPanel);
        this.setTitle("Drag and Drop demo");
        this.setSize(600, 600);
        this.setResizable(false); // For wms
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
