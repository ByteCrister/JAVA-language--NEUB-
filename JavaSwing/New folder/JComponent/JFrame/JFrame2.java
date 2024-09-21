import javax.swing.JFrame;

public class JFrame2 extends JFrame{
    JFrame2(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 300, 400);
        setTitle("Frame Demo");
        setResizable(false);
    }
    public static void main(String[] args) {
        JFrame2 frame = new JFrame2();
    }
}
