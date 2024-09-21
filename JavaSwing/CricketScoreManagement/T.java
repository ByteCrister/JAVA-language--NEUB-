
import javax.swing.*;
import java.awt.*;

public class T {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bounds Example");
        JPanel mainPanel = new JPanel();

        // Create and configure a panel
        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 300, 200);  // Set bounds for the panel
        panel.setBackground(Color.BLUE);

        // Create and configure a label within the panel
        JLabel label = new JLabel("Hello, World!");
        label.setBounds(10, 10, 200, 30);  // Set bounds for the label within the panel

        // Add the label to the panel
        panel.add(label);

        // Add the panel to the main panel
        mainPanel.setLayout(null);  // Set layout manager to null for absolute positioning
        mainPanel.add(panel);

        // Configure the frame
        frame.getContentPane().add(mainPanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
