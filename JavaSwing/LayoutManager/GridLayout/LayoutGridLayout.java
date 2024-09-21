import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

class LayoutGridLayout extends JFrame {
    private Container container;
    private JButton button[] = new JButton[9];
    private JPanel panel1;
    private GridLayout GLayout;

    LayoutGridLayout() {
        this.setBounds(400, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GridLayout Demo");
        container = this.getContentPane();

        GLayout = new GridLayout(3,3, 10, 10);

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 500, 500);
        panel1.setLayout(GLayout);
        panel1.setBackground(Color.CYAN);

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("" + (i + 1));
            panel1.add(button[i]);
        }

        container.add(panel1);
    }

    public static void main(String[] args) {
        LayoutGridLayout frame = new LayoutGridLayout();
        frame.setVisible(true);
    }
}