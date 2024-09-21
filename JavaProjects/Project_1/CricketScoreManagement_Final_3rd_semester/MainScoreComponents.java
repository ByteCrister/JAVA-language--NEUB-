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
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MainScoreComponents {

    AllMethodComponents object;

    public void ScoreBoard(AllMethodComponents ob) {

        object = ob;

        ExtraRunComponents eOb = new ExtraRunComponents();
        partnerShipComponents pOb = new partnerShipComponents();
        BatsmanName bOb = new BatsmanName();
        OpeningPlayerNameComponents oOb = new OpeningPlayerNameComponents();

        try {
            object.extraRunTextArea = new JTextArea("\nExtra run : ");
            object.extraRunTextArea.setBackground(new Color(153, 255, 204));
            object.extraRunTextArea.setFont(new Font("Arial", Font.BOLD, 20));
            object.extraRunTextArea.setForeground(new Color(128, 128, 128));
            object.extraRunTextArea.setLineWrap(true);
            object.extraRunTextArea.setWrapStyleWord(true);
            object.extraRunTextArea.setEditable(false);

            object.scoreBoardFrame = new JFrame();
            object.scoreBoardFrame.setBounds(380, 60, 600, 650);
            object.scoreBoardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            object.scoreBoardFrame.setResizable(false);
            object.scoreBoardFrame.setIconImage(object.scoreBoardFrameIcon.getImage());

            object.scoreBOardContainer = object.scoreBoardFrame.getContentPane();
            object.scoreBOardContainer.setBackground(new Color(153, 204, 255));
            object.scoreBOardContainer.setLayout(null);

            object.panel1 = new JPanel();
            object.panel1.setBounds(10, 10, 560, 100);
            object.panel1.setBackground(new Color(204, 255, 229));
            object.panel1.setLayout(null);

            object.teamNameLabel = new JLabel(object.firstBattingTeam + "," + " 1st inning");
            if (object.inningsIndicate == 2) {
                object.teamNameLabel.setText(object.secondBattingTeam + "," + " 2nd inning");
            }
            object.teamNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.teamNameLabel.setBounds(10, 10, 200, 30);
            object.teamNamePanel = new JPanel();
            object.teamNamePanel.setBounds(10, 10, 200, 30);
            object.teamNamePanel.setBackground(null);
            object.teamNamePanel.add(object.teamNameLabel);
            object.panel1.add(object.teamNamePanel);

            object.scoreLabel = new JLabel(object.totalRuns + " - " + object.numberOfWickets);
            object.scoreLabel.setFont(new Font("Arial", Font.BOLD, 30));
            object.scorePanel = new JPanel();
            object.scorePanel.setBounds(10, 40, 100, 40);
            object.scorePanel.setBackground(null);
            object.scorePanel.add(object.scoreLabel);
            object.panel1.add(object.scorePanel);

            object.ballsLabel = new JLabel("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");
            object.ballsLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.ballsLabel.setForeground(new Color(118, 118, 118));
            object.ballsPanel = new JPanel();
            object.ballsPanel.setBounds(100, 60, 60, 30);
            object.ballsPanel.setBackground(null);
            object.ballsPanel.add(object.ballsLabel);
            object.panel1.add(object.ballsPanel);

            object.crrLabel = new JLabel("CRR");
            object.crrLabel.setFont(new Font("Arial", Font.BOLD, 18));
            object.crrLabel.setForeground(new Color(78, 78, 78));
            object.crrPanel = new JPanel();
            object.crrPanel.setBounds(250, 10, 40, 40);
            object.crrPanel.setBackground(null);
            object.crrPanel.add(object.crrLabel);
            object.panel1.add(object.crrPanel);

            object.crrNumberLabel = new JLabel(object.CRR + "");
            object.crrNumberLabel.setFont(new Font("Arial", Font.BOLD, 18));
            object.crrNumberLabel.setForeground(new Color(78, 78, 78));
            object.crrNumberPanel = new JPanel();
            object.crrNumberPanel.setBounds(250, 50, 35, 35);
            object.crrNumberPanel.setBackground(null);
            object.crrNumberPanel.add(object.crrNumberLabel);
            object.panel1.add(object.crrNumberPanel);

            object.targetLabel = new JLabel("Target");
            object.targetLabel.setFont(new Font("Arial", Font.BOLD, 18));
            object.targetLabel.setForeground(new Color(78, 78, 78));
            object.targetPanel = new JPanel();
            object.targetPanel.setBounds(320, 10, 60, 40);
            object.targetPanel.setBackground(null);
            object.targetPanel.add(object.targetLabel);
            if (object.inningsIndicate == 2) {

                object.targetNumberLabel.setText((object.target) + "");
                object.targetNumberPanel.setVisible(true);
            } else {
                object.targetPanel.setVisible(false);
            }
            object.panel1.add(object.targetPanel);

            object.targetNumberLabel = new JLabel((object.target) + "");
            object.targetNumberLabel.setFont(new Font("Arial", Font.BOLD, 18));
            object.targetNumberLabel.setForeground(new Color(78, 78, 78));
            object.targetNumberPanel = new JPanel();
            object.targetNumberPanel.setBounds(325, 50, 35, 35);
            object.targetNumberPanel.setBackground(null);
            object.targetNumberPanel.add(object.targetNumberLabel);
            if (object.inningsIndicate == 2) {
                object.targetNumberPanel.setVisible(true);
            } else {
                object.targetNumberPanel.setVisible(false);
            }
            object.panel1.add(object.targetNumberPanel);

            object.rrLabel = new JLabel("RR");
            object.rrLabel.setFont(new Font("Arial", Font.BOLD, 18));
            object.rrLabel.setForeground(new Color(78, 78, 78));
            object.rrPanel = new JPanel();
            object.rrPanel.setBounds(400, 10, 60, 40);
            object.rrPanel.setBackground(null);

            if (object.inningsIndicate == 2) {

                object.rrPanel.setVisible(true);
            } else {
                object.rrPanel.setVisible(false);
            }
            object.rrPanel.add(object.rrLabel);
            object.panel1.add(object.rrPanel);

            object.rrNumberLabel = new JLabel(object.RR + "");
            object.rrNumberLabel.setFont(new Font("Arial", Font.BOLD, 18));
            object.rrNumberLabel.setForeground(new Color(78, 78, 78));
            object.rrNumberPanel = new JPanel();
            object.rrNumberPanel.setBounds(415, 50, 35, 35);
            object.rrNumberPanel.setBackground(null);

            if (object.inningsIndicate == 2) {

                object.rrNumberPanel.setVisible(true);
            } else {
                object.rrNumberPanel.setVisible(false);
            }
            object.rrNumberPanel.add(object.rrNumberLabel);
            object.panel1.add(object.rrNumberPanel);

            object.panel2 = new JPanel();
            object.panel2.setBounds(10, 120, 560, 30);
            object.panel2.setBackground(new Color(204, 255, 229));
            object.panel2.setLayout(null);

            object.batsmanLabel = new JLabel("Batsman");
            object.batsmanLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.batsmanLabel.setForeground(new Color(158, 158, 158));
            object.batsmanPanel = new JPanel();
            object.batsmanPanel.setBounds(10, 0, 60, 40);
            object.batsmanPanel.setBackground(null);
            object.batsmanPanel.add(object.batsmanLabel);
            object.panel2.add(object.batsmanPanel);

            object.labelR = new JLabel("R");
            object.labelR.setFont(new Font("Arial", Font.BOLD, 15));
            object.labelR.setForeground(new Color(158, 158, 158));
            object.panelR = new JPanel();
            object.panelR.setBounds(200, 0, 40, 40);
            object.panelR.setBackground(null);
            object.panelR.add(object.labelR);
            object.panel2.add(object.panelR);

            object.labelB = new JLabel("B");
            object.labelB.setFont(new Font("Arial", Font.BOLD, 15));
            object.labelB.setForeground(new Color(158, 158, 158));
            object.panelB = new JPanel();
            object.panelB.setBounds(280, 0, 40, 40);
            object.panelB.setBackground(null);
            object.panelB.add(object.labelB);
            object.panel2.add(object.panelB);

            object.label4s = new JLabel("4s");
            object.label4s.setFont(new Font("Arial", Font.BOLD, 15));
            object.label4s.setForeground(new Color(158, 158, 158));
            object.panel4s = new JPanel();
            object.panel4s.setBounds(360, 0, 40, 40);
            object.panel4s.setBackground(null);
            object.panel4s.add(object.label4s);
            object.panel2.add(object.panel4s);

            object.label6s = new JLabel("6s");
            object.label6s.setFont(new Font("Arial", Font.BOLD, 15));
            object.label6s.setForeground(new Color(158, 158, 158));
            object.panel6s = new JPanel();
            object.panel6s.setBounds(440, 0, 40, 40);
            object.panel6s.setBackground(null);
            object.panel6s.add(object.label6s);
            object.panel2.add(object.panel6s);

            object.labelSR = new JLabel("SR");
            object.labelSR.setFont(new Font("Arial", Font.BOLD, 15));
            object.labelSR.setForeground(new Color(158, 158, 158));
            object.panelSR = new JPanel();
            object.panelSR.setBounds(510, 0, 40, 40);
            object.panelSR.setBackground(null);
            object.panelSR.add(object.labelSR);
            object.panel2.add(object.panelSR);

            object.panel3 = new JPanel();
            object.panel3.setBounds(10, 152, 560, 80);
            object.panel3.setBackground(new Color(204, 255, 229));
            object.panel3.setLayout(null);

            object.strikerBatLabel = new JLabel(object.ActiveBatsman[0] + "*");
            object.strikerBatLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.strikerBatLabel.setForeground(new Color(96, 96, 96));
            object.strikerBatPanel = new JPanel();
            object.strikerBatPanel.setBounds(5, 5, 120, 25);
            object.strikerBatPanel.setBackground(null);
            object.strikerBatPanel.add(object.strikerBatLabel);
            object.panel3.add(object.strikerBatPanel);

            object.strikerBatRunLabel = new JLabel("" + object.runOfStrikerBatsman);
            object.strikerBatRunLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.strikerBatRunLabel.setForeground(new Color(96, 96, 96));
            object.strikerBatRunPanel = new JPanel();
            object.strikerBatRunPanel.setBounds(205, 5, 25, 25);
            object.strikerBatRunPanel.setBackground(null);
            object.strikerBatRunPanel.add(object.strikerBatRunLabel);
            object.panel3.add(object.strikerBatRunPanel);

            object.strikerBatBallLabel = new JLabel("" + object.ballPlayedByStrikerBatsman);
            object.strikerBatBallLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.strikerBatBallLabel.setForeground(new Color(96, 96, 96));
            object.strikerBatBallPanel = new JPanel();
            object.strikerBatBallPanel.setBounds(285, 5, 25, 25);
            object.strikerBatBallPanel.setBackground(null);
            object.strikerBatBallPanel.add(object.strikerBatBallLabel);
            object.panel3.add(object.strikerBatBallPanel);

            object.strikerBat4sLabel = new JLabel("" + object.numberOF4sOfStrikerBatsman);
            object.strikerBat4sLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.strikerBat4sLabel.setForeground(new Color(96, 96, 96));
            object.strikerBat4sPanel = new JPanel();
            object.strikerBat4sPanel.setBounds(365, 5, 25, 25);
            object.strikerBat4sPanel.setBackground(null);
            object.strikerBat4sPanel.add(object.strikerBat4sLabel);
            object.panel3.add(object.strikerBat4sPanel);

            object.strikerBat6sLabel = new JLabel("" + object.numberOF6sOfStrikerBatsman);
            object.strikerBat6sLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.strikerBat6sLabel.setForeground(new Color(96, 96, 96));
            object.strikerBat6sPanel = new JPanel();
            object.strikerBat6sPanel.setBounds(445, 5, 25, 25);
            object.strikerBat6sPanel.setBackground(null);
            object.strikerBat6sPanel.add(object.strikerBat6sLabel);
            object.panel3.add(object.strikerBat6sPanel);

            object.strikerBatSRLabel = new JLabel("" + object.numberOfSROfStrikerBatsman);
            object.strikerBatSRLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.strikerBatSRLabel.setForeground(new Color(96, 96, 96));
            object.strikerBatSRPanel = new JPanel();
            object.strikerBatSRPanel.setBounds(515, 5, 25, 25);
            object.strikerBatSRPanel.setBackground(null);
            object.strikerBatSRPanel.add(object.strikerBatSRLabel);
            object.panel3.add(object.strikerBatSRPanel);

            object.nonStrikerBatLabel = new JLabel(object.ActiveBatsman[1] + "");
            object.nonStrikerBatLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.nonStrikerBatLabel.setForeground(new Color(96, 96, 96));
            object.nonStrikerBatPanel = new JPanel();
            object.nonStrikerBatPanel.setBounds(5, 40, 150, 25);
            object.nonStrikerBatPanel.setBackground(null);
            object.nonStrikerBatPanel.add(object.nonStrikerBatLabel);
            object.panel3.add(object.nonStrikerBatPanel);

            object.nonstrikerBatRunLabel = new JLabel("" + object.runOfNonStrikerBatsman);
            object.nonstrikerBatRunLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.nonstrikerBatRunLabel.setForeground(new Color(96, 96, 96));
            object.nonstrikerBatRunPanel = new JPanel();
            object.nonstrikerBatRunPanel.setBounds(205, 40, 25, 25);
            object.nonstrikerBatRunPanel.setBackground(null);
            object.nonstrikerBatRunPanel.add(object.nonstrikerBatRunLabel);
            object.panel3.add(object.nonstrikerBatRunPanel);

            object.nonstrikerBatBallLabel = new JLabel("" + object.ballPlayedByNonStrikerBatsman);
            object.nonstrikerBatBallLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.nonstrikerBatBallLabel.setForeground(new Color(96, 96, 96));
            object.nonstrikerBatBallPanel = new JPanel();
            object.nonstrikerBatBallPanel.setBounds(285, 40, 25, 25);
            object.nonstrikerBatBallPanel.setBackground(null);
            object.nonstrikerBatBallPanel.add(object.nonstrikerBatBallLabel);
            object.panel3.add(object.nonstrikerBatBallPanel);

            object.nonstrikerBat4sLabel = new JLabel("" + object.number4sOfNonStrikerBatsman);
            object.nonstrikerBat4sLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.nonstrikerBat4sLabel.setForeground(new Color(96, 96, 96));
            object.nonstrikerBat4sPanel = new JPanel();
            object.nonstrikerBat4sPanel.setBounds(365, 40, 25, 25);
            object.nonstrikerBat4sPanel.setBackground(null);
            object.nonstrikerBat4sPanel.add(object.nonstrikerBat4sLabel);
            object.panel3.add(object.nonstrikerBat4sPanel);

            object.nonstrikerBat6sLabel = new JLabel("" + object.number6sOfNonStrikerBatsman);
            object.nonstrikerBat6sLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.nonstrikerBat6sLabel.setForeground(new Color(96, 96, 96));
            object.nonstrikerBat6sPanel = new JPanel();
            object.nonstrikerBat6sPanel.setBounds(445, 40, 25, 25);
            object.nonstrikerBat6sPanel.setBackground(null);
            object.nonstrikerBat6sPanel.add(object.nonstrikerBat6sLabel);
            object.panel3.add(object.nonstrikerBat6sPanel);

            object.nonstrikerBatSRLabel = new JLabel("" + object.numberOfSROfNonStrikerBatsman);
            object.nonstrikerBatSRLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.nonstrikerBatSRLabel.setForeground(new Color(96, 96, 96));
            object.nonstrikerBatSRPanel = new JPanel();
            object.nonstrikerBatSRPanel.setBounds(515, 40, 25, 25);
            object.nonstrikerBatSRPanel.setBackground(null);
            object.nonstrikerBatSRPanel.add(object.nonstrikerBatSRLabel);
            object.panel3.add(object.nonstrikerBatSRPanel);

            object.panel4 = new JPanel();
            object.panel4.setBounds(10, 240, 560, 30);
            object.panel4.setBackground(new Color(204, 255, 229));
            object.panel4.setLayout(null);

            object.bowlerLabel = new JLabel("Bowler");
            object.bowlerLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.bowlerLabel.setForeground(new Color(158, 158, 158));
            object.bowlerPanel = new JPanel();
            object.bowlerPanel.setBounds(10, 0, 60, 40);
            object.bowlerPanel.setBackground(null);
            object.bowlerPanel.add(object.bowlerLabel);
            object.panel4.add(object.bowlerPanel);

            object.bowlerOLabel = new JLabel("O");
            object.bowlerOLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.bowlerOLabel.setForeground(new Color(158, 158, 158));
            object.bowlerOPanel = new JPanel();
            object.bowlerOPanel.setBounds(200, 0, 40, 40);
            object.bowlerOPanel.setBackground(null);
            object.bowlerOPanel.add(object.bowlerOLabel);
            object.panel4.add(object.bowlerOPanel);

            object.bowlerMLabel = new JLabel("M");
            object.bowlerMLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.bowlerMLabel.setForeground(new Color(158, 158, 158));
            object.bowlerMPanel = new JPanel();
            object.bowlerMPanel.setBounds(280, 0, 40, 40);
            object.bowlerMPanel.setBackground(null);
            object.bowlerMPanel.add(object.bowlerMLabel);
            object.panel4.add(object.bowlerMPanel);

            object.bowlerRLabel = new JLabel("R");
            object.bowlerRLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.bowlerRLabel.setForeground(new Color(158, 158, 158));
            object.bowlerRPanel = new JPanel();
            object.bowlerRPanel.setBounds(360, 0, 40, 40);
            object.bowlerRPanel.setBackground(null);
            object.bowlerRPanel.add(object.bowlerRLabel);
            object.panel4.add(object.bowlerRPanel);

            object.bowlerWLabel = new JLabel("W");
            object.bowlerWLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.bowlerWLabel.setForeground(new Color(158, 158, 158));
            object.bowlerWPanel = new JPanel();
            object.bowlerWPanel.setBounds(440, 0, 40, 40);
            object.bowlerWPanel.setBackground(null);
            object.bowlerWPanel.add(object.bowlerWLabel);
            object.panel4.add(object.bowlerWPanel);

            object.bowlerERLabel = new JLabel("ER");
            object.bowlerERLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.bowlerERLabel.setForeground(new Color(158, 158, 158));
            object.bowlerERPanel = new JPanel();
            object.bowlerERPanel.setBounds(510, 0, 40, 40);
            object.bowlerERPanel.setBackground(null);
            object.bowlerERPanel.add(object.bowlerERLabel);
            object.panel4.add(object.bowlerERPanel);

            object.panel5 = new JPanel();
            object.panel5.setBounds(10, 272, 560, 40);
            object.panel5.setBackground(new Color(204, 255, 229));
            object.panel5.setLayout(null);

            if (object.bowlersInfo[object.chosenBowlerIndex][0] == null) {
                object.bowlersInfo[object.chosenBowlerIndex][0] = "0";
            }
            object.bowlerNameLabel = new JLabel();
            object.bowlerNameLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][0]);
            object.bowlerNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.bowlerNameLabel.setForeground(new Color(96, 96, 96));
            object.bowlerNamePanel = new JPanel();
            object.bowlerNamePanel.setBounds(5, 5, 100, 30);
            object.bowlerNamePanel.setBackground(null);
            object.bowlerNamePanel.add(object.bowlerNameLabel);
            object.panel5.add(object.bowlerNamePanel);

            if (object.bowlersInfo[object.chosenBowlerIndex][1] == null) {
                object.bowlersInfo[object.chosenBowlerIndex][1] = "0";
            }
            object.numberOfOLabel = new JLabel();
            object.numberOfOLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][1]);
            object.numberOfOLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.numberOfOLabel.setForeground(new Color(96, 96, 96));
            object.numberOfOPanel = new JPanel();
            object.numberOfOPanel.setBounds(200, 5, 30, 30);
            object.numberOfOPanel.setBackground(null);
            object.numberOfOPanel.add(object.numberOfOLabel);
            object.panel5.add(object.numberOfOPanel);

            if (object.bowlersInfo[object.chosenBowlerIndex][2] == null) {
                object.bowlersInfo[object.chosenBowlerIndex][2] = "0";
            }
            object.numberOFMLabel = new JLabel();
            object.numberOFMLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][2]);
            object.numberOFMLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.numberOFMLabel.setForeground(new Color(96, 96, 96));
            object.numberOFMPanel = new JPanel();
            object.numberOFMPanel.setBounds(285, 5, 30, 30);
            object.numberOFMPanel.setBackground(null);
            object.numberOFMPanel.add(object.numberOFMLabel);
            object.panel5.add(object.numberOFMPanel);

            if (object.bowlersInfo[object.chosenBowlerIndex][3] == null) {
                object.bowlersInfo[object.chosenBowlerIndex][3] = "0";
            }
            object.numberOfRLabel = new JLabel();
            object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);
            object.numberOfRLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.numberOfRLabel.setForeground(new Color(96, 96, 96));
            object.numberOfRPanel = new JPanel();
            object.numberOfRPanel.setBounds(365, 5, 30, 30);
            object.numberOfRPanel.setBackground(null);
            object.numberOfRPanel.add(object.numberOfRLabel);
            object.panel5.add(object.numberOfRPanel);

            if (object.bowlersInfo[object.chosenBowlerIndex][4] == null) {
                object.bowlersInfo[object.chosenBowlerIndex][4] = "0";
            }
            object.numberOfWLabel = new JLabel();
            object.numberOfWLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][4]);
            object.numberOfWLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.numberOfWLabel.setForeground(new Color(96, 96, 96));
            object.numberOfWPanel = new JPanel();
            object.numberOfWPanel.setBounds(445, 5, 30, 30);
            object.numberOfWPanel.setBackground(null);
            object.numberOfWPanel.add(object.numberOfWLabel);
            object.panel5.add(object.numberOfWPanel);

            if (object.bowlersInfo[object.chosenBowlerIndex][5] == null) {
                object.bowlersInfo[object.chosenBowlerIndex][5] = "0";
            }
            object.numberOfERLabel = new JLabel();
            object.numberOfERLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][5]);
            object.numberOfERLabel.setFont(new Font("Arial", Font.BOLD, 15));
            object.numberOfERLabel.setForeground(new Color(96, 96, 96));
            object.numberOfERPanel = new JPanel();
            object.numberOfERPanel.setBounds(515, 5, 30, 30);
            object.numberOfERPanel.setBackground(null);
            object.numberOfERPanel.add(object.numberOfERLabel);
            object.panel5.add(object.numberOfERPanel);

            object.OverArea = new JTextArea("This Over   : ");
            object.OverArea.setEditable(false);
            object.OverArea.setFont(new Font("Arial", Font.BOLD, 18));
            object.OverArea.setBackground(new Color(204, 255, 229));
            object.OverArea.setLineWrap(true);
            object.OverArea.setWrapStyleWord(true);
            object.OverArea.setBounds(10, 330, 560, 50);

            object.panel6 = new JPanel();
            object.panel6.setBounds(10, 380, 560, 50);
            object.panel6.setBackground(new Color(204, 255, 229));
            object.panel6.setLayout(null);

            object.wideButton = new JButton();
            object.wideButton.setBounds(5, 5, 80, 40);
            Image img = new ImageIcon(getClass().getResource("007.png")).getImage();
            Image reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
            object.wideButton.setIcon(new ImageIcon(reImage));
            object.panel6.add(object.wideButton);

            object.legByesButton = new JButton();
            object.legByesButton.setBounds(115, 5, 80, 40);
            img = new ImageIcon(getClass().getResource("006.png")).getImage();
            reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
            object.legByesButton.setIcon(new ImageIcon(reImage));
            object.panel6.add(object.legByesButton);

            object.byesButton = new JButton();
            object.byesButton.setBounds(225, 5, 80, 40);
            img = new ImageIcon(getClass().getResource("008.png")).getImage();
            reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
            object.byesButton.setIcon(new ImageIcon(reImage));
            object.panel6.add(object.byesButton);

            object.wicketButton = new JButton();
            object.wicketButton.setBounds(335, 5, 80, 40);
            img = new ImageIcon(getClass().getResource("014.png")).getImage();
            reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
            object.wicketButton.setIcon(new ImageIcon(reImage));
            object.panel6.add(object.wicketButton);

            object.noBallButton = new JButton();
            object.noBallButton.setBounds(445, 5, 80, 40);
            img = new ImageIcon(getClass().getResource("009.png")).getImage();
            reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
            object.noBallButton.setIcon(new ImageIcon(reImage));
            object.panel6.add(object.noBallButton);

            object.panel7 = new JPanel();
            object.panel7.setBounds(10, 450, 550, 50);
            object.panel7.setBackground(new Color(204, 255, 229));
            object.panel7.setLayout(null);

            object.button0 = new JButton("0");
            object.button0.setForeground(Color.WHITE);
            object.button0.setFont(new Font("Arial", Font.BOLD, 25));
            object.button0.setBackground(new Color(51, 51, 255));
            object.button0.setBounds(5, 10, 60, 30);
            object.panel7.add(object.button0);

            object.button1 = new JButton("1");
            object.button1.setForeground(Color.WHITE);
            object.button1.setFont(new Font("Arial", Font.BOLD, 25));
            object.button1.setBackground(new Color(51, 51, 255));
            object.button1.setBounds(80, 10, 60, 30);
            object.panel7.add(object.button1);

            object.button2 = new JButton("2");
            object.button2.setForeground(Color.WHITE);
            object.button2.setFont(new Font("Arial", Font.BOLD, 25));
            object.button2.setBackground(new Color(51, 51, 255));
            object.button2.setBounds(160, 10, 60, 30);
            object.panel7.add(object.button2);

            object.button3 = new JButton("3");
            object.button3.setForeground(Color.WHITE);
            object.button3.setFont(new Font("Arial", Font.BOLD, 25));
            object.button3.setBackground(new Color(51, 51, 255));
            object.button3.setBounds(240, 10, 60, 30);
            object.panel7.add(object.button3);

            object.button4 = new JButton("4");
            object.button4.setForeground(Color.WHITE);
            object.button4.setFont(new Font("Arial", Font.BOLD, 25));
            object.button4.setBackground(new Color(51, 51, 255));
            object.button4.setBounds(320, 10, 60, 30);
            object.panel7.add(object.button4);

            object.button5 = new JButton("5");
            object.button5.setForeground(Color.WHITE);
            object.button5.setFont(new Font("Arial", Font.BOLD, 25));
            object.button5.setBackground(new Color(51, 51, 255));
            object.button5.setBounds(400, 10, 60, 30);
            object.panel7.add(object.button5);

            object.button6 = new JButton("6");
            object.button6.setForeground(Color.WHITE);
            object.button6.setFont(new Font("Arial", Font.BOLD, 25));
            object.button6.setBackground(new Color(51, 51, 255));
            object.button6.setBounds(480, 10, 60, 30);
            object.panel7.add(object.button6);

            object.retireButton = new JButton("Retire");
            object.retireButton.setForeground(Color.WHITE);
            object.retireButton.setFont(new Font("Arial", Font.BOLD, 15));
            object.retireButton.setBackground(new Color(0, 153, 0));
            object.retireButton.setBounds(10, 530, 80, 30);
            object.scoreBOardContainer.add(object.retireButton);

            object.swapButton = new JButton("Swap Batsman");
            object.swapButton.setForeground(Color.WHITE);
            object.swapButton.setFont(new Font("Arial", Font.BOLD, 15));
            object.swapButton.setBackground(new Color(0, 153, 0));
            object.swapButton.setBounds(100, 530, 140, 30);
            object.scoreBOardContainer.add(object.swapButton);

            object.ExtrasButton = new JButton("Extras");
            object.ExtrasButton.setForeground(Color.WHITE);
            object.ExtrasButton.setFont(new Font("Arial", Font.BOLD, 15));
            object.ExtrasButton.setBackground(new Color(0, 153, 0));
            object.ExtrasButton.setBounds(250, 530, 100, 30);
            object.scoreBOardContainer.add(object.ExtrasButton);

            object.PartnerShipButton = new JButton("Partnership");
            object.PartnerShipButton.setForeground(Color.WHITE);
            object.PartnerShipButton.setFont(new Font("Arial", Font.BOLD, 15));
            object.PartnerShipButton.setBackground(new Color(0, 153, 0));
            object.PartnerShipButton.setBounds(10, 570, 120, 30);
            object.scoreBOardContainer.add(object.PartnerShipButton);

            object.plusRunButton = new JButton("+");
            object.plusRunButton.setForeground(Color.WHITE);
            object.plusRunButton.setFont(new Font("Arial", Font.BOLD, 15));
            object.plusRunButton.setBackground(new Color(0, 153, 0));
            object.plusRunButton.setBounds(150, 570, 50, 30);
            object.scoreBOardContainer.add(object.plusRunButton);

            object.undoRunButton = new JButton("-");
            object.undoRunButton.setForeground(Color.WHITE);
            object.undoRunButton.setFont(new Font("Arial", Font.BOLD, 15));
            object.undoRunButton.setBackground(new Color(0, 153, 0));
            object.undoRunButton.setBounds(250, 570, 50, 30);
            object.scoreBOardContainer.add(object.undoRunButton);

            object.backButton = new JButton("Back");/*<---------- */
            object.backButton.setForeground(Color.WHITE);
            object.backButton.setFont(new Font("Arial", Font.BOLD, 15));
            object.backButton.setBackground(new Color(0, 153, 0));
            object.backButton.setBounds(350, 570, 100, 30);
            // object.scoreBOardContainer.add(object.backButton);

            object.forwardButton = new JButton("Forward");/*<------------- */
            object.forwardButton.setForeground(Color.WHITE);
            object.forwardButton.setFont(new Font("Arial", Font.BOLD, 15));
            object.forwardButton.setBackground(new Color(0, 153, 0));
            object.forwardButton.setBounds(460, 570, 100, 30);
            // object.scoreBOardContainer.add(object.forwardButton);

            object.scoreBOardContainer.add(object.panel1);
            object.scoreBOardContainer.add(object.panel2);
            object.scoreBOardContainer.add(object.panel3);
            object.scoreBOardContainer.add(object.panel4);
            object.scoreBOardContainer.add(object.panel5);
            object.scoreBOardContainer.add(object.panel6);
            object.scoreBOardContainer.add(object.panel7);
            object.scoreBOardContainer.add(object.OverArea);

            object.scoreBoardFrame.setTitle(object.teamNames[0] + " Vs " + object.teamNames[1]);
            object.scoreBoardFrame.setVisible(true);

            object.ExtrasButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    eOb.toTextAreaForSeeExtraRuns(object);
                }

            });

            object.PartnerShipButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    pOb.partnerShip(object);
                }

            });

            object.retireButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.batsmanActiveIndicate == 0) {
                        object.numberOF4sOfStrikerBatsman = 0;
                        object.numberOF6sOfStrikerBatsman = 0;
                        object.numberOfSROfStrikerBatsman = 0;
                        object.ballPlayedByStrikerBatsman = 0;
                        object.runOfStrikerBatsman = 0;
                        object.PartnershipRun = 0;
                        object.partnershipBalls = 0;

                        object.strikerBatRunLabel.setText((object.runOfStrikerBatsman) + "");
                        object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman));

                        object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman / 1) * 100;

                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");
                        object.strikerBat4sLabel.setText(object.numberOF4sOfStrikerBatsman + "");
                        object.strikerBat6sLabel.setText(object.numberOF6sOfStrikerBatsman + "");

                    } else {
                        object.number4sOfNonStrikerBatsman = 0;
                        object.number6sOfNonStrikerBatsman = 0;
                        object.numberOfSROfNonStrikerBatsman = 0;
                        object.ballPlayedByNonStrikerBatsman = 0;
                        object.runOfNonStrikerBatsman = 0;
                        object.PartnershipRun = 0;
                        object.partnershipBalls = 0;

                        object.nonstrikerBatRunLabel.setText((object.runOfNonStrikerBatsman) + "");
                        object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman));

                        object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman / 1) * 100;

                        object.nonStrikerBatLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                        object.nonstrikerBat4sLabel.setText(object.number4sOfNonStrikerBatsman + "");
                        object.nonstrikerBat6sLabel.setText(object.number6sOfNonStrikerBatsman + "");

                        // _______________________________________

                        String str = object.OverArea.getText();
                        object.OverArea.setText(str + "  " + "WC1");
                        object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                        object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");

                    }
                    bOb.batsmanNameAfterOut(object);

                    object.HistoryStoreIn.push(object);/* <-------- */
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });

            object.swapButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatLabel.setText(object.ActiveBatsman[0]);
                        object.nonStrikerBatLabel.setText(object.ActiveBatsman[1] + "*");
                        object.batsmanActiveIndicate = 1;
                    } else {
                        object.strikerBatLabel.setText(object.ActiveBatsman[0] + "*");
                        object.nonStrikerBatLabel.setText(object.ActiveBatsman[1]);
                        object.batsmanActiveIndicate = 0;
                    }

                }

            });

            object.plusRunButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    object.totalRuns += 1;
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);

                    object.PartnershipRun += 1;
                    object.partnershipBalls += 0;
                    isWin();

                }

            });

            object.undoRunButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.totalRuns > 0) {

                        object.totalRuns -= 1;
                        object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                        object.PartnershipRun -= 1;
                        object.partnershipBalls += 0;
                    }

                }

            });

            object.wideButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    object.totalRuns += 1;
                    object.extraRun += 1;
                    object.wideRun += 1;
                    object.PartnershipRun += 1;
                    object.partnershipBalls += 0;
                    String str1 = object.extraRunTextArea.getText();
                    object.extraRunTextArea.setText(str1 + "  WD0,");

                    int valueIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    object.bowlersInfo[object.chosenBowlerIndex][3] = String.valueOf(++valueIntoInt);
                    object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);

                    isWin();

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + "  " + "WD0");
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");

                    object.HistoryStoreIn.push(object);/* <-------- */
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();

                }

            });

            object.legByesButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    object.totalRuns += 1;
                    object.legByesRun += 1;
                    object.PartnershipRun += 1;
                    object.partnershipBalls += 1;
                    String str1 = object.extraRunTextArea.getText();
                    object.extraRunTextArea.setText(str1 + "  LB0,");
                    isWin();

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + "  " + "LB0");
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");

                    object.HistoryStoreIn.push(object);/* <-------- */
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });

            object.byesButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    object.totalRuns += 1;
                    object.byesRun += 1;
                    object.PartnershipRun += 1;
                    object.partnershipBalls += 1;
                    String str1 = object.extraRunTextArea.getText();
                    object.extraRunTextArea.setText(str1 + "  B0,");
                    isWin();

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + "  " + "B0");
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");

                    object.HistoryStoreIn.push(object);/* <-------- */
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });

            object.wicketButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    object.numberOfBalls += 1;
                    object.numberOfWickets += 1;
                    int valueOfWicketsIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][4]);
                    object.bowlersInfo[object.chosenBowlerIndex][4] = String.valueOf(++valueOfWicketsIntoInt);
                    object.numberOfWLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][4]);

                    if (object.numberOfWickets == 10 && object.inningsIndicate == 2) {
                        object.scoreBoardFrame.dispose();
                        object.isChangeOfInnings = true;
                        JOptionPane.showMessageDialog(null,
                                "''" + object.firstBattingTeam + "''" + " win by "
                                        + (object.target - object.totalRuns)
                                        + " runs",
                                "End of game",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    // ___________________________________
                    if (object.numberOfWickets == 10 && object.inningsIndicate == 1) {

                        object.scoreBoardFrame.dispose();

                        JOptionPane.showMessageDialog(null, "Need " + (object.totalRuns + 1) + " runs to Win",
                                "End of first innings",
                                JOptionPane.INFORMATION_MESSAGE);

                        object.RR = object.totalRuns / object.numberOfOvers;

                        object.inningsIndicate = 2;

                        // previous data will be removed
                        object.target = object.totalRuns + 1;
                        object.numberOF4sOfStrikerBatsman = object.number4sOfNonStrikerBatsman = 0;
                        object.numberOF6sOfStrikerBatsman = object.number6sOfNonStrikerBatsman = 0;
                        object.numberOfSROfNonStrikerBatsman = object.numberOfSROfStrikerBatsman = 0;
                        object.ballPlayedByNonStrikerBatsman = object.ballPlayedByStrikerBatsman = 0;

                        object.numberOfBalls = 0;
                        object.totalRuns = 0;
                        object.numberOfOvers = 0;
                        object.numberOfWickets = 0;
                        object.extraRun = 0;
                        object.wideRun = 0;
                        object.legByesRun = 0;
                        object.byesRun = 0;
                        object.noBallRun = 0;
                        object.CRR = 0;

                        object.PartnershipRun = 0;
                        object.partnershipBalls = 0;

                        object.chosenBowlerIndex = 0;
                        object.bowlerNameIndex = -1;

                        object.ActiveBatsman[0] = "";
                        object.ActiveBatsman[1] = "";
                        object.runOfStrikerBatsman = 0;
                        object.ballPlayedByStrikerBatsman = 0;
                        object.runOfNonStrikerBatsman = 0;
                        object.ballPlayedByNonStrikerBatsman = 0;

                        object.extraRunTextArea.setText("\nExtra run : ");

                        object.OverArea.setText("This Over   : ");
                        for (int i = 0; i < 11; i++) {
                            for (int j = 0; j < 6; j++) {
                                object.bowlersInfo[i][j] = "";
                            }
                        }

                        object.scoreBoardFrame.dispose();
                        object.HistoryStoreIn.push(object);
                        object = object.HistoryStoreIn.peek();

                        while (!object.HistoryStoreIn.empty()) {
                            object.HistoryStoreIn.pop();
                        }
                        while (!object.ForwardHistory.isEmpty()) {
                            object.ForwardHistory.pop();
                        }
                        oOb.playerNamesAfterStart(object);

                    } else {
                        OverOrNot();
                        if (object.currentOver == object.previousOver) {
                            object.OverArea.setText(object.OverArea.getText() + "  " + "WC1");
                        } else {
                            object.previousOver = object.currentOver;
                        }

                        if (object.inputOverFromTheSpiner != object.numberOfOvers) {
                            if (object.batsmanActiveIndicate == 0) {
                                object.numberOF4sOfStrikerBatsman = 0;
                                object.numberOF6sOfStrikerBatsman = 0;
                                object.numberOfSROfStrikerBatsman = 0;
                                object.ballPlayedByStrikerBatsman = 0;
                                object.runOfStrikerBatsman = 0;
                                object.PartnershipRun = 0;
                                object.partnershipBalls = 0;

                                object.strikerBatRunLabel.setText((object.runOfStrikerBatsman) + "");
                                object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman));

                                object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman / 1) * 100;

                                object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");
                                object.strikerBat4sLabel.setText(object.numberOF4sOfStrikerBatsman + "");
                                object.strikerBat6sLabel.setText(object.numberOF6sOfStrikerBatsman + "");

                                object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                                object.ballsLabel
                                        .setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");

                            } else {
                                object.number4sOfNonStrikerBatsman = 0;
                                object.number6sOfNonStrikerBatsman = 0;
                                object.numberOfSROfNonStrikerBatsman = 0;
                                object.ballPlayedByNonStrikerBatsman = 0;
                                object.runOfNonStrikerBatsman = 0;
                                object.PartnershipRun = 0;
                                object.partnershipBalls = 0;

                                object.nonstrikerBatRunLabel.setText((object.runOfNonStrikerBatsman) + "");
                                object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman));

                                object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman / 1) * 100;

                                object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                                object.nonstrikerBat4sLabel.setText(object.number4sOfNonStrikerBatsman + "");
                                object.nonstrikerBat6sLabel.setText(object.number6sOfNonStrikerBatsman + "");

                                object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                                object.ballsLabel
                                        .setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");

                            }

                            if (!object.isChangeOfInnings) {
                                bOb.batsmanNameAfterOut(object);

                            } else {
                                object.isChangeOfInnings = false;
                            }
                            if (object.inningsIndicate == 2 && object.numberOfWickets == 1) {
                                bOb.batsmanNameAfterOut(object);
                            }

                        }

                    }

                    object.HistoryStoreIn.push(object);/* <-------- */
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });

            object.noBallButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    object.totalRuns += 1;
                    object.extraRun += 1;
                    object.noBallRun += 1;
                    object.PartnershipRun += 1;
                    object.partnershipBalls += 0;
                
                    object.extraRunTextArea.setText(object.extraRunTextArea.getText() + "  NB0,");
                    int valueIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    object.bowlersInfo[object.chosenBowlerIndex][3] = String.valueOf(++valueIntoInt);
                    object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);

                    isWin();
                    object.OverArea.setText(object.OverArea.getText() + "  " + "NB0");
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");

                    object.HistoryStoreIn.push(object);/* <-------- */
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();

                }

            });

            /*********************** Backward Button *******************************/
            object.backButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!object.HistoryStoreIn.isEmpty()) {

                        object.ForwardHistory.push(object.HistoryStoreIn.pop());/* <------ */
                        if(!object.HistoryStoreIn.isEmpty()){

                            object = object.HistoryStoreIn.peek();

                            System.out.println("After PoP - Backward");

                        object.scoreLabel.setText(object.scoreLabel.getText());
                        object.ballsLabel.setText(object.ballsLabel.getText());
                        object.crrNumberLabel.setText(object.crrNumberLabel.getText());
                        object.targetNumberLabel.setText(object.targetNumberLabel.getText());
                        object.rrNumberLabel.setText(object.rrNumberLabel.getText());

                        object.strikerBatLabel.setText(object.strikerBatLabel.getText());
                        object.nonStrikerBatLabel.setText(object.strikerBatLabel.getText());

                        object.strikerBatRunLabel.setText(object.runOfStrikerBatsman + "");
                        object.strikerBatBallLabel.setText("" + object.ballPlayedByStrikerBatsman);
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                        object.nonstrikerBatRunLabel.setText(object.runOfNonStrikerBatsman + "");
                        object.nonstrikerBatBallLabel.setText("" + object.ballPlayedByNonStrikerBatsman);
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");

                        object.numberOfRLabel.setText(object.numberOfRLabel.getText());
                        object.OverArea.setText(object.OverArea.getText());
                        }else{
                            JOptionPane.showMessageDialog(null, "Empty Stack");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Empty Stack");
                    }
                }

            });

            /*********************** Forward Button *************************/
            object.forwardButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!object.ForwardHistory.isEmpty()) {

                        object = object.ForwardHistory.peek();
                        object.HistoryStoreIn.push(object.ForwardHistory.pop());/* <------ */

                        System.out.println("After PoP - Forward");

                        object.scoreLabel.setText(object.scoreLabel.getText());
                        object.ballsLabel.setText(object.ballsLabel.getText());
                        object.crrNumberLabel.setText(object.crrNumberLabel.getText());
                        object.targetNumberLabel.setText(object.targetNumberLabel.getText());
                        object.rrNumberLabel.setText(object.rrNumberLabel.getText());

                        object.strikerBatLabel.setText(object.strikerBatLabel.getText());
                        object.nonStrikerBatLabel.setText(object.strikerBatLabel.getText());

                        object.strikerBatRunLabel.setText(object.runOfStrikerBatsman + "");
                        object.strikerBatBallLabel.setText("" + object.ballPlayedByStrikerBatsman);
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                        object.nonstrikerBatRunLabel.setText(object.runOfNonStrikerBatsman + "");
                        object.nonstrikerBatBallLabel.setText("" + object.ballPlayedByNonStrikerBatsman);
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");

                        object.numberOfRLabel.setText(object.numberOfRLabel.getText());
                        object.OverArea.setText(object.OverArea.getText());

                    } else {
                        JOptionPane.showMessageDialog(null, "Empty Stack");
                    }
                }

            });

            object.button0.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    object.totalRuns += 0;
                    object.numberOfBalls += 1;
                    object.PartnershipRun += 0;
                    object.partnershipBalls += 1;
                    isWin();

                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatRunLabel.setText(object.runOfStrikerBatsman + "");
                        object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman += 1));
                        object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman
                                / object.ballPlayedByStrikerBatsman)
                                * 100;
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                    } else {
                        object.nonstrikerBatRunLabel.setText(object.runOfNonStrikerBatsman + "");
                        object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman += 1));
                        object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman
                                / object.ballPlayedByNonStrikerBatsman) * 100;
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                    }

                    if (object.numberOfOvers == 0) {
                        object.CRR = (object.totalRuns / 1);
                        object.crrNumberLabel.setText(object.CRR + "");

                    } else {

                        object.CRR = (object.totalRuns / object.numberOfOvers);
                        object.crrNumberLabel.setText(object.CRR + "");
                    }

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + " " + 0);
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");
                    OverOrNot();

                    object.HistoryStoreIn.push(object);
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });

            object.button1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    object.totalRuns += 1;
                    object.numberOfBalls += 1;
                    object.PartnershipRun += 1;
                    object.partnershipBalls += 1;
                    int valueIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    object.bowlersInfo[object.chosenBowlerIndex][3] = String.valueOf(++valueIntoInt);
                    object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    isWin();

                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatRunLabel.setText((object.runOfStrikerBatsman += 1) + "");
                        object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman += 1));
                        object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman
                                / object.ballPlayedByStrikerBatsman)
                                * 100;
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                    } else {
                        object.nonstrikerBatRunLabel.setText((object.runOfNonStrikerBatsman += 1) + "");
                        object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman += 1));
                        object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman
                                / object.ballPlayedByNonStrikerBatsman) * 100;
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                    }
                    if (object.numberOfOvers == 0) {
                        object.CRR = (object.totalRuns / 1);
                        object.crrNumberLabel.setText(object.CRR + "");

                    } else {

                        object.CRR = (object.totalRuns / object.numberOfOvers);
                        object.crrNumberLabel.setText(object.CRR + "");
                    }

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + " " + 1);
                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatLabel.setText(object.ActiveBatsman[0]);
                        object.nonStrikerBatLabel.setText(object.ActiveBatsman[1] + "*");
                        object.batsmanActiveIndicate = 1;
                    } else {
                        object.strikerBatLabel.setText(object.ActiveBatsman[0] + "*");
                        object.nonStrikerBatLabel.setText(object.ActiveBatsman[1]);
                        object.batsmanActiveIndicate = 0;
                    }

                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");
                    OverOrNot();

                    object.HistoryStoreIn.push(object);
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });

            object.button2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    object.totalRuns += 2;
                    object.numberOfBalls += 1;
                    object.PartnershipRun += 2;
                    object.partnershipBalls += 1;
                    int valueIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    object.bowlersInfo[object.chosenBowlerIndex][3] = String.valueOf(valueIntoInt + 2);
                    object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    isWin();

                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatRunLabel.setText((object.runOfStrikerBatsman += 2) + "");
                        object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman += 1));
                        object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman
                                / object.ballPlayedByStrikerBatsman)
                                * 100;
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                    } else {
                        object.nonstrikerBatRunLabel.setText((object.runOfNonStrikerBatsman += 2) + "");
                        object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman += 1));
                        object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman
                                / object.ballPlayedByNonStrikerBatsman) * 100;
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                    }

                    if (object.numberOfOvers == 0) {
                        object.CRR = (object.totalRuns / 1);
                        object.crrNumberLabel.setText(object.CRR + "");

                    } else {

                        object.CRR = (object.totalRuns / object.numberOfOvers);
                        object.crrNumberLabel.setText(object.CRR + "");
                    }

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + " " + 2);
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");
                    OverOrNot();

                    object.HistoryStoreIn.push(object);
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });
            object.button3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    object.totalRuns += 3;
                    object.numberOfBalls += 1;
                    object.PartnershipRun += 3;
                    object.partnershipBalls += 1;
                    int valueIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    object.bowlersInfo[object.chosenBowlerIndex][3] = String.valueOf(3 + valueIntoInt);
                    object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    isWin();

                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatRunLabel.setText((object.runOfStrikerBatsman += 3) + "");
                        object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman += 1));
                        object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman
                                / object.ballPlayedByStrikerBatsman)
                                * 100;
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                    } else {
                        object.nonstrikerBatRunLabel.setText((object.runOfNonStrikerBatsman += 3) + "");
                        object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman += 1));
                        object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman
                                / object.ballPlayedByNonStrikerBatsman) * 100;
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                    }

                    if (object.numberOfOvers == 0) {
                        object.CRR = (object.totalRuns / 1);
                        object.crrNumberLabel.setText(object.CRR + "");

                    } else {

                        object.CRR = (object.totalRuns / object.numberOfOvers);
                        object.crrNumberLabel.setText(object.CRR + "");
                    }

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + " " + 3);
                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatLabel.setText(object.ActiveBatsman[0]);
                        object.nonStrikerBatLabel.setText(object.ActiveBatsman[1] + "*");
                        object.batsmanActiveIndicate = 1;
                    } else {
                        object.strikerBatLabel.setText(object.ActiveBatsman[0] + "*");
                        object.nonStrikerBatLabel.setText(object.ActiveBatsman[1]);
                        object.batsmanActiveIndicate = 0;
                    }
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");
                    OverOrNot();

                    object.HistoryStoreIn.push(object);
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });
            object.button4.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    object.totalRuns += 4;
                    object.numberOfBalls += 1;
                    object.PartnershipRun += 4;
                    object.partnershipBalls += 1;
                    int valueIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    object.bowlersInfo[object.chosenBowlerIndex][3] = String.valueOf(4 + valueIntoInt);
                    object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    isWin();

                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatRunLabel.setText((object.runOfStrikerBatsman += 4) + "");
                        object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman += 1));
                        object.strikerBat4sLabel.setText("" + (object.numberOF4sOfStrikerBatsman += 1));
                        object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman
                                / object.ballPlayedByStrikerBatsman)
                                * 100;
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                    } else {
                        object.nonstrikerBatRunLabel.setText((object.runOfNonStrikerBatsman += 4) + "");
                        object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman += 1));
                        object.nonstrikerBat4sLabel.setText("" + (object.number4sOfNonStrikerBatsman += 1));
                        object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman
                                / object.ballPlayedByNonStrikerBatsman) * 100;
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                    }

                    if (object.numberOfOvers == 0) {
                        object.CRR = (object.totalRuns / 1);
                        object.crrNumberLabel.setText(object.CRR + "");

                    } else {

                        object.CRR = (object.totalRuns / object.numberOfOvers);
                        object.crrNumberLabel.setText(object.CRR + "");
                    }

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + " " + 4);
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");
                    OverOrNot();

                    object.HistoryStoreIn.push(object);
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });
            object.button5.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    object.totalRuns += 5;
                    object.numberOfBalls += 1;
                    object.PartnershipRun += 5;
                    object.partnershipBalls += 1;
                    int valueIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    object.bowlersInfo[object.chosenBowlerIndex][3] = String.valueOf(5 + valueIntoInt);
                    object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    isWin();

                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatRunLabel.setText((object.runOfStrikerBatsman += 5) + "");
                        object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman += 1));
                        object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman
                                / object.ballPlayedByStrikerBatsman)
                                * 100;
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                    } else {
                        object.nonstrikerBatRunLabel.setText((object.runOfNonStrikerBatsman += 4) + "");
                        object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman += 1));
                        object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman
                                / object.ballPlayedByNonStrikerBatsman) * 100;
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                    }

                    if (object.inputOverFromTheSpiner == 0) {
                        object.CRR = (object.totalRuns / 1);
                        object.crrNumberLabel.setText(object.CRR + "");

                    } else {

                        object.CRR = (object.totalRuns / object.inputOverFromTheSpiner);
                        object.crrNumberLabel.setText(object.CRR + "");
                    }

                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + " " + 5);
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");
                    OverOrNot();

                    object.HistoryStoreIn.push(object);
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });
            object.button6.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    object.totalRuns += 6;
                    object.numberOfBalls += 1;
                    object.PartnershipRun += 6;
                    object.partnershipBalls += 1;
                    int valueIntoInt = Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3]);
                    object.bowlersInfo[object.chosenBowlerIndex][3] = String.valueOf(6 + valueIntoInt);
                    object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);

                    isWin();
                    if (object.batsmanActiveIndicate == 0) {
                        object.strikerBatRunLabel.setText((object.runOfStrikerBatsman += 6) + "");
                        object.strikerBatBallLabel.setText("" + (object.ballPlayedByStrikerBatsman += 1));
                        object.strikerBat6sLabel.setText("" + (object.numberOF6sOfStrikerBatsman += 1));
                        object.numberOfSROfStrikerBatsman = (object.runOfStrikerBatsman
                                / object.ballPlayedByStrikerBatsman)
                                * 100;
                        object.strikerBatSRLabel.setText(object.numberOfSROfStrikerBatsman + "");

                    } else {
                        object.nonstrikerBatRunLabel.setText((object.runOfNonStrikerBatsman += 6) + "");
                        object.nonstrikerBatBallLabel.setText("" + (object.ballPlayedByNonStrikerBatsman += 1));
                        object.nonstrikerBat6sLabel.setText("" + (object.number6sOfNonStrikerBatsman += 1));
                        object.numberOfSROfNonStrikerBatsman = (object.runOfNonStrikerBatsman
                                / object.ballPlayedByNonStrikerBatsman) * 100;
                        object.nonstrikerBatSRLabel.setText(object.numberOfSROfNonStrikerBatsman + "");
                    }
                    if (object.numberOfOvers == 0) {
                        object.CRR = (object.totalRuns / 1);
                        object.crrNumberLabel.setText(object.CRR + "");

                    } else {

                        object.CRR = (object.totalRuns / object.numberOfOvers);
                        object.crrNumberLabel.setText(object.CRR + "");
                    }
                    String str = object.OverArea.getText();
                    object.OverArea.setText(str + " " + 6);
                    object.scoreLabel.setText(object.totalRuns + " - " + object.numberOfWickets);
                    object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");
                    OverOrNot();

                    object.HistoryStoreIn.push(object);
                    System.out.println("Before peek");
                    object = object.HistoryStoreIn.peek();
                }

            });
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

        object.HistoryStoreIn.push(object);/* <----------------------- */
        System.out.println("Before first peek");
        object = object.HistoryStoreIn.peek();

    }

    public void isWin() {

        try {
            if (object.totalRuns >= object.target && object.inningsIndicate == 2) {
                object.scoreBoardFrame.dispose();
                object.isChangeOfInnings = true;

                JOptionPane.showMessageDialog(null,
                        object.secondBattingTeam + " won by " + (10 - object.numberOfWickets) + " wickets",
                        "End of the game", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }

    public void OverOrNot() {
        bowlerChoiceAllComponents bowlerObject = new bowlerChoiceAllComponents();

        try {
            if (object.numberOfBalls == 6) {
                if (object.batsmanActiveIndicate == 1) {
                    object.strikerBatLabel.setText(object.ActiveBatsman[0] + "*");
                    object.nonStrikerBatLabel.setText(object.ActiveBatsman[1]);
                    object.batsmanActiveIndicate = 0;
                } else {
                    object.strikerBatLabel.setText(object.ActiveBatsman[0]);
                    object.nonStrikerBatLabel.setText(object.ActiveBatsman[1] + "*");
                    object.batsmanActiveIndicate = 1;
                }
                if (object.maidenOrNotRun == Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3])
                        && object.maidenOrNotWicket < Integer
                                .parseInt(object.bowlersInfo[object.chosenBowlerIndex][4])) {
                    object.bowlersInfo[object.chosenBowlerIndex][2] = String
                            .valueOf(1 + Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][2]));
                }
                object.bowlersInfo[object.chosenBowlerIndex][1] = String
                        .valueOf(Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][1]) + 1);
                object.bowlersInfo[object.chosenBowlerIndex][5] = String
                        .valueOf((Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][3])
                                / Integer.parseInt(object.bowlersInfo[object.chosenBowlerIndex][1])) * 6);

                object.numberOfBalls = 0;
                object.numberOfOvers += 1;
                object.ballsLabel.setText("( " + (object.numberOfOvers) + "." + (object.numberOfBalls) + " )");

                if (object.inputOverFromTheSpiner != object.numberOfOvers) {

                    bowlerObject.bowlerChoice(object);
                    object.OverArea.setText("This Over   : ");
                }
                ++object.currentOver;

                isEndOfInnings();
                // object.indexOfHistory++;
                // object.HistoryStoreIn.push(object);

            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void isEndOfInnings() {
        OpeningPlayerNameComponents oPOb = new OpeningPlayerNameComponents();

        try {
            if (object.inningsIndicate == 2 && (object.inputOverFromTheSpiner == object.numberOfOvers)
                    && object.totalRuns < object.target) {

                object.scoreBoardFrame.dispose();
                object.isChangeOfInnings = true;
                JOptionPane.showMessageDialog(null,
                        "''" + object.secondBattingTeam + "''" + " lost by " + (object.target - object.totalRuns)
                                + " runs",
                        "End of game",
                        JOptionPane.INFORMATION_MESSAGE);

            } else if (object.inputOverFromTheSpiner == object.numberOfOvers) {

                object.scoreBoardFrame.dispose();
                JOptionPane.showMessageDialog(null, "Need " + (object.totalRuns + 1) + " runs to Win",
                        "End of first innings",
                        JOptionPane.INFORMATION_MESSAGE);

                // if (object.firstBattingTeam.equals(object.teamNames[0])) {
                // object.firstBattingTeam = object.teamNames[1];
                // } else {
                // object.firstBattingTeam = object.teamNames[0];

                // }

                object.teamNameLabel.setText(object.firstBattingTeam + "," + " 2nd inning");
                object.RR = object.totalRuns / object.numberOfOvers;

                object.inningsIndicate = 2;
                object.isChangeOfInnings = true;
                object.target = object.totalRuns + 1;

                // previous data will be removed
                object.numberOfBalls = 0;
                object.totalRuns = 0;
                object.numberOfOvers = 0;
                object.numberOfWickets = 0;
                object.extraRun = 0;
                object.wideRun = 0;
                object.legByesRun = 0;
                object.byesRun = 0;
                object.noBallRun = 0;
                object.CRR = 0;
                object.PartnershipRun = 0;
                object.partnershipBalls = 0;

                object.numberOF4sOfStrikerBatsman = 0;
                object.numberOF6sOfStrikerBatsman = 0;
                object.numberOfSROfStrikerBatsman = 0;
                object.ballPlayedByStrikerBatsman = 0;
                object.runOfStrikerBatsman = 0;

                object.number4sOfNonStrikerBatsman = 0;
                object.number6sOfNonStrikerBatsman = 0;
                object.numberOfSROfNonStrikerBatsman = 0;
                object.ballPlayedByNonStrikerBatsman = 0;
                object.runOfNonStrikerBatsman = 0;

                object.chosenBowlerIndex = 0;
                object.bowlerNameIndex = -1;

                object.ActiveBatsman[0] = "";
                object.ActiveBatsman[1] = "";
                object.runOfStrikerBatsman = 0;
                object.ballPlayedByStrikerBatsman = 0;
                object.runOfNonStrikerBatsman = 0;
                object.ballPlayedByNonStrikerBatsman = 0;

                object.currentOver = 0;
                object.previousOver = 0;

                object.extraRunTextArea.setText("\nExtra run : ");

                object.OverArea.setText("This Over   : ");
                for (int i = 0; i < 11; i++) {
                    for (int j = 0; j < 6; j++) {
                        object.bowlersInfo[i][j] = "";
                    }
                }

                object.HistoryStoreIn.push(object);
                object = object.HistoryStoreIn.peek();

                while (!object.HistoryStoreIn.empty()) {
                    object.HistoryStoreIn.pop();
                }
                while (!object.ForwardHistory.isEmpty()) {
                    object.ForwardHistory.pop();
                }
                oPOb.playerNamesAfterStart(object);/* <----- */

            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}