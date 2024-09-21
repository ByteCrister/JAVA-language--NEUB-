import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadio1 {
    public static void main(String[] args) {

        JTextArea ta;
        Container container;
        JRadioButton male, female, test1, test2;
        ButtonGroup grp = new ButtonGroup();

        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 400, 400);

        container = frame.getContentPane();
        container.setBackground(Color.DARK_GRAY);
        container.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(10, 170, 350, 100);
        ta.setBackground(Color.ORANGE);
        container.add(ta);
        

        male = new JRadioButton("Male");
        male.setBounds(100, 50, 100, 50);
        male.setBackground(Color.DARK_GRAY);
        male.setFont(new Font("Arial", Font.ROMAN_BASELINE, 15));
        male.setForeground(Color.YELLOW);
        container.add(male);
        grp.add(male);
        male.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("You have selected Male\n");
            }

        });

        female = new JRadioButton("Female");
        female.setBackground(Color.DARK_GRAY);
        female.setFont(new Font("Arial", Font.ROMAN_BASELINE, 15));
        female.setForeground(Color.YELLOW);
        female.setBounds(220, 50, 100, 50);
        container.add(female);
        grp.add(female);
        female.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("You have selected Female\n");
            }
            
        });
        
        test1 = new JRadioButton("Test1");
        test1.setSelected(true);
        test1.setBackground(Color.DARK_GRAY);
        test1.setFont(new Font("Arial", Font.ROMAN_BASELINE, 15));
        test1.setForeground(Color.YELLOW);
        test1.setBounds(110, 110, 100, 50);
        container.add(test1);
        grp.add(test1);

        test2 = new JRadioButton("Test2");
        test2.setEnabled(false);
        test2.setBackground(Color.DARK_GRAY);
        test2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 15));
        test2.setForeground(Color.YELLOW);
        test2.setBounds(220, 110, 100, 50);
        container.add(test2);
        grp.add(test2);
        
        frame.setVisible(true);
    }

}
