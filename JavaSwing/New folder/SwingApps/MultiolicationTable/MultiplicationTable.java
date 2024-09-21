import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable extends JFrame{

    private Container container;
    private ImageIcon icon, icon2;
    private JLabel label1, label2;
    private JTextField tf;
    private JTextArea ta;
    private JButton btn;


    MultiplicationTable(){
       
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,80,500,600);
        this.setTitle("Multiplication Table");
        this.setResizable(false);
        this.setBackground(Color.YELLOW);


        container = this.getContentPane();
        container.setBackground(Color.RED);
        container.setLayout(null);


        icon = new ImageIcon(getClass().getResource("102.png"));
        this.setIconImage(icon.getImage());



        label1 = new JLabel("Multiplication Table");
        label1.setBounds(10,10,465,100);
        label1.setFont(new Font("Arial",Font.BOLD,49));
        label1.setForeground(Color.RED);
        label1.setOpaque(true);
        label1.setBackground(Color.YELLOW);
        container.add(label1);

        label2 = new JLabel("Enter Integer Number : ");
        label2.setBounds(50,130,230,50);
        label2.setFont(new Font("Arial",Font.BOLD,20));
        label2.setForeground(Color.yellow);
        // label2.setOpaque(true);
        // label2.setBackground(Color.YELLOW);
        container.add(label2);



        tf = new JTextField();
        tf.setBounds(290, 140, 50, 30);
        tf.setFont(new Font("Arial",Font.BOLD,20));
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.YELLOW);
        tf.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                ta.setText("");
                if(tf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"You have not entered anything!!","WARNING",JOptionPane.ERROR_MESSAGE);
                }

                int value = Integer.parseInt(tf.getText());

                ta.append(" [ Table Of "+value+" ]\n");

               for(int i=1; i<=10; i++){

                ta.append("\t"+value+" X "+i+" = "+(i*value)+"\n");
               }
            }
            
        });
        container.add(tf);



        icon2 = new ImageIcon(getClass().getResource("103.png"));
        btn = new JButton(icon2);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setBounds(350, 135, icon2.getIconWidth(), icon2.getIconHeight());
        btn.setFont(new Font("Arial",Font.BOLD,20));
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               tf.setText("");
               ta.setText("");

            }
            
        });
        container.add(btn);


        ta = new JTextArea();
        ta.setBounds(10,200,465,350);
        ta.setForeground(Color.RED); 
        ta.setBackground(Color.YELLOW);
        ta.setFont(new Font("Arial",Font.BOLD,25));
        container.add(ta);


        

    }

    public static void main(String[] args) {
        
        new MultiplicationTable();
    }
}