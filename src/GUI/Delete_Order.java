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
public class Delete_Order extends JFrame{
    {
        JFrame f= new JFrame("Delete Order");
       f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
//Panel7
        JPanel panel7=new JPanel();  
        panel7.setBounds(0,0,900,650);
        panel7.setBackground(Color.decode("#63BB50")) ;
       
/***********************************************************************/

//Panel7_Buttons
         JButton b10=new JButton("Delete");
         b10.setBounds(600,300,80,30); 
         b10.setBackground(Color.decode("#19720E")) ;
         b10.setForeground(Color.decode("#63BB50")) ;
         
/***********************************************************************/

//Panel7_Labels
          JLabel del2 ;  
          del2=new JLabel("Delete Order "); 
          del2.setBounds(420,50, 200,30);
          
/***********************************************************************/

//Panel7_TextField
          JTextField DeleteOrder ; 
          DeleteOrder = new JTextField("Enter Order Code !") ; 
          DeleteOrder.setBounds(200,300 ,300 , 30) ;
          
/***********************************************************************/

//Panel7_Adds
         f.add(b10);
         f.add(del2);              
         f.add(DeleteOrder);
         f.add(panel7);
         
 //delete
    b10.addActionListener(new ActionListener() {
        protected void resetPanelData ()
    {
        DeleteOrder.setText("");
    }
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(x.equals(b10))
        {   
            JOptionPane.showMessageDialog(null,"Order Deleted Successfully!");
        }
         
         }})
         ;  
}}
