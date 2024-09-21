import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

class ExtraRunComponents {
    AllMethodComponents object;

    void toTextAreaForSeeExtraRuns(AllMethodComponents ob) {

        object = ob;

        try {
            object.extraRunFrame = new JFrame();
            object.extraRunFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            object.extraRunFrame.setTitle("Extra runs");
            object.extraRunFrame.setBounds(420, 200, 400, 200);

            ImageIcon extraRunFrameIcon = new ImageIcon(getClass().getResource("011.png"));
            object.extraRunFrame.setIconImage(extraRunFrameIcon.getImage());

            object.extraRunContainer = object.extraRunFrame.getContentPane();
            object.extraRunContainer.setLayout(null);

            object.extraRunScroll = new JScrollPane(object.extraRunTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            object.extraRunScroll.setBounds(0, 0, 400, 200);
            object.extraRunContainer.add(object.extraRunScroll);

            object.extraRunFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}