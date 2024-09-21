import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser extends JFrame{

    private Container container;
    private JButton button;

    ColorChooser(){
        this.setTitle("ColorChooser Demo");
        this.setBounds(300,200,600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = this.getContentPane();
        container.setBackground(Color.LIGHT_GRAY);
        container.setLayout(null);

        button = new JButton("Chose a Color");
        button.setBounds(230,150,120,50);
        container.add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Color color = JColorChooser.showDialog(null, "Select any color", Color.RED);
               container.setBackground(color);
            }
            
        });
    }


    public static void main(String[] args) {
        ColorChooser frame = new ColorChooser();
        frame.setVisible(true);
    }
}