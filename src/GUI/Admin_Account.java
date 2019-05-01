/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Omar
 */
public class Admin_Account extends JFrame {
    {
        JFrame f= new JFrame("Admin Account");
        f.setBounds(200,10,900,650);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        
/******************P A N E L 3 _ A D M I N _ A C C O U N T*********************/ 
   //Panel3
   
         JPanel Admin_Account_panel=new JPanel();
         Admin_Account_panel.setBounds(250,100,400,400);
         Admin_Account_panel.setBackground(Color.decode("#8EAF91"));
/***********************************************************************/
   //Panel3_Labels
   
   JLabel Welcome,UserName,Email,Age,Options;
   Welcome=new JLabel ("Welcome Admin:");
   Welcome.setBounds(350,130, 200,30);
   UserName=new JLabel("User Name:");
   UserName.setBounds(300,180, 200,30);
   Email=new JLabel("Email:");
   Email.setBounds(300,230, 200,30);
   Age=new JLabel("Age:");
   Age.setBounds(300,280, 200,30);
   Options=new JLabel("**Account Options**");
   Options.setBounds(385,340, 200,30);
/***********************************************************************/
   //Panel3_Buttons
   
   JButton Update;
   Update=new JButton("Update");
   Update.setBounds(400,410, 80,25);
/***********************************************************************/

//Panel3_Separators

     JSeparator S1,S2,S3,S4;
     S1=new JSeparator();
     S1.setBounds(330, 170, 230, 30);
     S2=new JSeparator();
     S2.setBounds(330, 330, 230, 30);
     S3=new JSeparator();
     S3.setBounds(370, 370, 145, 30);
     S4=new JSeparator();
     S4.setBounds(280, 470, 340, 30);
/***********************************************************************/

   //Panel3_Adds
   f.add(Welcome);
   f.add(S1);
   f.add(UserName);
   f.add(Email);
   f.add(Age);
   f.add(S2);
   f.add(Options);
   f.add(S3);
   f.add(Update);
   f.add(S4);
   f.add(Admin_Account_panel);
   
/***********************************************************************/

//Action
Update.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(Update))
        {   
             //Employee_DashBoard em=new Employee_DashBoard();
            new Admin_Update_Account();
         }
         }}) ;       
/***********************************************************************/
    }
    
}
