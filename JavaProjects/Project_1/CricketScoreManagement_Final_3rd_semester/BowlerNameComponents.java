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

class BowlerNameComponents {

    AllMethodComponents object;

    public void bowlerNameAfterOver(AllMethodComponents ob) {
        object = ob;

        try {
            object.newBowlerFrame = new JFrame();
            object.newBowlerFrame.setTitle("Select Opening Players");
            object.newBowlerFrame.setBounds(500, 200, 400, 150);
            object.newBowlerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            object.newBowlerFrame.setResizable(false);
            object.newBowlerFrame.setIconImage(object.newBowlerIcon.getImage());

            object.newBowlerContainer = object.newBowlerFrame.getContentPane();
            object.newBowlerContainer.setBackground(new Color(204, 255, 229));
            object.newBowlerContainer.setLayout(null);

            object.newBowlerNameLabel = new JLabel("New bowler");
            object.newBowlerNameLabel.setForeground(new Color(96, 96, 96));
            object.newBowlerNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.newBowlerNameLabel.setBounds(10, 10, 150, 50);
            object.newBowlerNameLabel.setBackground(Color.BLUE);
            object.newBowlerContainer.add(object.newBowlerNameLabel);

            object.newBowlerField = new JTextField();
            object.newBowlerField.setBounds(10, 50, 250, 30);
            object.newBowlerField.setForeground(new Color(96, 96, 96));
            object.newBowlerField.setFont(new Font("Arial", Font.BOLD, 15));
            object.newBowlerField.setBackground(new Color(153, 204, 255));
            object.newBowlerContainer.add(object.newBowlerField);

            object.newBowlerStarButton = new JButton();
            object.newBowlerStarButton.setBounds(290, 50, 60, 30);
            Image img = new ImageIcon(getClass().getResource("012.png")).getImage();
            Image reImage = img.getScaledInstance(object.newBowlerStarButton.getWidth(),
                    object.newBowlerStarButton.getHeight(), Image.SCALE_SMOOTH);
            object.newBowlerStarButton.setIcon(new ImageIcon(reImage));
            object.newBowlerContainer.add(object.newBowlerStarButton);

            object.newBowlerStarButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.newBowlerField.getText().trim().length() != 0) {
                        // BowlersName[++bowlerNameIndex] = newBowlerField.getText().trim();
                        object.bowlersInfo[++object.bowlerNameIndex][0] = object.newBowlerField.getText().trim();

                        object.chosenBowlerIndex = object.bowlerNameIndex;

                        object.bowlersInfo[object.chosenBowlerIndex][1] = "0";
                        object.bowlersInfo[object.chosenBowlerIndex][2] = "0";
                        object.bowlersInfo[object.chosenBowlerIndex][3] = "0";
                        object.bowlersInfo[object.chosenBowlerIndex][4] = "0";
                        object.bowlersInfo[object.chosenBowlerIndex][5] = "0";

                        object.bowlerNameLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][0]);
                        object.numberOfOLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][1]);
                        object.numberOFMLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][2]);
                        object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);
                        object.numberOfWLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][4]);
                        object.numberOfERLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][5]);

                        object.maidenOrNotRun = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                        object.maidenOrNotWicket = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][4]);

                        object.newBowlerFrame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, " Player's name can't be empty", "Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            });

            object.newBowlerFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    ///////////////////////////////////////////////////////////////
}