import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;

public class ActionListenerInterface extends JFrame implements ActionListener{

    private Container container;
    private JButton red, green, grey;

    ActionListenerInterface(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,400);


        container = this.getContentPane();
        container.setLayout(null);

        red = new JButton("RED");
        red.setBounds(20,20,80,80);
        container.add(red);

        green = new JButton("GREEN");
        green.setBounds(20,110,80,80);
        container.add(green);

        grey = new JButton("GREY");
        grey.setBounds(20,200,80,80);
        container.add(grey);
        

        red.addActionListener(this);
        green.addActionListener(this);
        grey.addActionListener(this);

    }
    public static void main(String[] args) {
        new ActionListenerInterface();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == red){
            container.setBackground(Color.red);
        }else if (e.getSource() == green) {
            container.setBackground(Color.green);
        }else{
            container.setBackground(Color.GRAY);
        }
    }
}