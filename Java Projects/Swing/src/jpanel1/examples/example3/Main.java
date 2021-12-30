package jpanel1.examples.example3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("JPanel example 3");
        // Set Up the frame
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // و وضعنا له حدود و عنوان Layout Manager لا يستخدم أي Panel هنا قمنا بتعريف
        JPanel panel = new JPanel(null);
        // Add titled border to the panel
        panel.setBorder(BorderFactory.createTitledBorder("User info"));
        // Set the bounds of the panel
        panel.setBounds(50, 30, 290, 300);

        // Add the panel in the frame
        frame.add(panel);

        JLabel label1 = new JLabel("First name");
        JLabel label2 = new JLabel("Last name");
        JLabel label3 = new JLabel("Father name");
        JLabel label4 = new JLabel("Mother name");
        JLabel label5 = new JLabel("Gender");
        JTextField firstNameTextFiled = new JTextField();
        JTextField lastNameTextFiled = new JTextField();
        JTextField fatherNameTextField = new JTextField();
        JTextField motherNameTextField = new JTextField();
        JComboBox<String> genderComboBox = new JComboBox<>(new String[]{"Male", "Female"});
        JButton button = new JButton("Add User");

        // Set bounds for all components
        label1.setBounds(30, 50, 100, 25);
        label2.setBounds(30, 90, 100, 25);
        label3.setBounds(30, 130, 100, 25);
        label4.setBounds(30, 170, 100, 25);
        label5.setBounds(30, 210, 100, 25);
        firstNameTextFiled.setBounds(120, 50, 130, 25);
        lastNameTextFiled.setBounds(120, 90, 130, 25);
        fatherNameTextField.setBounds(120, 130, 130, 25);
        motherNameTextField.setBounds(120, 170, 130, 25);
        genderComboBox.setBounds(120, 210, 130, 25);
        button.setBounds(120, 255, 130, 25);

        // Add all components in the panel
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(firstNameTextFiled);
        panel.add(lastNameTextFiled);
        panel.add(fatherNameTextField);
        panel.add(motherNameTextField);
        panel.add(genderComboBox);
        panel.add(button);

        // Show the frame
        frame.setVisible(true);
    }
}
