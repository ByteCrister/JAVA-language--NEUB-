import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LayoutCardLayout extends JFrame {
    private Container container;
    private JButton button[] = new JButton[5];
    private JPanel panel1;
    private CardLayout CLayout;

    LayoutCardLayout() {
        this.setBounds(400, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GridLayout Demo");
        container = this.getContentPane();

        CLayout = new CardLayout(10, 10);
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 500, 500);
        panel1.setLayout(CLayout);
        panel1.setBackground(Color.CYAN);

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("" + (i + 1));

            panel1.add(button[i], "" + (i + 1));// to make unique identification we use strings names

        }

        CLayout.show(panel1, "3");

        for (int i = 0; i < button.length; i++) {

            button[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    CLayout.next(panel1);
                    // CLayout.previous(panel1);
                    // CLayout.show(panel1, "5");
                    // CLayout.first(panel1);
                    // CLayout.last(panel1);
                }
                
            });
        }

        

        container.add(panel1);
    }

    public static void main(String[] args) {
        LayoutCardLayout frame = new LayoutCardLayout();
        frame.setVisible(true);
    }
}