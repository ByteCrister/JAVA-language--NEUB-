import javax.swing.JOptionPane;

class p1_JOptionPane{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to JavaSwing", "Welcome!", JOptionPane.INFORMATION_MESSAGE);
        String firstName = JOptionPane.showInputDialog(null,"Enter your First name : ", "   Name");
        String lastName = JOptionPane.showInputDialog(null,"Enter your Last Name : ","  Name");
        JOptionPane.showMessageDialog(null, "Hello "+firstName+" "+lastName, "Hi!", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showOptionDialog(null, "Are you want to Quit ? ", "Yes or No", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
    }
}