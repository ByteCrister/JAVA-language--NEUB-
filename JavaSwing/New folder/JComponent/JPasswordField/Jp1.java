import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jp1 extends JFrame {

    private Container container;
    private JPasswordField jp;
     Jp1() {
        container = this.getContentPane();
        container.setBackground(Color.RED);
        container.setLayout(null);

        jp = new JPasswordField();
        jp.setOpaque(true);
        jp.setBackground(Color.YELLOW);
        jp.setBounds(50, 20, 100, 50);
        jp.setEchoChar('*');
        jp.setFont(new Font("Arial",Font.ITALIC, 20));

        jp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                char[] text = jp.getPassword();
                if (text.length > 0) {
                    JOptionPane.showMessageDialog(null, "Password : " + new String(text), "Password",
                            JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "You didn't entered password!!", "WARNING",
                            JOptionPane.ERROR_MESSAGE);

                }

            }
        });

        container.add(jp);
    }

    public static void main(String[] args) {

        Jp1 frame = new Jp1();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 150, 500, 300);
        frame.setTitle("JPasswordField Demo");
    }
}