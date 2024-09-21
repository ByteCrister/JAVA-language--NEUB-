import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ListenerWindowListener extends JFrame{

     private Container container;
    private JTextArea area;
    private JTextField field;
    private JScrollPane scroll;

    ListenerWindowListener() {
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

        
        this.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("\n windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
               System.out.println("\n windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("\n windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("\n windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
               System.out.println("\n windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("\n windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("\n windowDeactivated");
            }
            
        });
        
    }
    public static void main(String[] args) {
        
        ListenerWindowListener frame = new ListenerWindowListener();
        frame.setVisible(true);
    }
}