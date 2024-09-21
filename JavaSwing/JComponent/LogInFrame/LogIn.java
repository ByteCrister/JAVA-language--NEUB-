import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {
    private Container container;
    private ImageIcon icon;
    private JLabel userLabel, passLabel;
    private JTextField userT;
    private JPasswordField passF;

    private JButton submitButton, clearButton;

    LogIn() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 200, 600, 500);
        this.setTitle("Log-in");

        container = this.getContentPane();
        container.setBackground(Color.RED);
        container.setLayout(null);

        icon = new ImageIcon(getClass().getResource("102.png"));
        this.setIconImage(icon.getImage());

        userLabel = new JLabel("User Name : ");
        userLabel.setFont(new Font("Arial", Font.BOLD, 15));
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(50, 20, 130, 50);
        container.add(userLabel);

        passLabel = new JLabel("Enter password : ");
        passLabel.setFont(new Font("Arial", Font.BOLD, 15));
        passLabel.setForeground(Color.WHITE);
        passLabel.setBounds(50, 80, 130, 50);
        container.add(passLabel);

        userT = new JTextField();
        userT.setBounds(190, 25, 130, 30);
        userT.setBackground(Color.YELLOW);
        container.add(userT);

        passF = new JPasswordField();
        passF.setEchoChar('*');
        passF.setBounds(190, 80, 130, 30);
        passF.setBackground(Color.YELLOW);
        passF.setCursor(Cursor.CROSSHAIR_CURSOR);
        container.add(passF);

        submitButton = new JButton("Submit");
        submitButton.setBounds(50, 150, 70, 30);
        submitButton.setBackground(Color.BLUE);
        submitButton.setForeground(Color.LIGHT_GRAY);
        submitButton.setFont(new Font("Arial", Font.BOLD, 10));
        container.add(submitButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(250, 150, 70, 30);
        clearButton.setBackground(Color.BLUE);
        clearButton.setForeground(Color.LIGHT_GRAY);
        clearButton.setFont(new Font("Arial", Font.BOLD, 12));
        container.add(clearButton);

        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (new String(passF.getPassword()) == "123") {

                }
                JOptionPane.showMessageDialog(null,
                        "Hello " + userT.getText() + "  pass : " + new String(passF.getPassword()), "Password",JOptionPane.INFORMATION_MESSAGE);

                // dispose();
                new LogInSecondFrame();

            }

        });

        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                userT.setText("");
                passF.setText("");
            }

        });

    }

    public static void main(String[] args) {

        new LogIn();
    }
}