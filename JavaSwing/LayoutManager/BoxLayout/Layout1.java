import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;

class Layout1 extends JFrame{
    private Container container;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JPanel panel1;
    private BoxLayout bLayout;

    Layout1(){
        this.setBounds(400,100,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("BoxLayout Demo");
        container = this.getContentPane();


        panel1 = new JPanel();
        panel1.setBounds(0,0,500,500);
        panel1.setBackground(Color.CYAN);
        
        bLayout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        panel1.setLayout(bLayout);
        
        btn1 = new JButton("1");
        panel1.add(btn1);
        panel1.add(Box.createVerticalStrut(10));

        btn2 = new JButton("2");
        panel1.add(btn2);
        btn3 = new JButton("3");
        panel1.add(btn3);
        btn4 = new JButton("4");
        panel1.add(btn4);
        panel1.add(Box.createVerticalStrut(5));
        
        btn5 = new JButton("5");
        panel1.add(btn5);

        
        container.add(panel1);
    }
    public static void main(String[] args) {
        Layout1 frame = new Layout1();
        frame.setVisible(true);
    }
}