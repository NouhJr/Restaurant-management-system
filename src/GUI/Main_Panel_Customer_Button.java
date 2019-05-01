/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class Main_Panel_Customer_Button  extends JFrame {
    {
         JFrame f= new JFrame("Customer");
        f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
    //Main_Panel
        JPanel panel1=new JPanel();  
        panel1.setBounds(200,10,200,650);
        panel1.setBackground(Color.decode("#382889")) ;
        
/***********************************************************************/

//Main_Panel_Buttons
         JButton b1=new JButton("Add New Customer");
         JButton b2=new JButton("List Customers");
         JButton b3=new JButton("Search/Delete"); 
         b1.setBounds(225,100,150,30); 
         b1.setBackground(Color.decode("#967BBB")) ;
         b2.setBounds(225,300,150,30);
         b2.setBackground(Color.decode("#967BBB")) ;
         b3.setBounds(225,500,150,30);
         b3.setBackground(Color.decode("#967BBB")) ;
         
/***********************************************************************/
//
//Main_Panel_Adds
        f.add(b1) ;      
        f.add(b2) ;
        f.add(b3);  
        f.add(panel1);
        
        

b1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(b1))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 Add_Customer panel2_Add_Employee = new Add_Customer();
         }
         }}) ; 
/***********************************************************************/

/***************************P A N E L 3 _ L I S T**************************/
b2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(b2))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 List_Cusromer panel3_List_Employee = new List_Cusromer();
         }
         }}) ; 

/***************************P A N E L 4 _ E D I T**************************/

b3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(b3))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 Update_Delete_Customer panel4_Edit_Employee = new Update_Delete_Customer();
         }
         }}) ; 
}}
