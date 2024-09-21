import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LogInSecondFrame extends JFrame{
    
    private Container container;
    private JLabel label;

    LogInSecondFrame(){
        createFrame();
        callContainer();
        callLabel();
    }

    private void createFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Message");
        this.setBounds(200,300,400,300);

    }
    
    private void callContainer(){
        container =this.getContentPane();
        container.setBackground(Color.CYAN);
        container.setLayout(null);
        
    }

    private void callLabel(){
        label = new JLabel("Second Demo Frame..");
        label.setBounds(30,30,150,50);
        container.add(label);
    }

    public static void main(String[] args) {
        new LogInSecondFrame();
    }
}
