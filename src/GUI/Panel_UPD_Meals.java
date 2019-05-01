/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Resturant.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ultra tech
 */
public class Panel_UPD_Meals extends JFrame{
    {
        JFrame f= new JFrame("Update/Delete");
        f.setBounds(200,10,900,650);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        
        //Panel8
        JPanel panel8=new JPanel();
        panel8.setBounds(0,0,900,650);
        panel8.setBackground(Color.decode("#538fa4"));
        
/***********************************************************************/

//Panel8_Buttons
        JButton meals_b4=new JButton("Search"); 
        JButton meals_b5=new JButton("Update"); 
        JButton meals_b6=new JButton("Delete"); 
        
         meals_b4.setBounds(570,90,100,30);
         meals_b4.setBackground(Color.decode("#2a5260"));
         meals_b4.setForeground(Color.decode("#538fa4"));
         
         meals_b5.setBounds(240,550, 200,30);
         meals_b5.setBackground(Color.decode("#2a5260"));
         meals_b5.setForeground(Color.decode("#538fa4"));
         
         meals_b6.setBounds(480,550, 200,30);
         meals_b6.setBackground(Color.decode("#2a5260"));
         meals_b6.setForeground(Color.decode("#538fa4"));

/***********************************************************************/

//Panel8_Labels
          JLabel name_m ,code_m,price_m,intro_m;  
          intro_m=new JLabel("**Update/Delete a Meal**");  
          intro_m.setBounds(400,30, 200,30);  
          name_m=new JLabel("Name");  
          name_m.setBounds(200,180, 100,30);  
          code_m=new JLabel("Code");  
          code_m.setBounds(200,450, 100,30);
          price_m=new JLabel("Price");  
          price_m.setBounds(200,315, 100,30);

/***********************************************************************/

//Panel8_TextField
          JTextField namemeal , codemeal , pricemeal  ,searchmeal ; 
          searchmeal = new JTextField("Enter Meal Code!") ; 
          searchmeal.setBounds(200,90 ,330 , 30) ;
          namemeal = new JTextField() ; 
          namemeal.setBounds(275,180 ,400 , 30) ;
          pricemeal = new JTextField() ; 
          pricemeal.setBounds(275,315 ,400 , 30) ;
          codemeal = new JTextField() ; 
          codemeal.setBounds(275,450 ,400 , 30) ; 

/***********************************************************************/

//Panel8_Adders
        f.add(meals_b4) ; 
        f.add(meals_b5) ; 
        f.add(meals_b6);
        f.add(searchmeal);
        f.add(namemeal) ;
        f.add(codemeal) ;
        f.add(pricemeal) ;
        f.add(intro_m); 
        f.add(name_m);
        f.add(code_m); 
        f.add(price_m); 
        f.add(panel8);
/***********************************************************************/
//Actions
/***********************************************************************/
meals_b5.addActionListener(new ActionListener() {
    Meals meal = new Meals();
    protected void resetPanelData ()
    {
        namemeal.setText("");
        codemeal.setText("");
        pricemeal.setText("");
        
    }
    
        @Override
        public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!namemeal.getText().equals("")&&!codemeal.getText().equals("")&&!pricemeal.getText().equals(""))
        {   
            meal.setMeal_name(namemeal.getText());
            meal.setPrice(Double.parseDouble(pricemeal.getText()));
            meal.setId(Integer.parseInt(codemeal.getText()));
           
            if (meal.updateMeals(Integer.parseInt(searchmeal.getText()),meal))     
            {
                JOptionPane.showMessageDialog(null, "Meal Updated Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to Update Meal !");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Enter Data!");
        }
         }}) ; 
//Action
//search
 meals_b4.addActionListener(new ActionListener() {
    protected void setPanelData(Meals meal)
    {
            namemeal.setText(""+ meal.getMeal_name());
            pricemeal.setText(""+meal.getPrice());
            codemeal.setText(""+meal.getId());

    }
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
        if(!searchmeal.getText().equals(""))
        {   
            Meals meal1 = new Meals();
            Meals returned = meal1.searchMeals(Integer.parseInt(searchmeal.getText()));
            if (returned.getId()>0)
            {
                intro_m.setText("Found!..");
                setPanelData(returned);
            }
            else
            {
                intro_m.setText("Not Found!..");
            }
        }
        else
        {
            intro_m.setText("Missing required Fields ... !  Please, Search By ID ...");
        }
         }}) ;
//del
 meals_b6.addActionListener(new ActionListener() {
        protected void resetPanelData ()
    {
        namemeal.setText("");
        codemeal.setText("");
        pricemeal.setText("");
        
    }
         @Override
        public void actionPerformed(ActionEvent C_A) {
            Object x=C_A.getSource();
        if(!searchmeal.getText().equals(""))
        {   
            Meals meal2 = new Meals();
            Meals returned = meal2.searchMeals(Integer.parseInt(searchmeal.getText()));
            if (meal2.deleteMeals(Integer.parseInt(searchmeal.getText())))     
            {
                JOptionPane.showMessageDialog(null, "Meal Deleted Successfully!");
                resetPanelData();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to Delete Meal !");
            }
        }
        else
        {
            intro_m.setText("Missing required Fields ... !  Please, Search By ID ...");
        }
         
         }})
         ;  
//meals_b5.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x=C_A.getSource();
//        if(x.equals(meals_b5))
//        {   
//           JOptionPane.showMessageDialog(null, "Meal Updated Successfully!");
//        }
// }}) ;
///***********************************************************************/
//meals_b6.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x=C_A.getSource();
//        if(x.equals(meals_b6))
//        {   
//           JOptionPane.showMessageDialog(null, "Meal Deleted Successfully!");
//        }
// }}) ;

    }
    
}
