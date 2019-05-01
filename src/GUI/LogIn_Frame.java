/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Resturant.*;

//import java.awt.*;
/**
 *
 * @author Omar
 */
public class LogIn_Frame extends JFrame  {
{
   /*********************M A I N_F R A M E*****************/
     
   //Main_Frame
     JFrame f= new JFrame("Log In");
     f.setSize(450,290);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setLayout(null);  
     f.setVisible(true);
     f.setResizable(false);
   /**********************************************************/
   
   //Main_Frame_Labels
     JLabel Lb1,Lb2,l1;
     Lb1=new JLabel("User Name");
     Lb1.setBounds(190, 60, 200, 30);
     Lb2=new JLabel("Password");
     Lb2.setBounds(190, 120, 200, 30);
   
   /**********************************************************/  
     
   //Main_Frame_Fields
     JTextField Tf=new JTextField();
     Tf.setBounds(270, 60, 160, 30);
     
     JPasswordField Pf=new JPasswordField();
     Pf.setBounds(270, 120, 160, 30);
   /**********************************************************/
   
   //Main_Frame_Buttons
     JButton Bttn=new JButton("Log in");
     Bttn.setBounds(270, 190, 80, 25);
   /******************I M A G E*****************************/
   
     ImageIcon img;
     img = new ImageIcon(getClass().getResource("login.png"));
     l1 = new JLabel(img);
     l1.setBounds(0,0, 215, 300); 
       
   /**********************************************************/
    
   /*********************P A N E L*****************/
  
   //Panel
     JPanel Pn=new JPanel();
     Pn.setBounds(2,-3,180,403);
     Pn.add(l1);
   /**********************************************************/
   
   //Frame_Adders
   
     f.add(Lb1);
     f.add(Tf);
     f.add(Lb2);
     f.add(Pf);
     f.add(Bttn);
     f.add(Pn);

/**********************************************************************************/
String s;
s=Tf.getText();
//Action
Bttn.addActionListener(new ActionListener() {
        Admin admin = new Admin();
        Employee emp = new Employee();
        //Pf.getPassword();
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(Bttn))
        {   
            if(admin.login(Tf.getText(),Pf.getText()))
            { 
                f.setVisible(false);
                new Admin_DashBoard();
            }
            else if(emp.login(Tf.getText(),Pf.getText()))
            {
                f.setVisible(false);
                new Employee_DashBoard();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Your UserName Or Password Is Incorrect "
                    ,"Error !.. ", JOptionPane.PLAIN_MESSAGE);
            }
        }  
         }}) ; 

 /*******************************************************************************************************************/
/*******************************************************************************************************************/
                                            /* D O N E !*/     
/*******************************************************************************************************************/
/*******************************************************************************************************************/  
}    

}