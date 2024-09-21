import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ListenerKeyListener extends JFrame {
    private Container container;
    private JTextArea area;
    private JScrollPane scroll;
    private JLabel label1, label2, A, E, I, O, U;

    int totalVowels, a, e, i, o, u;

    ListenerKeyListener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 200, 400, 400);
        this.setResizable(false);

        container = this.getContentPane();
        container.setBackground(Color.DARK_GRAY);
        container.setLayout(null);

        area = new JTextArea();
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(new Font("Arial", Font.BOLD, 20));
        area.setBackground(Color.ORANGE);
        scroll = new JScrollPane(area);
        scroll.setBounds(8, 10, 370, 70);
        container.add(scroll);

        label1 = new JLabel("Total number of vowels : ");
        label1.setForeground(Color.YELLOW);
        label1.setFont(new Font("Arial", Font.BOLD, 15));
        label1.setBounds(20, 80, 180, 100);
        container.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.YELLOW);
        label2.setFont(new Font("Arial", Font.BOLD, 15));
        label2.setBounds(205, 80, 180, 100);
        container.add(label2);

        A = new JLabel();
        A.setForeground(Color.YELLOW);
        A.setFont(new Font("Arial", Font.BOLD, 15));
        A.setBounds(170, 140, 50, 50);
        container.add(A);

        E = new JLabel();
        E.setForeground(Color.YELLOW);
        E.setFont(new Font("Arial", Font.BOLD, 15));
        E.setBounds(170, 180, 50, 50);
        container.add(E);

        I = new JLabel();
        I.setForeground(Color.YELLOW);
        I.setFont(new Font("Arial", Font.BOLD, 15));
        I.setBounds(170, 220, 50, 50);
        container.add(I);

        O = new JLabel();
        O.setForeground(Color.YELLOW);
        O.setFont(new Font("Arial", Font.BOLD, 15));
        O.setBounds(170, 260, 50, 50);
        container.add(O);

        U = new JLabel();
        U.setForeground(Color.YELLOW);
        U.setFont(new Font("Arial", Font.BOLD, 15));
        U.setBounds(170, 300, 50, 50);
        container.add(U);

        area.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent aE) {
            }

            @Override
            public void keyPressed(KeyEvent aE) {
                if (aE.getSource() == area) {
                    if (aE.VK_A == aE.getKeyCode()) {
                        totalVowels++;
                        a++;
                    }
                    if (aE.VK_O == aE.getKeyCode()) {
                        totalVowels++;
                        o++;
                    }
                    if (aE.VK_E == aE.getKeyCode()) {
                        totalVowels++;
                        e++;
                    }
                    if (aE.VK_I == aE.getKeyCode()) {
                        totalVowels++;
                        i++;
                    }
                    if (aE.VK_U == aE.getKeyCode()) {
                        totalVowels++;
                        u++;
                    }
                }

                label2.setText("" + totalVowels);
                A.setText(" A : " + a);
                E.setText(" E : " + e);
                I.setText(" I : " + i);
                O.setText(" O : " + o);
                U.setText(" U : " + u);
            }

            @Override
            public void keyReleased(KeyEvent aE) {

            }

        });

    }

    public static void main(String[] args) {
        ListenerKeyListener frame = new ListenerKeyListener();
        frame.setVisible(true);

    }

}