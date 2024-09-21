import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

class Layout1 extends JFrame {
    private Container container;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn10, btn8, btn9, buttons[] = new JButton[20];
    private JPanel panel1;
    private FlowLayout fLayout = new FlowLayout(FlowLayout.RIGHT, 10, 10);

    Layout1() {
        this.setBounds(400, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("BorderLayout Demo");

        container = this.getContentPane();

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 500, 500);
        panel1.setBackground(Color.CYAN);
        container.add(panel1);

        panel1.setLayout(fLayout);

        // btn1 = new JButton("1");
        // panel1.add(btn1);
        // btn2 = new JButton("2");
        // panel1.add(btn2);
        // btn3 = new JButton("3");
        // panel1.add(btn3);
        // btn4 = new JButton("4");
        // panel1.add(btn4);
        // btn5 = new JButton("5");
        // panel1.add(btn5);
        // btn6 = new JButton("6");
        // panel1.add(btn6);
        // btn7 = new JButton("7");
        // panel1.add(btn7);
        // btn8 = new JButton("8");
        // panel1.add(btn8);
        // btn9 = new JButton("9");
        // panel1.add(btn9);
        // btn10 = new JButton("10");
        // panel1.add(btn10);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + (i + 1));
            panel1.add(buttons[i]);
        }

    }

    public static void main(String[] args) {
        Layout1 frame = new Layout1();
        frame.setVisible(true);
    }
}