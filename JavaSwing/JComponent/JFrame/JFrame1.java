import javax.swing.JFrame;

class JFrame1{
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true); //without this cant see the JFrame element
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //close JFrame object after closing it
        // frame.setSize(300,200);
        // frame.setLocationRelativeTo(null);//for centering the frame
        // frame.setLocation(500,300);

        frame.setBounds(500, 300, 300, 200); //seSize and setLocation
        
        frame.setTitle("First Frame");
        frame.setResizable(false);// Cant resize your window Frame

    }
}