import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ListenerFocusListener extends JFrame{

     private Container container;
    private JTextArea area;
    private JTextField field;
    private JScrollPane scroll;

   ListenerFocusListener() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 200, 400, 400);
        this.setResizable(false);

        container = this.getContentPane();
        container.setBackground(Color.DARK_GRAY);
        container.setLayout(null);

        field = new JTextField();
        field.setBounds(8, 10, 370, 70);
        field.setFont(new Font("Arial", Font.BOLD, 20));
        field.setOpaque(true);
        field.setBackground(Color.ORANGE);
        container.add(field);
        
        area = new JTextArea();
        area.setBackground(Color.ORANGE);
        area.setFont(new Font("Arial", Font.BOLD, 20));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        scroll = new JScrollPane(area);
        scroll.setBounds(8,100,370,250);
        container.add(scroll);

        field.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
               area.append("    Focus Gained \n");
            }

            @Override
            public void focusLost(FocusEvent e) {
                area.append("   Focus Lost \n");
            }
            
        });

    }
    public static void main(String[] args) {
        ListenerFocusListener frame = new ListenerFocusListener();
        frame.setVisible(true);
    }
}