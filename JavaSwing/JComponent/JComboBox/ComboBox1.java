import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.StringReader;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComboBox1 extends JFrame {

    private Container container;
    private JComboBox box;
    private JTextArea ta;
    String names[] = { "C", "C++", "Java", "Python", "mySql" };

    ComboBox1() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JComboBox Example");
        this.setBounds(200, 100, 1000, 500);
        this.setResizable(false);

        container = this.getContentPane();
        container.setBackground(Color.DARK_GRAY);
        container.setLayout(null);

        box = new JComboBox<>(names);
        box.setBounds(100, 50, 100, 50);

        // ****************************/
        box.setEditable(true);
        // box.setSelectedIndex(2);
        box.setSelectedItem("Java");
        box.addItem("Last");
        // box.removeItem("C");
        // box.removeItemAt(0);
        // box.removeAllItems();
        container.add(box);

        // *****************************/

        ta = new JTextArea();
        ta.setFont(new Font("Arial", Font.BOLD, 20));
        ta.setBackground(Color.LIGHT_GRAY);
        ta.setText("\n");
        container.add(ta);

        JScrollPane bar = new JScrollPane(ta);
        bar.setBounds(250, 100, 420, 200);
        container.add(bar);

        box.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = box.getSelectedItem().toString();
                ta.append("\tYou have selected " + str + "\n");
            }

        });
        
        JButton btn = new JButton("Click");
        btn.setBounds(10, 100, 80, 40);
        container.add(btn);
        
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = box.getSelectedItem().toString();
                ta.append("     Clicked : " + str + "\n");
            }

        });
        
        System.out.println("Items : " + box.getItemCount());
         this.setVisible(true);
    }

    public static void main(String[] args) {

        new ComboBox1();
    }
}