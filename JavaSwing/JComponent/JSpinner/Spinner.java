import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

class Spinner extends JFrame{
    private Container container;
    private JSpinner spinner;
    private JLabel label;

    Spinner(){
        this.setBounds(300,200,600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JSpinner Demo");

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.darkGray);

        spinner = new JSpinner(new SpinnerNumberModel(5,0,10,1));
        spinner.setFont(new Font("Arial",Font.BOLD, 30));
        spinner.setBounds(50,50,100,70);
        container.add(spinner);

        label = new JLabel("Hi");
        label.setFont(new Font("Arial",Font.BOLD, 30));
        label.setBounds(180,100,400,200);
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        container.add(label);


        spinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                String str = spinner.getValue().toString();
                label.setText("\tCurrent Value : "+str);
            }
            
        });

    }

   

    public static void main(String[] args) {
        Spinner frame = new Spinner();
        frame.setVisible(true);
    }
}