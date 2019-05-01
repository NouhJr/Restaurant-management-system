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
public class Panel_List_Meals extends JFrame{
    {
        JFrame f= new JFrame("List Meals");
        f.setBounds(200,10,900,650);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        //Panel7
        JPanel panel7=new JPanel();
        panel7.setBounds(0,0,900,650);
        panel7.setBackground(Color.decode("#538fa4"));
        
/***********************************************************************/

//Panel7_Labels
       JLabel P7_Lb;
       P7_Lb=new JLabel("**MEALS**");
       P7_Lb.setBounds(410,35,200,30);

/***********************************************************************/

//Panel7_Table
      String data[][]={ {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""},
                        {"","",""},{"","",""},{"","",""}};    
            String column[]={"Name","ID","Price"};         
            final JTable jt=new JTable(data,column);                  
            JScrollPane sp=new JScrollPane(jt);    
            sp.setBounds(80,100 ,690,555 );
            jt.setBackground(Color.decode("#9dc3be")); 
            jt.setBorder(BorderFactory.createLineBorder(Color.decode("#2c655d")));
            
             Meals e = new Meals();
           ArrayList<Meals> meal = new ArrayList<Meals>();
           meal = e.listMeals();
           int i = 0 ;
        for (Meals x : meal) {
            data[i][0] = x.getMeal_name();
            data[i][1] = Integer.toString(x.getId());
            data[i][2] = Double.toString(x.getPrice());       
             i++; } 
            
/***********************************************************************/

//Panel7_Adds
      f.add(sp);
      f.add(P7_Lb);
      f.add(panel7);
    }
}
