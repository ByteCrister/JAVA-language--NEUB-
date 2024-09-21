import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class showMessageDialog1 {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "Wrong password");
        // null: position - center         message : String

        // JOptionPane.showMessageDialog(null, "Wrong password", "Warning", JOptionPane.WARNING_MESSAGE);
        //plain_error_warning_information_MESSAGE


        ImageIcon img = new ImageIcon("101.png");
        JOptionPane.showMessageDialog(null, "Password Incorrect", "WARNING", JOptionPane.PLAIN_MESSAGE,img);
    }
}