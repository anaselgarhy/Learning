package joptionPane1.examples.example2;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JOptionPane example 2");
        // Set Up the frame
        frame.setSize(420, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton clearHistoryButton = new JButton("Clear history");
        JButton likeButton = new JButton("Do you like programming");
        JButton exitButton = new JButton("Exit");
        JLabel label = new JLabel("Here we display user interactions");

        // Set the bounds for all components
        clearHistoryButton.setBounds(95, 20, 200, 30);
        likeButton.setBounds(95, 60, 200, 30);
        exitButton.setBounds(95, 100, 200, 30);
        label.setBounds(95, 150, 200, 30);

        // Add all components to the frame
        frame.add(clearHistoryButton);
        frame.add(likeButton);
        frame.add(exitButton);
        frame.add(label);

        // Show the frame
        frame.setVisible(true);

        // Add Clear history button action listener
        // clearHistoryButton عند النقر على الـ Confirm Dialog هنا قلنا أنه سيتم إظهار
        clearHistoryButton.addActionListener(event -> {
            // result ثم تخزين قيمة الزر الذي نقر عليه المستخدم في المتغير Confirm Dialog سيتم إظهار
            int result = JOptionPane.showConfirmDialog(frame, "You are going to delete your history\nAre you sure?",
                    "Delete history", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

            // result على أساس القيمة التي تم تخزينها في المتغير label هنا سيتم تغيير نص الـ
            String temp = "User click: ";
            switch(result){
                case JOptionPane.YES_OPTION -> temp += "Yes";
                case JOptionPane.NO_OPTION -> temp += "No";
                case JOptionPane.CANCEL_OPTION -> temp += "Cancel";
                case JOptionPane.CLOSED_OPTION -> temp += "Close";
            }
            // Set label text
            label.setText(temp);
        });

        // Add like button action listener
        // likeButton عند النقر على الـ Confirm Dialog هنا قلنا أنه سيتم إظهار
        likeButton.addActionListener(event -> {
            // result ثم تخزين قيمة الزر الذي نقر عليه المستخدم في المتغير Confirm Dialog سيتم إظهار
            int result = JOptionPane.showConfirmDialog(frame, "Do like a programming?",
                    "Like a programming",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            // result على أساس القيمة التي تم تخزينها في المتغير label هنا سيتم تغيير نص الـ
            String temp = "User chose: ";
            switch(result){
                case JOptionPane.YES_OPTION -> temp += "Yes ☺";
                case JOptionPane.NO_OPTION -> temp += "No 😥";
                case JOptionPane.CLOSED_OPTION ->  temp = "User click: Close";
            }
            // Set label text
            label.setText(temp);
        });

        // Add exit button action listener
        // exitButton عند النقر على الـ Confirm Dialog هنا قلنا أنه سيتم إظهار
        exitButton.addActionListener(event -> {
            // result ثم تخزين قيمة الزر الذي نقر عليه المستخدم في المتغير Confirm Dialog سيتم إظهار
            int result = JOptionPane.showConfirmDialog(frame,
                    "Close the program now?", "Exit",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

            // result على أساس القيمة التي تم تخزينها في المتغير label هنا سيتم تغيير نص الـ
            String temp = "User click: ";
            switch(result){
                case JOptionPane.YES_OPTION -> System.exit(1);
                case JOptionPane.CANCEL_OPTION -> temp += "Cancel";
                case JOptionPane.CLOSED_OPTION -> temp += "Close";
            }
            // Set label text
            label.setText(temp);
        });
    }
}
