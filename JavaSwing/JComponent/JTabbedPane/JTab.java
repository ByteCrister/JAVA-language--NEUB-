import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.Container;

class JTab extends JFrame {
    private Container container;
    private JTabbedPane tabPane;
    private JPanel panel1, panel2, panel3;

    JTab() {
        this.setTitle("JTabbedPane Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 200, 600, 400);

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.LIGHT_GRAY);
        
        this.setIconImage(new ImageIcon(getClass().getResource("102.png")).getImage());
        
        tabPane = new JTabbedPane(JTabbedPane.TOP);
        // tabPane.setTabPlacement(JTabbedPane.RIGHT);
        tabPane.setBounds(0,0,600,400);
        
        
        panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel1.add(new JLabel("This is Red Tab"));

        panel2 = new JPanel();
        panel2.setBackground(Color.green);
        panel2.add(new JLabel("This is Green Tab"));

        panel3 = new JPanel();
        panel3.setBackground(Color.yellow);
        panel3.add(new JLabel("This is Yellow Tab"));
        
        tabPane.addTab("Red",panel1);
        tabPane.addTab("Green",panel2);
        tabPane.addTab("Yellow", panel3);
        
        container.add(tabPane); 
    }

    public static void main(String[] args) {
        JTab frame = new JTab();
        frame.setVisible(true);
    }
}