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
public class Main_Panel_Order_Button extends JFrame{
    {
        JFrame f= new JFrame("Order");
        f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
    //Panel5
        JPanel panel5=new JPanel();  
        panel5.setBounds(200,10,200,650);
        panel5.setBackground(Color.decode("#135607")) ;
        
/***********************************************************************/

//Panel5_Buttons
         JButton b7=new JButton("Add New Order");
         JButton b8=new JButton("Delete Order");
         b7.setBounds(225,220,150,30);         
         b8.setBounds(225,420,150,30);
         
/***********************************************************************/

//Panel5_Adds
        f.add(b7);
        f.add(b8);
        f.add(panel5);
        
   b7.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(b7))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 Add_Order panel6_Add_Employee = new Add_Order();
         }
         }}) ; 
        
/***********************************************************************/

/*************************P A N E L 7 _ D E L E T E******************************/
b8.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(b8))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 Delete_Order panel7_Delete_Employee = new Delete_Order();
         }
         }

        }) ; 
        
    
    }
}
