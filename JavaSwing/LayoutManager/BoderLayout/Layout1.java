import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

class Layout1 extends JFrame{
    private Container container;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JPanel panel1;
    private BorderLayout B_layout;

    Layout1(){
        this.setBounds(400,100,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("BorderLayout Demo");
        container = this.getContentPane();


        panel1 = new JPanel();
        panel1.setBounds(0,0,500,500);
        panel1.setBackground(Color.CYAN);
        container.add(panel1);

        B_layout = new BorderLayout(10,5);
        panel1.setLayout(B_layout);
        // container.setBackground(Color.lightGray);
        // container.setLayout(B_layout);

        //***********************/
        // B_layout.setHgap(10);
        // B_layout.setVgap(10);

        btn1 = new JButton("1");
        panel1.add(btn1, BorderLayout.NORTH);

        btn2 = new JButton("2");
        panel1.add(btn2, BorderLayout.SOUTH);

        btn3 = new JButton("3");
        panel1.add(btn3, BorderLayout.EAST);

        btn4 = new JButton("4");
        panel1.add(btn4, BorderLayout.WEST);

        btn5 = new JButton("5");
        panel1.add(btn5, BorderLayout.CENTER);



    }
    public static void main(String[] args) {
        Layout1 frame = new Layout1();
        frame.setVisible(true);
    }
}