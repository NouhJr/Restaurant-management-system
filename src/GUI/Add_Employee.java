/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Resturant.*;
/**
 *
 * @author Omar
 */
public class Add_Employee extends JFrame {
    {
        JFrame f= new JFrame("Add Employee");
        f.setBounds(200,10,900,650);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
/***********************************************************************/
//*****************************P A N E L1_A D D**************************//
        //Panel1
        
        JPanel Dynamic_panel_AddEmployee=new JPanel();  
        Dynamic_panel_AddEmployee.setBounds(0,0,900,650);    
        Dynamic_panel_AddEmployee.setBackground(Color.decode("#769E88"));
/***********************************************************************/          
        //Panel1_Buttons
        
        JButton b=new JButton("Submit");
        b.setBounds(250,550, 200,30);
          
/***********************************************************************/
     //Panel1_Separator
     
     JSeparator S0;
     S0=new JSeparator();
     S0.setBounds(270,70 , 150,30 );
     
/***********************************************************************/
        
        //Panel1_Labels
          
        
          JLabel name,id,Lname,age,password,intro,username;  
          intro=new JLabel("**Add New Employee**");  
          intro.setBounds(280,30, 200,30);  
          name=new JLabel("First Name ");  
          name.setBounds(30,80, 100,30); 
          Lname=new JLabel("Last Name");  
          Lname.setBounds(30,160, 100,30);
          id=new JLabel("ID");  
          id.setBounds(30,240, 100,30);
          username = new JLabel("Username");
          username.setBounds(30,320,100,30);
          password=new JLabel("Password");  
          password.setBounds(30,480, 100,30);
          age=new JLabel("age");  
          age.setBounds(30,400, 100,30);
          
        
/***********************************************************************/        
         //Panel1_TextFields 
          
          
          JTextField name1 ,lname, id1 ,password1 , UserName , age1 ; 
          name1 = new JTextField() ; 
          name1.setBounds(150,80 ,400 , 30) ;
          lname = new JTextField();
          lname.setBounds(150,160 ,400 , 30) ;
          id1 = new JTextField() ; 
          id1.setBounds(150,240 ,400 , 30) ;
          UserName = new JTextField() ; 
          UserName.setBounds(150,320 ,400 , 30) ;
          age1 = new JTextField() ; 
          age1.setBounds(150,400 ,400 , 30) ;
          password1 = new JTextField() ; 
          password1.setBounds(150,480 ,400 , 30) ;
         
          
/***********************************************************************/        
        //Panel1_Adds
        
        f.add(b) ; 
        f.add(name1) ;
        f.add(lname);
        f.add(age1) ;
        f.add(id1) ;
        f.add(UserName) ;
        f.add(password1) ;
        f.add(intro);
        f.add(S0);
        f.add(name);
        f.add(id); 
        f.add(Lname); 
        f.add(username);
        f.add(password); 
        f.add(age); 
        f.add(Dynamic_panel_AddEmployee);
        
 /***********************************************************************/
 //Action

 b.addActionListener(new ActionListener() {
        Employee emp = new Employee();
        protected void resetPanelData ()
        {
        name1.setText("");
        lname.setText("");
        age1.setText("");
        id1.setText("");
        UserName.setText    ("");
        password1.setText("");
        }
        
        @Override
        public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!name1.getText().equals("")&&!lname.getText().equals("")&&!age1.getText().equals("")&& 
                !id1.getText().equals("")&&!UserName.getText().equals("")&&!password1.getText().equals(""))
        {   
            emp.setId(Integer.parseInt(id1.getText()));
            emp.setFname(name1.getText());
            emp.setLname(lname.getText());
            emp.setUsername(UserName.getText());
            emp.setPassword(password1.getText());  
            emp.setAge(Integer.parseInt(age1.getText())); 
            if(emp.addemployee() &&!name1.getText().equals("")||!lname.getText().equals("")||!age1.getText().equals("")|| 
                !id1.getText().equals("")||!UserName.getText().equals("")||!password1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Employee Added Successfully!");
                resetPanelData();
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Failed to add Employee!");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Please Enter Data!");
         }}) ; 
    }
}
