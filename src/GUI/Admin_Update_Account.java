/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Resturant.*;
/**
 *
 * @author Omar
 */
public class Admin_Update_Account extends JFrame {
    {
        JFrame f= new JFrame("Admin Account");
        f.setBounds(200,10,900,650);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
/***********************************************************************/
/******************P A N E L 4 _ U P D A T E _ A D M I N _ A C C O U N T*********************/ 
//Panel4
  JPanel Admin_Update_Account=new JPanel();
  Admin_Update_Account.setBounds(210,80,500,500);
  Admin_Update_Account.setBackground(Color.decode("#8EAF91"));
/***********************************************************************/

//Panel4_Labels
  JLabel P4_Lb1,P4_Lb2,P4_Lb3,P4_Lb4,P4_Lb5,P4_Lb6;
  P4_Lb6=new JLabel("**Update Your Information**");
  P4_Lb6.setBounds(375,100, 200,30);
  P4_Lb1=new JLabel("Enter User Name");
  P4_Lb1.setBounds(230,180, 200,30);
  /*P4_Lb2=new JLabel("Enter ID");
  P4_Lb2.setBounds(230,240, 200,30);
  P4_Lb3=new JLabel("Enter Email");
  P4_Lb3.setBounds(230,300, 200,30);*/
  P4_Lb4=new JLabel("Enter Password");
  P4_Lb4.setBounds(230,300, 200,30);
  P4_Lb5=new JLabel("Confirm Password");
  P4_Lb5.setBounds(230,420, 200,30);
/***********************************************************************/

//Panel4_Textfield
  JTextField P4_Tf1,P4_Tf2,P4_Tf3,P4_Tf4,P4_Tf5;
  P4_Tf1=new JTextField();
  P4_Tf1.setBounds(355, 180, 200, 30);
  /*P4_Tf2=new JTextField();
  P4_Tf2.setBounds(355, 240, 200, 30);
  P4_Tf3=new JTextField();
  P4_Tf3.setBounds(355, 300, 200, 30);*/
  P4_Tf4=new JTextField();
  P4_Tf4.setBounds(355, 300, 200, 30);
  P4_Tf5=new JTextField();
  P4_Tf5.setBounds(355, 420, 200, 30);
/***********************************************************************/

//P4_Buttons
  JButton P4_Bttn;
  P4_Bttn=new JButton("Submit");
  P4_Bttn.setBounds(400,500, 80,25);
/***********************************************************************/

//Panel4_Separator
  JSeparator S5,S6;
  S5=new JSeparator();
  S5.setBounds(355, 130, 200, 30);
  S6=new JSeparator();
  S6.setBounds(280, 550, 340, 30);
/***********************************************************************/

//Panel4_Adders
 f.add(P4_Lb6);
 f.add(S5);
 f.add(P4_Lb1);
 f.add(P4_Tf1);
 /*f.add(P4_Lb2);
 f.add(P4_Tf2);
 f.add(P4_Lb3);
 f.add(P4_Tf3);*/
 f.add(P4_Lb4);
 f.add(P4_Tf4);
 f.add(P4_Lb5);
 f.add(P4_Tf5);
 f.add(P4_Bttn);
 f.add(S6);
 f.add(Admin_Update_Account);
 
/***********************************************************************/
//Action
P4_Bttn.addActionListener(new ActionListener() {
    Admin A=new Admin();
    protected void resetPanelData ()
        {
        P4_Tf1.setText("");
        P4_Tf4.setText("");
        P4_Tf5.setText("");
        }
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(!P4_Tf1.getText().equals("")&&!P4_Tf4.getText().equals("")&&!P4_Tf5.getText().equals(""))
        {   
            A.updateusername(P4_Tf1.getText());
            A.updatepassword(P4_Tf4.getText());
             
        
                JOptionPane.showMessageDialog(null, "Employee Added Successfully!");
                resetPanelData();
            /*{
                JOptionPane.showMessageDialog(null, "Failed to add Employee!");
            }*/
        }
        else
            JOptionPane.showMessageDialog(null,"Failed to add Employee!");
         }}) ; 

    }
    
}
