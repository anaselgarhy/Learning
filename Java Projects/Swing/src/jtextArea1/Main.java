package jtextArea1;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextArea");
        frame.setSize(615, 540);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font tajawalMedium = new Font("Tajawal", Font.PLAIN, 20);
        Font tajawalBold = new Font("Tajawal", Font.BOLD, 20);

        JLabel label1 = new JLabel("Sava as"), label2 = new JLabel(".");
        JTextField fileName = new JTextField();
        JTextField fileExtension = new JTextField("txt");
        JTextArea textArea = new JTextArea();
        JButton saveButton = new JButton("Save");

        // Set font for all elements
        label1.setFont(tajawalMedium);
        label2.setFont(tajawalBold);
        fileName.setFont(tajawalMedium);
        fileExtension.setFont(tajawalMedium);
        textArea.setFont(tajawalMedium);
        saveButton.setFont(tajawalMedium);

        // Set Bounds for all elements
        label1.setBounds(40, 40, 63, 28);
        label2.setBounds(309, 40, 7, 29);
        fileName.setBounds(123, 40, 177, 28);
        fileExtension.setBounds(325, 40, 97, 28);
        saveButton.setBounds(447, 40, 107, 28);
        textArea.setBounds(19, 88, 562, 392);

        // Set text area properties
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Add all elements to frame
        frame.add(label1);
        frame.add(label2);
        frame.add(fileName);
        frame.add(fileExtension);
        frame.add(saveButton);
        frame.add(textArea);

        // show frame
        frame.setVisible(true);


        saveButton.addActionListener(event -> {
            if(fileName.getText().equals("")){
                fileName.setBackground(Color.red);
            }
            else if(fileExtension.getText().equals(""))
                fileExtension.setBackground(Color.red);
            else{
                FileWriter fileWriter = null;
                try{
                    fileWriter = new FileWriter(fileName.getText() + "." + fileExtension.getText());
                    fileWriter.write(textArea.getText());
                } catch (IOException e) {
                    fileName.setForeground(Color.red);
                    fileExtension.setForeground(Color.red);
                } finally{
                    try {
                        if(fileWriter != null)
                            fileWriter.close();
                    } catch (IOException e) {
                        saveButton.setBackground(Color.red);
                    }
                }
            }
        });
    }
}
