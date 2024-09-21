import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectCardLayout extends JFrame {
    private Container container;
    private JButton previousButton, nextButton;
    private CardLayout cardLayout;
    private JPanel panel;
    private ImageIcon icon;

    ProjectCardLayout() {
        this.setTitle("Project CardLayout Demo");
        this.setBounds(400, 50, 400, 520);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = this.getContentPane();
        container.setBackground(Color.LIGHT_GRAY);
        container.setLayout(null);

        cardLayout = new CardLayout();
        panel = new JPanel(cardLayout);
        panel.setBounds(40, 10, 300, 400);
        // panel.setLayout(cardLayout);

        for (int i = 1; i <= 4; i++) {

            // ************ For Resizing the image ****************/
            icon = new ImageIcon(getClass().getResource("img-" + (i) + ".jpg"));
            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);

            panel.add(new JLabel(icon));
        }

        previousButton = new JButton("Previous");
        previousButton.setBounds(10, 420, 100, 50);
        container.add(previousButton);

        nextButton = new JButton("Next");
        nextButton.setBounds(270, 420, 100, 50);
        container.add(nextButton);

        container.add(panel);

        Handler hd = new Handler();
        previousButton.addActionListener(hd);
        nextButton.addActionListener(hd);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == previousButton) {
                cardLayout.previous(panel);
            } else {
                cardLayout.next(panel);
            }
        }

    }

    public static void main(String[] args) {
        ProjectCardLayout frame = new ProjectCardLayout();
        frame.setVisible(true);
    }
}