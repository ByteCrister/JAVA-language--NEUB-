import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class JLabel3 extends JFrame {

    private Container container;
    private JLabel label1;

    JLabel3() {
        container = this.getContentPane();
        container.setBackground(Color.DARK_GRAY);

        container.setLayout(null);
        label1= new JLabel();
        label1.setText("Enter your Name : ");
        label1.setFont(new Font("Arial",Font.ITALIC, 15));
        label1.setBounds(20,20,150,50);

        //*************************************/
        label1.setForeground(Color.lightGray);//To change the color of foreground

        //**************************/
        label1.setOpaque(true);
        label1.setBackground(Color.RED);// setOpaque and setBackground for change the color of Background

        container.add(label1);

        //**************************************************/
        label1.setToolTipText("Please enter your name");

        System.out.println(label1.getText());
        System.out.println(label1.getToolTipText());

    }

    public static void main(String[] args) {

        JLabel3 frame = new JLabel3();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 150, 450, 300);
        frame.setTitle("JavaSwing");
    }
}
