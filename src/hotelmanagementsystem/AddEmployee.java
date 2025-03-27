/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddEmployee extends JFrame implements ActionListener{
    
    JTextField tfname,tfemail,tfage,tfsalary,tfphone,tfaadhar;
    JRadioButton rbmale,rbfemale;
    JButton submit;
    JComboBox cbjob;
    
    AddEmployee()
    {
        setLayout(null);
        JLabel lblname=new JLabel("NAME");
        lblname.setBounds(60,20,120,30);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblname);
        
         tfname=new JTextField();
        tfname.setBounds(200,20,150,30);
        add(tfname);
        
        JLabel lblage=new JLabel("AGE");
        lblage.setBounds(60,70,120,30);
        lblage.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblage);
        
         tfage=new JTextField();
        tfage.setBounds(200,70,150,30);
        add(tfage);
        
        JLabel lblgender=new JLabel("GENDER");
        lblgender.setBounds(60,120,120,30);
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblgender);
        
        rbmale= new JRadioButton("Male");
        rbmale.setBounds(200,120,70,30);
        rbmale.setFont(new Font("Tahoma",Font.PLAIN,14));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        
        rbfemale= new JRadioButton("Female");
        rbfemale.setBounds(280,120,70,30);
        rbfemale.setFont(new Font("Tahoma",Font.PLAIN,14));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        JLabel lbljob=new JLabel("JOB");
        lbljob.setBounds(60,170,180,30);
        lbljob.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lbljob);
        
        String str[]={"Front Desk Clerks","porters","House Keeping","Kitchen Staff","Room Service","Chef","Waiter/Waitress","Manager","Accountant"};
         cbjob=new JComboBox(str);
        cbjob.setBounds(200,170,150,30);
        cbjob.setBackground(Color.WHITE);
        add(cbjob);
        
        JLabel lblsalary=new JLabel("SALARY");
        lblsalary.setBounds(60,220,120,30);
        lblsalary.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblsalary);
        
         tfsalary=new JTextField();
        tfsalary.setBounds(200,220,150,30);
        add(tfsalary);
        
        JLabel lblphone=new JLabel("PHONE");
        lblphone.setBounds(60,270,120,30);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(200,270,150,30);
        add(tfphone);
        
        JLabel lblemail=new JLabel("EMAIL");
        lblemail.setBounds(60,320,120,30);
        lblemail.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(200,320,150,30);
        add(tfemail);
        
        JLabel lblaadhar=new JLabel("AADHAR");
        lblaadhar.setBounds(60,370,120,30);
        lblaadhar.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblaadhar);
        
        tfaadhar=new JTextField();
        tfaadhar.setBounds(200,370,150,30);
        add(tfaadhar);
        
        
        
        
        
        submit=new JButton("SUMBIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200,420,150,30);
        submit.addActionListener(this);
        add(submit);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i2=i1.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(380,50,450,380);
        add(image);
        getContentPane().setBackground(Color.WHITE);
        setBounds(150,100,950,540);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String emp_name=tfname.getText();
        String age=tfage.getText();
        String salary= tfsalary.getText();
        String phone=tfphone.getText();
        String email=tfemail.getText();
        String aadhar=tfaadhar.getText();
        String gender=null;
        
        if(rbmale.isSelected())
        {
            gender="Male";
            
        }
        else if(rbfemale.isSelected())
        {
           gender="Female";
        }
        String job=(String)cbjob.getSelectedItem();
        try
        {
           Conn conn=new Conn();
           
           String query="insert into employee values('"+emp_name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
           conn.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"Employee added sucessfully");
           setVisible(false);
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void main(String[] args)
    {
        new AddEmployee();
    }
}
