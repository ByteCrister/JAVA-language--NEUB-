import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class p2_JFrame extends JFrame {

    private Container container;
    private ImageIcon icon;
    private JLabel label1, label2;

    private void createFrame() {
        container = this.getContentPane();
        this.setTitle("Demo");
        this.setBounds(400, 300, 500, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

        container.setLayout(null);
        label1 = new JLabel();
        label1.setText("Enter your Name : ");
        label1.setFont(new Font("Arial", Font.BOLD, 15));
        label1.setBounds(40, 40, 200, 200);
        container.add(label1);

        label2 = new JLabel();
        label2.setText("Enter your Name : ");
        label2.setFont(new Font("Arial", Font.BOLD, 10));
        label2.setBounds(40, 80, 200, 200);
        container.add(label2);



    }

    private void changeBackColor() {

        container = this.getContentPane();
        container.setBackground(Color.LIGHT_GRAY);
    }

    private void creatIcon() {
        icon = new ImageIcon(getClass().getResource("102.png"));
        this.setIconImage(icon.getImage());
    }
    

    public static void main(String[] args) {
        p2_JFrame frame = new p2_JFrame();

        frame.createFrame();
        frame.changeBackColor();
        frame.creatIcon();

    }
}
