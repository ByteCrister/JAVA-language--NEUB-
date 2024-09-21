import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ToggleButton extends JFrame implements ActionListener {
    private Container container;
    private JLabel label;
    private JToggleButton toggleButton;
    private ImageIcon offIcon, icon, onIcon;

    ToggleButton() {
        this.setTitle("Toggle Button Demo");
        this.setBounds(400, 100, 400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = this.getContentPane();
        container.setBackground(Color.GRAY);
        container.setLayout(null);

        toggleButton = new JToggleButton();
        toggleButton.setBounds(5, 100, 370, 200);
        // toggleButton.setFont(new Font("Arial", Font.BOLD, 35));
        
        label = new JLabel("\tHello there");
        label.setFont(new Font("Arial", Font.BOLD, 35));
        label.setBounds(100, 320, 200, 100);
        label.setOpaque(true);
        label.setBackground(Color.YELLOW);
        label.setVisible(false);
        container.add(label);

        icon = new ImageIcon(getClass().getResource("off.jpg"));
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(toggleButton.getWidth(), toggleButton.getHeight(), Image.SCALE_SMOOTH);
        offIcon = new ImageIcon(newImage);
        
        toggleButton.setIcon(offIcon);
        
        icon = new ImageIcon(getClass().getResource("on.jpg"));
        img = icon.getImage();
        newImage = img.getScaledInstance(toggleButton.getWidth(), toggleButton.getHeight(), Image.SCALE_SMOOTH);
        onIcon = new ImageIcon(newImage);
        
        container.add(toggleButton);
        toggleButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (toggleButton.isSelected()) {
            toggleButton.setIcon(onIcon);
            label.setVisible(true);
            
        } else {
            toggleButton.setIcon(offIcon); 
            label.setVisible(false);
        }
    }

    public static void main(String[] args) {
        ToggleButton frame = new ToggleButton();
        frame.setVisible(true);
    }

}