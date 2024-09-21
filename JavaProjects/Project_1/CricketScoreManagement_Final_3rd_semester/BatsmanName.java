import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class BatsmanName {

    AllMethodComponents object;

    public void batsmanNameAfterOut(AllMethodComponents ob) {
        object = ob;

        try {
            object.newBatsmanFrame = new JFrame();
            object.newBatsmanFrame.setTitle("New Batsman");
            object.newBatsmanFrame.setBounds(500, 200, 400, 150);
            object.newBatsmanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            object.newBatsmanFrame.setResizable(false);
            object.newBatsmanFrame.setIconImage(object.newBatsmanIcon.getImage());

            object.newBatsmanContainer = object.newBatsmanFrame.getContentPane();
            object.newBatsmanContainer.setBackground(new Color(204, 255, 229));
            object.newBatsmanContainer.setLayout(null);

            object.newBatsmanLabel = new JLabel("New Batsman");
            object.newBatsmanLabel.setForeground(new Color(96, 96, 96));
            object.newBatsmanLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.newBatsmanLabel.setBounds(10, 10, 150, 50);
            object.newBatsmanLabel.setBackground(Color.BLUE);
            object.newBatsmanContainer.add(object.newBatsmanLabel);

            object.newBatsmanField = new JTextField();
            object.newBatsmanField.setBounds(10, 50, 250, 30);
            object.newBatsmanField.setForeground(new Color(96, 96, 96));
            object.newBatsmanField.setFont(new Font("Arial", Font.BOLD, 15));
            object.newBatsmanField.setBackground(new Color(153, 204, 255));
            object.newBatsmanContainer.add(object.newBatsmanField);

            object.newBatsmanButton = new JButton();
            object.newBatsmanButton.setBounds(290, 50, 60, 30);
            Image img = new ImageIcon(getClass().getResource("012.png")).getImage();
            Image reImage = img.getScaledInstance(object.newBatsmanButton.getWidth(),
                    object.newBatsmanButton.getHeight(),
                    Image.SCALE_SMOOTH);
            object.newBatsmanButton.setIcon(new ImageIcon(reImage));
            object.newBatsmanContainer.add(object.newBatsmanButton);

            object.newBatsmanButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.newBatsmanField.getText().trim().length() != 0) {
                        // BatsmanName[++batsmanNameIndex] = newBatsmanField.getText().trim();
                        if (object.batsmanActiveIndicate == 0) {
                            object.ActiveBatsman[0] = object.newBatsmanField.getText().trim();
                            object.strikerBatLabel.setText(object.ActiveBatsman[0] + "*");
                            object.nonStrikerBatLabel.setText(object.ActiveBatsman[1] + "");

                        } else {
                            object.ActiveBatsman[1] = object.newBatsmanField.getText().trim();
                            object.nonStrikerBatLabel.setText(object.ActiveBatsman[1] + "*");
                            object.strikerBatLabel.setText(object.ActiveBatsman[0] + "");
                        }
                        object.newBatsmanFrame.dispose();
                        // ScoreBoard();
                    } else {
                        JOptionPane.showMessageDialog(null, " Player's name can't be empty",
                                "Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            });

            object.newBatsmanFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}