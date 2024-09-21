import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StudentManagement extends JFrame implements ActionListener {
    private Container container;

    String headColumn[] = { "First Name", "Last Name", "GPA", "Phone Number" };
    String infoRows[] = new String[4];

    private JLabel infoLabel, fLabel, lLabel, phoneLabel, gpaLabel;

    private JButton addButton, updateButton, deleteButton, clearButton;

    private DefaultTableModel tableModel;

    private JTable table;

    private JScrollPane scroll;

    private JTextField fField, lField, phoneNumberField, gpaField;

    StudentManagement() {
        this.setTitle("Student Management System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 80, 600, 600);

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.DARK_GRAY);

        infoLabel = new JLabel("Student Registration");
        infoLabel.setForeground(Color.WHITE);
        infoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        infoLabel.setBounds(200, 10, 200, 50);
        container.add(infoLabel);

        fLabel = new JLabel("First Name");
        fLabel.setForeground(Color.WHITE);
        fLabel.setFont(new Font("Arial", Font.BOLD, 15));
        fLabel.setBounds(15, 70, 150, 50);
        container.add(fLabel);

        fField = new JTextField();
        fField.setFont(new Font("Arial", Font.BOLD, 15));
        fField.setBounds(120, 80, 180, 30);
        container.add(fField);

        addButton = new JButton("Add");
        addButton.setBounds(340, 80, 100, 30);
        container.add(addButton);

        lLabel = new JLabel("Last Name");
        lLabel.setForeground(Color.WHITE);
        lLabel.setFont(new Font("Arial", Font.BOLD, 15));
        lLabel.setBounds(15, 130, 150, 50);
        container.add(lLabel);

        lField = new JTextField();
        lField.setFont(new Font("Arial", Font.BOLD, 15));
        lField.setBounds(120, 140, 180, 30);
        container.add(lField);

        updateButton = new JButton("Update");
        updateButton.setBounds(340, 140, 100, 30);
        container.add(updateButton);

        phoneLabel = new JLabel("Phone");
        phoneLabel.setForeground(Color.WHITE);
        phoneLabel.setFont(new Font("Arial", Font.BOLD, 15));
        phoneLabel.setBounds(15, 190, 150, 50);
        container.add(phoneLabel);

        phoneNumberField = new JTextField();
        phoneNumberField.setFont(new Font("Arial", Font.BOLD, 15));
        phoneNumberField.setBounds(120, 200, 180, 30);
        container.add(phoneNumberField);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(340, 200, 100, 30);
        container.add(deleteButton);

        gpaLabel = new JLabel("GPA");
        gpaLabel.setForeground(Color.WHITE);
        gpaLabel.setFont(new Font("Arial", Font.BOLD, 15));
        gpaLabel.setBounds(15, 250, 150, 50);
        container.add(gpaLabel);

        gpaField = new JTextField();
        gpaField.setFont(new Font("Arial", Font.BOLD, 15));
        gpaField.setBounds(120, 260, 180, 30);
        container.add(gpaField);

        clearButton = new JButton("Clear");
        clearButton.setBounds(340, 260, 100, 30);
        container.add(clearButton);

        table = new JTable();

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headColumn);

        table.setModel(tableModel);
        table.setFont(new Font("Arial", Font.BOLD, 15));
        table.setSelectionBackground(Color.YELLOW);
        table.setRowHeight(30);
        table.setBackground(Color.LIGHT_GRAY);

        scroll = new JScrollPane(table);
        scroll.setBounds(15, 320, 560, 200);
        container.add(scroll);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);

        ///////////////////////////////////////
        table.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int tableValue = table.getSelectedRow();
                fField.setText(tableModel.getValueAt(tableValue, 0).toString());
                lField.setText(tableModel.getValueAt(tableValue, 1).toString());
                phoneNumberField.setText(tableModel.getValueAt(tableValue, 2).toString());
                gpaField.setText(tableModel.getValueAt(tableValue, 3).toString());

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });
        ///////////////////////////////////////////

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (fField.getText().length() != 0 && lField.getText().length() != 0 && phoneNumberField.getText().length() != 0
                && gpaField.getText().length() != 0) {

            if (e.getSource() == addButton) {
                infoRows[0] = fField.getText();
                infoRows[1] = lField.getText();
                infoRows[2] = phoneNumberField.getText();
                infoRows[3] = gpaField.getText();

                tableModel.addRow(infoRows);

            } else if (e.getSource() == clearButton) {
                fField.setText("");
                lField.setText("");
                phoneNumberField.setText("");
                gpaField.setText("");
            } else if (e.getSource() == deleteButton) {
                int rowTableNo = table.getSelectedRow();

                if (rowTableNo != -1) {

                    tableModel.removeRow(rowTableNo);
                } else {
                    JOptionPane.showMessageDialog(null, "Select a Row", "WARNING", JOptionPane.ERROR_MESSAGE);
                }
            } else if (e.getSource() == updateButton) {
                int rowNo = table.getSelectedRow();
                if (table.getSelectedRow() >= 0) {
                    tableModel.setValueAt(fField.getText(), rowNo, 0);
                    tableModel.setValueAt(lField.getText(), rowNo, 1);
                    tableModel.setValueAt(phoneNumberField.getText(), rowNo, 2);
                    tableModel.setValueAt(gpaField.getText(), rowNo, 3);

                } else {
                    JOptionPane.showMessageDialog(null, "Select a Row", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Enter your all Information's !!", "WARNING!",
                    JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void main(String[] args) {

        StudentManagement frame = new StudentManagement();
        frame.setVisible(true);

    }
}