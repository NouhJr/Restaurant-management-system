/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Resturant.Employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Omar
 */
public class Employee_Buttons extends JFrame {
    {
        JFrame f= new JFrame("Employees");
        f.setBounds(200,10,900,650);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
//********************P A N E L_B U T T O N S*************************//          
        //Main_panel
        
        JPanel Bottons_panel=new JPanel();  
        Bottons_panel.setBounds(200,10,200,650);
        Bottons_panel.setBackground(Color.decode("#506776"));
/***********************************************************************/           
        //Main_panel_Buttons 
        
         JButton b1=new JButton("Add New Employee");
         JButton b2=new JButton("List Employees");
         JButton b3=new JButton("Update/Delete");
         b1.setBounds(225,100,150,30);         
         b2.setBounds(225,300,150,30);
         b3.setBounds(225,500,150,30);
/***********************************************************************/
        //Main_panel_Adds
        
         f.add(b1);
         f.add(b2);     
         f.add(b3);
         f.add(Bottons_panel);
/***********************************************************************/
//Action
/***********************************************************************/
//Add Employee
b1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(b1))
        {   
           new Add_Employee();  
        }
         }}) ;
/***********************************************************************/
//Add Employee
b2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(b2))
        {   
           new List_Employee();  
        }
         }}) ;
/***********************************************************************/
/*b2.addActionListener(new ActionListener() {
    Employee emp = new Employee();
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(b2))
        {   
           
        }
         }}) ;*/
//Edit Employee    
b3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(b3))
        {   
           new Update_Delete_Employee();  
        }
         }}) ;

    }

    
}
