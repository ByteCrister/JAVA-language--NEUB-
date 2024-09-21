import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ListenerMouseMotionListener extends JFrame {

    private Container container;
    private JTextArea area;
    private JTextField field;
    private JScrollPane scroll;

    ListenerMouseMotionListener() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 200, 400, 400);
        setResizable(false);

        container = getContentPane();
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
        scroll.setBounds(8, 100, 370, 250);
        container.add(scroll);

        field.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                area.append("mouseDragged : " + e.getX() + " - " + e.getY() + " \n");
            }

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                area.append("mouseMoved  : " + e.getX() + " - " + e.getY() + "\n");
            }
        });
    }

    public static void main(String[] args) {
        ListenerMouseMotionListener frame = new ListenerMouseMotionListener();
        frame.setVisible(true);
    }
}
