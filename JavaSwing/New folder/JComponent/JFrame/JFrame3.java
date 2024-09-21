import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrame3 extends JFrame {
    private ImageIcon img;

    JFrame3() {
        img = new ImageIcon(getClass().getResource("102.png"));
        this.setIconImage(img.getImage());

    }

    public static void main(String[] args) {
        JFrame3 frame = new JFrame3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 400, 400);
        frame.setTitle("Frame Demo");
    }
}
