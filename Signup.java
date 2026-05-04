package Bank.Management.System;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=""+Math.abs(first4);
    JLabel l1,l2,l3;
    JDateChooser  dateChooser;
    JTextField textName,textFname,textEmail,textAdd,textcity,textPin,textState;
    JRadioButton r1,r2,r3,m1,m2;
    JButton next;
    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        l1=new JLabel("APPLICATION FORM NO."+first);
        l1.setBounds(160,20,600,40);
        l1.setFont(new Font("Raleway",Font.BOLD,38));
        add(l1);

        l2=new JLabel("Page 1");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(330,70,600,30);
        add(l2);

        l3=new JLabel("Personal Details");
        l3.setBounds(290,90,600,30);
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        add(l3);


        JLabel label4=new JLabel("Name: ");
        label4.setFont(new Font("Raleway",Font.BOLD,20));
        label4.setBounds(100, 150, 400, 25);
        add(label4);

        textName = new JTextField("");
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,150,400,25);
        add(textName);

        JLabel Fname=new JLabel("Father's name:");
        Fname.setFont(new Font("Ralway",Font.BOLD,20));
        Fname.setBounds(100,200,400,25);
        add(Fname);

        textFname = new JTextField("");
        textFname.setFont(new Font("Ralway",Font.BOLD,14));
        textFname.setBounds(300,200,400,25);
        add(textFname);

        JLabel DOB=new JLabel("DOB: ");
        DOB.setFont(new Font("Ralway",Font.BOLD,22));
        DOB.setBounds(100,250,400,25);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,250,400,25);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,300,400,25);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,15));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,300,60,25);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,15));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(400,300,90,25);
        add(r2);

        r3=new JRadioButton("Other");
        r3.setFont(new Font("Ralway",Font.BOLD,15));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(500,300,80,25);
        add(r3);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel Email=new JLabel("Email: ");
        Email.setFont(new Font("Ralway",Font.BOLD,20));
        Email.setBounds(100,350,400,25);
        add(Email);

        textEmail=new JTextField("");
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,350,400,25);
        add(textEmail);

        JLabel labelMs=new JLabel("Marital");
        labelMs.setFont(new Font("Ralway",Font.BOLD,20));
        labelMs.setBounds(100,400,400,25);
        add(labelMs);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,15));
        m1.setBounds(300,400,100,25);
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,15));
        m2.setBounds(400,400,200,25);
        m2.setBackground(new Color(222,255,228));
        add(m2);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);

        JLabel Address=new JLabel("Address: ");
        Address.setFont(new Font("Ralway",Font.BOLD,20));
        Address.setBounds(100,450,400,25);
        add(Address);

        textAdd = new JTextField("");
        textAdd.setFont(new Font("Ralway",Font.BOLD,14));
        textAdd.setBounds(300,450,400,25);
        add(textAdd);

        JLabel city=new JLabel("City");
        city.setFont(new Font("Ralway",Font.BOLD,20));
        city.setBounds(100,500,400,25);
        add(city);

        textcity=new JTextField("");
        textcity.setFont(new Font("Ralway",Font.BOLD,14));
        textcity.setBounds(300,500,400,25);
        add(textcity);

        JLabel state=new JLabel("State");
        state.setFont(new Font("Ralway",Font.BOLD,20));
        state.setBounds(100,550,400,25);
        add(state);

        textState=new JTextField("");
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,550,400,25);
        add(textState);

        JLabel pin=new JLabel("Pin Code");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,600,400,25);
        add(pin);

        textPin=new JTextField("");
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,600,400,25);
        add(textPin);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(650,650,100,25);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(360,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String formno=first;
        String name= textName.getText();
        String fname=textFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";
        } else if (r3.isSelected()) {
            gender="Other";
        }
        String email=textEmail.getText();
        String martial=null;
        if(m1.isSelected()){
            martial="Married";
        } else if (m2.isSelected()) {
            martial="Unmarried";
        }
        String address=textAdd.getText();
        String city=textcity.getText();
        String state=textState.getText();
        String pin=textPin.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }else {
                conn con=new conn();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                con.statement.executeUpdate(q);
                new Signup2("");
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {

        new Signup();
    }
}
