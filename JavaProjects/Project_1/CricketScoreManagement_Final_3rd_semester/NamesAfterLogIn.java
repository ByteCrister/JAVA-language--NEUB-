import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

class NamesAfterLogIn {
    OpeningPlayerNameComponents Oob = new OpeningPlayerNameComponents();

    AllMethodComponents object;
    public void toGameInformation(AllMethodComponents ob) {
        this.object = ob;

        try {
            object.startFrame = new JFrame();
            object.startFrame.setTitle(" Team");
            object.startFrame.setBounds(450, 100, 350, 500);
            object.startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            object.startFrame.setResizable(false);
            object.startFrame.setIconImage(object.startFrameIcon.getImage());

            object.startContainer = object.startFrame.getContentPane();
            object.startContainer.setBackground(new Color(204, 255, 229));
            object.startContainer.setLayout(null);

            object.hostLabel = new JLabel("Host Team");
            object.hostLabel.setForeground(new Color(96, 96, 96));
            object.hostLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.hostLabel.setBounds(10, 10, 150, 50);
            object.hostLabel.setBackground(Color.BLUE);
            object.startContainer.add(object.hostLabel);

            object.hostField = new JTextField();
            object.hostField.setBounds(10, 50, 250, 30);
            object.hostField.setForeground(new Color(96, 96, 96));
            object.hostField.setFont(new Font("Arial", Font.BOLD, 15));
            object.hostField.setBackground(new Color(153, 204, 255));
            object.startContainer.add(object.hostField);

            object.visitorLabel = new JLabel("Visitor Team");
            object.visitorLabel.setForeground(new Color(96, 96, 96));
            object.visitorLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.visitorLabel.setBounds(10, 90, 150, 50);
            object.visitorLabel.setBackground(Color.BLUE);
            object.startContainer.add(object.visitorLabel);

            object.visitorField = new JTextField();
            object.visitorField.setBounds(10, 130, 250, 30);
            object.visitorField.setForeground(new Color(96, 96, 96));
            object.visitorField.setFont(new Font("Arial", Font.BOLD, 15));
            object.visitorField.setBackground(new Color(153, 204, 255));
            object.startContainer.add(object.visitorField);

            object.batOrBallLabel = new JLabel("Host team Opted to ?");
            object.batOrBallLabel.setForeground(new Color(96, 96, 96));
            object.batOrBallLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.batOrBallLabel.setBounds(10, 180, 150, 50);
            object.startContainer.add(object.batOrBallLabel);

            object.batOption = new JCheckBox("Bat");
            object.batOption.setForeground(new Color(96, 96, 96));
            object.batOption.setFont(new Font("Arial", Font.BOLD, 15));
            object.batOption.setBounds(10, 220, 50, 50);
            object.batOption.setBackground(new Color(204, 255, 229));
            object.batOption.setSelected(true);
            object.startContainer.add(object.batOption);
            object.groupBarOrBall.add(object.batOption);

            object.ballOption = new JCheckBox("Ball");
            object.ballOption.setForeground(new Color(96, 96, 96));
            object.ballOption.setFont(new Font("Arial", Font.BOLD, 15));
            object.ballOption.setBounds(70, 220, 80, 50);
            object.ballOption.setBackground(new Color(204, 255, 229));
            object.startContainer.add(object.ballOption);
            object.groupBarOrBall.add(object.ballOption);

            object.overLabel = new JLabel("Overs ?");
            object.overLabel.setForeground(new Color(96, 96, 96));
            object.overLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.overLabel.setBounds(10, 300, 150, 50);
            object.overLabel.setBackground(new Color(204, 255, 229));
            object.startContainer.add(object.overLabel);

            object.oversSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
            object.oversSpinner.setBounds(20, 350, 40, 35);
            object.oversSpinner.setFont(new Font("Arial", Font.BOLD, 20));
            object.oversSpinner.setBackground(new Color(204, 255, 229));
            object.startContainer.add(object.oversSpinner);

            object.starButton = new JButton();
            object.starButton.setBounds(220, 380, 90, 40);
            Image img = object.startIconButton.getImage();
            Image reImage = img.getScaledInstance(object.starButton.getWidth(),
                    object.starButton.getHeight(), Image.SCALE_SMOOTH);
            object.starButton.setIcon(new ImageIcon(reImage));
            object.startContainer.add(object.starButton);

            Handler handle = new Handler();
            object.starButton.addActionListener(handle);

            object.startFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String spinerValue = object.oversSpinner.getValue().toString();
            try {
                if (object.hostField.getText().trim().length() != 0 &&
                        object.visitorField.getText().trim().length() != 0 && (object.ballOption.isSelected() ||
                                object.batOption.isSelected())
                        && Integer.parseInt(spinerValue) != 0) {
                    object.teamNames[0] = object.hostField.getText();
                    object.teamNames[1] = object.visitorField.getText();
                    object.inputOverFromTheSpiner = Integer.parseInt(spinerValue);

                    if (object.batOption.isSelected()) {
                        object.firstBattingTeam = object.teamNames[0];
                        object.secondBattingTeam = object.teamNames[1];
                    } else {
                        object.firstBattingTeam = object.teamNames[1];
                        object.secondBattingTeam = object.teamNames[0];
                    }
                    object.startFrame.dispose();
                    Oob.playerNamesAfterStart(object);/*<-------- */
                } else {
                    JOptionPane.showMessageDialog(null, "Give all information or Select at least one Over",
                            "Give all information", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ec) {
                System.out.println(ec);
                ec.printStackTrace();
            }

        }

    }
}