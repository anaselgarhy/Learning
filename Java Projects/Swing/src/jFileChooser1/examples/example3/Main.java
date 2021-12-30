package jFileChooser1.examples.example3;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JFileChooser example 3");
        // Set Up the frame
        frame.setSize(520, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem open = new JMenuItem("Open File");

        // Assembly the menu bar
        menuBar.add(fileMenu);
        fileMenu.add(open);

        // Create the text area and the text area scroll pane
        JTextArea textArea = new JTextArea();
        JScrollPane textAreaScroller = new JScrollPane(textArea);

        // Add the menu bar to the frame
        frame.setJMenuBar(menuBar);
        // Add the scroll pane(text area) to the frame
        frame.add(textAreaScroller);

        // Create the file chooser
        JFileChooser fileChooser = new JFileChooser();

        // File Chooser Dialog يمثل إمتداد الملفات التي نريدها أن تظهر في الـ FileNameExtensionFilter هنا قمنا بإنشاء كائن من الكلاس
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Java or Text files", "java", "txt");
        fileChooser.setFileFilter(extensionFilter);

        // Show the frame
        frame.setVisible(true);

        // Add the action listener to the open file option
        open.addActionListener(event ->{
            // Show the open file dialog
            int returnValue = fileChooser.showOpenDialog(null);

            // Check opened file
            if(returnValue == JFileChooser.APPROVE_OPTION){
                String line;
                StringBuilder content = new StringBuilder();

                try{
                    // Open file
                    BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));

                    // Read file content line by line
                    while((line = reader.readLine()) != null)
                        content.append(line).append('\n');

                    // Add the content to the text area
                    textArea.setText(content.toString());

                    // Close the opened file
                    reader.close();
                } catch(IOException e){
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
