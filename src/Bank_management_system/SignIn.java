package Bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class SignIn extends JFrame implements ActionListener {
    long random;
    JRadioButton male, female, Other, married, unmarried;

    JTextField nameTextField, fnameTextField, dateofbirth, emailadd, addresss, cityfield, pinnum, states;

    SignIn() {
        Random ran = new Random();
        setLayout(null);
        random = Math.abs((ran.nextLong() % 9000L) + 1000l);
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        JLabel personlDetails = new JLabel(" Page: Pesonal Details");
        personlDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personlDetails.setBounds(290, 80, 400, 30);
        add(personlDetails);
        JLabel name = new JLabel(" Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        JLabel fname = new JLabel("Father Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        JLabel db = new JLabel("Date of Birth:");
        db.setFont(new Font("Raleway", Font.BOLD, 20));
        db.setBounds(100, 240, 200, 30);
        add(db);
        dateofbirth = new JTextField();
        dateofbirth.setFont(new Font("Raleway", Font.BOLD, 14));
        dateofbirth.setBounds(300, 240, 400, 30);
        add(dateofbirth);
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 120, 30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);
        ButtonGroup genderButton = new ButtonGroup();
        genderButton.add(male);
        genderButton.add(female);
        JLabel email = new JLabel("Email Adderess:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        emailadd = new JTextField();
        emailadd.setFont(new Font("Raleway", Font.BOLD, 14));
        emailadd.setBounds(300, 340, 400, 30);
        add(emailadd);
        JLabel status = new JLabel("Marital Status:");
        status.setFont(new Font("Raleway", Font.BOLD, 20));
        status.setBounds(100, 390, 200, 30);
        add(status);
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);
        unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450, 390, 120, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        Other = new JRadioButton("Other");
        Other.setBounds(630, 390, 120, 30);
        Other.setBackground(Color.white);
        add(Other);
        ButtonGroup sbutton = new ButtonGroup();
        sbutton.add(married);
        sbutton.add(unmarried);
        sbutton.add(Other);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addresss = new JTextField();
        addresss.setFont(new Font("Raleway", Font.BOLD, 14));
        addresss.setBounds(300, 440, 400, 30);
        add(addresss);
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        cityfield = new JTextField();
        cityfield.setFont(new Font("Raleway", Font.BOLD, 14));
        cityfield.setBounds(300, 490, 400, 30);
        add(cityfield);
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        states = new JTextField();
        states.setFont(new Font("Raleway", Font.BOLD, 14));
        states.setBounds(300, 540, 400, 30);
        add(states);
        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 590, 200, 30);
        add(pin);
        pinnum = new JTextField();
        pinnum.setFont(new Font("Raleway", Font.BOLD, 14));
        pinnum.setBounds(300, 590, 400, 30);
        JButton button = new JButton("Next");
        button.setForeground(Color.white);
        button.setBackground(Color.black);
        button.setFont(new Font("Raleway", Font.BOLD, 14));
        button.setBounds(620, 660, 80, 30);
        button.addActionListener(this);
        add(button);
        add(pinnum);
        setTitle("Sign Up");
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        getContentPane().setBackground(Color.white);


    }

    public static void main(String[] args) {
        new SignIn();

    }
        @Override
        public void actionPerformed (ActionEvent e){
            String formno = "" + random;
            String name = nameTextField.getText();
            String fname = fnameTextField.getText();
            String dob = dateofbirth.getText();
            String gender = null;
            if (male.isSelected()) {
                gender = "male";
            } else if (female.isSelected()) {
                gender = "female";
            }
            String email = emailadd.getText();
            String marital = null;
            if (married.isSelected()) {
                marital = "Married";
            } else if (unmarried.isSelected()) {
                marital = "Unmarried";
            } else if (Other.isSelected()) {

                marital = "Other";
            }
            String address = addresss.getText();
            String city = cityfield.getText();
            String state = states.getText();
            String pin = pinnum.getText();
            try {
                if (name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Name is requird");
                } else {
                    Conn c = new Conn();
            String query = "insert into SignIn values('" + formno + "','" + name + "','" + fname + "','" + dob + "',''" + email+ ",''" + gender + "','" + marital + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
                    c.s.executeUpdate(query);
        }

} catch (NullPointerException | SQLException ae) {
        System.out.println(ae);
            }

        }


    }


