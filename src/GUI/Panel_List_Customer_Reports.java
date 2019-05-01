/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import Resturant.* ; 
import java.util.ArrayList;

/**
 *
 * @author ultra tech
 */
public class Panel_List_Customer_Reports extends JFrame {
    {
       JFrame f= new JFrame("Customer Reports");
        f.setBounds(200,10,900,650);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        //Panel12
        JPanel panel_rc=new JPanel();  
        panel_rc.setBounds(0,0,900,650);    
        panel_rc.setBackground(Color.decode("#9dc3be")) ; 
        
/***********************************************************************/

//Panel12_Labels
          JLabel rcintrod;  
          rcintrod=new JLabel("Customers Reports"); 
          rcintrod.setForeground(Color.decode("#2c655d"));
          rcintrod.setBounds(380,30, 200,30);

/***********************************************************************/

//Panel12_Table
               String data00[][]={ {"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},
                         {"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},
                         {"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""}, 
                         {"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""}};    
            String column00[]={"Code","Description"};         
            final JTable jte1=new JTable(data00,column00);                  
            JScrollPane spe1=new JScrollPane(jte1);    
            spe1.setBounds(150,85,595,471);
            jte1.setBackground(Color.decode("#9dc3be")); 
            jte1.setBorder(BorderFactory.createLineBorder(Color.decode("#2c655d")));
            
         /*   Reports e = new Reports();
           ArrayList<Reports> reports = new ArrayList<Reports>();
           reports = e.listReportcus();
           int i = 0 ;
        for (Reports x : reports ) {
            data00[i][0] = Integer.toString(x.getCode()) ;
            data00[i][1] = x.getDescription();
             i++; } */
/***********************************************************************/

//Panel12_Adds
          f.add(spe1); 
          f.add(rcintrod) ;
          f.add(panel_rc) ;
    }
    
}
