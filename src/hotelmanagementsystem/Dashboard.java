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
public class Dashboard extends JFrame implements ActionListener
{
    Dashboard()
    {
        setBounds(0,0,1550,1000);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2=i1.getImage().getScaledInstance(1550, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        JLabel text=new JLabel("THE TAJ LABEL GROUP WELCOMES YOU");
        text.setBounds(400,80,1500,50);
        image.add(text);
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        JMenu hotel=new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        JMenu admin=new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);
        JMenuItem addemployee=new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);
         JMenuItem addrooms=new JMenuItem("ADD ROOMS");
        admin.add(addrooms);
        addrooms.addActionListener(this);
         JMenuItem adddrivers=new JMenuItem("ADD DRIVERS");
         adddrivers.addActionListener(this);
        admin.add(adddrivers);
        
        JMenuItem reception=new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        text.setFont(new Font("Tahoma",Font.PLAIN,46));
        text.setForeground(Color.WHITE);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("ADD EMPLOYEE"))
        {
            new AddEmployee();
        }
        else if (ae.getActionCommand().equals("ADD ROOMS"))
        {
            new AddRooms();
        }
        else if (ae.getActionCommand().equals("ADD DRIVERS"))
        {
            new AddDriver();
        }
         else if (ae.getActionCommand().equals("RECEPTION"))
        {
            new Reception();
        }
    }
    public static void main(String args[])
    {
        new Dashboard();
    }
}
