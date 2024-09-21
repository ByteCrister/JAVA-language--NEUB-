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

class OpeningPlayerNameComponents {
    MainScoreComponents ScoreBoardObject = new MainScoreComponents();

    public void playerNamesAfterStart(AllMethodComponents object) {

        try {
            object.playerNameFrame = new JFrame();
            object.playerNameFrame.setTitle("Select Opening Players");
            object.playerNameFrame.setBounds(500, 200, 450, 350);
            object.playerNameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            object.playerNameFrame.setResizable(false);
            object.playerNameFrame.setIconImage(object.playerNameFrameIcon.getImage());

            object.playerNameContainer = object.playerNameFrame.getContentPane();
            object.playerNameContainer.setBackground(new Color(204, 255, 229));
            object.playerNameContainer.setLayout(null);

            object.strikerLabel = new JLabel("Striker");
            object.strikerLabel.setForeground(new Color(96, 96, 96));
            object.strikerLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.strikerLabel.setBounds(10, 10, 150, 50);
            object.strikerLabel.setBackground(Color.BLUE);
            object.playerNameContainer.add(object.strikerLabel);

            object.strikerField = new JTextField();
            object.strikerField.setBounds(10, 50, 250, 30);
            object.strikerField.setForeground(new Color(96, 96, 96));
            object.strikerField.setFont(new Font("Arial", Font.BOLD, 15));
            object.strikerField.setBackground(new Color(153, 204, 255));
            object.playerNameContainer.add(object.strikerField);

            object.nonStrikerLabel = new JLabel("Non-striker");
            object.nonStrikerLabel.setForeground(new Color(96, 96, 96));
            object.nonStrikerLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.nonStrikerLabel.setBounds(10, 90, 150, 50);
            object.nonStrikerLabel.setBackground(Color.BLUE);
            object.playerNameContainer.add(object.nonStrikerLabel);

            object.nonStrikerField = new JTextField();
            object.nonStrikerField.setBounds(10, 130, 250, 30);
            object.nonStrikerField.setForeground(new Color(96, 96, 96));
            object.nonStrikerField.setFont(new Font("Arial", Font.BOLD, 15));
            object.nonStrikerField.setBackground(new Color(153, 204, 255));
            object.playerNameContainer.add(object.nonStrikerField);

            object.firstBowlerLabel = new JLabel("Bowler");
            object.firstBowlerLabel.setForeground(new Color(96, 96, 96));
            object.firstBowlerLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.firstBowlerLabel.setBounds(10, 170, 150, 50);
            object.firstBowlerLabel.setBackground(Color.BLUE);
            object.playerNameContainer.add(object.firstBowlerLabel);

            object.firstBowlerField = new JTextField();
            object.firstBowlerField.setBounds(10, 210, 250, 30);
            object.firstBowlerField.setForeground(new Color(96, 96, 96));
            object.firstBowlerField.setFont(new Font("Arial", Font.BOLD, 15));
            object.firstBowlerField.setBackground(new Color(153, 204, 255));
            object.playerNameContainer.add(object.firstBowlerField);

            object.playerNameBackButton = new JButton();
            object.playerNameBackButton.setBounds(340, 260, 80, 35);
            Image img = new ImageIcon(getClass().getResource("013.png")).getImage();
            Image reImage = img.getScaledInstance(object.playerNameBackButton.getWidth(),
                    object.playerNameBackButton.getHeight(), Image.SCALE_SMOOTH);
            // playerNameBackButton.setIcon(new ImageIcon(reImage));
            // playerNameContainer.add(playerNameBackButton);

            object.playerNameStartButton = new JButton();
            object.playerNameStartButton.setBounds(15, 260, 80, 35);
            img = new ImageIcon(getClass().getResource("012.png")).getImage();
            reImage = img.getScaledInstance(object.playerNameStartButton.getWidth(),
                    object.playerNameStartButton.getHeight(), Image.SCALE_SMOOTH);
            object.playerNameStartButton.setIcon(new ImageIcon(reImage));
            object.playerNameContainer.add(object.playerNameStartButton);

            object.playerNameStartButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.strikerField.getText().trim().length() != 0 &&
                            object.nonStrikerField.getText().trim().length() != 0 &&
                            object.firstBowlerField.getText().trim().length() != 0) {
                        object.ActiveBatsman[0] = object.strikerField.getText().trim();
                        object.ActiveBatsman[1] = object.nonStrikerField.getText().trim();

                        object.bowlersInfo[++object.bowlerNameIndex][0] = object.firstBowlerField.getText().trim();
                        object.chosenBowlerIndex = object.bowlerNameIndex;

                        object.bowlersInfo[object.chosenBowlerIndex][1] = "0";
                        object.bowlersInfo[object.chosenBowlerIndex][2] = "0";
                        object.bowlersInfo[object.chosenBowlerIndex][3] = "0";
                        object.bowlersInfo[object.chosenBowlerIndex][4] = "0";
                        object.bowlersInfo[object.chosenBowlerIndex][5] = "0";

                        object.maidenOrNotRun = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                        object.maidenOrNotWicket = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][4]);

                        object.playerNameFrame.dispose();
                        ScoreBoardObject.ScoreBoard(object);/*<---------- */
                    } else {
                        JOptionPane.showMessageDialog(null, " Player's name can't be empty", "Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            });

            object.playerNameFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}