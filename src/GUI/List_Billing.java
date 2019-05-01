/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Resturant.Billing;
import Resturant.Employee;
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
public class List_Billing extends JFrame {
    {
        JFrame f= new JFrame("List Bill");
        f.setBounds(401,64,900,654);
      //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        //Panel10
     JPanel panel10=new JPanel();  
     panel10.setBounds(0,0,900,650);
     panel10.setBackground(Color.decode("#9EC970")) ;
     
/***********************************************************************/

//Panel10_Labels
     JLabel intro10;  
     intro10=new JLabel("**Billings Data**");  
     intro10.setBounds(400,50, 200,30);
     
/***********************************************************************/

//Panel10_Table
     String data1[][]={ {"","","",},{"","","",},{"","","",},{"","","",}
     ,{"","","",},{"","","",},{"","","",},{"","","",},{"","","",},{"","","",}
     ,{"","","",},{"","","",},{"","","",},{"","","",},{"","","",},{"","","",}
     ,{"","","",},{"","","",},{"","","",},{"","","",},{"","","",},{"","","",}
     ,{"","","",},{"","","",},{"","","",},{"","","",},{"","","",},{"","","",}};    
            String column1[]={"Bill Code","Bill Date","Bill Price"};         
            final JTable jt1=new JTable(data1,column1);                  
            JScrollPane sp1=new JScrollPane(jt1);    
            sp1.setBounds(160,130 ,595,471 );
            jt1.setBackground(Color.decode("#9EC970")); 
            jt1.setBorder(BorderFactory.createLineBorder(Color.decode("#2c655d")));
            
            Billing bil = new Billing();
           ArrayList<Billing>  Billings = new ArrayList< Billing>();
            Billings = bil.listBilling();
           int i = 0 ;
        for ( Billing x :  Billings) {
            data1[i][0] = Double.toString(x.getCode());
            data1[i][1] = x.getDate();
            data1[i][2] = Double.toString(x.getPrice()); 
             i++; }
/***********************************************************************/

//Panel10_Adds
    f.add(intro10);          
    f.add(sp1);
    f.add(panel10);
    }
    
}
