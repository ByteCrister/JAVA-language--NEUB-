import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;

class JLabel1 extends JFrame {

    private Container container;
    private JLabel userLabel1, userLabel2;

    JLabel1() {

        container = this.getContentPane();

        container.setLayout(null);//For set bounds

        container.setBackground(Color.lightGray);

        userLabel1 = new JLabel();

        userLabel1.setText("Message : ");
        userLabel1.setBounds(50, 20, 100, 50);
        container.add(userLabel1);

        userLabel2 = new JLabel();
        userLabel2.setText("Type your thoughts : ");
        userLabel2.setBounds(50,40,150,50);
        container.add(userLabel2);

    }

    public static void main(String[] args) {
        JLabel1 frame = new JLabel1();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 400, 200);
        frame.setResizable(false);
        frame.setTitle("Label Demo");
    }
}