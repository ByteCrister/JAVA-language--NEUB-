
import java.awt.Container;
import java.util.Stack;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class AllFrameWorkComponents {

        // ************************* All Score Board Components *****************/
        protected Stack<AllMethodComponents> HistoryStoreIn = new Stack<>();
        protected Stack<AllMethodComponents> ForwardHistory = new Stack<>();

        protected String teamNames[] = new String[2],
                        ActiveBatsman[] = new String[2],
                        firstBattingTeam, secondBattingTeam;

        protected boolean isChangeOfInnings = false;

        protected String bowlersInfo[][] = new String[11][6];

        protected int previousOver = 0, currentOver = 0;

        protected int batsmanActiveIndicate = 0, bowlerNameIndex = -1, batsmanNameIndex = 0, inningsIndicate = 1;

        protected int CRR, RR, maidenOrNotRun = 0, maidenOrNotWicket = 0;

        protected int numberOfOvers, inputOverFromTheSpiner, numberOfBalls = 0, runOfStrikerBatsman = 0,
                        runOfNonStrikerBatsman = 0, PartnershipRun = 0, partnershipBalls = 0,
                        extraRun = 0, totalRuns = 0, numberOF4sOfStrikerBatsman = 0, number4sOfNonStrikerBatsman = 0,
                        numberOF6sOfStrikerBatsman = 0, number6sOfNonStrikerBatsman = 0, target = 0,
                        ballPlayedByStrikerBatsman = 0, ballPlayedByNonStrikerBatsman = 0;

        protected int numberOfSROfNonStrikerBatsman = 0, numberOfSROfStrikerBatsman = 0;

        protected int wideRun = 0, noBallRun = 0, byesRun = 0, legByesRun = 0, numberOfWickets = 0;

        protected JFrame scoreBoardFrame;
        protected Container scoreBOardContainer;
        protected ImageIcon scoreBoardFrameIcon = new ImageIcon(getClass().getResource("011.png"));
        protected JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7;
        protected JTextArea OverArea;

        protected JLabel strikerBatLabel, nonStrikerBatLabel, strikerBatRunLabel,
                        nonstrikerBatRunLabel, strikerBatBallLabel, nonstrikerBatBallLabel,
                        strikerBat4sLabel, nonstrikerBat4sLabel, strikerBat6sLabel,
                        nonstrikerBat6sLabel, strikerBatSRLabel, nonstrikerBatSRLabel;

        protected JPanel strikerBatPanel, nonStrikerBatPanel, strikerBatRunPanel,
                        nonstrikerBatRunPanel, strikerBatBallPanel, nonstrikerBatBallPanel,
                        strikerBat4sPanel, nonstrikerBat4sPanel, strikerBat6sPanel,
                        nonstrikerBat6sPanel, strikerBatSRPanel, nonstrikerBatSRPanel;

        protected JPanel batsmanPanel, panelR, panelB, panel4s, panel6s, panelSR;
        protected JLabel batsmanLabel, labelR, labelB, label4s, label6s, labelSR;

        protected JPanel teamNamePanel, scorePanel, ballsPanel, crrPanel,
                        crrNumberPanel, targetPanel, targetNumberPanel, rrPanel, rrNumberPanel;
        protected JLabel teamNameLabel, scoreLabel, ballsLabel,
                        crrLabel, crrNumberLabel, targetLabel, targetNumberLabel, rrNumberLabel,
                        rrLabel;

        protected JButton wideButton, noBallButton, byesButton, legByesButton,
                        wicketButton;
        protected JButton button0, button1, button2, button3, button4, button5,
                        button6;
        protected JButton retireButton, swapButton, ExtrasButton, PartnerShipButton,
                        plusRunButton, undoRunButton, backButton, forwardButton;

        protected JLabel bowlerLabel, bowlerOLabel, bowlerMLabel, bowlerRLabel,
                        bowlerWLabel, bowlerERLabel;
        protected JPanel bowlerPanel, bowlerOPanel, bowlerMPanel, bowlerRPanel,
                        bowlerWPanel, bowlerERPanel;

        protected JLabel bowlerNameLabel, numberOfOLabel, numberOFMLabel,
                        numberOfRLabel, numberOfWLabel, numberOfERLabel;
        protected JPanel bowlerNamePanel, numberOfOPanel, numberOFMPanel,
                        numberOfRPanel, numberOfWPanel, numberOfERPanel;
        // ________________________________________________________________________

        // ************************ partnerShip **************************/
        protected JFrame partnerShipFrame;
        protected Container partnerShipContainer;
        protected JTable TableForPartnership;

        // __________________________________________________________________________

        // ************Log-in Frame components *************/
        protected Container logInContainer;
        protected JFrame logInFrame;
        protected JPanel logInPanel;
        protected JTextField logInUserField;
        protected JPasswordField logINPassword;
        protected JCheckBox logInShowOption;
        protected JButton logInSubmitButton;
        protected JLabel logInNameLabel, logInPanelLabel, passLabel, userNameLabel;
        protected ImageIcon logInIcon = new ImageIcon(getClass().getResource("login.png")),
                        logInFrameIcon = new ImageIcon(getClass().getResource("011.png")),
                        logInPanelIcon = new ImageIcon(getClass().getResource("001.png"));
        protected final String logInPassword = "1234", logInUserName = "admin";
        // _________________________________________________________________________

        // ****************** Game start components **********************/
        protected JFrame startFrame;
        protected Container startContainer;
        protected JLabel hostLabel, visitorLabel, batOrBallLabel, overLabel;
        protected JTextField hostField, visitorField;
        protected JCheckBox batOption, ballOption;
        protected ButtonGroup groupBarOrBall = new ButtonGroup();
        protected JSpinner oversSpinner;
        protected JButton starButton;
        protected ImageIcon startIconButton = new ImageIcon(getClass().getResource("012.png")),
                        startFrameIcon = new ImageIcon(getClass().getResource("011.png"));
        // ________________________________________________________________________

        // ***************** Players Name after Start *****************/
        protected JFrame playerNameFrame;
        protected Container playerNameContainer;
        protected JLabel strikerLabel, nonStrikerLabel, firstBowlerLabel;
        protected JTextField strikerField, nonStrikerField, firstBowlerField;
        protected JButton playerNameStartButton, playerNameBackButton;
        protected ImageIcon playerNameFrameIcon = new ImageIcon(getClass().getResource("011.png"));
        // _________________________________________________________________________

        // ********************* Bowler name after Over **********************/
        protected JFrame newBowlerFrame;
        protected Container newBowlerContainer;
        protected JLabel newBowlerNameLabel;
        protected JTextField newBowlerField;
        protected JButton newBowlerStarButton;
        protected ImageIcon newBowlerIcon = new ImageIcon(getClass().getResource("011.png"));
        // __________________________________________________________________________

        // ********************* Batsman name after Out **********************/
        protected JFrame newBatsmanFrame;
        protected Container newBatsmanContainer;
        protected JLabel newBatsmanLabel;
        protected JTextField newBatsmanField;
        protected JButton newBatsmanButton;
        protected ImageIcon newBatsmanIcon = new ImageIcon(getClass().getResource("011.png"));
        // ___________________________________________________________________________

        /********************* Bowler choice components ******************/
        protected JFrame bowlerChoiceFrame;
        protected Container bowlerChoiceContainer;
        protected ImageIcon bowlerChoiceIcon = new ImageIcon(getClass().getResource("011.png"));
        protected JButton buttonBowler1, buttonBowler2, buttonBowler3, buttonBowler4, buttonBowler5, buttonBowler6,
                        buttonBowler7, buttonBowler8, buttonBowler9, buttonBowler10, buttonBowler11;
        protected JButton addNewBowlerButton;
        protected int chosenBowlerIndex = 0;
        // ______________________________________________________________________________________

        /********************** Extra run text field components ***********************/
        protected JFrame extraRunFrame;
        protected Container extraRunContainer;
        protected JTextArea extraRunTextArea;
        protected JScrollPane extraRunScroll;
}