package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textpan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;

        JLabel L1 = new JLabel("Page 2");
        L1.setFont(new Font("Raleway",Font.BOLD,22));
        L1.setBounds(330,30,80,35);
        add(L1);

        JLabel L2=new JLabel("Personal Details");
        L2.setFont(new Font("Raleway",Font.BOLD,22));
        L2.setBounds(300,60,200,35);
        add(L2);

        JLabel L3=new JLabel("Religion");
        L3.setFont(new Font("Raleway",Font.BOLD,18));
        L3.setBounds(100,150,300,30);
        add(L3);

        String religion[]={"Hindu","Muslim","christian","Buddhism","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setFont(new Font("Raleway",Font.BOLD,22));
        comboBox.setBackground(Color.WHITE);
        comboBox.setBounds(300,150,300,30);
        add(comboBox);

        JLabel L4=new JLabel("Category");
        L4.setFont(new Font("Raleway",Font.BOLD,18));
        L4.setBounds(100,200,200,30);
        add(L4);

        String category[]={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,22));
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setBounds(300,200,300,30);
        add(comboBox2);

        JLabel L5=new JLabel("Income");
        L5.setFont(new Font("Raleway",Font.BOLD,18));
        L5.setBounds(100,250,200,30);
        add(L5);

        String income[]={"Null","<1,25,000","<2,00,000","<3,00,000","upto 10,00,000","above 10,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,22));
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setBounds(300,250,200,30);
        add(comboBox3);

        JLabel L6=new JLabel("Education");
        L6.setFont(new Font("Raleway",Font.BOLD,18));
        L6.setBounds(100,300,200,30);
        add(L6);

        String Education[]={"Non Graduate","Graduate","Post Graduate","Doctrate","Other"};
        comboBox4=new JComboBox(Education);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,22));
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setBounds(300,300,300,30);
        add(comboBox4);

        JLabel L7=new JLabel("Occupation");
        L7.setFont(new Font("Raleway",Font.BOLD,18));
        L7.setBounds(100,350,200,30);
        add(L7);

        String Occupation[]={"Self-Employee","Business","Student","Retried"};
        comboBox5=new JComboBox(Occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,22));
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setBounds(300,350,300,30);
        add(comboBox5);

        JLabel L8=new JLabel("PAN number");
        L8.setFont(new Font("Raleway",Font.BOLD,18));
        L8.setBounds(100,400,200,30);
        add(L8);

        textpan=new JTextField("");
        textpan.setFont(new Font("Raleway",Font.BOLD,20));
        textpan.setBounds(300,400,300,30);
        add(textpan);

        JLabel L9=new JLabel("aadhar number");
        L9.setFont(new Font("Raleway",Font.BOLD,18));
        L9.setBounds(100,450,200,30);
        add(L9);

        textAadhar=new JTextField("");
        textAadhar.setFont(new Font("Raleway",Font.BOLD,20));
        textAadhar.setBounds(300,450,300,30);
        add(textAadhar);

        JLabel L10=new JLabel("Senior citizen");
        L10.setFont(new Font("Raleway",Font.BOLD,18));
        L10.setBounds(100,500,200,30);
        add(L10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setForeground(Color.BLACK);
        r1.setBackground(Color.WHITE);
        r1.setBounds(300,500,70,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setForeground(Color.BLACK);
        r2.setBackground(Color.WHITE);
        r2.setBounds(370,500,70,30);
        add(r2);

        ButtonGroup buttongroup =new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);

        JLabel L11=new JLabel("Existing Account:  ");
        L11.setFont(new Font("Raleway",Font.BOLD,18));
        L11.setBounds(100,550,300,30);
        add(L11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,18));
        e1.setForeground(Color.BLACK);
        e1.setBackground(Color.WHITE);
        e1.setBounds(300,550,70,30);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,18));
        e2.setForeground(Color.BLACK);
        e2.setBackground(Color.WHITE);
        e2.setBounds(370,550,70,30);
        add(e2);

        ButtonGroup buttongroup1 =new ButtonGroup();
        buttongroup1.add(e1);
        buttongroup1.add(e2);

        JLabel l12=new JLabel("form no.");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(650,10,100,20);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(750,10,60,20);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(480,620,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(300,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String)comboBox.getSelectedItem();
        String cate=(String)comboBox2.getSelectedItem();
        String inc=(String)comboBox3.getSelectedItem();
        String edu =(String)comboBox4.getSelectedItem();
        String occ=(String)comboBox5.getSelectedItem();

        String pan=textpan.getText();
        String aadhar=textAadhar.getText();

        String Scitizen="";
        if(r1.isSelected()){
            Scitizen="Yes";
        } else if (r2.isSelected()) {
            Scitizen="No";
        }
        String Eaccount="";
        if(e1.isSelected()){
            Eaccount="Yes";
        } else if (e2.isSelected()) {
            Eaccount="No";
        }

        try{
            if(textpan.getText().equals("")||textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            }else {
                conn con = new conn();
                String q="insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+Scitizen+"','"+Eaccount+"')";
                con.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new Signup2("");
    }


}
