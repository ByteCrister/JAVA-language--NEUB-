import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.StringReader;

class Table extends JFrame{

    private String headColumn[] = {"ID", "NAME", "GPA"};

    private String rowsInformation[][] = {
        {"043","Shakib", "3.00"},
        {"02","Mashiyat", "4.00"},
        {"12","Niaz", "3.90"},
        {"043","Shakib", "3.00"},
        {"02","Mashiyat", "4.00"},
        {"12","Niaz", "3.90"},
    };


    private Container container;
    private JLabel label;
    private JTable table;
    private JScrollPane scroll;

    Table(){
        this.setTitle("JTable Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,100,600,500);

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.LIGHT_GRAY);

        label = new JLabel("Student information's");
        label.setFont(new Font("Arial",Font.BOLD, 25));
        label.setBounds(130,10,260,50);
        container.add(label);


        table = new JTable(rowsInformation, headColumn);
        table.setSelectionBackground(Color.RED);
        // table.setEnabled(false);
        scroll = new JScrollPane(table);
        scroll.setBounds(10,50,560,100);
        container.add(scroll);

    }
    public static void main(String[] args) {
        Table frame = new Table();
        frame.setVisible(true);
    }
}