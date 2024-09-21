
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class ScoreManagementSystem {

    // ************************* All Score Board Components *****************/

    private String teamNames[] = new String[2],
            ActiveBatsman[] = new String[2],
            firstBattingTeam;

    private String bowlersInfo[][] = new String[11][6];

    private int batsmanActiveIndicate = 0, bowlerNameIndex = -1, batsmanNameIndex = 0, inningsIndicate = 1;

    private int CRR, RR, maidenOrNotRun = 0, maidenOrNotWicket = 0;

    private int numberOfOvers, inputOverFromTheSpiner, numberOfBalls = 0, runOfStrikerBatsman = 0,
            runOfNonStrikerBatsman = 0, PartnershipRun = 0, partnershipBalls = 0,
            extraRun = 0, totalRuns = 0, numberOF4sOfStrikerBatsman = 0, number4sOfNonStrikerBatsman = 0,
            numberOF6sOfStrikerBatsman = 0, number6sOfNonStrikerBatsman = 0, target = 0,
            ballPlayedByStrikerBatsman = 0, ballPlayedByNonStrikerBatsman = 0;

    private int numberOfSROfNonStrikerBatsman = 0, numberOfSROfStrikerBatsman = 0;

    private int wideRun = 0, noBallRun = 0, byesRun = 0, legByesRun = 0, numberOfWickets = 0;

    private JFrame scoreBoardFrame;
    private Container scoreBOardContainer;
    private ImageIcon scoreBoardFrameIcon = new ImageIcon(getClass().getResource("011.png"));
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7;
    private JTextArea OverArea;

    private JLabel strikerBatLabel, nonStrikerBatLabel, strikerBatRunLabel,
            nonstrikerBatRunLabel, strikerBatBallLabel, nonstrikerBatBallLabel,
            strikerBat4sLabel, nonstrikerBat4sLabel, strikerBat6sLabel,
            nonstrikerBat6sLabel, strikerBatSRLabel, nonstrikerBatSRLabel;

    private JPanel strikerBatPanel, nonStrikerBatPanel, strikerBatRunPanel,
            nonstrikerBatRunPanel, strikerBatBallPanel, nonstrikerBatBallPanel,
            strikerBat4sPanel, nonstrikerBat4sPanel, strikerBat6sPanel,
            nonstrikerBat6sPanel, strikerBatSRPanel, nonstrikerBatSRPanel;

    private JPanel batsmanPanel, panelR, panelB, panel4s, panel6s, panelSR;
    private JLabel batsmanLabel, labelR, labelB, label4s, label6s, labelSR;

    private JPanel teamNamePanel, scorePanel, ballsPanel, crrPanel,
            crrNumberPanel, targetPanel, targetNumberPanel, rrPanel, rrNumberPanel;
    private JLabel teamNameLabel, scoreLabel,  ballsLabel,
            crrLabel, crrNumberLabel, targetLabel, targetNumberLabel, rrNumberLabel,
            rrLabel;

    private JButton wideButton, noBallButton, byesButton, legByesButton,
            wicketButton;
    private JButton button0, button1, button2, button3, button4, button5,
            button6;
    private JButton retireButton, swapButton, ExtrasButton, PartnerShipButton,
            plusRunButton, undoRunButton;

    private JLabel bowlerLabel, bowlerOLabel, bowlerMLabel, bowlerRLabel,
            bowlerWLabel, bowlerERLabel;
    private JPanel bowlerPanel, bowlerOPanel, bowlerMPanel, bowlerRPanel,
            bowlerWPanel, bowlerERPanel;

    private JLabel bowlerNameLabel, numberOfOLabel, numberOFMLabel,
            numberOfRLabel, numberOfWLabel, numberOfERLabel;
    private JPanel bowlerNamePanel, numberOfOPanel, numberOFMPanel,
            numberOfRPanel, numberOfWPanel, numberOfERPanel;
    // ________________________________________________________________________

    // ************************ partnerShip **************************/
    private JFrame partnerShipFrame;
    private Container partnerShipContainer;
    private JTable TableForPartnership;

    // __________________________________________________________________________

    // ************Log-in Frame components *************/
    private Container logInContainer;
    private JFrame logInFrame;
    private JPanel logInPanel;
    private JTextField logInUserField;
    private JPasswordField logINPassword;
    private JCheckBox logInShowOption;
    private JButton logInSubmitButton;
    private JLabel logInNameLabel, logInPanelLabel, passLabel, userNameLabel;
    private ImageIcon logInIcon = new ImageIcon(getClass().getResource("login.png")),
            logInFrameIcon = new ImageIcon(getClass().getResource("011.png")),
            logInPanelIcon = new ImageIcon(getClass().getResource("001.png"));
    private final String logInPassword = "1234", logInUserName = "admin";
    // _________________________________________________________________________

    // ****************** Game start components **********************/
    private JFrame startFrame;
    private Container startContainer;
    private JLabel hostLabel, visitorLabel, batOrBallLabel, overLabel;
    private JTextField hostField, visitorField;
    private JCheckBox batOption, ballOption;
    private ButtonGroup groupBarOrBall = new ButtonGroup();
    private JSpinner oversSpinner;
    private JButton starButton;
    private ImageIcon startIconButton = new ImageIcon(getClass().getResource("012.png")),
            startFrameIcon = new ImageIcon(getClass().getResource("011.png"));
    // ________________________________________________________________________

    // ***************** players Name after Start *****************/
    private JFrame playerNameFrame;
    private Container playerNameContainer;
    private JLabel strikerLabel, nonStrikerLabel, firstBowlerLabel;
    private JTextField strikerField, nonStrikerField, firstBowlerField;
    private JButton playerNameStartButton, playerNameBackButton;
    private ImageIcon playerNameFrameIcon = new ImageIcon(getClass().getResource("011.png"));
    // _________________________________________________________________________

    // ********************* Bowler name after Over **********************/
    private JFrame newBowlerFrame;
    private Container newBowlerContainer;
    private JLabel newBowlerNameLabel;
    private JTextField newBowlerField;
    private JButton newBowlerStarButton;
    private ImageIcon newBowlerIcon = new ImageIcon(getClass().getResource("011.png"));
    // __________________________________________________________________________

    // ********************* Batsman name after Out **********************/
    private JFrame newBatsmanFrame;
    private Container newBatsmanContainer;
    private JLabel newBatsmanLabel;
    private JTextField newBatsmanField;
    private JButton newBatsmanButton;
    private ImageIcon newBatsmanIcon = new ImageIcon(getClass().getResource("011.png"));
    // ___________________________________________________________________________

    /********************* Bowler choice components ******************/
    private JFrame bowlerChoiceFrame;
    private Container bowlerChoiceContainer;
    private ImageIcon bowlerChoiceIcon = new ImageIcon(getClass().getResource("011.png"));
    private JButton buttonBowler1, buttonBowler2, buttonBowler3, buttonBowler4, buttonBowler5, buttonBowler6,
            buttonBowler7, buttonBowler8, buttonBowler9, buttonBowler10, buttonBowler11;
    private JButton addNewBowlerButton;
    private int chosenBowlerIndex = 0;
    // ______________________________________________________________________________________

    /********************** Extra run text field components ***********************/
    private JFrame extraRunFrame;
    private Container extraRunContainer;
    private JTextArea extraRunTextArea;
    private JScrollPane extraRunScroll;

    void toTextAreaForSeeExtraRuns() {
        extraRunFrame = new JFrame();
        extraRunFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        extraRunFrame.setTitle("Extra runs");
        extraRunFrame.setBounds(420, 200, 400, 200);

        ImageIcon extraRunFrameIcon = new ImageIcon(getClass().getResource("011.png"));
        extraRunFrame.setIconImage(extraRunFrameIcon.getImage());

        extraRunContainer = extraRunFrame.getContentPane();
        extraRunContainer.setLayout(null);

        // extraRunTextArea = new JTextArea("\nExtra run : ");
        // extraRunTextArea.setBackground(new Color(153, 255, 204));
        // extraRunTextArea.setFont(new Font("Arial", Font.BOLD, 20));
        // extraRunTextArea.setForeground(new Color(128, 128, 128));
        // extraRunTextArea.setLineWrap(true);
        // extraRunTextArea.setWrapStyleWord(true);
        // extraRunTextArea.setEditable(false);

        // will be declared in score board frame

        extraRunScroll = new JScrollPane(extraRunTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        extraRunScroll.setBounds(0, 0, 400, 200);
        extraRunContainer.add(extraRunScroll);

        extraRunFrame.setVisible(true);
    }

    void bowlerChoice() {

        bowlerChoiceFrame = new JFrame();
        bowlerChoiceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        bowlerChoiceFrame.setTitle("Choice a new Bowler");
        bowlerChoiceFrame.setIconImage(bowlerChoiceIcon.getImage());
        bowlerChoiceFrame.setBounds(500, 100, 300, 500);
        bowlerChoiceFrame.setResizable(false);

        bowlerChoiceContainer = bowlerChoiceFrame.getContentPane();
        bowlerChoiceContainer.setBackground(new Color(204, 255, 229));
        bowlerChoiceContainer.setLayout(null);

        if (bowlerNameIndex == -1) {

            buttonBowler1 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler1 = new JButton(bowlersInfo[0][0]);

        }
        buttonBowler1.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler1.setBackground(new Color(0, 204, 204));
        buttonBowler1.setBounds(10, 10, 110, 30);
        bowlerChoiceContainer.add(buttonBowler1);

        if (bowlerNameIndex == -1) {

            buttonBowler2 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler2 = new JButton(bowlersInfo[1][0]);

        }
        buttonBowler2.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler2.setBackground(new Color(0, 204, 204));
        buttonBowler2.setVisible(true);
        buttonBowler2.setBounds(160, 10, 110, 30);
        bowlerChoiceContainer.add(buttonBowler2);

        if (bowlerNameIndex == -1) {

            buttonBowler3 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler3 = new JButton(bowlersInfo[2][0]);

        }
        buttonBowler3.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler3.setBackground(new Color(0, 204, 204));
        buttonBowler3.setVisible(true);
        buttonBowler3.setBounds(10, 50, 110, 30);
        bowlerChoiceContainer.add(buttonBowler3);

        if (bowlerNameIndex == -1) {

            buttonBowler4 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler4 = new JButton(bowlersInfo[3][0]);

        }
        buttonBowler4.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler4.setBackground(new Color(0, 204, 204));
        buttonBowler4.setVisible(true);
        buttonBowler4.setBounds(160, 50, 110, 30);
        bowlerChoiceContainer.add(buttonBowler4);

        if (bowlerNameIndex == -1) {

            buttonBowler5 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler5 = new JButton(bowlersInfo[4][0]);

        }
        buttonBowler5.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler5.setBackground(new Color(0, 204, 204));
        buttonBowler5.setVisible(true);
        buttonBowler5.setBounds(10, 90, 110, 30);
        bowlerChoiceContainer.add(buttonBowler5);

        if (bowlerNameIndex == -1) {

            buttonBowler6 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler6 = new JButton(bowlersInfo[5][0]);

        }
        buttonBowler6.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler6.setBackground(new Color(0, 204, 204));
        buttonBowler6.setVisible(true);
        buttonBowler6.setBounds(160, 90, 110, 30);
        bowlerChoiceContainer.add(buttonBowler6);

        if (bowlerNameIndex == -1) {

            buttonBowler7 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler7 = new JButton(bowlersInfo[6][0]);

        }
        buttonBowler7.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler7.setBackground(new Color(0, 204, 204));
        buttonBowler7.setVisible(true);
        buttonBowler7.setBounds(10, 130, 110, 30);
        bowlerChoiceContainer.add(buttonBowler7);

        if (bowlerNameIndex == -1) {

            buttonBowler8 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler8 = new JButton(bowlersInfo[7][0]);

        }
        buttonBowler8.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler8.setBackground(new Color(0, 204, 204));
        buttonBowler8.setVisible(true);
        buttonBowler8.setBounds(160, 130, 110, 30);
        bowlerChoiceContainer.add(buttonBowler8);

        if (bowlerNameIndex == -1) {

            buttonBowler9 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler9 = new JButton(bowlersInfo[8][0]);

        }
        buttonBowler9.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler9.setBackground(new Color(0, 204, 204));
        buttonBowler9.setVisible(true);
        buttonBowler9.setBounds(10, 170, 110, 30);
        bowlerChoiceContainer.add(buttonBowler9);

        if (bowlerNameIndex == -1) {

            buttonBowler10 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler10 = new JButton(bowlersInfo[10][0]);

        }
        buttonBowler10.setBackground(new Color(0, 204, 204));
        buttonBowler10.setVisible(true);
        buttonBowler10.setBounds(160, 170, 110, 30);
        bowlerChoiceContainer.add(buttonBowler10);

        if (bowlerNameIndex == -1) {

            buttonBowler11 = new JButton(bowlersInfo[0][0] = "");
        } else {
            buttonBowler11 = new JButton(bowlersInfo[10][0]);

        }
        buttonBowler11.setFont(new Font("Arial", Font.BOLD, 10));
        buttonBowler11.setBackground(new Color(0, 204, 204));
        buttonBowler11.setVisible(true);
        buttonBowler11.setBounds(10, 210, 110, 30);
        bowlerChoiceContainer.add(buttonBowler11);

        JLabel orLabel = new JLabel("OR");
        orLabel.setFont(new Font("Arial", Font.BOLD, 20));
        orLabel.setBounds(120, 260, 100, 50);
        orLabel.setForeground(new Color(128, 128, 128));
        bowlerChoiceContainer.add(orLabel);

        addNewBowlerButton = new JButton("Add new Bowler");
        addNewBowlerButton.setBounds(70, 320, 140, 30);
        addNewBowlerButton.setBackground(new Color(153, 204, 255));
        bowlerChoiceContainer.add(addNewBowlerButton);

        addNewBowlerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bowlerChoiceFrame.dispose();
                bowlerNameAfterOver();
            }

        });

        buttonBowler1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                chosenBowlerIndex = 0;
                bowlerChoiceFrame.dispose();
                bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
            }

        });
        buttonBowler2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (bowlerNameIndex < 1) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    chosenBowlerIndex = 1;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);

                }
            }

        });
        buttonBowler3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (bowlerNameIndex < 2) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {

                    chosenBowlerIndex = 2;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });
        buttonBowler4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (bowlerNameIndex < 3) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {

                    chosenBowlerIndex = 3;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });
        buttonBowler5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (bowlerNameIndex < 4) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {

                    chosenBowlerIndex = 4;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });
        buttonBowler6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (bowlerNameIndex < 5) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {

                    chosenBowlerIndex = 5;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });
        buttonBowler7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (bowlerNameIndex < 6) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    chosenBowlerIndex = 6;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });
        buttonBowler8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (bowlerNameIndex < 7) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    chosenBowlerIndex = 7;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });
        buttonBowler9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (bowlerNameIndex < 8) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    chosenBowlerIndex = 8;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });
        buttonBowler10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (bowlerNameIndex < 9) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    chosenBowlerIndex = 9;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });
        buttonBowler11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (bowlerNameIndex < 10) {
                    JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                            JOptionPane.ERROR_MESSAGE);

                } else {

                    chosenBowlerIndex = 10;
                    bowlerChoiceFrame.dispose();
                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
                }
            }

        });

        bowlerChoiceFrame.setVisible(true);
    }

    ////////////////////////////////////////////
    void partnerShip() {
        partnerShipFrame = new JFrame("Partnership");
        partnerShipFrame.setIconImage(new ImageIcon(getClass().getResource("011.png")).getImage());
        partnerShipFrame.setBounds(400, 200, 600, 150);
        partnerShipFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        partnerShipFrame.setResizable(false);

        partnerShipContainer = partnerShipFrame.getContentPane();
        partnerShipContainer.setLayout(null);
        partnerShipContainer.setBackground(Color.WHITE);

        String partnerShipTableHead[] = { "Striker", "Run", "Ball", "Non-Striker", "Run", "Ball", "Partnership",
                "Balls" };

        String partnerShipInfoRow[][] = new String[1][8];
        partnerShipInfoRow[0][0] = ActiveBatsman[0];
        partnerShipInfoRow[0][1] = String.valueOf(runOfStrikerBatsman);
        partnerShipInfoRow[0][2] = String.valueOf(ballPlayedByStrikerBatsman);

        partnerShipInfoRow[0][3] = ActiveBatsman[1];
        partnerShipInfoRow[0][4] = String.valueOf(runOfNonStrikerBatsman);
        partnerShipInfoRow[0][5] = String.valueOf(ballPlayedByNonStrikerBatsman);

        partnerShipInfoRow[0][6] = String.valueOf(PartnershipRun);
        partnerShipInfoRow[0][7] = String.valueOf(partnershipBalls);

        TableForPartnership = new JTable(partnerShipInfoRow, partnerShipTableHead);

        TableForPartnership.setFont(new Font("Arial", Font.BOLD, 15));
        TableForPartnership.setForeground(Color.LIGHT_GRAY);

        JScrollPane tableScroll = new JScrollPane(TableForPartnership);
        tableScroll.setBounds(0, 0, 600, 150);

        partnerShipContainer.add(tableScroll);
        partnerShipFrame.setVisible(true);

    }

    ///////////////////////////////////////////////////////////
    public void ScoreBoard() {

        // bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
        // numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
        // numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
        // numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
        // numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
        // numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);

        extraRunTextArea = new JTextArea("\nExtra run : ");
        extraRunTextArea.setBackground(new Color(153, 255, 204));
        extraRunTextArea.setFont(new Font("Arial", Font.BOLD, 20));
        extraRunTextArea.setForeground(new Color(128, 128, 128));
        extraRunTextArea.setLineWrap(true);
        extraRunTextArea.setWrapStyleWord(true);
        extraRunTextArea.setEditable(false);
        // go to extraRunFrame

        scoreBoardFrame = new JFrame();
        scoreBoardFrame.setBounds(380, 60, 600, 650);
        scoreBoardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scoreBoardFrame.setResizable(false);
        scoreBoardFrame.setIconImage(scoreBoardFrameIcon.getImage());

        scoreBOardContainer = scoreBoardFrame.getContentPane();
        scoreBOardContainer.setBackground(new Color(153, 204, 255));
        scoreBOardContainer.setLayout(null);

        panel1 = new JPanel();
        panel1.setBounds(10, 10, 560, 100);
        panel1.setBackground(new Color(204, 255, 229));
        panel1.setLayout(null);

        teamNameLabel = new JLabel(firstBattingTeam + "," + " 1st inning");
        if (inningsIndicate == 2) {
            teamNameLabel.setText(firstBattingTeam + "," + " 2nd inning");
        }
        teamNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        teamNameLabel.setBounds(10, 10, 200, 30);
        teamNamePanel = new JPanel();
        teamNamePanel.setBounds(10, 10, 200, 30);
        teamNamePanel.setBackground(null);
        teamNamePanel.add(teamNameLabel);
        panel1.add(teamNamePanel);

        scoreLabel = new JLabel(totalRuns + " - " + numberOfWickets);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 30));
        scorePanel = new JPanel();
        scorePanel.setBounds(10, 40, 100, 40);
        scorePanel.setBackground(null);
        scorePanel.add(scoreLabel);
        panel1.add(scorePanel);

        ballsLabel = new JLabel("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
        ballsLabel.setFont(new Font("Arial", Font.BOLD, 15));
        ballsLabel.setForeground(new Color(118, 118, 118));
        ballsPanel = new JPanel();
        ballsPanel.setBounds(100, 60, 60, 30);
        ballsPanel.setBackground(null);
        ballsPanel.add(ballsLabel);
        panel1.add(ballsPanel);

        crrLabel = new JLabel("CRR");
        crrLabel.setFont(new Font("Arial", Font.BOLD, 18));
        crrLabel.setForeground(new Color(78, 78, 78));
        crrPanel = new JPanel();
        crrPanel.setBounds(250, 10, 40, 40);
        crrPanel.setBackground(null);
        crrPanel.add(crrLabel);
        panel1.add(crrPanel);

        crrNumberLabel = new JLabel(CRR + "");
        crrNumberLabel.setFont(new Font("Arial", Font.BOLD, 18));
        crrNumberLabel.setForeground(new Color(78, 78, 78));
        crrNumberPanel = new JPanel();
        crrNumberPanel.setBounds(250, 50, 35, 35);
        crrNumberPanel.setBackground(null);
        crrNumberPanel.add(crrNumberLabel);
        panel1.add(crrNumberPanel);

        targetLabel = new JLabel("Target");
        targetLabel.setFont(new Font("Arial", Font.BOLD, 18));
        targetLabel.setForeground(new Color(78, 78, 78));
        targetPanel = new JPanel();
        targetPanel.setBounds(320, 10, 60, 40);
        targetPanel.setBackground(null);
        targetPanel.add(targetLabel);
        if (inningsIndicate == 2) {

            targetNumberLabel.setText((target) + "");
            targetNumberPanel.setVisible(true);
        } else {
            targetPanel.setVisible(false);
        }
        panel1.add(targetPanel);

        targetNumberLabel = new JLabel((target) + "");
        targetNumberLabel.setFont(new Font("Arial", Font.BOLD, 18));
        targetNumberLabel.setForeground(new Color(78, 78, 78));
        targetNumberPanel = new JPanel();
        targetNumberPanel.setBounds(325, 50, 35, 35);
        targetNumberPanel.setBackground(null);
        targetNumberPanel.add(targetNumberLabel);
        if (inningsIndicate == 2) {
            targetNumberPanel.setVisible(true);
        } else {
            targetNumberPanel.setVisible(false);
        }
        panel1.add(targetNumberPanel);

        rrLabel = new JLabel("RR");
        rrLabel.setFont(new Font("Arial", Font.BOLD, 18));
        rrLabel.setForeground(new Color(78, 78, 78));
        rrPanel = new JPanel();
        rrPanel.setBounds(400, 10, 60, 40);
        rrPanel.setBackground(null);

        if (inningsIndicate == 2) {

            rrPanel.setVisible(true);
        } else {
            rrPanel.setVisible(false);
        }
        rrPanel.add(rrLabel);
        panel1.add(rrPanel);

        rrNumberLabel = new JLabel(RR + "");
        rrNumberLabel.setFont(new Font("Arial", Font.BOLD, 18));
        rrNumberLabel.setForeground(new Color(78, 78, 78));
        rrNumberPanel = new JPanel();
        rrNumberPanel.setBounds(415, 50, 35, 35);
        rrNumberPanel.setBackground(null);

        if (inningsIndicate == 2) {

            rrNumberPanel.setVisible(true);
        } else {
            rrNumberPanel.setVisible(false);
        }
        rrNumberPanel.add(rrNumberLabel);
        panel1.add(rrNumberPanel);

        panel2 = new JPanel();
        panel2.setBounds(10, 120, 560, 30);
        panel2.setBackground(new Color(204, 255, 229));
        panel2.setLayout(null);

        batsmanLabel = new JLabel("Batsman");
        batsmanLabel.setFont(new Font("Arial", Font.BOLD, 15));
        batsmanLabel.setForeground(new Color(158, 158, 158));
        batsmanPanel = new JPanel();
        batsmanPanel.setBounds(10, 0, 60, 40);
        batsmanPanel.setBackground(null);
        batsmanPanel.add(batsmanLabel);
        panel2.add(batsmanPanel);

        labelR = new JLabel("R");
        labelR.setFont(new Font("Arial", Font.BOLD, 15));
        labelR.setForeground(new Color(158, 158, 158));
        panelR = new JPanel();
        panelR.setBounds(200, 0, 40, 40);
        panelR.setBackground(null);
        panelR.add(labelR);
        panel2.add(panelR);

        labelB = new JLabel("B");
        labelB.setFont(new Font("Arial", Font.BOLD, 15));
        labelB.setForeground(new Color(158, 158, 158));
        panelB = new JPanel();
        panelB.setBounds(280, 0, 40, 40);
        panelB.setBackground(null);
        panelB.add(labelB);
        panel2.add(panelB);

        label4s = new JLabel("4s");
        label4s.setFont(new Font("Arial", Font.BOLD, 15));
        label4s.setForeground(new Color(158, 158, 158));
        panel4s = new JPanel();
        panel4s.setBounds(360, 0, 40, 40);
        panel4s.setBackground(null);
        panel4s.add(label4s);
        panel2.add(panel4s);

        label6s = new JLabel("6s");
        label6s.setFont(new Font("Arial", Font.BOLD, 15));
        label6s.setForeground(new Color(158, 158, 158));
        panel6s = new JPanel();
        panel6s.setBounds(440, 0, 40, 40);
        panel6s.setBackground(null);
        panel6s.add(label6s);
        panel2.add(panel6s);

        labelSR = new JLabel("SR");
        labelSR.setFont(new Font("Arial", Font.BOLD, 15));
        labelSR.setForeground(new Color(158, 158, 158));
        panelSR = new JPanel();
        panelSR.setBounds(510, 0, 40, 40);
        panelSR.setBackground(null);
        panelSR.add(labelSR);
        panel2.add(panelSR);

        panel3 = new JPanel();
        panel3.setBounds(10, 152, 560, 80);
        panel3.setBackground(new Color(204, 255, 229));
        panel3.setLayout(null);

        strikerBatLabel = new JLabel(ActiveBatsman[0] + "*");
        strikerBatLabel.setFont(new Font("Arial", Font.BOLD, 15));
        strikerBatLabel.setForeground(new Color(96, 96, 96));
        strikerBatPanel = new JPanel();
        strikerBatPanel.setBounds(5, 5, 120, 25);
        strikerBatPanel.setBackground(null);
        strikerBatPanel.add(strikerBatLabel);
        panel3.add(strikerBatPanel);

        strikerBatRunLabel = new JLabel("" + runOfStrikerBatsman);
        strikerBatRunLabel.setFont(new Font("Arial", Font.BOLD, 15));
        strikerBatRunLabel.setForeground(new Color(96, 96, 96));
        strikerBatRunPanel = new JPanel();
        strikerBatRunPanel.setBounds(205, 5, 25, 25);
        strikerBatRunPanel.setBackground(null);
        strikerBatRunPanel.add(strikerBatRunLabel);
        panel3.add(strikerBatRunPanel);

        strikerBatBallLabel = new JLabel("" + ballPlayedByStrikerBatsman);
        strikerBatBallLabel.setFont(new Font("Arial", Font.BOLD, 15));
        strikerBatBallLabel.setForeground(new Color(96, 96, 96));
        strikerBatBallPanel = new JPanel();
        strikerBatBallPanel.setBounds(285, 5, 25, 25);
        strikerBatBallPanel.setBackground(null);
        strikerBatBallPanel.add(strikerBatBallLabel);
        panel3.add(strikerBatBallPanel);

        strikerBat4sLabel = new JLabel("" + numberOF4sOfStrikerBatsman);
        strikerBat4sLabel.setFont(new Font("Arial", Font.BOLD, 15));
        strikerBat4sLabel.setForeground(new Color(96, 96, 96));
        strikerBat4sPanel = new JPanel();
        strikerBat4sPanel.setBounds(365, 5, 25, 25);
        strikerBat4sPanel.setBackground(null);
        strikerBat4sPanel.add(strikerBat4sLabel);
        panel3.add(strikerBat4sPanel);

        strikerBat6sLabel = new JLabel("" + numberOF6sOfStrikerBatsman);
        strikerBat6sLabel.setFont(new Font("Arial", Font.BOLD, 15));
        strikerBat6sLabel.setForeground(new Color(96, 96, 96));
        strikerBat6sPanel = new JPanel();
        strikerBat6sPanel.setBounds(445, 5, 25, 25);
        strikerBat6sPanel.setBackground(null);
        strikerBat6sPanel.add(strikerBat6sLabel);
        panel3.add(strikerBat6sPanel);

        strikerBatSRLabel = new JLabel("" + numberOfSROfStrikerBatsman);
        strikerBatSRLabel.setFont(new Font("Arial", Font.BOLD, 15));
        strikerBatSRLabel.setForeground(new Color(96, 96, 96));
        strikerBatSRPanel = new JPanel();
        strikerBatSRPanel.setBounds(515, 5, 25, 25);
        strikerBatSRPanel.setBackground(null);
        strikerBatSRPanel.add(strikerBatSRLabel);
        panel3.add(strikerBatSRPanel);

        nonStrikerBatLabel = new JLabel(ActiveBatsman[1] + "");
        nonStrikerBatLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nonStrikerBatLabel.setForeground(new Color(96, 96, 96));
        nonStrikerBatPanel = new JPanel();
        nonStrikerBatPanel.setBounds(5, 40, 150, 25);
        nonStrikerBatPanel.setBackground(null);
        nonStrikerBatPanel.add(nonStrikerBatLabel);
        panel3.add(nonStrikerBatPanel);

        nonstrikerBatRunLabel = new JLabel("" + runOfNonStrikerBatsman);
        nonstrikerBatRunLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nonstrikerBatRunLabel.setForeground(new Color(96, 96, 96));
        nonstrikerBatRunPanel = new JPanel();
        nonstrikerBatRunPanel.setBounds(205, 40, 25, 25);
        nonstrikerBatRunPanel.setBackground(null);
        nonstrikerBatRunPanel.add(nonstrikerBatRunLabel);
        panel3.add(nonstrikerBatRunPanel);

        nonstrikerBatBallLabel = new JLabel("" + ballPlayedByNonStrikerBatsman);
        nonstrikerBatBallLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nonstrikerBatBallLabel.setForeground(new Color(96, 96, 96));
        nonstrikerBatBallPanel = new JPanel();
        nonstrikerBatBallPanel.setBounds(285, 40, 25, 25);
        nonstrikerBatBallPanel.setBackground(null);
        nonstrikerBatBallPanel.add(nonstrikerBatBallLabel);
        panel3.add(nonstrikerBatBallPanel);

        nonstrikerBat4sLabel = new JLabel("" + number4sOfNonStrikerBatsman);
        nonstrikerBat4sLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nonstrikerBat4sLabel.setForeground(new Color(96, 96, 96));
        nonstrikerBat4sPanel = new JPanel();
        nonstrikerBat4sPanel.setBounds(365, 40, 25, 25);
        nonstrikerBat4sPanel.setBackground(null);
        nonstrikerBat4sPanel.add(nonstrikerBat4sLabel);
        panel3.add(nonstrikerBat4sPanel);

        nonstrikerBat6sLabel = new JLabel("" + number6sOfNonStrikerBatsman);
        nonstrikerBat6sLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nonstrikerBat6sLabel.setForeground(new Color(96, 96, 96));
        nonstrikerBat6sPanel = new JPanel();
        nonstrikerBat6sPanel.setBounds(445, 40, 25, 25);
        nonstrikerBat6sPanel.setBackground(null);
        nonstrikerBat6sPanel.add(nonstrikerBat6sLabel);
        panel3.add(nonstrikerBat6sPanel);

        nonstrikerBatSRLabel = new JLabel("" + numberOfSROfNonStrikerBatsman);
        nonstrikerBatSRLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nonstrikerBatSRLabel.setForeground(new Color(96, 96, 96));
        nonstrikerBatSRPanel = new JPanel();
        nonstrikerBatSRPanel.setBounds(515, 40, 25, 25);
        nonstrikerBatSRPanel.setBackground(null);
        nonstrikerBatSRPanel.add(nonstrikerBatSRLabel);
        panel3.add(nonstrikerBatSRPanel);

        panel4 = new JPanel();
        panel4.setBounds(10, 240, 560, 30);
        panel4.setBackground(new Color(204, 255, 229));
        panel4.setLayout(null);

        bowlerLabel = new JLabel("Bowler");
        bowlerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bowlerLabel.setForeground(new Color(158, 158, 158));
        bowlerPanel = new JPanel();
        bowlerPanel.setBounds(10, 0, 60, 40);
        bowlerPanel.setBackground(null);
        bowlerPanel.add(bowlerLabel);
        panel4.add(bowlerPanel);

        bowlerOLabel = new JLabel("O");
        bowlerOLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bowlerOLabel.setForeground(new Color(158, 158, 158));
        bowlerOPanel = new JPanel();
        bowlerOPanel.setBounds(200, 0, 40, 40);
        bowlerOPanel.setBackground(null);
        bowlerOPanel.add(bowlerOLabel);
        panel4.add(bowlerOPanel);

        bowlerMLabel = new JLabel("M");
        bowlerMLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bowlerMLabel.setForeground(new Color(158, 158, 158));
        bowlerMPanel = new JPanel();
        bowlerMPanel.setBounds(280, 0, 40, 40);
        bowlerMPanel.setBackground(null);
        bowlerMPanel.add(bowlerMLabel);
        panel4.add(bowlerMPanel);

        bowlerRLabel = new JLabel("R");
        bowlerRLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bowlerRLabel.setForeground(new Color(158, 158, 158));
        bowlerRPanel = new JPanel();
        bowlerRPanel.setBounds(360, 0, 40, 40);
        bowlerRPanel.setBackground(null);
        bowlerRPanel.add(bowlerRLabel);
        panel4.add(bowlerRPanel);

        bowlerWLabel = new JLabel("W");
        bowlerWLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bowlerWLabel.setForeground(new Color(158, 158, 158));
        bowlerWPanel = new JPanel();
        bowlerWPanel.setBounds(440, 0, 40, 40);
        bowlerWPanel.setBackground(null);
        bowlerWPanel.add(bowlerWLabel);
        panel4.add(bowlerWPanel);

        bowlerERLabel = new JLabel("ER");
        bowlerERLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bowlerERLabel.setForeground(new Color(158, 158, 158));
        bowlerERPanel = new JPanel();
        bowlerERPanel.setBounds(510, 0, 40, 40);
        bowlerERPanel.setBackground(null);
        bowlerERPanel.add(bowlerERLabel);
        panel4.add(bowlerERPanel);

        panel5 = new JPanel();
        panel5.setBounds(10, 272, 560, 40);
        panel5.setBackground(new Color(204, 255, 229));
        panel5.setLayout(null);

        if (bowlersInfo[chosenBowlerIndex][0] == null) {
            bowlersInfo[chosenBowlerIndex][0] = "0";
        }
        bowlerNameLabel = new JLabel();
        bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
        bowlerNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bowlerNameLabel.setForeground(new Color(96, 96, 96));
        bowlerNamePanel = new JPanel();
        bowlerNamePanel.setBounds(5, 5, 100, 30);
        bowlerNamePanel.setBackground(null);
        bowlerNamePanel.add(bowlerNameLabel);
        panel5.add(bowlerNamePanel);

        if (bowlersInfo[chosenBowlerIndex][1] == null) {
            bowlersInfo[chosenBowlerIndex][1] = "0";
        }
        numberOfOLabel = new JLabel();
        numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
        numberOfOLabel.setFont(new Font("Arial", Font.BOLD, 15));
        numberOfOLabel.setForeground(new Color(96, 96, 96));
        numberOfOPanel = new JPanel();
        numberOfOPanel.setBounds(200, 5, 30, 30);
        numberOfOPanel.setBackground(null);
        numberOfOPanel.add(numberOfOLabel);
        panel5.add(numberOfOPanel);

        if (bowlersInfo[chosenBowlerIndex][2] == null) {
            bowlersInfo[chosenBowlerIndex][2] = "0";
        }
        numberOFMLabel = new JLabel();
        numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
        numberOFMLabel.setFont(new Font("Arial", Font.BOLD, 15));
        numberOFMLabel.setForeground(new Color(96, 96, 96));
        numberOFMPanel = new JPanel();
        numberOFMPanel.setBounds(285, 5, 30, 30);
        numberOFMPanel.setBackground(null);
        numberOFMPanel.add(numberOFMLabel);
        panel5.add(numberOFMPanel);

        if (bowlersInfo[chosenBowlerIndex][3] == null) {
            bowlersInfo[chosenBowlerIndex][3] = "0";
        }
        numberOfRLabel = new JLabel();
        numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
        numberOfRLabel.setFont(new Font("Arial", Font.BOLD, 15));
        numberOfRLabel.setForeground(new Color(96, 96, 96));
        numberOfRPanel = new JPanel();
        numberOfRPanel.setBounds(365, 5, 30, 30);
        numberOfRPanel.setBackground(null);
        numberOfRPanel.add(numberOfRLabel);
        panel5.add(numberOfRPanel);

        if (bowlersInfo[chosenBowlerIndex][4] == null) {
            bowlersInfo[chosenBowlerIndex][4] = "0";
        }
        numberOfWLabel = new JLabel();
        numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
        numberOfWLabel.setFont(new Font("Arial", Font.BOLD, 15));
        numberOfWLabel.setForeground(new Color(96, 96, 96));
        numberOfWPanel = new JPanel();
        numberOfWPanel.setBounds(445, 5, 30, 30);
        numberOfWPanel.setBackground(null);
        numberOfWPanel.add(numberOfWLabel);
        panel5.add(numberOfWPanel);

        if (bowlersInfo[chosenBowlerIndex][5] == null) {
            bowlersInfo[chosenBowlerIndex][5] = "0";
        }
        numberOfERLabel = new JLabel();
        numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);
        numberOfERLabel.setFont(new Font("Arial", Font.BOLD, 15));
        numberOfERLabel.setForeground(new Color(96, 96, 96));
        numberOfERPanel = new JPanel();
        numberOfERPanel.setBounds(515, 5, 30, 30);
        numberOfERPanel.setBackground(null);
        numberOfERPanel.add(numberOfERLabel);
        panel5.add(numberOfERPanel);

        OverArea = new JTextArea("This Over   : ");
        OverArea.setEditable(false);
        OverArea.setFont(new Font("Arial", Font.BOLD, 18));
        OverArea.setBackground(new Color(204, 255, 229));
        OverArea.setLineWrap(true);
        OverArea.setWrapStyleWord(true);
        OverArea.setBounds(10, 330, 560, 50);

        panel6 = new JPanel();
        panel6.setBounds(10, 380, 560, 50);
        panel6.setBackground(new Color(204, 255, 229));
        panel6.setLayout(null);

        wideButton = new JButton();
        wideButton.setBounds(5, 5, 80, 40);
        Image img = new ImageIcon(getClass().getResource("007.png")).getImage();
        Image reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
        wideButton.setIcon(new ImageIcon(reImage));
        panel6.add(wideButton);

        legByesButton = new JButton();
        legByesButton.setBounds(115, 5, 80, 40);
        img = new ImageIcon(getClass().getResource("006.png")).getImage();
        reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
        legByesButton.setIcon(new ImageIcon(reImage));
        panel6.add(legByesButton);

        byesButton = new JButton();
        byesButton.setBounds(225, 5, 80, 40);
        img = new ImageIcon(getClass().getResource("008.png")).getImage();
        reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
        byesButton.setIcon(new ImageIcon(reImage));
        panel6.add(byesButton);

        wicketButton = new JButton();
        wicketButton.setBounds(335, 5, 80, 40);
        img = new ImageIcon(getClass().getResource("014.png")).getImage();
        reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
        wicketButton.setIcon(new ImageIcon(reImage));
        panel6.add(wicketButton);

        noBallButton = new JButton();
        noBallButton.setBounds(445, 5, 80, 40);
        img = new ImageIcon(getClass().getResource("009.png")).getImage();
        reImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
        noBallButton.setIcon(new ImageIcon(reImage));
        panel6.add(noBallButton);

        panel7 = new JPanel();
        panel7.setBounds(10, 450, 550, 50);
        panel7.setBackground(new Color(204, 255, 229));
        panel7.setLayout(null);

        button0 = new JButton("0");
        button0.setForeground(Color.WHITE);
        button0.setFont(new Font("Arial", Font.BOLD, 25));
        button0.setBackground(new Color(51, 51, 255));
        button0.setBounds(5, 10, 60, 30);
        panel7.add(button0);

        button1 = new JButton("1");
        button1.setForeground(Color.WHITE);
        button1.setFont(new Font("Arial", Font.BOLD, 25));
        button1.setBackground(new Color(51, 51, 255));
        button1.setBounds(80, 10, 60, 30);
        panel7.add(button1);

        button2 = new JButton("2");
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Arial", Font.BOLD, 25));
        button2.setBackground(new Color(51, 51, 255));
        button2.setBounds(160, 10, 60, 30);
        panel7.add(button2);

        button3 = new JButton("3");
        button3.setForeground(Color.WHITE);
        button3.setFont(new Font("Arial", Font.BOLD, 25));
        button3.setBackground(new Color(51, 51, 255));
        button3.setBounds(240, 10, 60, 30);
        panel7.add(button3);

        button4 = new JButton("4");
        button4.setForeground(Color.WHITE);
        button4.setFont(new Font("Arial", Font.BOLD, 25));
        button4.setBackground(new Color(51, 51, 255));
        button4.setBounds(320, 10, 60, 30);
        panel7.add(button4);

        button5 = new JButton("5");
        button5.setForeground(Color.WHITE);
        button5.setFont(new Font("Arial", Font.BOLD, 25));
        button5.setBackground(new Color(51, 51, 255));
        button5.setBounds(400, 10, 60, 30);
        panel7.add(button5);

        button6 = new JButton("6");
        button6.setForeground(Color.WHITE);
        button6.setFont(new Font("Arial", Font.BOLD, 25));
        button6.setBackground(new Color(51, 51, 255));
        button6.setBounds(480, 10, 60, 30);
        panel7.add(button6);

        retireButton = new JButton("Retire");
        retireButton.setForeground(Color.WHITE);
        retireButton.setFont(new Font("Arial", Font.BOLD, 15));
        retireButton.setBackground(new Color(0, 153, 0));
        retireButton.setBounds(10, 530, 80, 30);
        scoreBOardContainer.add(retireButton);

        swapButton = new JButton("Swap Batsman");
        swapButton.setForeground(Color.WHITE);
        swapButton.setFont(new Font("Arial", Font.BOLD, 15));
        swapButton.setBackground(new Color(0, 153, 0));
        swapButton.setBounds(100, 530, 140, 30);
        scoreBOardContainer.add(swapButton);

        ExtrasButton = new JButton("Extras");
        ExtrasButton.setForeground(Color.WHITE);
        ExtrasButton.setFont(new Font("Arial", Font.BOLD, 15));
        ExtrasButton.setBackground(new Color(0, 153, 0));
        ExtrasButton.setBounds(250, 530, 100, 30);
        scoreBOardContainer.add(ExtrasButton);

        PartnerShipButton = new JButton("Partnership");
        PartnerShipButton.setForeground(Color.WHITE);
        PartnerShipButton.setFont(new Font("Arial", Font.BOLD, 15));
        PartnerShipButton.setBackground(new Color(0, 153, 0));
        PartnerShipButton.setBounds(10, 570, 120, 30);
        scoreBOardContainer.add(PartnerShipButton);

        plusRunButton = new JButton("+");
        plusRunButton.setForeground(Color.WHITE);
        plusRunButton.setFont(new Font("Arial", Font.BOLD, 15));
        plusRunButton.setBackground(new Color(0, 153, 0));
        plusRunButton.setBounds(150, 570, 50, 30);
        scoreBOardContainer.add(plusRunButton);

        undoRunButton = new JButton("-");
        undoRunButton.setForeground(Color.WHITE);
        undoRunButton.setFont(new Font("Arial", Font.BOLD, 15));
        undoRunButton.setBackground(new Color(0, 153, 0));
        undoRunButton.setBounds(250, 570, 50, 30);
        scoreBOardContainer.add(undoRunButton);

        scoreBOardContainer.add(panel1);
        scoreBOardContainer.add(panel2);
        scoreBOardContainer.add(panel3);
        scoreBOardContainer.add(panel4);
        scoreBOardContainer.add(panel5);
        scoreBOardContainer.add(panel6);
        scoreBOardContainer.add(panel7);
        scoreBOardContainer.add(OverArea);

        scoreBoardFrame.setTitle(teamNames[0] + " Vs " + teamNames[1]);
        scoreBoardFrame.setVisible(true);

        ExtrasButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toTextAreaForSeeExtraRuns();
            }

        });

        PartnerShipButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                partnerShip();
            }

        });

        retireButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (batsmanActiveIndicate == 0) {
                    numberOF4sOfStrikerBatsman = 0;
                    numberOF6sOfStrikerBatsman = 0;
                    numberOfSROfStrikerBatsman = 0;
                    ballPlayedByStrikerBatsman = 0;
                    runOfStrikerBatsman = 0;
                    PartnershipRun = 0;
                    partnershipBalls = 0;

                    strikerBatRunLabel.setText((runOfStrikerBatsman) + "");
                    strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman));

                    numberOfSROfStrikerBatsman = (runOfStrikerBatsman / 1) * 100;

                    strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");
                    strikerBat4sLabel.setText(numberOF4sOfStrikerBatsman + "");
                    strikerBat6sLabel.setText(numberOF6sOfStrikerBatsman + "");

                } else {
                    number4sOfNonStrikerBatsman = 0;
                    number6sOfNonStrikerBatsman = 0;
                    numberOfSROfNonStrikerBatsman = 0;
                    ballPlayedByNonStrikerBatsman = 0;
                    runOfNonStrikerBatsman = 0;
                    PartnershipRun = 0;
                    partnershipBalls = 0;

                    nonstrikerBatRunLabel.setText((runOfNonStrikerBatsman) + "");
                    nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman));

                    numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / 1) * 100;

                    nonStrikerBatLabel.setText(numberOfSROfNonStrikerBatsman + "");
                    nonstrikerBat4sLabel.setText(number4sOfNonStrikerBatsman + "");
                    nonstrikerBat6sLabel.setText(number6sOfNonStrikerBatsman + "");

                    // _______________________________________

                    String str = OverArea.getText();
                    OverArea.setText(str + "  " + "WC1");
                    scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                    ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                    batsmanNameAfterOut();
                }
                batsmanNameAfterOut();
            }

        });

        swapButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (batsmanActiveIndicate == 0) {
                    strikerBatLabel.setText(ActiveBatsman[0]);
                    nonStrikerBatLabel.setText(ActiveBatsman[1] + "*");
                    batsmanActiveIndicate = 1;
                } else {
                    strikerBatLabel.setText(ActiveBatsman[0] + "*");
                    nonStrikerBatLabel.setText(ActiveBatsman[1]);
                    batsmanActiveIndicate = 0;
                }

            }

        });

        plusRunButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 1;
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);

                PartnershipRun += 1;
                partnershipBalls += 0;
                isWin();

            }

        });

        undoRunButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (totalRuns > 0) {

                    totalRuns -= 1;
                    scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                    PartnershipRun -= 1;
                    partnershipBalls += 0;
                }

            }

        });

        wideButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 1;
                extraRun += 1;
                wideRun += 1;
                PartnershipRun += 1;
                partnershipBalls += 0;
                String str1 = extraRunTextArea.getText();
                extraRunTextArea.setText(str1 + "  WD0,");

                int valueIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                bowlersInfo[chosenBowlerIndex][3] = String.valueOf(++valueIntoInt);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);

                isWin();

                String str = OverArea.getText();
                OverArea.setText(str + "  " + "WD0");
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
            }

        });

        legByesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 1;
                legByesRun += 1;
                PartnershipRun += 1;
                partnershipBalls += 1;
                String str1 = extraRunTextArea.getText();
                extraRunTextArea.setText(str1 + "  LB0,");
                isWin();

                String str = OverArea.getText();
                OverArea.setText(str + "  " + "LB0");
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
            }

        });

        byesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 1;
                byesRun += 1;
                PartnershipRun += 1;
                partnershipBalls += 1;
                String str1 = extraRunTextArea.getText();
                extraRunTextArea.setText(str1 + "  B0,");
                isWin();

                String str = OverArea.getText();
                OverArea.setText(str + "  " + "B0");
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
            }

        });

        wicketButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                numberOfBalls += 1;
                numberOfWickets += 1;
                int valueOfWicketsIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][4]);
                bowlersInfo[chosenBowlerIndex][4] = String.valueOf(++valueOfWicketsIntoInt);
                numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);

                if (numberOfWickets == 10 && inningsIndicate == 2) {
                    scoreBoardFrame.dispose();
                    JOptionPane.showMessageDialog(null,
                            "''" + firstBattingTeam + "''" + " lost by " + (target - totalRuns) + " runs",
                            "End of game",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                // ___________________________________
                if (numberOfWickets == 10 && inningsIndicate == 1) {

                    scoreBoardFrame.dispose();

                    JOptionPane.showMessageDialog(null, "Need " + (totalRuns + 1) + " runs to Win",
                            "End of first innings",
                            JOptionPane.INFORMATION_MESSAGE);

                    if (firstBattingTeam.equals(teamNames[0])) {
                        firstBattingTeam = teamNames[1];
                    } else {
                        firstBattingTeam = teamNames[0];

                    }

                    RR = totalRuns / numberOfOvers;

                    inningsIndicate = 2;
                    // previous data will be removed
                    target = totalRuns + 1;
                    numberOF4sOfStrikerBatsman = number4sOfNonStrikerBatsman = 0;
                    numberOF6sOfStrikerBatsman = number6sOfNonStrikerBatsman = 0;
                    numberOfSROfNonStrikerBatsman = numberOfSROfStrikerBatsman = 0;
                    ballPlayedByNonStrikerBatsman = ballPlayedByStrikerBatsman = 0;

                    numberOfBalls = 0;
                    totalRuns = 0;
                    numberOfOvers = 0;
                    numberOfWickets = 0;
                    extraRun = 0;
                    wideRun = 0;
                    legByesRun = 0;
                    byesRun = 0;
                    noBallRun = 0;
                    CRR = 0;

                    PartnershipRun = 0;
                    partnershipBalls = 0;

                    chosenBowlerIndex = 0;
                    bowlerNameIndex = -1;

                    ActiveBatsman[0] = "";
                    ActiveBatsman[1] = "";
                    runOfStrikerBatsman = 0;
                    ballPlayedByStrikerBatsman = 0;
                    runOfNonStrikerBatsman = 0;
                    ballPlayedByNonStrikerBatsman = 0;

                    extraRunTextArea.setText("\nExtra run : ");

                    OverArea.setText("This Over   : ");
                    for (int i = 0; i < 11; i++) {
                        for (int j = 0; j < 6; j++) {
                            bowlersInfo[i][j] = "";
                        }
                    }

                    scoreBoardFrame.dispose();
                    playerNamesAfterStart();

                } else {
                    OverOrNot();
                    if (inputOverFromTheSpiner != numberOfOvers) {
                        if (batsmanActiveIndicate == 0) {
                            numberOF4sOfStrikerBatsman = 0;
                            numberOF6sOfStrikerBatsman = 0;
                            numberOfSROfStrikerBatsman = 0;
                            ballPlayedByStrikerBatsman = 0;
                            runOfStrikerBatsman = 0;
                            PartnershipRun = 0;
                            partnershipBalls = 0;

                            strikerBatRunLabel.setText((runOfStrikerBatsman) + "");
                            strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman));

                            numberOfSROfStrikerBatsman = (runOfStrikerBatsman / 1) * 100;

                            strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");
                            strikerBat4sLabel.setText(numberOF4sOfStrikerBatsman + "");
                            strikerBat6sLabel.setText(numberOF6sOfStrikerBatsman + "");

                            String str = OverArea.getText();
                            OverArea.setText(str + "  " + "WC1");
                            scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                            ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                            batsmanNameAfterOut();

                        } else {
                            number4sOfNonStrikerBatsman = 0;
                            number6sOfNonStrikerBatsman = 0;
                            numberOfSROfNonStrikerBatsman = 0;
                            ballPlayedByNonStrikerBatsman = 0;
                            runOfNonStrikerBatsman = 0;
                            PartnershipRun = 0;
                            partnershipBalls = 0;

                            nonstrikerBatRunLabel.setText((runOfNonStrikerBatsman) + "");
                            nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman));

                            numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / 1) * 100;

                            nonstrikerBatSRLabel.setText(numberOfSROfNonStrikerBatsman + "");
                            nonstrikerBat4sLabel.setText(number4sOfNonStrikerBatsman + "");
                            nonstrikerBat6sLabel.setText(number6sOfNonStrikerBatsman + "");

                            // _______________________________________

                            String str = OverArea.getText();
                            OverArea.setText(str + "  " + "WC1");
                            scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                            ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                            batsmanNameAfterOut();
                        }

                    }

                }
            }

        });

        noBallButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 1;
                extraRun += 1;
                noBallRun += 1;
                PartnershipRun += 1;
                partnershipBalls += 0;
                String str1 = extraRunTextArea.getText();
                extraRunTextArea.setText(str1 + "  NB0,");
                int valueIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                bowlersInfo[chosenBowlerIndex][3] = String.valueOf(++valueIntoInt);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);

                isWin();

                String str = OverArea.getText();
                OverArea.setText(str + "  " + "NB0");
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");

            }

        });

        button0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 0;
                numberOfBalls += 1;
                PartnershipRun += 0;
                partnershipBalls += 1;
                isWin();

                if (batsmanActiveIndicate == 0) {
                    strikerBatRunLabel.setText(runOfStrikerBatsman + "");
                    strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman += 1));
                    numberOfSROfStrikerBatsman = (runOfStrikerBatsman / ballPlayedByStrikerBatsman) * 100;
                    strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");

                } else {
                    nonstrikerBatRunLabel.setText(runOfNonStrikerBatsman + "");
                    nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman += 1));
                    numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / ballPlayedByNonStrikerBatsman) * 100;
                    nonstrikerBatSRLabel.setText(numberOfSROfNonStrikerBatsman + "");
                }

                if (numberOfOvers == 0) {
                    CRR = (totalRuns / 1);
                    crrNumberLabel.setText(CRR + "");

                } else {

                    CRR = (totalRuns / numberOfOvers);
                    crrNumberLabel.setText(CRR + "");
                }

                String str = OverArea.getText();
                OverArea.setText(str + " " + 0);
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                OverOrNot();
            }

        });

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 1;
                numberOfBalls += 1;
                PartnershipRun += 1;
                partnershipBalls += 1;
                int valueIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                bowlersInfo[chosenBowlerIndex][3] = String.valueOf(++valueIntoInt);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                isWin();

                if (batsmanActiveIndicate == 0) {
                    strikerBatRunLabel.setText((runOfStrikerBatsman += 1) + "");
                    strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman += 1));
                    numberOfSROfStrikerBatsman = (runOfStrikerBatsman / ballPlayedByStrikerBatsman) * 100;
                    strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");

                } else {
                    nonstrikerBatRunLabel.setText((runOfNonStrikerBatsman += 1) + "");
                    nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman += 1));
                    numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / ballPlayedByNonStrikerBatsman) * 100;
                    nonstrikerBatSRLabel.setText(numberOfSROfNonStrikerBatsman + "");
                }
                if (numberOfOvers == 0) {
                    CRR = (totalRuns / 1);
                    crrNumberLabel.setText(CRR + "");

                } else {

                    CRR = (totalRuns / numberOfOvers);
                    crrNumberLabel.setText(CRR + "");
                }

                String str = OverArea.getText();
                OverArea.setText(str + " " + 1);
                if (batsmanActiveIndicate == 0) {
                    strikerBatLabel.setText(ActiveBatsman[0]);
                    nonStrikerBatLabel.setText(ActiveBatsman[1] + "*");
                    batsmanActiveIndicate = 1;
                } else {
                    strikerBatLabel.setText(ActiveBatsman[0] + "*");
                    nonStrikerBatLabel.setText(ActiveBatsman[1]);
                    batsmanActiveIndicate = 0;
                }

                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                OverOrNot();
            }

        });

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 2;
                numberOfBalls += 1;
                PartnershipRun += 2;
                partnershipBalls += 1;
                int valueIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                bowlersInfo[chosenBowlerIndex][3] = String.valueOf(valueIntoInt + 2);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                isWin();

                if (batsmanActiveIndicate == 0) {
                    strikerBatRunLabel.setText((runOfStrikerBatsman += 2) + "");
                    strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman += 1));
                    numberOfSROfStrikerBatsman = (runOfStrikerBatsman / ballPlayedByStrikerBatsman) * 100;
                    strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");

                } else {
                    nonstrikerBatRunLabel.setText((runOfNonStrikerBatsman += 2) + "");
                    nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman += 1));
                    numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / ballPlayedByNonStrikerBatsman) * 100;
                    nonstrikerBatSRLabel.setText(numberOfSROfNonStrikerBatsman + "");
                }

                if (numberOfOvers == 0) {
                    CRR = (totalRuns / 1);
                    crrNumberLabel.setText(CRR + "");

                } else {

                    CRR = (totalRuns / numberOfOvers);
                    crrNumberLabel.setText(CRR + "");
                }

                String str = OverArea.getText();
                OverArea.setText(str + " " + 2);
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                OverOrNot();
            }

        });
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 3;
                numberOfBalls += 1;
                PartnershipRun += 3;
                partnershipBalls += 1;
                int valueIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                bowlersInfo[chosenBowlerIndex][3] = String.valueOf(3 + valueIntoInt);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                isWin();

                if (batsmanActiveIndicate == 0) {
                    strikerBatRunLabel.setText((runOfStrikerBatsman += 3) + "");
                    strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman += 1));
                    numberOfSROfStrikerBatsman = (runOfStrikerBatsman / ballPlayedByStrikerBatsman) * 100;
                    strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");

                } else {
                    nonstrikerBatRunLabel.setText((runOfNonStrikerBatsman += 3) + "");
                    nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman += 1));
                    numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / ballPlayedByNonStrikerBatsman) * 100;
                    nonstrikerBatSRLabel.setText(numberOfSROfNonStrikerBatsman + "");
                }

                if (numberOfOvers == 0) {
                    CRR = (totalRuns / 1);
                    crrNumberLabel.setText(CRR + "");

                } else {

                    CRR = (totalRuns / numberOfOvers);
                    crrNumberLabel.setText(CRR + "");
                }

                String str = OverArea.getText();
                OverArea.setText(str + " " + 3);
                if (batsmanActiveIndicate == 0) {
                    strikerBatLabel.setText(ActiveBatsman[0]);
                    nonStrikerBatLabel.setText(ActiveBatsman[1] + "*");
                    batsmanActiveIndicate = 1;
                } else {
                    strikerBatLabel.setText(ActiveBatsman[0] + "*");
                    nonStrikerBatLabel.setText(ActiveBatsman[1]);
                    batsmanActiveIndicate = 0;
                }
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                OverOrNot();
            }

        });
        button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 4;
                numberOfBalls += 1;
                PartnershipRun += 4;
                partnershipBalls += 1;
                int valueIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                bowlersInfo[chosenBowlerIndex][3] = String.valueOf(4 + valueIntoInt);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                isWin();

                if (batsmanActiveIndicate == 0) {
                    strikerBatRunLabel.setText((runOfStrikerBatsman += 4) + "");
                    strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman += 1));
                    strikerBat4sLabel.setText("" + (numberOF4sOfStrikerBatsman += 1));
                    numberOfSROfStrikerBatsman = (runOfStrikerBatsman / ballPlayedByStrikerBatsman) * 100;
                    strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");

                } else {
                    nonstrikerBatRunLabel.setText((runOfNonStrikerBatsman += 4) + "");
                    nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman += 1));
                    nonstrikerBat4sLabel.setText("" + (number4sOfNonStrikerBatsman += 1));
                    numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / ballPlayedByNonStrikerBatsman) * 100;
                    nonstrikerBatSRLabel.setText(numberOfSROfNonStrikerBatsman + "");
                }

                if (numberOfOvers == 0) {
                    CRR = (totalRuns / 1);
                    crrNumberLabel.setText(CRR + "");

                } else {

                    CRR = (totalRuns / numberOfOvers);
                    crrNumberLabel.setText(CRR + "");
                }

                String str = OverArea.getText();
                OverArea.setText(str + " " + 4);
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                OverOrNot();
            }

        });
        button5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 5;
                numberOfBalls += 1;
                PartnershipRun += 5;
                partnershipBalls += 1;
                int valueIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                bowlersInfo[chosenBowlerIndex][3] = String.valueOf(5 + valueIntoInt);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                isWin();

                if (batsmanActiveIndicate == 0) {
                    strikerBatRunLabel.setText((runOfStrikerBatsman += 5) + "");
                    strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman += 1));
                    numberOfSROfStrikerBatsman = (runOfStrikerBatsman / ballPlayedByStrikerBatsman) * 100;
                    strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");

                } else {
                    nonstrikerBatRunLabel.setText((runOfNonStrikerBatsman += 4) + "");
                    nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman += 1));
                    numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / ballPlayedByNonStrikerBatsman) * 100;
                    nonstrikerBatSRLabel.setText(numberOfSROfNonStrikerBatsman + "");
                }

                if (inputOverFromTheSpiner == 0) {
                    CRR = (totalRuns / 1);
                    crrNumberLabel.setText(CRR + "");

                } else {

                    CRR = (totalRuns / inputOverFromTheSpiner);
                    crrNumberLabel.setText(CRR + "");
                }

                String str = OverArea.getText();
                OverArea.setText(str + " " + 5);
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                OverOrNot();
            }

        });
        button6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                totalRuns += 6;
                numberOfBalls += 1;
                PartnershipRun += 6;
                partnershipBalls += 1;
                int valueIntoInt = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                bowlersInfo[chosenBowlerIndex][3] = String.valueOf(6 + valueIntoInt);
                numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);

                isWin();
                if (batsmanActiveIndicate == 0) {
                    strikerBatRunLabel.setText((runOfStrikerBatsman += 6) + "");
                    strikerBatBallLabel.setText("" + (ballPlayedByStrikerBatsman += 1));
                    strikerBat6sLabel.setText("" + (numberOF6sOfStrikerBatsman += 1));
                    numberOfSROfStrikerBatsman = (runOfStrikerBatsman / ballPlayedByStrikerBatsman) * 100;
                    strikerBatSRLabel.setText(numberOfSROfStrikerBatsman + "");

                } else {
                    nonstrikerBatRunLabel.setText((runOfNonStrikerBatsman += 6) + "");
                    nonstrikerBatBallLabel.setText("" + (ballPlayedByNonStrikerBatsman += 1));
                    nonstrikerBat6sLabel.setText("" + (number6sOfNonStrikerBatsman += 1));
                    numberOfSROfNonStrikerBatsman = (runOfNonStrikerBatsman / ballPlayedByNonStrikerBatsman) * 100;
                    nonstrikerBatSRLabel.setText(numberOfSROfNonStrikerBatsman + "");
                }
                if (numberOfOvers == 0) {
                    CRR = (totalRuns / 1);
                    crrNumberLabel.setText(CRR + "");

                } else {

                    CRR = (totalRuns / numberOfOvers);
                    crrNumberLabel.setText(CRR + "");
                }
                String str = OverArea.getText();
                OverArea.setText(str + " " + 6);
                scoreLabel.setText(totalRuns + " - " + numberOfWickets);
                ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");
                OverOrNot();
            }

        });

    }

    public void isWin() {

        if (totalRuns >= target && inningsIndicate == 2) {
            scoreBoardFrame.dispose();
            JOptionPane.showMessageDialog(null, firstBattingTeam + " won by " + (10 - numberOfWickets) + " wickets",
                    "End of the game", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void OverOrNot() {

        if (numberOfBalls == 6) {
            if (batsmanActiveIndicate == 1) {
                strikerBatLabel.setText(ActiveBatsman[0]);
                nonStrikerBatLabel.setText(ActiveBatsman[1] + "*");
                batsmanActiveIndicate = 1;
            } else {
                strikerBatLabel.setText(ActiveBatsman[0] + "*");
                nonStrikerBatLabel.setText(ActiveBatsman[1]);
                batsmanActiveIndicate = 0;
            }
            if (maidenOrNotRun == Integer.parseInt(bowlersInfo[chosenBowlerIndex][3])
                    && maidenOrNotWicket < Integer.parseInt(bowlersInfo[chosenBowlerIndex][4])) {
                bowlersInfo[chosenBowlerIndex][2] = String
                        .valueOf(1 + Integer.parseInt(bowlersInfo[chosenBowlerIndex][2]));
            }
            bowlersInfo[chosenBowlerIndex][1] = String.valueOf(Integer.parseInt(bowlersInfo[chosenBowlerIndex][1]) + 1);
            bowlersInfo[chosenBowlerIndex][5] = String.valueOf((Integer.parseInt(bowlersInfo[chosenBowlerIndex][3])
                    / Integer.parseInt(bowlersInfo[chosenBowlerIndex][1])) * 6);

            numberOfBalls = 0;
            numberOfOvers += 1;
            ballsLabel.setText("( " + (numberOfOvers) + "." + (numberOfBalls) + " )");

            if (inputOverFromTheSpiner != numberOfOvers) {
                bowlerChoice();
                OverArea.setText("This Over   : ");
            }
            isEndOfInnings();

        }
    }

    public void isEndOfInnings() {

        if (inningsIndicate == 2 && (inputOverFromTheSpiner == numberOfOvers) && totalRuns < target) {

            scoreBoardFrame.dispose();
            JOptionPane.showMessageDialog(null,
                    "''" + firstBattingTeam + "''" + " lost by " + (target - totalRuns) + " runs",
                    "End of game",
                    JOptionPane.INFORMATION_MESSAGE);

        } else if (inputOverFromTheSpiner == numberOfOvers) {

            scoreBoardFrame.dispose();
            JOptionPane.showMessageDialog(null, "Need " + (totalRuns + 1) + " runs to Win", "End of first innings",
                    JOptionPane.INFORMATION_MESSAGE);

            if (firstBattingTeam.equals(teamNames[0])) {
                firstBattingTeam = teamNames[1];
            } else {
                firstBattingTeam = teamNames[0];

            }

            teamNameLabel.setText(firstBattingTeam + "," + " 2nd inning");
            RR = totalRuns / numberOfOvers;

            inningsIndicate = 2;
            target = totalRuns + 1;

            // previous data will be removed
            numberOfBalls = 0;
            totalRuns = 0;
            numberOfOvers = 0;
            numberOfWickets = 0;
            extraRun = 0;
            wideRun = 0;
            legByesRun = 0;
            byesRun = 0;
            noBallRun = 0;
            CRR = 0;
            PartnershipRun = 0;
            partnershipBalls = 0;

            numberOF4sOfStrikerBatsman = 0;
            numberOF6sOfStrikerBatsman = 0;
            numberOfSROfStrikerBatsman = 0;
            ballPlayedByStrikerBatsman = 0;
            runOfStrikerBatsman = 0;

            number4sOfNonStrikerBatsman = 0;
            number6sOfNonStrikerBatsman = 0;
            numberOfSROfNonStrikerBatsman = 0;
            ballPlayedByNonStrikerBatsman = 0;
            runOfNonStrikerBatsman = 0;

            chosenBowlerIndex = 0;
            bowlerNameIndex = -1;

            ActiveBatsman[0] = "";
            ActiveBatsman[1] = "";
            runOfStrikerBatsman = 0;
            ballPlayedByStrikerBatsman = 0;
            runOfNonStrikerBatsman = 0;
            ballPlayedByNonStrikerBatsman = 0;

            extraRunTextArea.setText("\nExtra run : ");

            OverArea.setText("This Over   : ");
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 6; j++) {
                    bowlersInfo[i][j] = "";
                }
            }

            playerNamesAfterStart();
        }

    }

    ///////////////////////////////////////////////////////
    public void batsmanNameAfterOut() {
        newBatsmanFrame = new JFrame();
        newBatsmanFrame.setTitle("New Batsman");
        newBatsmanFrame.setBounds(500, 200, 400, 150);
        newBatsmanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newBatsmanFrame.setResizable(false);
        newBatsmanFrame.setIconImage(newBatsmanIcon.getImage());

        newBatsmanContainer = newBatsmanFrame.getContentPane();
        newBatsmanContainer.setBackground(new Color(204, 255, 229));
        newBatsmanContainer.setLayout(null);

        newBatsmanLabel = new JLabel("New Batsman");
        newBatsmanLabel.setForeground(new Color(96, 96, 96));
        newBatsmanLabel.setFont(new Font("Arial", Font.BOLD, 15));
        newBatsmanLabel.setBounds(10, 10, 150, 50);
        newBatsmanLabel.setBackground(Color.BLUE);
        newBatsmanContainer.add(newBatsmanLabel);

        newBatsmanField = new JTextField();
        newBatsmanField.setBounds(10, 50, 250, 30);
        newBatsmanField.setForeground(new Color(96, 96, 96));
        newBatsmanField.setFont(new Font("Arial", Font.BOLD, 15));
        newBatsmanField.setBackground(new Color(153, 204, 255));
        newBatsmanContainer.add(newBatsmanField);

        newBatsmanButton = new JButton();
        newBatsmanButton.setBounds(290, 50, 60, 30);
        Image img = new ImageIcon(getClass().getResource("012.png")).getImage();
        Image reImage = img.getScaledInstance(newBatsmanButton.getWidth(),
                newBatsmanButton.getHeight(),
                Image.SCALE_SMOOTH);
        newBatsmanButton.setIcon(new ImageIcon(reImage));
        newBatsmanContainer.add(newBatsmanButton);

        newBatsmanButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (newBatsmanField.getText().trim().length() != 0) {
                    // BatsmanName[++batsmanNameIndex] = newBatsmanField.getText().trim();
                    if (batsmanActiveIndicate == 0) {
                        ActiveBatsman[0] = newBatsmanField.getText().trim();
                        strikerBatLabel.setText(ActiveBatsman[0] + "*");
                        nonStrikerBatLabel.setText(ActiveBatsman[1] + "");

                    } else {
                        ActiveBatsman[1] = newBatsmanField.getText().trim();
                        strikerBatLabel.setText(ActiveBatsman[1] + "*");
                        nonStrikerBatLabel.setText(ActiveBatsman[0] + "");
                    }
                    newBatsmanFrame.dispose();
                    // ScoreBoard();
                } else {
                    JOptionPane.showMessageDialog(null, " Player's name can't be empty",
                            "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        newBatsmanFrame.setVisible(true);
    }

    /////////////////////////////////////////////////////////
    public void bowlerNameAfterOver() {
        newBowlerFrame = new JFrame();
        newBowlerFrame.setTitle("Select Opening Players");
        newBowlerFrame.setBounds(500, 200, 400, 150);
        newBowlerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newBowlerFrame.setResizable(false);
        newBowlerFrame.setIconImage(newBowlerIcon.getImage());

        newBowlerContainer = newBowlerFrame.getContentPane();
        newBowlerContainer.setBackground(new Color(204, 255, 229));
        newBowlerContainer.setLayout(null);

        newBowlerNameLabel = new JLabel("New bowler");
        newBowlerNameLabel.setForeground(new Color(96, 96, 96));
        newBowlerNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        newBowlerNameLabel.setBounds(10, 10, 150, 50);
        newBowlerNameLabel.setBackground(Color.BLUE);
        newBowlerContainer.add(newBowlerNameLabel);

        newBowlerField = new JTextField();
        newBowlerField.setBounds(10, 50, 250, 30);
        newBowlerField.setForeground(new Color(96, 96, 96));
        newBowlerField.setFont(new Font("Arial", Font.BOLD, 15));
        newBowlerField.setBackground(new Color(153, 204, 255));
        newBowlerContainer.add(newBowlerField);

        newBowlerStarButton = new JButton();
        newBowlerStarButton.setBounds(290, 50, 60, 30);
        Image img = new ImageIcon(getClass().getResource("012.png")).getImage();
        Image reImage = img.getScaledInstance(newBowlerStarButton.getWidth(),
                newBowlerStarButton.getHeight(), Image.SCALE_SMOOTH);
        newBowlerStarButton.setIcon(new ImageIcon(reImage));
        newBowlerContainer.add(newBowlerStarButton);

        newBowlerStarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (newBowlerField.getText().trim().length() != 0) {
                    // BowlersName[++bowlerNameIndex] = newBowlerField.getText().trim();
                    bowlersInfo[++bowlerNameIndex][0] = newBowlerField.getText().trim();

                    chosenBowlerIndex = bowlerNameIndex;

                    bowlersInfo[chosenBowlerIndex][1] = "0";
                    bowlersInfo[chosenBowlerIndex][2] = "0";
                    bowlersInfo[chosenBowlerIndex][3] = "0";
                    bowlersInfo[chosenBowlerIndex][4] = "0";
                    bowlersInfo[chosenBowlerIndex][5] = "0";

                    bowlerNameLabel.setText(bowlersInfo[chosenBowlerIndex][0]);
                    numberOfOLabel.setText(bowlersInfo[chosenBowlerIndex][1]);
                    numberOFMLabel.setText(bowlersInfo[chosenBowlerIndex][2]);
                    numberOfRLabel.setText(bowlersInfo[chosenBowlerIndex][3]);
                    numberOfWLabel.setText(bowlersInfo[chosenBowlerIndex][4]);
                    numberOfERLabel.setText(bowlersInfo[chosenBowlerIndex][5]);

                    maidenOrNotRun = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                    maidenOrNotWicket = Integer.parseInt(bowlersInfo[chosenBowlerIndex][4]);

                    newBowlerFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, " Player's name can't be empty", "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        newBowlerFrame.setVisible(true);
    }
    ///////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    public void playerNamesAfterStart() {
        playerNameFrame = new JFrame();
        playerNameFrame.setTitle("Select Opening Players");
        playerNameFrame.setBounds(500, 200, 450, 350);
        playerNameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        playerNameFrame.setResizable(false);
        playerNameFrame.setIconImage(playerNameFrameIcon.getImage());

        playerNameContainer = playerNameFrame.getContentPane();
        playerNameContainer.setBackground(new Color(204, 255, 229));
        playerNameContainer.setLayout(null);

        strikerLabel = new JLabel("Striker");
        strikerLabel.setForeground(new Color(96, 96, 96));
        strikerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        strikerLabel.setBounds(10, 10, 150, 50);
        strikerLabel.setBackground(Color.BLUE);
        playerNameContainer.add(strikerLabel);

        strikerField = new JTextField();
        strikerField.setBounds(10, 50, 250, 30);
        strikerField.setForeground(new Color(96, 96, 96));
        strikerField.setFont(new Font("Arial", Font.BOLD, 15));
        strikerField.setBackground(new Color(153, 204, 255));
        playerNameContainer.add(strikerField);

        nonStrikerLabel = new JLabel("Non-striker");
        nonStrikerLabel.setForeground(new Color(96, 96, 96));
        nonStrikerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nonStrikerLabel.setBounds(10, 90, 150, 50);
        nonStrikerLabel.setBackground(Color.BLUE);
        playerNameContainer.add(nonStrikerLabel);

        nonStrikerField = new JTextField();
        nonStrikerField.setBounds(10, 130, 250, 30);
        nonStrikerField.setForeground(new Color(96, 96, 96));
        nonStrikerField.setFont(new Font("Arial", Font.BOLD, 15));
        nonStrikerField.setBackground(new Color(153, 204, 255));
        playerNameContainer.add(nonStrikerField);

        firstBowlerLabel = new JLabel("Bowler");
        firstBowlerLabel.setForeground(new Color(96, 96, 96));
        firstBowlerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        firstBowlerLabel.setBounds(10, 170, 150, 50);
        firstBowlerLabel.setBackground(Color.BLUE);
        playerNameContainer.add(firstBowlerLabel);

        firstBowlerField = new JTextField();
        firstBowlerField.setBounds(10, 210, 250, 30);
        firstBowlerField.setForeground(new Color(96, 96, 96));
        firstBowlerField.setFont(new Font("Arial", Font.BOLD, 15));
        firstBowlerField.setBackground(new Color(153, 204, 255));
        playerNameContainer.add(firstBowlerField);

        playerNameBackButton = new JButton();
        playerNameBackButton.setBounds(340, 260, 80, 35);
        Image img = new ImageIcon(getClass().getResource("013.png")).getImage();
        Image reImage = img.getScaledInstance(playerNameBackButton.getWidth(),
                playerNameBackButton.getHeight(), Image.SCALE_SMOOTH);
        // playerNameBackButton.setIcon(new ImageIcon(reImage));
        // playerNameContainer.add(playerNameBackButton);

        playerNameStartButton = new JButton();
        playerNameStartButton.setBounds(15, 260, 80, 35);
        img = new ImageIcon(getClass().getResource("012.png")).getImage();
        reImage = img.getScaledInstance(playerNameStartButton.getWidth(),
                playerNameStartButton.getHeight(), Image.SCALE_SMOOTH);
        playerNameStartButton.setIcon(new ImageIcon(reImage));
        playerNameContainer.add(playerNameStartButton);

        playerNameStartButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (strikerField.getText().trim().length() != 0 &&
                        nonStrikerField.getText().trim().length() != 0 &&
                        firstBowlerField.getText().trim().length() != 0) {
                    ActiveBatsman[0] = strikerField.getText().trim();
                    ActiveBatsman[1] = nonStrikerField.getText().trim();

                    bowlersInfo[++bowlerNameIndex][0] = firstBowlerField.getText().trim();
                    chosenBowlerIndex = bowlerNameIndex;

                    bowlersInfo[chosenBowlerIndex][1] = "0";
                    bowlersInfo[chosenBowlerIndex][2] = "0";
                    bowlersInfo[chosenBowlerIndex][3] = "0";
                    bowlersInfo[chosenBowlerIndex][4] = "0";
                    bowlersInfo[chosenBowlerIndex][5] = "0";

                    maidenOrNotRun = Integer.parseInt(bowlersInfo[chosenBowlerIndex][3]);
                    maidenOrNotWicket = Integer.parseInt(bowlersInfo[chosenBowlerIndex][4]);

                    playerNameFrame.dispose();
                    ScoreBoard();
                } else {
                    JOptionPane.showMessageDialog(null, " Player's name can't be empty", "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        // playerNameBackButton.addActionListener(new ActionListener() {

        // @Override
        // public void actionPerformed(ActionEvent e) {
        // bowlersInfo[bowlerNameIndex--][0] = null;
        // playerNameFrame.dispose();
        // toGameInformation();
        // }

        // });

        playerNameFrame.setVisible(true);
    }

    ///////////////////////////////////////////////////////
    public void toGameInformation() {
        startFrame = new JFrame();
        startFrame.setTitle(" Team");
        startFrame.setBounds(450, 100, 350, 500);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setResizable(false);
        startFrame.setIconImage(startFrameIcon.getImage());

        startContainer = startFrame.getContentPane();
        startContainer.setBackground(new Color(204, 255, 229));
        startContainer.setLayout(null);

        hostLabel = new JLabel("Host Team");
        hostLabel.setForeground(new Color(96, 96, 96));
        hostLabel.setFont(new Font("Arial", Font.BOLD, 15));
        hostLabel.setBounds(10, 10, 150, 50);
        hostLabel.setBackground(Color.BLUE);
        startContainer.add(hostLabel);

        hostField = new JTextField();
        hostField.setBounds(10, 50, 250, 30);
        hostField.setForeground(new Color(96, 96, 96));
        hostField.setFont(new Font("Arial", Font.BOLD, 15));
        hostField.setBackground(new Color(153, 204, 255));
        startContainer.add(hostField);

        visitorLabel = new JLabel("Visitor Team");
        visitorLabel.setForeground(new Color(96, 96, 96));
        visitorLabel.setFont(new Font("Arial", Font.BOLD, 15));
        visitorLabel.setBounds(10, 90, 150, 50);
        visitorLabel.setBackground(Color.BLUE);
        startContainer.add(visitorLabel);

        visitorField = new JTextField();
        visitorField.setBounds(10, 130, 250, 30);
        visitorField.setForeground(new Color(96, 96, 96));
        visitorField.setFont(new Font("Arial", Font.BOLD, 15));
        visitorField.setBackground(new Color(153, 204, 255));
        startContainer.add(visitorField);

        batOrBallLabel = new JLabel("Host team Opted to ?");
        batOrBallLabel.setForeground(new Color(96, 96, 96));
        batOrBallLabel.setFont(new Font("Arial", Font.BOLD, 15));
        batOrBallLabel.setBounds(10, 180, 150, 50);
        startContainer.add(batOrBallLabel);

        batOption = new JCheckBox("Bat");
        batOption.setForeground(new Color(96, 96, 96));
        batOption.setFont(new Font("Arial", Font.BOLD, 15));
        batOption.setBounds(10, 220, 50, 50);
        batOption.setBackground(new Color(204, 255, 229));
        batOption.setSelected(true);
        startContainer.add(batOption);
        groupBarOrBall.add(batOption);

        ballOption = new JCheckBox("Ball");
        ballOption.setForeground(new Color(96, 96, 96));
        ballOption.setFont(new Font("Arial", Font.BOLD, 15));
        ballOption.setBounds(70, 220, 80, 50);
        ballOption.setBackground(new Color(204, 255, 229));
        startContainer.add(ballOption);
        groupBarOrBall.add(ballOption);

        overLabel = new JLabel("Overs ?");
        overLabel.setForeground(new Color(96, 96, 96));
        overLabel.setFont(new Font("Arial", Font.BOLD, 15));
        overLabel.setBounds(10, 300, 150, 50);
        overLabel.setBackground(new Color(204, 255, 229));
        startContainer.add(overLabel);

        oversSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        oversSpinner.setBounds(20, 350, 40, 35);
        oversSpinner.setFont(new Font("Arial", Font.BOLD, 20));
        oversSpinner.setBackground(new Color(204, 255, 229));
        startContainer.add(oversSpinner);

        starButton = new JButton();
        starButton.setBounds(220, 380, 90, 40);
        Image img = startIconButton.getImage();
        Image reImage = img.getScaledInstance(starButton.getWidth(),
                starButton.getHeight(), Image.SCALE_SMOOTH);
        starButton.setIcon(new ImageIcon(reImage));
        startContainer.add(starButton);

        Handler handle = new Handler();
        starButton.addActionListener(handle);

        startFrame.setVisible(true);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String spinerValue = oversSpinner.getValue().toString();
            if (hostField.getText().trim().length() != 0 &&
                    visitorField.getText().trim().length() != 0 && (ballOption.isSelected() ||
                            batOption.isSelected())
                    && Integer.parseInt(spinerValue) != 0) {
                teamNames[0] = hostField.getText();
                teamNames[1] = visitorField.getText();
                inputOverFromTheSpiner = Integer.parseInt(spinerValue);

                if (batOption.isSelected()) {
                    firstBattingTeam = teamNames[0];
                } else {
                    firstBattingTeam = teamNames[1];
                }
                startFrame.dispose();
                playerNamesAfterStart();
            } else {
                JOptionPane.showMessageDialog(null, "Give all information or Select at least one Over",
                        "Give all information", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }

    //////////////////////////////////////////////////////////////////////
    public void toLogInFame() {
        logInFrame = new JFrame();
        logInFrame.setTitle("Log-In Cricket Score Management");
        logInFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        logInFrame.setBounds(350, 100, 700, 500);
        logInFrame.setIconImage(logInFrameIcon.getImage());
        logInFrame.setResizable(false);

        logInContainer = logInFrame.getContentPane();
        logInContainer.setLayout(null);
        logInContainer.setBackground(new Color(102, 178, 255));

        logInNameLabel = new JLabel("Log In");
        logInNameLabel.setFont(new Font("Arial", Font.BOLD, 45));
        logInNameLabel.setBounds(290, 30, 150, 50);
        logInNameLabel.setForeground(new Color(0, 0, 102));
        logInNameLabel.setVisible(false);// *<----- */
        logInContainer.add(logInNameLabel);

        logInPanel = new JPanel();
        logInPanel.setBounds(0, 100, 700, 200);
        logInPanel.setBackground(new Color(0, 128, 255));

        Image inImg = logInPanelIcon.getImage();
        Image reImg = inImg.getScaledInstance(250, 180, Image.SCALE_SMOOTH);
        logInPanelIcon = new ImageIcon(reImg);

        logInPanelLabel = new JLabel(logInPanelIcon);
        logInPanel.add(logInPanelLabel);
        logInPanel.setVisible(false);// *<----*/
        logInContainer.add(logInPanel);

        userNameLabel = new JLabel("User Name ");
        userNameLabel.setBounds(30, 330, 120, 50);
        userNameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        userNameLabel.setForeground(new Color(0, 0, 102));
        userNameLabel.setVisible(false);/* <---- */
        logInContainer.add(userNameLabel);

        logInUserField = new JTextField();
        logInUserField.setBounds(150, 340, 200, 30);
        logInUserField.setFont(new Font("Arial", Font.BOLD, 18));
        logInUserField.setForeground(new Color(0, 0, 102));
        logInUserField.setBackground(new Color(0, 128, 255));
        logInUserField.setHorizontalAlignment(JTextField.CENTER);
        logInUserField.setVisible(false);/* <---- */
        logInContainer.add(logInUserField);

        passLabel = new JLabel("Password ");
        passLabel.setBounds(30, 390, 120, 50);
        passLabel.setFont(new Font("Arial", Font.BOLD, 18));
        passLabel.setForeground(new Color(0, 0, 102));
        passLabel.setVisible(false);/* <--- */
        logInContainer.add(passLabel);

        logINPassword = new JPasswordField();
        logINPassword.setBounds(150, 400, 200, 30);
        logINPassword.setFont(new Font("Arial", Font.BOLD, 18));
        logINPassword.setForeground(new Color(0, 0, 102));
        logINPassword.setBackground(new Color(0, 128, 255));
        logINPassword.setHorizontalAlignment(JTextField.CENTER);
        logINPassword.setEchoChar('$');
        logINPassword.setVisible(false);/* <--- */
        logInContainer.add(logINPassword);

        logInShowOption = new JCheckBox("Show");
        logInShowOption.setBounds(370, 400, 80, 30);
        logInShowOption.setFont(new Font("Arial", Font.BOLD, 15));
        logInShowOption.setForeground(new Color(0, 0, 102));
        logInShowOption.setBackground(new Color(0, 128, 255));
        logInShowOption.setVisible(false);/* <--- */
        logInContainer.add(logInShowOption);

        inImg = logInIcon.getImage();
        reImg = inImg.getScaledInstance(140, 40, Image.SCALE_SMOOTH);
        logInIcon = new ImageIcon(reImg);
        logInSubmitButton = new JButton();
        logInSubmitButton.setIcon(logInIcon);
        logInSubmitButton.setBounds(520, 400, logInIcon.getIconWidth() - 5,
                logInIcon.getIconHeight() - 5);
        logInSubmitButton.setVisible(false);/* <--- */
        logInContainer.add(logInSubmitButton);

        logInSubmitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String enteredUsername = logInUserField.getText().trim();
                String enteredPassword = new String(logINPassword.getPassword());
                if (enteredUsername.length() != 0 && enteredPassword.length() != 0) {
                    if (enteredUsername.equals(logInUserName) &&
                            enteredPassword.equals(logInPassword)) {
                        logInFrame.dispose();
                        toGameInformation();
                    } else {
                        JOptionPane.showMessageDialog(null, "You have entered wrong Username or Password", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter Username and Password",
                            "Username and password",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        logInShowOption.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (logInShowOption.isSelected()) {
                    logINPassword.setEchoChar((char) 0);
                } else {
                    logINPassword.setEchoChar('$');

                }
            }

        });

        /* Loading components */
        JLabel LoadingLabe = new JLabel("Loading");
        LoadingLabe.setBounds(120, 100, 250, 70);
        LoadingLabe.setForeground(new Color(0, 80, 102));
        LoadingLabe.setFont(new Font("Arial", Font.ITALIC, 50));
        logInContainer.add(LoadingLabe);

        String name = "Cricket Score Management";
        JLabel LoadingNameLabe = new JLabel();
        LoadingNameLabe.setBounds(130, 160, 400, 70);
        LoadingNameLabe.setForeground(new Color(0, 102, 100));
        LoadingNameLabe.setFont(new Font("Arial", Font.BOLD, 30));
        LoadingNameLabe.setVisible(false);
        logInContainer.add(LoadingNameLabe);

        logInFrame.setVisible(true);
        try {
            for (int i = 1; i <= 2; i++) {
                if (i <= 2) {

                    for (int j = 1; j <= 4; j++) {
                        String str = LoadingLabe.getText();
                        Thread.sleep(800);
                        LoadingLabe.setText(str + " .");
                    }
                    LoadingLabe.setText("Loading");
                }

            }
        } catch (Exception e) {

        }

        try {
            for (int j = 1; j <= 3; j++) {

                LoadingLabe.setText("");
                Thread.sleep(400);
                LoadingLabe.setText("Loading");
                Thread.sleep(400);
            }
            Thread.sleep(500);

        } catch (Exception e) {

        }
        LoadingLabe.setVisible(false);
        LoadingNameLabe.setVisible(true);

        String strN = "";
        try {
            for (int i = 0; i < name.length(); i++) {
                strN = strN + name.charAt(i);
                LoadingNameLabe.setText(strN);
                Thread.sleep(100);
            }
            Thread.sleep(1000);
            LoadingNameLabe.setVisible(false);
            Thread.sleep(500);
        } catch (Exception e) {

        }

        logInNameLabel.setVisible(true);
        logInPanel.setVisible(true);
        userNameLabel.setVisible(true);
        logInUserField.setVisible(true);
        passLabel.setVisible(true);
        logINPassword.setVisible(true);
        logInShowOption.setVisible(true);
        logInSubmitButton.setVisible(true);

    }

    public static void main(String[] args) {

        ScoreManagementSystem ob = new ScoreManagementSystem();
        ob.toLogInFame();
        // ob.playerNamesAfterStart();
        // ob.bowlerNameAfterOver();
        // ob.bowlerChoice();
        // ob.batsmanNameAfterOut();
        // ob.ScoreBoard();
        // ob.partnerShip();
        // ob.toTextAreaForSeeExtraRuns();

    }
}