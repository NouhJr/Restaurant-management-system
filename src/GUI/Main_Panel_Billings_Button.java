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
public class Main_Panel_Billings_Button extends JFrame {
    {
      JFrame f= new JFrame("Billings");
        f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
    //Panel8
      JPanel panel8=new JPanel();  
      panel8.setBounds(200,10,200,650);
      panel8.setBackground(Color.decode("#657A66")) ;
      
/***********************************************************************/

//Panel8_Buttons
      JButton b11=new JButton("Add New Bill");
      JButton b12=new JButton("List Bill");
      b11.setBounds(225,220,150,30);         
      b12.setBounds(225,420,150,30);
      
/***********************************************************************/

//Panel8_Adds
      f.add(b11);
      f.add(b12);
      f.add(panel8);
      
/***********************************************************************/

/*************************P A N E L 9 _ A D D******************************/

b11.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(b11))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 Add_Billing panel9_Add_Employee = new Add_Billing();
         }
         }

        
      }) ; 
     
/***********************************************************************/

/*************************P A N E L 10 _ L I S T******************************/
b12.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(b12))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 List_Billing panel10_List_Employee = new List_Billing();
         }
        }}) ; 
}
}