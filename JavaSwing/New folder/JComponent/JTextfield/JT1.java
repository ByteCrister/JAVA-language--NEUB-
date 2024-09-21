import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class JT1 extends JFrame{

    private Container container;
    private JTextField jt1,jt2;

    JT1(){
        container = this.getContentPane();
        container.setBackground(Color.DARK_GRAY);

        container.setLayout(null);
        //*********************/
        jt1 = new JTextField();
        jt1.setFont(new Font("Arial",Font.BOLD + Font.ITALIC, 20));

        jt1.setForeground(Color.YELLOW);
        jt1.setOpaque(true);
        jt1.setBackground(Color.RED);
        
        jt1.setHorizontalAlignment(JTextField.CENTER);

        jt1.setBounds(20,20,200,50);
        container.add(jt1);

        //********************/
        jt2 = new JTextField();
        jt2.setFont(new Font("Arial",Font.ITALIC, 15));
        jt2.setBounds(20,80, 200, 50);
        container.add(jt2);
    }
    public static void main(String[] args) {
        
        JT1 frame = new JT1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,150,500,400);
        frame.setTitle("Demo Field");
    }
}
