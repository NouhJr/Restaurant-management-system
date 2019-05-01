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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Resturant.Customer ; 
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Add_Customer extends JFrame
{
    {JFrame f= new JFrame("Add New Customer");
       f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
    //Panel2
        JPanel panel2=new JPanel();  
        panel2.setBounds(0,0,900,650);
        panel2.setBackground(Color.decode("#9187c2"));

/***********************************************************************/

//Panel2_Buttons
         JButton b4=new JButton("Submit");
         b4.setBounds(750,550, 100,30); 
         b4.setForeground(Color.decode("#967BBB")) ;
         b4.setBackground(Color.decode("#382889")) ;

/***********************************************************************/

//Panel2_Labels
          JLabel intro3,fname,lname,age4,id4,DateOfJoin,Wallet;  
          intro3=new JLabel("Add New Customer");  
          intro3.setBounds(400,40, 200,30);  
          fname=new JLabel("First Name ");  
          fname.setBounds(200,100 ,400 , 30);  
          lname=new JLabel("Last Name");  
          lname.setBounds(200,170 ,400 , 30); 
          age4=new JLabel("Age");  
          age4.setBounds(200,240 ,400 , 30);
          id4=new JLabel("ID");  
          id4.setBounds(200,310 ,400 , 30);
          DateOfJoin=new JLabel("Date Of Join");  
          DateOfJoin.setBounds(200,380 ,400 , 30);
          Wallet=new JLabel("Wallet");  
          Wallet.setBounds(200,450 ,400 , 30);
          
/***********************************************************************/

//Panel2_TextFields
          JTextField fname1,lname1,age5,id5,DateOfJoin1,Wallet1;  
          fname1 = new JTextField() ; 
          fname1.setBounds(300,100 ,400 , 30) ;
          lname1 = new JTextField() ; 
          lname1.setBounds(300,170 ,400 , 30) ;
          age5 = new JTextField() ; 
          age5.setBounds(300,240 ,400 , 30) ;
          id5 = new JTextField() ; 
          id5.setBounds(300,310 ,400 , 30) ;
          DateOfJoin1 = new JTextField() ; 
          DateOfJoin1.setBounds(300,380 ,400 , 30) ;
          Wallet1 = new JTextField() ; 
          Wallet1.setBounds(300,450 ,400 , 30) ;


/***********************************************************************/

//Panel2_Adds
        f.add(b4);
        f.add(intro3);          
        f.add(fname);          
        f.add(lname);
        f.add(id4);
        f.add(age4);
        f.add(DateOfJoin);          
        f.add(Wallet);
        f.add(fname1);           
        f.add(lname1);
        f.add(id5);
        f.add(DateOfJoin1);       
        f.add(Wallet1);
        f.add(age5);
        f.add(panel2);
        
        
 //Action
 b4.addActionListener(new ActionListener() {
        Customer Cus = new Customer();
        protected void resetPanelData ()
        {
        fname1.setText("");
        lname1.setText("");
        age5.setText("");
        id5.setText("");
        DateOfJoin1.setText("");
        Wallet1.setText("");
   
        }
         @Override
         public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!fname1.getText().equals("")&&!lname1.getText().equals("")&&!age5.getText().equals("")&& 
                !id5.getText().equals("")&&!DateOfJoin1.getText().equals("")&&!Wallet1.getText().equals(""))
        {   
             Cus.setId(Integer.parseInt(id5.getText()));  
             Cus.setFname(fname1.getText());    
             Cus.setDoJ(DateOfJoin1.getText());   
             Cus.setLname(lname1.getText());
             Cus.setWallet(Wallet1.getText());
             Cus.setAge(Integer.parseInt(age5.getText()));
             
             
            if(Cus.addcustomer()&&!fname1.getText().equals("")||!lname1.getText().equals("")||!age5.getText().equals("")|| 
                !id5.getText().equals("")||!DateOfJoin1.getText().equals("")||!Wallet1.getText().equals(""))
            {   
                
                JOptionPane.showMessageDialog(null, "Customer Added Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to add Customer!");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Please Enter Data!");
         }}) ; 
    
}
    
}