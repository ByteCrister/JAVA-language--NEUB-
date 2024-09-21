import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JB2 extends JFrame{

    private Container container;
    private ImageIcon icon;
    private JButton button1;
    private JTextField jf;

    private Cursor cursor; //Creating new look of cursor

    JB2(){
        container=this.getContentPane();
        container.setBackground(Color.RED);
        container.setLayout(null);

        icon = new ImageIcon(getClass().getResource("102.png"));
        this.setIconImage(icon.getImage());


        jf = new JTextField();
        jf.setBounds(60,10,150,50);
        jf.setFont(new Font("Arial",Font.BOLD, 15));
        jf.setForeground(Color.LIGHT_GRAY);
        jf.setBackground(Color.blue);
        container.add(jf);

        button1 = new JButton();
        button1.setText("Clear");
        button1.setFont(new Font("Arial",Font.BOLD,10));
        button1.setBounds(60,70,60,30);
        button1.setForeground(Color.DARK_GRAY);
        button1.setBackground(Color.YELLOW);

        cursor= new Cursor(Cursor.HAND_CURSOR);
        button1.setCursor(cursor);

        container.add(button1);



        button1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
               jf.setText("");
            }
            
        });

    }
    public static void main(String[] args) {
        
        JB2 frame = new JB2();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,200,500,400);
        frame.setTitle("JButton Demo");
    }
}