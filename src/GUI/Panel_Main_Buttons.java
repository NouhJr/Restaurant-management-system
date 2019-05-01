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
public class Panel_Main_Buttons extends JFrame {
    {
        JFrame f= new JFrame("Reports");
        f.setBounds(200,10,900,650);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
//MainPanel            
        JPanel panel_r1=new JPanel();  
        panel_r1.setBounds(200,10,200,650);
        panel_r1.setBackground(Color.decode("#2c655d"));
        
/***********************************************************************/        
//MainPanel_Buttons 
        
        
         JButton b_r=new JButton("Add New Report");
         JButton b1_r=new JButton("Employees Reports");
         JButton b2_r=new JButton("Customers Reports");
         
         b_r.setForeground(Color.decode("#2c655d"));
         b1_r.setForeground(Color.decode("#2c655d"));
         b2_r.setForeground(Color.decode("#2c655d"));
         b_r.setBackground(Color.decode("#9dc3be"));
         b_r.setBounds(225,100,150,30);         
         b1_r.setBounds(225,300,150,30);
         b1_r.setBackground(Color.decode("#9dc3be"));
         b2_r.setBounds(225,500,150,30);
         b2_r.setBackground(Color.decode("#9dc3be"));
/***********************************************************************/         

//MainPanel_Adds         
          f.add(b_r) ; 
          f.add(b1_r) ;
          f.add(b2_r) ;
          f.add(panel_r1); 
/***********************************************************************/          
//Action
/***********************************************************************/
//Add_Report
b_r.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(b_r))
        {   
             //Employee_DashBoard em=new Employee_DashBoard();
            new Panel_Add_Report();
         }
         }}) ; 
/***********************************************************************/
//List_Employee_Reports
b1_r.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(b1_r))
        {   
             //Employee_DashBoard em=new Employee_DashBoard();
            new Panel_List_Employee_Reports();
         }
         }}) ; 
/***********************************************************************/
//List_Customer_Reports
b2_r.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(b2_r))
        {   
             //Employee_DashBoard em=new Employee_DashBoard();
            new Panel_List_Customer_Reports();
         }
         }}) ; 
    
   }
}
