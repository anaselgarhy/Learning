package jtabbedPane1.examples.example6;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialTab extends JPanel {
    private final JTabbedPane tabbedPane;

    public SpecialTab(final JTabbedPane tabbedPane){

        // تترب من اليسار لليمين و أزلنا أي هوامش لا حاجة لها Tab هنا جعلنا الأشياء التي ستظهر في الـ
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));

        // فارغاً tabbedPane سيتم رمي إستثناء في حال كان الـ
        if(tabbedPane == null)
            throw new NullPointerException("Tabbed pane is null!");
        this.tabbedPane = tabbedPane;

        // مفتوح Tab هنا قمنا بتحسين لون الخلفية الذي يظهر على الـ
        setOpaque(false);

        // label و تحويله إلى Panel هنا سيتم قراءة عنوان الـ
        JLabel label = new JLabel(){
            @Override
            public String getText(){
                int i = tabbedPane.indexOfTabComponent(SpecialTab.this);
                if(i != -1)
                    return tabbedPane.getTitleAt(i);
                return null;
            }
        };

        // Tab في الـ label بعدها سيتم وضع الـ
        super.add(label);

        // 5px بعدها سيتم إزالة أي حدود موضوعة له و إضافة هامش بنسبة
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));

        // بعدها سيتم تعريف زر الخروج الذي سيظهر بجانب العنوان
        JButton btn = new CloseButton();

        super.add(btn);

        // هنا قمنا بإضافة بعض الهامش ناحية اليسار قبل زر الخروج
        super.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
    }
    class CloseButton extends JButton implements ActionListener {
        public CloseButton(){
            final int size = 15;
            super.setPreferredSize(new Dimension(size, size));
            super.setText("x");
            super.setForeground(Color.white);
            super.setToolTipText("Close this tab");

            super.setBackground(new Color(254, 46, 46));
            super.setContentAreaFilled(true);

            super.setFocusable(false);
            super.setBorder(BorderFactory.createEtchedBorder());
            super.setBorderPainted(true);

            super.setUI(new BasicButtonUI());

            super.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int i = tabbedPane.indexOfTabComponent(SpecialTab.this);
            if(i != -1)
                tabbedPane.remove(i);
        }
        @Override
        public void updateUI(){}
    }
}
