import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class partnerShipComponents {

    AllMethodComponents object;

    void partnerShip(AllMethodComponents ob) {
        object = ob;

        try {
            object.partnerShipFrame = new JFrame("Partnership");
            object.partnerShipFrame.setIconImage(new ImageIcon(getClass().getResource("011.png")).getImage());
            object.partnerShipFrame.setBounds(400, 200, 600, 150);
            object.partnerShipFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            object.partnerShipFrame.setResizable(false);

            object.partnerShipContainer = object.partnerShipFrame.getContentPane();
            object.partnerShipContainer.setLayout(null);
            object.partnerShipContainer.setBackground(Color.WHITE);

            String partnerShipTableHead[] = { "Striker", "Run", "Ball", "Non-Striker", "Run", "Ball", "Partnership",
                    "Balls" };

            String partnerShipInfoRow[][] = new String[1][8];
            partnerShipInfoRow[0][0] = object.ActiveBatsman[0];
            partnerShipInfoRow[0][1] = String.valueOf(object.runOfStrikerBatsman);
            partnerShipInfoRow[0][2] = String.valueOf(object.ballPlayedByStrikerBatsman);

            partnerShipInfoRow[0][3] = object.ActiveBatsman[1];
            partnerShipInfoRow[0][4] = String.valueOf(object.runOfNonStrikerBatsman);
            partnerShipInfoRow[0][5] = String.valueOf(object.ballPlayedByNonStrikerBatsman);

            partnerShipInfoRow[0][6] = String.valueOf(object.PartnershipRun);
            partnerShipInfoRow[0][7] = String.valueOf(object.partnershipBalls);

            object.TableForPartnership = new JTable(partnerShipInfoRow, partnerShipTableHead);

            object.TableForPartnership.setFont(new Font("Arial", Font.BOLD, 15));
            object.TableForPartnership.setForeground(Color.LIGHT_GRAY);

            JScrollPane tableScroll = new JScrollPane(object.TableForPartnership);
            tableScroll.setBounds(0, 0, 600, 150);

            object.partnerShipContainer.add(tableScroll);
            object.partnerShipFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
