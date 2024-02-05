import javax.swing.*;
import java.awt.*;
public class login  extends JFrame {

    login(){
        setTitle(" AUTOMATED TELLER MACHINE");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100,100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 220, 250, 30);
        add(pinTextField);

        JButton login = new JButton("SIGN IN");
        Color customColor = Color.decode("#d4983f");
        login.setBounds(300,300,100,30);
        login.setBackground(customColor);
        login.setForeground(Color.BLACK);
        add(login);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(customColor);
        clear.setForeground(Color.BLACK);
        add(clear);                              //31:17

        getContentPane().setBackground(Color.white);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }


    public static void main(String[] args) {
        new login();
    }
}
