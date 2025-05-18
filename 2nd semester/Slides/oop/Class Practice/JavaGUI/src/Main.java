import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame gui = new JFrame();
        JLabel uname = new JLabel();
        JTextField textField = new JTextField();
        uname.setText("User Name: ");
        textField.setBounds(200,150,200,50);
        gui.add(textField);
        gui.add(uname);
        uname.setBounds(0,150,200,50);
        gui.setTitle("GUI");
        gui.setSize(400,400);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
    }
}