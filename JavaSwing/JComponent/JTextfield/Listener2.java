import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener2 extends JFrame {
    private Container container;
    private JTextField jt1, jt2;

    Listener2() {
        container = this.getContentPane();
        container.setBackground(Color.RED);
        container.setLayout(null);

        jt1 = new JTextField();
        jt1.setBounds(180, 30, 150, 60);
        jt1.setFont(new Font("Arial", Font.BOLD + Font.ROMAN_BASELINE, 15));
        jt1.setHorizontalAlignment(JTextField.CENTER);
        jt1.setForeground(Color.DARK_GRAY);
        jt1.setOpaque(true);
        jt1.setBackground(Color.YELLOW);
        container.add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(180, 120, 150, 60);
        jt2.setFont(new Font("Arial", Font.BOLD + Font.ROMAN_BASELINE, 15));
        jt2.setHorizontalAlignment(JTextField.CENTER);
        jt2.setForeground(Color.DARK_GRAY);
        jt2.setOpaque(true);
        jt2.setBackground(Color.YELLOW);
        container.add(jt2);

        Ac ac = new Ac();
        jt1.addActionListener(ac);
        jt2.addActionListener(ac);

    }

    class Ac implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == jt1) {

                String text = jt1.getText();

                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You did not entered anything", "WARNING",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "You have entered : " + text, "Your Text",
                            JOptionPane.PLAIN_MESSAGE);
                }
            } else {
                String text = jt2.getText();

                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You did not entered anything", "WARNING",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "You have entered : " + text, "Your Text",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }

        }
    }

    public static void main(String[] args) {

        Listener2 frame = new Listener2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 150, 500, 400);
        frame.setTitle("Action Listener Demo");
    }
}
