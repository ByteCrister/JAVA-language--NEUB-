import javax.swing.JOptionPane;

public class showConfirmDialog1 {
    public static void main(String[] args) {

        int optionResult = JOptionPane.showOptionDialog( null, "Do you want to Quit?", "Yes or No", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null); // Default option, here "Yes"
        // JOptionPane.showOptionDialog(null, args, null, 0, 0, null, args, args);

        if(optionResult == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Yes selected", "Yes",JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No selected", "No", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
