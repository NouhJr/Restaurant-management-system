/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Resturant.Customer;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author dell
 */
public class List_Cusromer extends JFrame{
    {JFrame f= new JFrame("List Customers");
        f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        //Panel3
        JPanel panel3=new JPanel();  
        panel3.setBounds(0,0,900,650);
        panel3.setBackground(Color.decode("#9187c2")) ;
        
/***********************************************************************/

//Panel3_Labels
          JLabel intro4;  
          intro4=new JLabel("Customers Database");  
          intro4.setBounds(400,50, 200,30);

/***********************************************************************/

//Panel3_Table
                String data[][]={ {"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""},{"","","","","",""},{"","","","","",""}
                ,{"","","","","",""}};    
            String column[]={"First Name","Last Name","Age","ID","Date Of Join","Wallet"};         
            final JTable jt=new JTable(data,column);                  
            JScrollPane sp=new JScrollPane(jt);    
            sp.setBounds(160,110 ,595,471 );
            jt.setBackground(Color.decode("#9dc3be")); 
            jt.setBorder(BorderFactory.createLineBorder(Color.decode("#2c655d")));
            
            Customer c = new Customer();
            ArrayList<Customer> Customers = new ArrayList<Customer>();
           Customers = c.listCustomer();
           int i = 0 ;
        for (Customer x : Customers) {
            data[i][0] = x.getFname();
            data[i][1] = x.getLname();
            data[i][2] = Integer.toString(x.getAge());
            data[i][3] = Integer.toString(x.getId());
            data[i][4] = x.getDoJ();
            data[i][5] = x.getWallet();  
             i++;}
/******************************************************************************************/

//Panel3_Adds
        f.add(intro4);          
        f.add(sp);
        f.add(panel3);
        
/******************************************************************************************/ 


    }
    
}
