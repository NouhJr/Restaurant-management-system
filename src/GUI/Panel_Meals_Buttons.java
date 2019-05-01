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
 * @author ultra tech
 */
public class Panel_Meals_Buttons extends JFrame{
    
    {
        JFrame f= new JFrame("Meals");
        f.setBounds(200,10,900,650);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        
        //Main_Panel
                      
        JPanel P5=new JPanel();  
        P5.setBounds(200,10,200,650);
        P5.setBackground(Color.decode("#2a5260"));
        
/***********************************************************************/          
//Main_Panel_Buttons 
        
         JButton P5_Bttn1=new JButton("Add New Meal");
         JButton P5_Bttn2=new JButton("List Meals");
         JButton P5_Bttn3=new JButton("Update/Delete");  
         
         P5_Bttn1.setBackground(Color.decode("#538fa4"));
         P5_Bttn1.setBounds(225,100,150,30);         
         P5_Bttn2.setBounds(225,300,150,30);
         P5_Bttn2.setBackground(Color.decode("#538fa4"));
         P5_Bttn3.setBounds(225,500,150,30);
         P5_Bttn3.setBackground(Color.decode("#538fa4"));
         
         
/***********************************************************************/         
        
//Main_Adders

        f.add(P5_Bttn1) ;
        f.add(P5_Bttn2) ;
        f.add(P5_Bttn3) ;
        f.add(P5);

        
        P5_Bttn1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(P5_Bttn1))
        {   
             //Employee_DashBoard em=new Employee_DashBoard();
            new Panel_Add_Meal();
         }
         }}) ; 
    
/***********************************************************************/

/****************************P A N E L 7 _ L I S T _ M E A L S**************************/

P5_Bttn2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(P5_Bttn2))
        {   
             //Employee_DashBoard em=new Employee_DashBoard();
            new Panel_List_Meals();
         }
         }}) ; 
      
/***********************************************************************/

/****************************P A N E L 8 _ E D I T _ M E A L S**************************/

P5_Bttn3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(P5_Bttn3))
        {   
             //Employee_DashBoard em=new Employee_DashBoard();
            new Panel_UPD_Meals();
         }
         }}) ; 
    }
    
    
}
