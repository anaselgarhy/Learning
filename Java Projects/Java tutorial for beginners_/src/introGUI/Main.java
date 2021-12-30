package introGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Show thd jdialog to ask for the user's name
        String name = JOptionPane.showInputDialog("What is your name?");
        // Show a message dialog with the user's name
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // Show a message dialog to ask the user's age
        // but we need to convert the user's input from string to an int
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        // Show a message dialog with the user's age
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        // Sho a message dialog to ask the user height
        // but we need to convert the user's input from string to a double
        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
        // Show a message dialog with the user's height
        JOptionPane.showMessageDialog(null, "You are " + height + " meters tall");
    }
}
