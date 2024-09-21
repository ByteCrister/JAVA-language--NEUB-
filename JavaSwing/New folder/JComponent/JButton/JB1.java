import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

public class JB1 extends JFrame{

    private Container container;
    private ImageIcon icon;
    private JButton button1, button2;

    private Cursor cursor; //Creating new look of cursor

    JB1(){
        container=this.getContentPane();
        container.setBackground(Color.RED);
        container.setLayout(null);

        icon = new ImageIcon(getClass().getResource("102.png"));
        this.setIconImage(icon.getImage());


        button1 = new JButton(new ImageIcon(getClass().getResource("login.png")));
        button1.setText("Click");
        button1.setFont(new Font("Arial",Font.BOLD,10));
        button1.setBounds(60,30,60,30);
        button1.setForeground(Color.DARK_GRAY);
        button1.setBackground(Color.YELLOW);

        cursor= new Cursor(Cursor.HAND_CURSOR);
        button1.setCursor(cursor);

        container.add(button1);
        
        
        
        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial",Font.TYPE1_FONT,10));
        button2.setBounds(130,30,60,30);
        button2.setForeground(Color.DARK_GRAY);
        button2.setBackground(Color.YELLOW);
        button2.setCursor(new Cursor(Cursor.MOVE_CURSOR));

        container.add(button2);


    }
    public static void main(String[] args) {
        
        JB1 frame = new JB1();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,200,500,400);
        frame.setTitle("JButton Demo");
    }
}