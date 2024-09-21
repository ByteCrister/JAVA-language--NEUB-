import javax.swing.JFrame;
import javax.swing.JSlider;

import java.awt.Color;
import java.awt.Container;

class Slider extends JFrame implements ActionListener {

    private Container container;
    private JSlider slider;

    Slider() {
        this.setTitle("JSlider Demo");
        this.setBounds(400, 100, 500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = this.getContentPane();
        container.setBackground(Color.GRAY);
        container.setLayout(null);

        slider = new JSlider(0, 25,10);
        slider.setBounds(10, 50, 460, 200);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        container.add(slider);

    }

    public static void main(String[] args) {
        Slider frame = new Slider();
        frame.setVisible(true);
    }

}