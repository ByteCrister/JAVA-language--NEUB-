import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBox1 extends JFrame{

    private Container container;
   private JCheckBox cb1, cb2, cb3, cb4;
   private ButtonGroup grp;
    
    JCheckBox1(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,200,500,400);
        this.setResizable(false);
        
        container = this.getContentPane();
        container.setBackground(Color.red);
        container.setLayout(null);

        grp = new ButtonGroup();

        cb1 = new JCheckBox("Male");
        cb1.setFont(new Font("Arial",Font.BOLD,20));
        cb1.setBounds(20,50,100,100);
        cb1.setForeground(Color.YELLOW);
        cb1.setBackground(Color.red);
        container.add(cb1);
        grp.add(cb1);


        cb2 = new JCheckBox("Female");
        cb2.setFont(new Font("Arial",Font.BOLD,20));
        cb2.setBounds(130,50,100,100);
        cb2.setForeground(Color.YELLOW);
        cb2.setBackground(Color.red);
        container.add(cb2);
        grp.add(cb2);


        cb3 = new JCheckBox("Test1");
        cb3.setFont(new Font("Arial",Font.BOLD,20));
        cb3.setBounds(20,160,100,100);
        cb3.setForeground(Color.YELLOW);
        cb3.setBackground(Color.red);
        cb3.setSelected(true);
        container.add(cb3);


        cb4 = new JCheckBox("Test2");
        cb4.setFont(new Font("Arial",Font.BOLD,20));
        cb4.setBounds(130,160,100,100);
        cb4.setForeground(Color.YELLOW);
        cb4.setBackground(Color.red);
        cb4.setEnabled(false);
        container.add(cb4);

        Handler h = new Handler();
        cb1.addActionListener(h);
        cb2.addActionListener(h);

        cb3.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource()==cb3){
                    JOptionPane.showMessageDialog(null, "You have entered selected checkbox", "Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        });

        this.setVisible(true);
    }

    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(cb1.isSelected()){
                JOptionPane.showMessageDialog(null, "You have entered Male", "Message",JOptionPane.INFORMATION_MESSAGE);
            }else{
                
            JOptionPane.showMessageDialog(null, "You have entered Female", "Message",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public static void main(String[] args) {
        new JCheckBox1();
    }
}
