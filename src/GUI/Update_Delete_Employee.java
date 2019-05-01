/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Resturant.Employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Omar
 */
public class Update_Delete_Employee extends JFrame {
    {
        JFrame f= new JFrame("Update/Delete Employee");
        f.setBounds(200,10,900,650);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        /**********************P A N E L 13 _ E D I T **************************/

//Panel13
        JPanel panel2=new JPanel();
        panel2.setBounds(0,0,900,650);
        panel2.setBackground(Color.LIGHT_GRAY);
        
/***********************************************************************/

//Panel13_Buttons
         JButton P13_b8 = new JButton("Search"); 
         JButton  P13_b9=new JButton("Submit");  
         JButton del=new JButton("Delete");
         
         P13_b8.setBounds(500,70,80,30);
         P13_b9.setBounds(270,520, 200,30); 
         del.setBounds(400,70,80,30);
         
/***********************************************************************/

//Panel13_Labels
          JLabel name2,id2,email2,age2,password2,intro2,REpassword2,lname;  
          intro2=new JLabel("**Update/Delete Employee**");  
          intro2.setBounds(250,20, 200,30);  
          name2=new JLabel("Frist Name");  
          name2.setBounds(80,120, 100,30);
          lname=new JLabel("Last Name");  
          lname.setBounds(80,180, 100,30); 
          id2=new JLabel("ID");  
          id2.setBounds(80,240, 100,30); 
          email2=new JLabel("Username");  
          email2.setBounds(80,300, 100,30);
          password2=new JLabel("Password");  
          password2.setBounds(80,360, 100,30);
          REpassword2=new JLabel("RePassword");  
          REpassword2.setBounds(80,420, 100,30);
          age2=new JLabel("age");  
          age2.setBounds(80,480, 100,30);
          
/***********************************************************************/

//Panel13_TextField
          JTextField name3 , id3 ,password3 , email3 , age3 ,REPassword3,search3,lname1 ; 
          search3 = new JTextField("Enter Employee ID !") ; 
          search3.setBounds(80,70 ,300 , 30) ;
          name3 = new JTextField() ; 
          name3.setBounds(180,120 ,400 , 30) ;
          lname1 = new JTextField() ; 
          lname1.setBounds(180,180 ,400 , 30) ;
          id3 = new JTextField() ; 
          id3.setBounds(180,240 ,400 , 30) ;
          email3 = new JTextField() ; 
          email3.setBounds(180,300 ,400 , 30) ;
          password3 = new JTextField() ; 
          password3.setBounds(180,360 ,400 , 30) ;
          REPassword3 = new JTextField() ; 
          REPassword3.setBounds(180,420 ,400 , 30) ;
          age3 = new JTextField() ; 
          age3.setBounds(180,480 ,400 , 30) ;
          
/***********************************************************************/

//Panel13_Adds
        f.add(del);
        f.add(P13_b9);
        f.add(P13_b8);
        f.add(search3);
        f.add(name2) ;
        f.add(age2) ;
        f.add(id2) ;
        f.add(email2) ;
        f.add(password2) ;
        f.add(REpassword2);
        f.add(intro2); 
        f.add(name3);
        f.add(id3); 
        f.add(email3); 
        f.add(password3);
        f.add(REPassword3);
        f.add(age3); 
        f.add(lname);
        f.add(lname1);
        f.add(panel2);
        
/***********************************************************************/
P13_b9.addActionListener(new ActionListener() {
    Employee emp = new Employee();
    protected void resetPanelData ()
    {
        name3.setText("");
        lname1.setText("");
        age3.setText("");
        id3.setText("");
        email3.setText("");
        password3.setText("");
        REPassword3.setText("");
    }
    
         @Override
        public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!name3.getText().equals("")&&!lname.getText().equals("")&&!id3.getText().equals(""))
        {   
            emp.setFname(name3.getText());
            emp.setLname(lname1.getText());
            emp.setId(Integer.parseInt(id3.getText()));
            emp.setAge(Integer.parseInt(age3.getText()));
            emp.setUsername(email3.getText());
            if(password3.getText().equals(REPassword3.getText()))
            {
                emp.setPassword(password3.getText());
            }
           emp.setPassword(password3.getText());
           emp.setPassword(REPassword3.getText());
            JOptionPane.showMessageDialog(null, "Employee Successfully!");
            if (emp.updateEmployee(emp))     
            {
                JOptionPane.showMessageDialog(null, "Employee Updated Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to Update Employee!");
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
    protected void setPanelData(Employee emp)
    {
        name3.setText(""+emp.getFname());
        lname1.setText(""+emp.getLname());
        id3.setText(""+emp.getId());
        age3.setText(""+emp.getAge());
        email3.setText(""+emp.getUsername());
        password3.setText(""+emp.getPassword());
        REPassword3.setText(""+emp.getPassword());
    }
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(!search3.getText().equals(""))
        {   
            Employee emp2 = new Employee();
            Employee returned = emp2.searchEmployee(Integer.parseInt(search3.getText()));
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
//search
 del.addActionListener(new ActionListener() {
        protected void resetPanelData ()
    {
        name3.setText("");
        lname1.setText("");
        age3.setText("");
        id3.setText("");
        email3.setText("");
        password3.setText("");
        REPassword3.setText("");
    }
         @Override
        public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!search3.getText().equals(""))
        {   
            Employee emp2 = new Employee();
            Employee returned = emp2.searchEmployee(Integer.parseInt(search3.getText()));
            if (emp2.deleteEmployee(Integer.parseInt(search3.getText())))     
            {
                JOptionPane.showMessageDialog(null, "Employee Deleted Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to Delete Employee!");
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
