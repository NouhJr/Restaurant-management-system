/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Resturant.Billing;
import Resturant.Customer;
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
public class Add_Billing extends JFrame {
    {
       JFrame f= new JFrame("Add New Bill");
       f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);

    //Panel9
     JPanel panel9=new JPanel();  
     panel9.setBounds(0,0,900,650);
     panel9.setBackground(Color.decode("#9EC970")) ;
     
/***********************************************************************/ 

//Panel9_Buttons
     JButton b13=new JButton("Submit");
     b13.setBounds(420,500, 100,30);
     
/***********************************************************************/

//Panel9_Labels
     JLabel AddNew1 ,BillCode , BillDate ,BillPrice ;  
     AddNew1=new JLabel("Add New Bill "); 
     AddNew1.setBounds(420,30, 200,30);  
     BillCode=new JLabel("Bill Code");  
     BillCode.setBounds(200,100, 200,30);  
     BillDate=new JLabel("Bill Date");  
     BillDate.setBounds(200,250, 100,30);  
     BillPrice=new JLabel("Bill Price");  
     BillPrice.setBounds(200,400, 100,30);
     
/***********************************************************************/

//Panel9_TextField
     JTextField BillCode1 , BillDate1 ,BillPrice1  ; 
     BillCode1 = new JTextField() ; 
     BillCode1.setBounds(300,100 ,400 , 30) ;
     BillDate1 = new JTextField() ; 
     BillDate1.setBounds(300,250 ,400 , 30) ;
     BillPrice1 = new JTextField() ; 
     BillPrice1.setBounds(300,400 ,400 , 30) ;
     
/***********************************************************************/

//Panel9_Adds
     f.add(AddNew1);
     f.add(BillCode);
     f.add(BillDate);
     f.add(BillPrice);
     f.add(BillCode1);
     f.add(BillDate1);
     f.add(BillPrice1);
     f.add(b13);
     f.add(panel9);
   
 //Action
 b13.addActionListener(new ActionListener() {
        Billing bil = new Billing();
        protected void resetPanelData ()
        {
        BillCode1.setText("");
        BillDate1.setText("");
        BillPrice1.setText("");
   
        }
         @Override
         public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!BillCode1.getText().equals("")&&!BillDate1.getText().equals("")&&!BillPrice1.getText().equals(""))
        {   
             bil.setCode(Double.parseDouble( BillCode1.getText()));  
             bil.setDate(BillDate1.getText());
             bil.setPrice(Double.parseDouble( BillPrice1.getText()));
           
            if(bil.addbilling()&&!BillCode1.getText().equals("")||!BillDate1.getText().equals("")||!BillPrice1.getText().equals(""))
            {   
                
                JOptionPane.showMessageDialog(null, "Billings Added Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to add Billings!");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Please Enter Data!");
         }}) ; 
}}

