import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class bowlerChoiceAllComponents {

    BowlerNameComponents bOb = new BowlerNameComponents();
    AllMethodComponents object;

    void bowlerChoice(AllMethodComponents ob) {
        object = ob;

        try {
            object.bowlerChoiceFrame = new JFrame();
            object.bowlerChoiceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            object.bowlerChoiceFrame.setTitle("Choice a new Bowler");
            object.bowlerChoiceFrame.setIconImage(object.bowlerChoiceIcon.getImage());
            object.bowlerChoiceFrame.setBounds(500, 100, 300, 500);
            object.bowlerChoiceFrame.setResizable(false);

            object.bowlerChoiceContainer = object.bowlerChoiceFrame.getContentPane();
            object.bowlerChoiceContainer.setBackground(new Color(204, 255, 229));
            object.bowlerChoiceContainer.setLayout(null);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler1 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler1 = new JButton(object.bowlersInfo[0][0]);

            }
            object.buttonBowler1.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler1.setBackground(new Color(0, 204, 204));
            object.buttonBowler1.setBounds(10, 10, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler1);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler2 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler2 = new JButton(object.bowlersInfo[1][0]);

            }
            object.buttonBowler2.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler2.setBackground(new Color(0, 204, 204));
            object.buttonBowler2.setVisible(true);
            object.buttonBowler2.setBounds(160, 10, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler2);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler3 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler3 = new JButton(object.bowlersInfo[2][0]);

            }
            object.buttonBowler3.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler3.setBackground(new Color(0, 204, 204));
            object.buttonBowler3.setVisible(true);
            object.buttonBowler3.setBounds(10, 50, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler3);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler4 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler4 = new JButton(object.bowlersInfo[3][0]);

            }
            object.buttonBowler4.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler4.setBackground(new Color(0, 204, 204));
            object.buttonBowler4.setVisible(true);
            object.buttonBowler4.setBounds(160, 50, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler4);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler5 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler5 = new JButton(object.bowlersInfo[4][0]);

            }
            object.buttonBowler5.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler5.setBackground(new Color(0, 204, 204));
            object.buttonBowler5.setVisible(true);
            object.buttonBowler5.setBounds(10, 90, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler5);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler6 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler6 = new JButton(object.bowlersInfo[5][0]);

            }
            object.buttonBowler6.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler6.setBackground(new Color(0, 204, 204));
            object.buttonBowler6.setVisible(true);
            object.buttonBowler6.setBounds(160, 90, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler6);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler7 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler7 = new JButton(object.bowlersInfo[6][0]);

            }
            object.buttonBowler7.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler7.setBackground(new Color(0, 204, 204));
            object.buttonBowler7.setVisible(true);
            object.buttonBowler7.setBounds(10, 130, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler7);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler8 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler8 = new JButton(object.bowlersInfo[7][0]);

            }
            object.buttonBowler8.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler8.setBackground(new Color(0, 204, 204));
            object.buttonBowler8.setVisible(true);
            object.buttonBowler8.setBounds(160, 130, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler8);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler9 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler9 = new JButton(object.bowlersInfo[8][0]);

            }
            object.buttonBowler9.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler9.setBackground(new Color(0, 204, 204));
            object.buttonBowler9.setVisible(true);
            object.buttonBowler9.setBounds(10, 170, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler9);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler10 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler10 = new JButton(object.bowlersInfo[10][0]);

            }
            object.buttonBowler10.setBackground(new Color(0, 204, 204));
            object.buttonBowler10.setVisible(true);
            object.buttonBowler10.setBounds(160, 170, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler10);

            if (object.bowlerNameIndex == -1) {

                object.buttonBowler11 = new JButton(object.bowlersInfo[0][0] = "");
            } else {
                object.buttonBowler11 = new JButton(object.bowlersInfo[10][0]);

            }
            object.buttonBowler11.setFont(new Font("Arial", Font.BOLD, 10));
            object.buttonBowler11.setBackground(new Color(0, 204, 204));
            object.buttonBowler11.setVisible(true);
            object.buttonBowler11.setBounds(10, 210, 110, 30);
            object.bowlerChoiceContainer.add(object.buttonBowler11);

            JLabel orLabel = new JLabel("OR");
            orLabel.setFont(new Font("Arial", Font.BOLD, 20));
            orLabel.setBounds(120, 260, 100, 50);
            orLabel.setForeground(new Color(128, 128, 128));
            object.bowlerChoiceContainer.add(orLabel);

            object.addNewBowlerButton = new JButton("Add new Bowler");
            object.addNewBowlerButton.setBounds(70, 320, 140, 30);
            object.addNewBowlerButton.setBackground(new Color(153, 204, 255));
            object.bowlerChoiceContainer.add(object.addNewBowlerButton);

            object.addNewBowlerButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    object.bowlerChoiceFrame.dispose();
                    bOb.bowlerNameAfterOver(object);
                }

            });

            object.buttonBowler1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    object.chosenBowlerIndex = 0;
                    setBowlerCase();
                }

            });
            object.buttonBowler2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.bowlerNameIndex < 1) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {
                        object.chosenBowlerIndex = 1;
                        setBowlerCase();

                    }
                }

            });
            object.buttonBowler3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.bowlerNameIndex < 2) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {

                        object.chosenBowlerIndex = 2;
                        setBowlerCase();
                    }
                }

            });
            object.buttonBowler4.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (object.bowlerNameIndex < 3) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {

                        object.chosenBowlerIndex = 3;
                        setBowlerCase();
                    }
                }

            });
            object.buttonBowler5.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.bowlerNameIndex < 4) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {

                        object.chosenBowlerIndex = 4;
                        setBowlerCase();
                    }
                }

            });
            object.buttonBowler6.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.bowlerNameIndex < 5) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {

                        object.chosenBowlerIndex = 5;
                        setBowlerCase();
                    }
                }

            });
            object.buttonBowler7.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (object.bowlerNameIndex < 6) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {
                        object.chosenBowlerIndex = 6;
                        setBowlerCase();
                    }
                }

            });
            object.buttonBowler8.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (object.bowlerNameIndex < 7) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {
                        object.chosenBowlerIndex = 7;
                        setBowlerCase();
                    }
                }

            });
            object.buttonBowler9.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (object.bowlerNameIndex < 8) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {
                        object.chosenBowlerIndex = 8;
                        setBowlerCase();
                    }
                }

            });
            object.buttonBowler10.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.bowlerNameIndex < 9) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {
                        object.chosenBowlerIndex = 9;
                        setBowlerCase();
                    }
                }

            });
            object.buttonBowler11.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (object.bowlerNameIndex < 10) {
                        JOptionPane.showMessageDialog(null, "Add more bowlers", "Not enough bowlers",
                                JOptionPane.ERROR_MESSAGE);

                    } else {

                        object.chosenBowlerIndex = 10;
                        setBowlerCase();
                    }
                }

            });

            object.bowlerChoiceFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private void setBowlerCase() {
        try {

            object.bowlerChoiceFrame.dispose();
            object.bowlerNameLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][0]);
            object.numberOfOLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][1]);
            object.numberOFMLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][2]);
            object.numberOfRLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][3]);
            object.numberOfWLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][4]);
            object.numberOfERLabel.setText(object.bowlersInfo[object.chosenBowlerIndex][5]);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}