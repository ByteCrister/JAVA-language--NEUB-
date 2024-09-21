import javax.swing.JOptionPane;

public class showInputDialog1 {
    public static void main(String[] args) {

        // String name = JOptionPane.showInputDialog("Enter your name : ");
        
        String firstName = JOptionPane.showInputDialog(null,"Enter First Name : ", "First Name", JOptionPane.QUESTION_MESSAGE);
        String lastName = JOptionPane.showInputDialog(null,"Enter last Name : ", "Last Name",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, firstName+" "+lastName+" "+" Welcome to JavaSwing", "WELCOME",JOptionPane.PLAIN_MESSAGE);

    }
}
