import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class Curve2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rounded Border JTextArea Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JTextArea with a rounded border
            JTextArea textArea = new JTextArea(10, 20);
            textArea.setBorder(new RoundedBorder(10)); // Adjust the radius as needed

            // Place the JTextArea in a JScrollPane for scrolling
            JScrollPane scrollPane = new JScrollPane(textArea);

            frame.add(scrollPane);
            frame.setVisible(true);
        });
    }

    // Custom Border class for creating rounded borders
    static class RoundedBorder extends AbstractBorder {
        private int radius;

        public RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();

            // Set anti-aliasing for smoother edges
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Draw rounded border
            g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);

            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius, radius, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.top = insets.right = insets.bottom = radius;
            return insets;
        }
    }
}
