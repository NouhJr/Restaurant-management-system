/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Resturant.Customer;
import Resturant.Employee;
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
public class Update_Delete_Customer extends JFrame{
    {    JFrame f= new JFrame("Update/Delete Employee");
        f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
    //Main_Panel
        JPanel panel1=new JPanel();  
        panel1.setBounds(0,0,900,654);
        panel1.setBackground(Color.decode("#967BBB")) ;
        
/***********************************************************************/

//Panel13_Buttons
         JButton P13_b8 = new JButton("Search"); 
         JButton  P13_b9=new JButton("Submit");  
         JButton del=new JButton("Delete");
         
         P13_b8.setBounds(500,100,80,30);
         P13_b9.setBounds(250,580, 200,30); 
         del.setBounds(400,100,80,30);
         
/***********************************************************************/

//Panel13_Labels
          JLabel name2,lname2,age2,intro2,id2,doj2,Wallet2;  
          intro2=new JLabel("**Update/Delete Employee**");  
          intro2.setBounds(250,50, 200,30);  
          name2=new JLabel("Frist Name");  
          name2.setBounds(80,170, 100,30);  
          lname2=new JLabel("Last Name");  
          lname2.setBounds(80,250, 100,30); 
          age2=new JLabel("Age");  
          age2.setBounds(80,320, 100,30);
          id2=new JLabel("ID");  
          id2.setBounds(80,390, 100,30);
          doj2=new JLabel("DoJ");  
          doj2.setBounds(80,460, 100,30);
          Wallet2=new JLabel("Wallet");  
          Wallet2.setBounds(80,530, 100,30);
          
/***********************************************************************/

//Panel13_TextField
          JTextField name3 , lname3 ,age3 ,Wallet3 ,id3,search3,doj3 ; 
          search3 = new JTextField("Enter Customer ID !") ; 
          search3.setBounds(80,100 ,300 , 30) ;
          name3 = new JTextField() ; 
          name3.setBounds(180,170 ,400 , 30) ;
          lname3= new JTextField() ; 
          lname3.setBounds(180,250 ,400 , 30) ;
          age3 = new JTextField() ; 
          age3.setBounds(180,320 ,400 , 30) ;
          id3= new JTextField() ; 
          id3.setBounds(180,390 ,400 , 30) ;
          doj3 = new JTextField() ; 
          doj3.setBounds(180,460 ,400 , 30) ;
          Wallet3 = new JTextField() ; 
          Wallet3.setBounds(180,530 ,400 , 30) ;
          
/***********************************************************************/

//Panel13_Adds
        f.add(del);
        f.add(P13_b9);
        f.add(P13_b8);
        f.add(search3);
        f.add(name2) ;
        f.add(age2) ;
        f.add(id2) ;
        f.add(lname2) ;
        f.add(Wallet2);
        f.add(intro2); 
        f.add(name3);
        f.add(id3); 
        f.add(doj2);
        f.add(doj3);
        f.add(lname3);
        f.add(Wallet3);
        f.add(age3); 
        f.add(panel1);
        
/***********************************************************************/
P13_b9.addActionListener(new ActionListener() {
    
    protected void resetPanelData ()
    {
        
        name3.setText("");
        lname3.setText("");
        age3.setText("");
        id3.setText("");
        doj3.setText("");
        Wallet3.setText("");
    }
    
         @Override
        public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!name3.getText().equals("")&&!lname3.getText().equals("")&&!id3.getText().equals("")&& 
                !doj3.getText().equals("")&&!Wallet3.getText().equals(""))
        {   
            Customer cus = new Customer();
            cus.setFname(name3.getText());
            cus.setLname(lname3.getText());
            cus.setId(Integer.parseInt(id3.getText()));
            cus.setAge(Integer.parseInt(age3.getText()));
            cus.setDoJ(doj3.getText());
            cus.setWallet(Wallet3.getText());
            
            if (cus.updateCustomer(Integer.parseInt(search3.getText()),cus))     
            {
                JOptionPane.showMessageDialog(null, "Customer Updated Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to Update Customer!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Enter Data!");
        }
         }}) ; 
//Action
//search
 P13_b8.addActionListener(new ActionListener() {
    protected void setPanelData(Customer cus)
    {
        name3.setText(""+cus.getFname());
        lname3.setText(""+cus.getLname());
        id3.setText(""+cus.getId());
        age3.setText(""+cus.getAge());
        doj3.setText(""+cus.getDoJ());
        Wallet3.setText(""+cus.getWallet());
    }
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(!search3.getText().equals(""))
        {   
            Customer cus2 = new Customer();
            Customer returned = cus2.searchcustomer(Integer.parseInt(search3.getText()));
            if (returned.getId()>0)
            {
                intro2.setText("Found!..");
                setPanelData(returned);
            }
            else
            {
                intro2.setText("Not Found!..");
            }
        }
        else
        {
            intro2.setText("Missing required Fields ... !  Please, Search By ID ...");
        }
         }}) ;
//delete
 del.addActionListener(new ActionListener() {
        protected void resetPanelData ()
    {
        name3.setText("");
        lname3.setText("");
        age3.setText("");
        id3.setText("");
        doj3.setText("");
        Wallet3.setText("");
    }
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(!search3.getText().equals(""))
        {   
            Customer cus2 = new Customer();
            Customer returned = cus2.searchcustomer(Integer.parseInt(search3.getText()));
            if (cus2.deleteCustomer(Integer.parseInt(search3.getText())))     
            {
                JOptionPane.showMessageDialog(null, "Customer Deleted Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to Delete Customer!");
            }
        }
        else
        {
            intro2.setText("Missing required Fields ... !  Please, Search By ID ...");
        }
         
         }})
         ;  
    }
}
