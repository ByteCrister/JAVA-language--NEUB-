import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;

public class JFrame4 extends JFrame{
    private ImageIcon icon;
    private Container c;
    JFrame4(){
        icon = new ImageIcon(getClass().getResource("102.png"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setBackground(Color.DARK_GRAY);
    }
    public static void main(String[] args) {
        JFrame4 frame = new JFrame4();

        frame.setTitle("Frame Demo");
        frame.setBounds(200,200,500,300);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
