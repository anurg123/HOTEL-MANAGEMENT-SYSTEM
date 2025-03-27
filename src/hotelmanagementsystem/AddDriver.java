/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;

/**
 *
 * @author Ananya rg
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddDriver extends JFrame implements ActionListener{
    JButton add,cancel;
    JTextField tfname,tfcompany,tfage,tfmodel,tflocation;
    JComboBox availablecombo,gendercombo;
    AddDriver()
    {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma",Font.BOLD,18));
        heading.setBounds(50,1,200,20);
        add(heading);
        
        
        JLabel lblroomno=new JLabel("Name");
        lblroomno.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblroomno.setBounds(50,40,120,20);
        add(lblroomno);
        
         tfname=new JTextField();
        tfname.setBounds(200,30,150,30);
        add(tfname);
        
        JLabel lblage=new JLabel("Age");
        lblage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblage.setBounds(50,80,120,30);
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(200,80,150,30);
        add(tfage);
        
         JLabel lblclean=new JLabel("Gender");
        lblclean.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblclean.setBounds(50,130,120,30);
        add(lblclean);
        
        String cleanOptions[]={"Male","Female"};
        gendercombo=new JComboBox(cleanOptions);
        gendercombo.setBounds(200,130,150,30);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);
        
        JLabel lblprice=new JLabel("Car Company");
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblprice.setBounds(50,180,120,30);
        add(lblprice);
        
        tfcompany=new JTextField();
        tfcompany.setBounds(200,180,150,30);
        add(tfcompany);
        
        JLabel lbltype=new JLabel("Car Model");
        lbltype.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltype.setBounds(50,220,120,30);
        add(lbltype);
        
        tfmodel=new JTextField();
        tfmodel.setBounds(200,220,150,30);
        add(tfmodel);
        
        JLabel lblavailable=new JLabel("Avialable");
        lblavailable.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblavailable.setBounds(50,260,120,30);
        add(lblavailable);
        
        String driverOptions[]={"Available","Busy"};
       availablecombo=new JComboBox(driverOptions);
        availablecombo.setBounds(200,260,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        
        JLabel lbllocation=new JLabel("Location");
        lbllocation.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbllocation.setBounds(50,310,120,30);
        add(lbllocation);
        
        tflocation=new JTextField();
        tflocation.setBounds(200,310,150,30);
        add(tflocation);
        
       add=new JButton("Add Driver");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,370,130,30);
        add.addActionListener(this);
        add(add);
        
        cancel=new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,370,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);
        
        setBounds(200,160,980,470);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==add)
        {
            String name=tfname.getText();
            String age=tfage.getText();
            String gender= (String) gendercombo.getSelectedItem();
            String company=tfcompany.getText();
            String brand= tfmodel.getText();
            String available=(String) availablecombo.getSelectedItem();
            String location=tflocation.getText();
            try
            {
                Conn conn=new Conn();
                String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
                conn.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"New Driver Added Successfully");
                setVisible(false);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
        }
    }
    
    public static void main(String args[])
    {
        new AddDriver();
    }
}
