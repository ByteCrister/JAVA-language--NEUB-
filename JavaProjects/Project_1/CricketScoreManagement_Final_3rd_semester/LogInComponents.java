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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LogInComponents {
    NamesAfterLogIn toGameInformationObject = new NamesAfterLogIn();

    public void toLogInFame(AllMethodComponents object) {

        // object.HistoryStoreIn.push(ob);
        // object = object.HistoryStoreIn.peek();

        try {
            object.logInFrame = new JFrame();
            object.logInFrame.setTitle("Log-In Cricket Score Management");
            object.logInFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            object.logInFrame.setBounds(350, 100, 700, 500);
            object.logInFrame.setIconImage(object.logInFrameIcon.getImage());
            object.logInFrame.setResizable(false);

            object.logInContainer = object.logInFrame.getContentPane();
            object.logInContainer.setLayout(null);
            object.logInContainer.setBackground(new Color(102, 178, 255));

            object.logInNameLabel = new JLabel("Log In");
            object.logInNameLabel.setFont(new Font("Arial", Font.BOLD, 45));
            object.logInNameLabel.setBounds(290, 30, 150, 50);
            object.logInNameLabel.setForeground(new Color(0, 0, 102));
            object.logInNameLabel.setVisible(false);// *<----- */
            object.logInContainer.add(object.logInNameLabel);

            object.logInPanel = new JPanel();
            object.logInPanel.setBounds(0, 100, 700, 200);
            object.logInPanel.setBackground(new Color(0, 128, 255));

            Image inImg = object.logInPanelIcon.getImage();
            Image reImg = inImg.getScaledInstance(250, 180, Image.SCALE_SMOOTH);
            object.logInPanelIcon = new ImageIcon(reImg);

            object.logInPanelLabel = new JLabel(object.logInPanelIcon);
            object.logInPanel.add(object.logInPanelLabel);
            object.logInPanel.setVisible(false);// *<----*/
            object.logInContainer.add(object.logInPanel);

            object.userNameLabel = new JLabel("User Name ");
            object.userNameLabel.setBounds(30, 330, 120, 50);
            object.userNameLabel.setFont(new Font("Arial", Font.BOLD, 18));
            object.userNameLabel.setForeground(new Color(0, 0, 102));
            object.userNameLabel.setVisible(false);/* <---- */
            object.logInContainer.add(object.userNameLabel);

            object.logInUserField = new JTextField();
            object.logInUserField.setBounds(150, 340, 200, 30);
            object.logInUserField.setFont(new Font("Arial", Font.BOLD, 18));
            object.logInUserField.setForeground(new Color(0, 0, 102));
            object.logInUserField.setBackground(new Color(0, 128, 255));
            object.logInUserField.setHorizontalAlignment(JTextField.CENTER);
            object.logInUserField.setVisible(false);/* <---- */
            object.logInContainer.add(object.logInUserField);

            object.passLabel = new JLabel("Password ");
            object.passLabel.setBounds(30, 390, 120, 50);
            object.passLabel.setFont(new Font("Arial", Font.BOLD, 18));
            object.passLabel.setForeground(new Color(0, 0, 102));
            object.passLabel.setVisible(false);/* <--- */
            object.logInContainer.add(object.passLabel);

            object.logINPassword = new JPasswordField();
            object.logINPassword.setBounds(150, 400, 200, 30);
            object.logINPassword.setFont(new Font("Arial", Font.BOLD, 18));
            object.logINPassword.setForeground(new Color(0, 0, 102));
            object.logINPassword.setBackground(new Color(0, 128, 255));
            object.logINPassword.setHorizontalAlignment(JTextField.CENTER);
            object.logINPassword.setEchoChar('$');
            object.logINPassword.setVisible(false);/* <--- */
            object.logInContainer.add(object.logINPassword);

            object.logInShowOption = new JCheckBox("Show");
            object.logInShowOption.setBounds(370, 400, 80, 30);
            object.logInShowOption.setFont(new Font("Arial", Font.BOLD, 15));
            object.logInShowOption.setForeground(new Color(0, 0, 102));
            object.logInShowOption.setBackground(new Color(0, 128, 255));
            object.logInShowOption.setVisible(false);/* <--- */
            object.logInContainer.add(object.logInShowOption);

            inImg = object.logInIcon.getImage();
            reImg = inImg.getScaledInstance(140, 40, Image.SCALE_SMOOTH);
            object.logInIcon = new ImageIcon(reImg);
            object.logInSubmitButton = new JButton();
            object.logInSubmitButton.setIcon(object.logInIcon);
            object.logInSubmitButton.setBounds(520, 400, object.logInIcon.getIconWidth() - 5,
                    object.logInIcon.getIconHeight() - 5);
            object.logInSubmitButton.setVisible(false);/* <--- */
            object.logInContainer.add(object.logInSubmitButton);

            object.logInSubmitButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    String enteredUsername = object.logInUserField.getText().trim();
                    String enteredPassword = new String(object.logINPassword.getPassword());
                    if (enteredUsername.length() != 0 && enteredPassword.length() != 0) {
                        if (enteredUsername.equals(object.logInUserName) &&
                                enteredPassword.equals(object.logInPassword)) {
                            object.logInFrame.dispose();
                            toGameInformationObject.toGameInformation(object);/*<----- */
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

            object.logInShowOption.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.logInShowOption.isSelected()) {
                        object.logINPassword.setEchoChar((char) 0);
                    } else {
                        object.logINPassword.setEchoChar('$');

                    }
                }

            });

            /* Loading components */
            JLabel LoadingLabe = new JLabel("Loading");
            LoadingLabe.setBounds(120, 100, 300, 70);
            LoadingLabe.setForeground(new Color(0, 80, 102));
            LoadingLabe.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 50));
            object.logInContainer.add(LoadingLabe);

            String name = "Cricket  Score  Management";
            JLabel LoadingNameLabe = new JLabel();
            LoadingNameLabe.setBounds(130, 160, 450, 70);
            LoadingNameLabe.setForeground(new Color(0, 102, 100));
            LoadingNameLabe.setFont(new Font("Serif", Font.BOLD, 35));
            LoadingNameLabe.setVisible(false);
            object.logInContainer.add(LoadingNameLabe);

            object.logInFrame.setVisible(true);
            try {
                for (int i = 1; i <= 2; i++) {
                    
                    for (int j = 1; j <= 4; j++) {
                        String str = LoadingLabe.getText();
                        Thread.sleep(800);
                        LoadingLabe.setText(str + " .");
                    }
                    if (i <= 2) {

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

            object.logInNameLabel.setVisible(true);
            object.logInPanel.setVisible(true);
            object.userNameLabel.setVisible(true);
            object.logInUserField.setVisible(true);
            object.passLabel.setVisible(true);
            object.logINPassword.setVisible(true);
            object.logInShowOption.setVisible(true);
            object.logInSubmitButton.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }

}