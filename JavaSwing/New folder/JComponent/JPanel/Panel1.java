import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
class Panel1 extends JFrame{

    private Container container;
    private ImageIcon icon;
    private JPanel panel1, panel2;
    private JButton btn1, btn2, btn3, btn4;

    Panel1(){
        this.setBounds(400,200,400,400);
        this.setTitle("JPanel Demo");

        container = this.getContentPane();
        container.setBackground(Color.YELLOW);
        container.setLayout(null);

        icon = new ImageIcon(getClass().getResource("102.png"));
        this.setIconImage(icon.getImage());

        panel1 = new JPanel();
        panel1.setBounds(5,10,180,340);
        panel1.setBackground(Color.RED);
        container.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(200,10,180,340);
        panel2.setBackground(Color.red );
        container.add(panel2);


        btn1 = new JButton("1");
        panel1.add(btn1);
        btn2 = new JButton("2");
        panel1.add(btn2);


        btn3 = new JButton("3");
        panel2.add(btn3);
        btn4 = new JButton("4");
        panel2.add(btn4);


    }
    public static void main(String[] args) {
        Panel1 frame = new Panel1();
        frame.setVisible(true);
    }
}