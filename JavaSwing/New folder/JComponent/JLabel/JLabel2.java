import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

class JLabel2 extends JFrame {

    private Container container;
    private JLabel userLabel1, userLabel2;
    private Font f;
    

    JLabel2() {

        container = this.getContentPane();

        container.setLayout(null);//For set bounds

        container.setBackground(Color.lightGray);

        userLabel1 = new JLabel();
        userLabel1.setBounds(50, 20, 200, 100);
        
        userLabel1.setText("Enter your first name : ");
        f = new Font("Arial", Font.BOLD, 10);//adding font
        userLabel1.setFont(f);

        container.add(userLabel1); //adding JLabel into JFrame

        userLabel2 = new JLabel();
        userLabel2.setText("Enter your last name : ");
        userLabel2.setBounds(50,40,200,100);
        container.add(userLabel2);

    }

    public static void main(String[] args) {
        JLabel2 frame = new JLabel2();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 600, 400);
        // frame.setResizable(false);
        frame.setTitle("Label Demo");
    }
}