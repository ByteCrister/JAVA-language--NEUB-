import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class JLabel4 extends JFrame {

    private Container container;
    private JLabel label1;
    private ImageIcon imglabel;

    JLabel4() {
        container = this.getContentPane();
        container.setBackground(Color.DARK_GRAY);

        imglabel = new ImageIcon(getClass().getResource("103.png"));

        container.setLayout(null);
        label1= new JLabel(imglabel);
        // label1.setBounds(20,20,150,50);
        label1.setBounds(30,40,imglabel.getIconWidth(),imglabel.getIconHeight());
        container.add(label1);

    }

    public static void main(String[] args) {

        JLabel4 frame = new JLabel4();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 150, 450, 300);
        frame.setTitle("JavaSwing");
    }
}
