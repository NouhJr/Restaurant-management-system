/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Resturant.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Omar
 */
public class Panel_Add_Report extends JFrame {
    
    {
        JFrame f= new JFrame("Add New Report");
        f.setBounds(200,10,900,650);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        //Panel10
        JPanel panel_r=new JPanel();  
        panel_r.setBounds(0,0,900,650);    
        panel_r.setBackground(Color.decode("#9dc3be")) ;  

/***********************************************************************/

//Panel10_Buttons
        JButton b3_r=new JButton("Employee Report");  
        JButton b4_r=new JButton("Customer Report");
        
        b3_r.setForeground(Color.decode("#9dc3be"));
        b3_r.setBounds(280,550, 150,30); 
        b3_r.setBackground(Color.decode("#2c655d"));
        b4_r.setBounds(480,550, 150,30); 
        b4_r.setBackground(Color.decode("#2c655d"));
        b4_r.setForeground(Color.decode("#9dc3be"));

/***********************************************************************/

//Panel10_Labels
          JLabel desc,rcode,rintrod;  
          rintrod=new JLabel("**Make New Report**"); 
          rintrod.setForeground(Color.decode("#2c655d"));
          rintrod.setBounds(380,70, 200,30);  
          desc=new JLabel("Description");  
          desc.setForeground(Color.decode("#2c655d"));
          desc.setBounds(160,150, 100,30);  
          rcode=new JLabel("Code");  
          rcode.setForeground(Color.decode("#2c655d"));
          rcode.setBounds(160,450, 100,30);

/***********************************************************************/

//Panel10_TextField
          JTextField r_code ; 
          JTextArea r_desc ; 
          r_desc = new JTextArea() ; 
          r_desc.setBounds(250,150 ,400 , 200) ;
          r_code = new JTextField() ; 
          r_code.setBounds(250,450 ,400 , 30) ;
          
/***********************************************************************/

//Panel10_Adders
             f.add(b3_r) ;
             f.add(b4_r) ; 
             f.add(desc) ;
             f.add(rcode) ;
             f.add(rintrod) ;
             f.add(r_desc); 
             f.add(r_code);
             f.add(panel_r) ;
             
/***********************************************************************/
//Employee Reports
b3_r.addActionListener(new ActionListener() {
        Reports Rep = new Reports();
        protected void resetPanelData ()
        {
            r_code.setText("");
            r_desc.setText("");
        }
        @Override
        public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!r_code.getText().equals("")&&!r_desc.getText().equals(""))
        {   
            Rep.setCode(Integer.parseInt(r_code.getText()));
            Rep.setDescription(r_desc.getText());
            if(Rep.addReportsemp()&&!r_code.getText().equals("")||!r_desc.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Employee Report Added Successfully!");
                resetPanelData();
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Failed to add Employee Report!");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Please Enter Data!");
         }}) ; 
//customer Report
b4_r.addActionListener(new ActionListener() {
        Reports Rep2 = new Reports();
        protected void resetPanelData ()
        {
            r_code.setText("");
            r_desc.setText("");
        }
        @Override
        public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!r_code.getText().equals("")&&!r_desc.getText().equals(""))
        {   
            Rep2.setCode(Integer.parseInt(r_code.getText()));
            Rep2.setDescription(r_desc.getText());
            if(Rep2.addReportsemp()&&!r_code.getText().equals("")||!r_desc.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Customer Report Added Successfully!");
                resetPanelData();
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Failed to add Customer Report!");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Please Enter Data!");
         }}) ; 
    }
    
}
