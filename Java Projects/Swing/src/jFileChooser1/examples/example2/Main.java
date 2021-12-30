package jFileChooser1.examples.example2;

import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JFileChooser example 2");
        // Set Up the frame
        frame.setSize(520, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // هنا قمنا بتعريف كل شيء وضعناه في شريط القوائم
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openMenuItem = new JMenuItem("Open File");

        // fileMenu في القائمة openMenuItem في شريط القائمة. ثم وضعنا العنصر file هنا وضعنا قائمة الـ
        menuBar.add(fileMenu);
        fileMenu.add(openMenuItem);

        // عند الحاجة Scroll Bar حتى يظهر Scroll Pane و وضعناه بداخل Text Area هنا قمنا بتعريف
        JTextArea textArea = new JTextArea();
        JScrollPane textAreaScroller = new JScrollPane(textArea);

        // Add the menu bar and the scroll pane to the frame
        frame.setJMenuBar(menuBar);
        frame.add(textAreaScroller);

        JFileChooser fileChooser = new JFileChooser((File) null);

        // Shoe the frame
        frame.setVisible(true);

        // open item action listener
        openMenuItem.addActionListener(event -> {
            // Show the open file dialog
            int returnValue = fileChooser.showOpenDialog(frame);

            // Check opened file
            if(returnValue == JFileChooser.APPROVE_OPTION){
                // Get file
                File file = fileChooser.getSelectedFile(); // Look here
                // Get path of selected file
                String filePath = file.getPath();

                try{
                    // Read file content line by line
                    BufferedReader reader = new BufferedReader(new FileReader(filePath));

                    String line;
                    StringBuilder content = new StringBuilder();

                    while((line = reader.readLine()) != null)
                        content.append(line).append('\n');

                    // Add the content file to text area
                    textArea.setText(content.toString());
                    // Close the file
                    reader.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });



    }
}
