import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Container;

class Slider extends JFrame implements ChangeListener{

    private Container container;
    private JLabel redLabel, greenLabel, blueLabel, previewLabel;
    private JSlider redSlider, greenSlider, blueSlider;
    private JTextField rField, gField, bField;
    private JPanel panel; 

    Slider(){
        this.setTitle("Color Slider");
        this.setBounds(400,200,600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        container = this.getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(null);

        redLabel = new JLabel("Red");
        redLabel.setBounds(30,50,50,50);
        redLabel.setBackground(Color.DARK_GRAY);
        container.add(redLabel);

        greenLabel = new JLabel("Green");
        greenLabel.setBounds(30,120,50,50);
        greenLabel.setBackground(Color.DARK_GRAY);
        container.add(greenLabel);

        blueLabel = new JLabel("Blue");
        blueLabel.setBounds(30,200,50,50);
        blueLabel.setBackground(Color.DARK_GRAY);
        container.add(blueLabel);


        redSlider = new JSlider(0,255,0);
        redSlider.setBounds(70, 60, 160,15);
        container.add(redSlider);

        greenSlider = new JSlider(0,255,0);
        greenSlider.setBounds(70, 130, 160,15);
        container.add(greenSlider);

        blueSlider = new JSlider(0, 255,0);
        blueSlider.setBounds(70, 210, 160,15);
        container.add(blueSlider);


        rField = new JTextField();
        rField.setHorizontalAlignment(JTextField.CENTER);
        rField.setBounds(250, 50, 50, 40);
        container.add(rField);

        gField = new JTextField();
        gField.setHorizontalAlignment(JTextField.CENTER);
        gField.setBounds(250, 120, 50, 40);
        container.add(gField);

        bField = new JTextField();
        bField.setHorizontalAlignment(JTextField.CENTER);
        bField.setBounds(250, 195, 50, 40);
        container.add(bField);

        panel = new JPanel();
        panel.setBounds(310, 50, 200,200);
        container.add(panel);

        previewLabel = new JLabel("Preview");
        previewLabel.setBounds(380, 260, 80,40);
        container.add(previewLabel);

        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);

    }
    @Override
    public void stateChanged(ChangeEvent e) {
      int rValue = redSlider.getValue();
      int gValue = greenSlider.getValue();
      int bValue = blueSlider.getValue();

      rField.setText(""+rValue);
      gField.setText(""+gValue);
      bField.setText(""+bValue);

      Color color = new Color(rValue, gValue, bValue);
      panel.setBackground(color);
    }
    public static void main(String[] args) {
        Slider frame = new Slider();
        frame.setVisible(true);
    }
}