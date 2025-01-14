package Bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login  extends JFrame implements ActionListener {
    JButton login,sinup,CLEAR;
    JTextField cardfield;
    JPasswordField pinnum;
    Login(){
        setLayout(null);
        setTitle("AUTOMATIC TELLER MACHINE");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
       Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);

       JLabel label= new JLabel(i3);
       label.setBounds(70,10,100,100);

        add(label);
        JLabel text=new JLabel("Welcome to ATM ");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        JLabel card =new JLabel("Card NO: ");
        card.setFont(new Font("Realeway",Font.BOLD,28));
        card.setBounds(120,150,150,40);
        add(card);
      cardfield=new JTextField();
        cardfield.setBounds(300,150,230,30);
        cardfield.setFont(new Font("Arial",Font.BOLD,14));
        add(cardfield);
       pinnum=new  JPasswordField();
      pinnum.setBounds(300,220,230,30);
        add(pinnum);
        JLabel pin=new JLabel("PIN: ");
        pin.setFont(new Font("",Font.BOLD,28));
      pinnum.setFont(new Font("Arial",Font.BOLD,14));
        pin.setBounds(120,220,400,40);
        add(pin);
        login=new JButton("SIGN IN");
        login.setBounds(300,280,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
       CLEAR=new JButton("CLEAR");
        CLEAR.setBounds(430,280,100,30);
        CLEAR.setBackground(Color.BLACK);
        CLEAR.setForeground(Color.WHITE);
        CLEAR.addActionListener(this);
        add(CLEAR);

   sinup=new JButton("SIGN UP");
        sinup.setBounds(300,330,250,30);
        sinup.setBackground(Color.BLACK);
      sinup.setForeground(Color.WHITE);
        sinup.addActionListener(this);
        add(sinup);
        setSize(600,400);
        setVisible(true);
        setLocation(350,200);
        getContentPane().setBackground(Color.white);


    }
    public static void main(String[] args) {
        new Login();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==CLEAR){
            cardfield.setText("");
            pinnum.setText("");

        }
        else if(ae.getSource()==login){

        }
        else if(ae.getSource()==sinup){

        }


    }
}
