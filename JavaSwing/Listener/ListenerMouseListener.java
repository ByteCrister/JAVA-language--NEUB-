import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListenerMouseListener extends JFrame {
    private Container container;
    private JTextArea area;
    private JTextField field;
    private JScrollPane scroll;

    ListenerMouseListener() {
        
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


        field.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                area.append("  mouseClicked \n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                area.append("  mousePressed \n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                area.append("  mouseReleased \n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                area.append("  mouseEntered \n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
               area.append("  mouseExited \n");
            }
            
        });

    }

    public static void main(String[] args) {
        ListenerMouseListener frame =  new ListenerMouseListener();
        frame.setVisible(true);
    }
}
