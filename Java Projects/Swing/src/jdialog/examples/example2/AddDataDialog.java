package jdialog.examples.example2;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class AddDataDialog extends JDialog {
    Font font;
    private final DefaultTableModel tableModel;
    private final JPanel panel;
    private final JScrollPane scrollPane;
    private final JButton addButton, cancelButton;

    private final ArrayList<String> columns = new ArrayList<>();
    private final ArrayList<JTextField> textFields = new ArrayList<>();


    public AddDataDialog(JFrame frame, @NotNull final DefaultTableModel tableModel, Font font){
        super(frame, true);
        this.tableModel = tableModel;
        panel = new JPanel(new GridLayout(), false);
        scrollPane = new JScrollPane(panel);
        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");
        this.font = font;
        createDialog(true);
    }
    private void createDialog(boolean isFirstTime){
        if(isFirstTime) {
            // Set up the dialog
            super.setSize(501, 325);
            super.setLayout(null);
            super.setTitle("Add data");

            // Set bounds for all components in dialog
            scrollPane.setBounds(78, 38, 335, 188);
            addButton.setBounds(333, 249, 118, 36);
            cancelButton.setBounds(40, 249, 118, 36);

            // Set font for buttons in the dialog
            addButton.setFont(font);
            cancelButton.setFont(font);

            // Set columns of grid layout
            ((GridLayout)panel.getLayout()).setColumns(1);

            // Add all components to the dialog
            super.add(scrollPane);
            super.add(addButton);
            super.add(cancelButton);
        } else {
            ((GridLayout)panel.getLayout()).setRows(tableModel.getColumnCount());
            // Clear array lists
            columns.clear();
            textFields.clear();

            JPanel[] panelsSmall = new JPanel[tableModel.getColumnCount()];
            for(int i = 0; i < tableModel.getColumnCount()-1; i++) {
                columns.add(tableModel.getColumnName(i));

                // Create the text field
                textFields.add(new JTextField());
                // Set size of text field
                textFields.get(i).setBounds(0, 75, 178, 35);

                panelsSmall[i] = new JPanel(null);
                panelsSmall[i].setBounds(i == 0 ? 10 : panelsSmall[i-1].getX() + 10,
                        i == 0 ? 10 : panelsSmall[i-1].getY() + 10, 304, 36);
                // Add the label (column name) to the panel small
                panelsSmall[i].add(new JLabel(columns.get(i))).setBounds(0, 1, 70, 26);
                // Add the text filed to the panel small
                panelsSmall[i].add(textFields.get(i));

                panel.add(panelsSmall[i]);

            }

        }

    }
    @Override
    public void setVisible(boolean visible){
        if(visible)
            createDialog(false);

        super.setVisible(visible);
    }

}
