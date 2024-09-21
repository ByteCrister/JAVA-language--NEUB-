import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class JT1 extends JFrame{

    private Container container;
    private JTextArea jt;

    private JScrollPane scroll;

    JT1(){
        CreateFrame();
        CreateContainer();
        CreateTextArea();
    }


    private void CreateFrame(){
        this.setVisible(true);
        this.setBounds(300,300,400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Area Demo");

    }


    private void CreateContainer(){
        container = this.getContentPane();
        container.setBackground(Color.BLUE);
        container.setLayout(null);
        
    }


    private void CreateTextArea(){
        jt = new JTextArea();
        jt.setFont(new Font("Arial",Font.ITALIC,15));
        jt.setForeground(Color.ORANGE);
        jt.setBackground(Color.DARK_GRAY);

        //***************************/
        jt.setLineWrap(true);
        jt.setWrapStyleWord(true);

        
        //************************/
        scroll = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);// Defining scroll for the Text Area
        scroll.setBounds(30,30,300,200);


        container.add(scroll); //Scroll will be added to container instead of TextField
    }
    public static void main(String[] args) {
        
        new JT1();
    }
}