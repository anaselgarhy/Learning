package jdialog.examples.example1;

import javax.swing.*;

public class CustomDialog {
    private JDialog dialog;
    private  JLabel label;
    private JButton button;

    public CustomDialog(JFrame frame){
        // Dialog و تعريف الأشياء التي سنضيفها في الـ Frame بالـ Dialog هنا قمنا بربط الـ
        dialog = new JDialog(frame);
        label = new JLabel("This ia a custom dialog");
        button = new JButton("Close");

        // Set bounds for all components
        label.setBounds(40, 50, 150, 30);
        button.setBounds(210, 50, 70, 30);

        // Dialog هنا قمنا بتحديد بعض خصائص الـ
        dialog.setLocationRelativeTo(frame); // هنا نقوم بجعل الديالوج يظهر في المكان الذي توجد به النافذة حاليا
        dialog.setLayout(null);
        dialog.setSize(340, 170);
        dialog.setTitle("Custom dialog");
        dialog.setModal(false);

        // Add all components to the dialog
        dialog.add(label);
        dialog.add(button);

        button.addActionListener(event -> hide());
    }
    public void show(){
        dialog.setVisible(true);
    }
    public void hide(){
        dialog.setVisible(false);
    }
}
