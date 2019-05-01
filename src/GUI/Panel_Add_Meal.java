/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Resturant.Meals;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ultra tech
 */
public class Panel_Add_Meal extends JFrame{
    {
        JFrame f= new JFrame("Add New Meal");
        f.setBounds(200,10,900,650);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        //Panel6
        JPanel P6=new JPanel();  
        P6.setBounds(0,0,900,650);   
        P6.setBackground(Color.decode("#538fa4")) ;
        
/***********************************************************************/        

//Panel6_Labels
          JLabel meal_name,meal_id,price,introd;  
          introd=new JLabel("**Add New Meal**"); 
          introd.setBackground(Color.decode("#2a5260"));
          introd.setBounds(425,25, 200,30);  
          meal_name=new JLabel("Name ");  
          meal_name.setForeground(Color.decode("#2a5260"));
          meal_name.setBounds(230,95, 100,30);  
          meal_id=new JLabel("Price");  
          meal_id.setForeground(Color.decode("#2a5260"));
          meal_id.setBounds(230,285, 100,30); 
          price=new JLabel("ID");  
          price.setForeground(Color.decode("#2a5260"));
          price.setBounds(235,475, 100,30);
     
/***********************************************************************/

//Panel6_TextFields 
          JTextField m_name , m_id ,m_price ; 
          m_name = new JTextField() ; 
          m_name.setBounds(280,95 ,400 , 30) ;
          m_price = new JTextField() ; 
          m_price.setBounds(280,285 ,400 , 30) ;
          m_id = new JTextField() ; 
          m_id.setBounds(280,475 ,400 , 30) ;
 
/***********************************************************************/    

//Panel6_Buttons
         JButton P6_Bttn1=new JButton("ADD");
         P6_Bttn1.setForeground(Color.decode("#538fa4"));
         P6_Bttn1.setBounds(380,550,200,30); 
         P6_Bttn1.setBackground(Color.decode("#2a5260"));
/***********************************************************************/
          
//Panel6_Adds      
        f.add(P6_Bttn1) ; 
        f.add(m_name) ;
        f.add(m_id) ;
        f.add(m_price) ;
        f.add(introd); 
        f.add(meal_name);
        f.add(meal_id); 
        f.add(price);
        f.add(P6);
/***********************************************************************/
//Action

P6_Bttn1.addActionListener(new ActionListener() {
    //offers
    Meals meal = new Meals();
    protected void resetPanelData ()
        {
            m_name.setText("");
            m_id.setText("");
            m_price.setText("");
        }
    
        @Override
        public void actionPerformed(ActionEvent C_A) {
             Object x=C_A.getSource();
            
            if(!m_name.getText().equals("")&&!m_id.getText().equals("")&&!m_price.getText().equals(""))
            {
                meal.setMeal_name(m_name.getText());
                meal.setId(Integer.parseInt(m_id.getText()));
                meal.setPrice(Double.parseDouble(m_price.getText()));
                if(meal.addMeals()&&!m_name.getText().equals("")||!m_id.getText().equals("")||!m_price.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Meal Added Successfully!");
                    resetPanelData();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Failed to add Meal!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Failed to add Meal!.....Please Enter Data!");
            }
        }});
/***********************************************************************/
    }
}
/*else if(i==2)
                {
                    ++i;
                    JOptionPane.showMessageDialog(null, "Meal Added Successfully!");
                    JOptionPane.showMessageDialog(null, "Enjoy with 25% Discount!");
                    resetPanelData();
                }*/