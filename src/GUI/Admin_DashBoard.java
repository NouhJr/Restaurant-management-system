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
public class Admin_DashBoard extends JFrame {
    
     
   { 
       
/*********************M A I N_F R A M E*****************/       
        //Main_Frame 
       
          JMenu File,Manage;  
          JMenuItem i1, i2, i3, i4; 
          
          JFrame f= new JFrame("Admin DashBoard");  
          JMenuBar MenuBar=new JMenuBar();
          
          File=new JMenu("File"); 
          File.setMnemonic(KeyEvent.VK_F);
          i1=new JMenuItem("Report");  
          i2=new JMenuItem("Meals");  
          i3=new JMenuItem("Employee");  
          i4=new JMenuItem("Account");    
          File.add(i1); File.add(i2);
          
          Manage=new JMenu("Manage");
          Manage.add(i3);
          Manage.add(i4);
          MenuBar.add(File); 
          MenuBar.add(Manage);
          
         
          
/***********************************************************************/
       
        //Main_Frame_Seters
        
        f.setJMenuBar(MenuBar);
        f.setSize(1920,1080);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        
/***********************************************************************/

/********************************M A I N _ V E I W********************************************/

//Panel

JPanel Panel0=new JPanel();
Panel0.setBounds(620, 220, 128, 128);
Panel0.setBackground(Color.decode("#A4AF8E"));

JPanel Panel00=new JPanel();
Panel00.setBounds(485, 350, 400, 100);
Panel00.setBackground(Color.decode("#A4AF8E"));
/***********************************************************************/

//Panel_Labels
JLabel l1=new JLabel();
JLabel l2=new JLabel();
JLabel l4=new JLabel();

JLabel l5=new JLabel("Welcome Admin");
l5.setBounds(630, 380, 200, 30);
/***********************************************************************/

//Panel_Images

ImageIcon img, img2;
     img = new ImageIcon(getClass().getResource("breakfast-2359617_1920.jpg"));
     l1 = new JLabel(img);
     
     l1.setBounds(0,0,1366,768);
    
img2 = new ImageIcon(getClass().getResource("265674.png"));
     l4 = new JLabel(img2);
     l4.setBounds(3,400, 500, 300);
     
     
/***********************************************************************/

//Panel_Separator
JSeparator s=new JSeparator();
s.setBounds(590, 410, 180, 30);
/***********************************************************************/

//Panel_Adds

Panel0.add(l4);
f.add(l2);
f.add(Panel0);
f.add(l5);
f.add(s);
f.add(Panel00);
f.add(l1);
/***********************************************************************/

/******************************A C T I O N S*************************************/
//File_Reeports
i1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(i1))
        {   
           new Panel_Main_Buttons();  
        }
 }}) ;
/*******************************************************************************************************************/
//File_Meals
i2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(i2))
        {   
           new Panel_Meals_Buttons();  
        }
 }}) ;
/*******************************************************************************************************************/
//Manage_Employee
i3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(i3))
        {   
           new Employee_Buttons();  
        }
 }}) ;
/*******************************************************************************************************************/
//Manage_Account
i4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(i4))
        {   
           new Admin_Account();  
        }
 }}) ;
/*******************************************************************************************************************/
                                            /* D O N E !*/     
/*******************************************************************************************************************/
/*******************************************************************************************************************/

   } 
}

