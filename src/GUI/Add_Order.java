/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Resturant.Customer;
import Resturant.Order;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dell
 */
public class Add_Order extends JFrame {
    {
        JFrame f= new JFrame("Add New Order");
        f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        
//Panel6
        JPanel panel6=new JPanel();  
        panel6.setBounds(0,0,900,650);
        panel6.setBackground(Color.decode("#63BB50")) ;
        
/***********************************************************************/

//Panel6_Buttons
         JButton b9=new JButton("Submit");
         b9.setBounds(420,520, 100,30); 
         b9.setBackground(Color.decode("#328D1D")) ;
         
/***********************************************************************/

//Panel6_Labels
          JLabel AddNew ,OrderName , OrderCode ,OrderDate ;  
          AddNew=new JLabel("Add New Order "); 
          AddNew.setBounds(420,30, 200,30);  
          OrderName=new JLabel("Number Of Meals ");  
          OrderName.setBounds(200,100, 200,30);  
          OrderCode=new JLabel("Order Code ");  
          OrderCode.setBounds(200,250, 100,30);  
          OrderDate=new JLabel("Order Date");  
          OrderDate.setBounds(200,400, 100,30);
          
/***********************************************************************/

//Panel6_TextFields
          JTextField OrderName1 , OrderCode1 ,OrderDate1  ; 
          OrderName1 = new JTextField() ; 
          OrderName1.setBounds(300,100 ,400 , 30) ;
          OrderCode1 = new JTextField() ; 
          OrderCode1.setBounds(300,250 ,400 , 30) ;
          OrderDate1 = new JTextField() ; 
          OrderDate1.setBounds(300,400 ,400 , 30) ;
          
/***********************************************************************/

//Panel6_Adds
        f.add(b9);
        f.add(OrderName);     
        f.add(OrderCode);
        f.add(OrderDate);
        f.add(AddNew);
        f.add(OrderName1);       
        f.add(OrderCode1);
        f.add(OrderDate1);
        f.add(panel6);
        
        
        //Action
 //fname1,lname1,age5,id5,DateOfJoin1,Wallet1; 
 b9.addActionListener(new ActionListener() {
        Order or = new Order();
        protected void resetPanelData ()
        {
        OrderName1.setText("");
        OrderCode1.setText("");
        OrderDate1.setText("");
        }
         @Override
         public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!OrderName1.getText().equals("")&&!OrderCode1.getText().equals("")
                &&!OrderDate1.getText().equals(""))
        {   
             or.setNum_of_meals(Integer.parseInt(OrderName1.getText()));  
             or.setCode(Double.parseDouble(OrderCode1.getText()));    
             or.setPay_date(OrderDate1.getText());   
            if(or.addorder()&&!OrderName1.getText().equals("")||!OrderCode1.getText().equals("")
                    ||!OrderDate1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Order Added Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to add Order!");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Please Enter Data!");
         }}) ; 
    
    }
    
}
