package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Omar
 */
public class Employee_DashBoard extends JFrame {
   
    { 
/*********************M A I N_F R A M E************************/ 
        
/***************************************************************/        
//Main_Frame        
          JMenu Manage;  
          JMenuItem i1, i2,i3; 
          JFrame f= new JFrame("Employee DashBoard");  
          JMenuBar MenuBar=new JMenuBar();
          Manage=new JMenu("Manage");
          i3=new JMenuItem ("Customer");
          i1=new JMenuItem("Orders");  
          i2=new JMenuItem("Billings");  
          Manage.add(i3);
          Manage.add(i1);
          Manage.add(i2);
          MenuBar.add(Manage); 
          
/***************************************************************/
//Main_Frame_Setters 
        f.setJMenuBar(MenuBar);
        f.setSize(1920,1080);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);
        f.setResizable(false);
        
/***************************************************************/

/********************************M A I N _ V E I W********************************************/

//Panel

JPanel Panel0=new JPanel();
Panel0.setBounds(620, 220, 128, 128);
Panel0.setBackground(Color.decode("#8EAFAA"));

JPanel Panel00=new JPanel();
Panel00.setBounds(485, 350, 400, 100);
Panel00.setBackground(Color.decode("#8EAFAA"));
/***********************************************************************/

//Panel_Labels
JLabel l1=new JLabel();
JLabel l2=new JLabel();
JLabel l4=new JLabel();

JLabel l5=new JLabel("Welcome Employee");
l5.setBounds(630, 380, 200, 30);
/***********************************************************************/

//Panel_Images

ImageIcon img, img2;
     img = new ImageIcon(getClass().getResource("breakfast-2359617_1920.jpg"));
     l1 = new JLabel(img);
     
     l1.setBounds(0,0,1366,768);
    
img2 = new ImageIcon(getClass().getResource("236822.png"));
     l4 = new JLabel(img2);
     l4.setBounds(3,400, 500, 300);
     
     
/***********************************************************************/

//Panel_Separator
JSeparator s=new JSeparator();
s.setBounds(590, 410, 180, 30);
/***********************************************************************/

//Panel_Adds

Panel0.add(l4);
f.add(l2);
f.add(Panel0);
f.add(l5);
f.add(s);
f.add(Panel00);
f.add(l1);
/***********************************************************************/

/***********************************************************************/
/***********************************************************************/

/*************************C U S T O M E R******************************/

/*************************M A I N _ P A N E L******************************/
i3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(i3))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 Main_Panel_Customer_Button main_Panel_Customer_Button = new  Main_Panel_Customer_Button();
         }
         }}) ; 

        
/***********************************************************************/

/***************************P A N E L 2 _ A D D**************************/
//
//b1.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x1=C_A.getSource();
//        if(x1.equals(b1))
//        {   
//                 //Employee_DashBoard em=new Employee_DashBoard();
//                 Panel2_Add_Employee panel2_Add_Employee = new Panel2_Add_Employee();
//         }
//         }}) ; 
///***********************************************************************/
//
///***************************P A N E L 3 _ L I S T**************************/
//b2.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x1=C_A.getSource();
//        if(x1.equals(b2))
//        {   
//                 //Employee_DashBoard em=new Employee_DashBoard();
//                 Panel3_List_Employee panel3_List_Employee = new Panel3_List_Employee();
//         }
//         }}) ; 
//
///***************************P A N E L 4 _ E D I T**************************/
//
//b3.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x1=C_A.getSource();
//        if(x1.equals(b3))
//        {   
//                 //Employee_DashBoard em=new Employee_DashBoard();
//                 Panel4_Edit_Employee panel4_Edit_Employee = new Panel4_Edit_Employee();
//         }
//         }}) ; 

        
/******************************************************************************************/

/***********************************************************************/
/***********************************************************************/

/*************************O R D E R******************************/

/*************************M A I N _ P A N E L******************************/

i1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(i1))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 Main_Panel_Order_Button main_Panel_Order_Button = new Main_Panel_Order_Button();
         }
         }}) ; 
/***********************************************************************/

/*************************P A N E L 6 _ A D D******************************/
//b7.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x1=C_A.getSource();
//        if(x1.equals(b7))
//        {   
//                 //Employee_DashBoard em=new Employee_DashBoard();
//                 Panel6_Add_Employee panel6_Add_Employee = new Panel6_Add_Employee();
//         }
//         }}) ; 
//        
///***********************************************************************/
//
///*************************P A N E L 7 _ D E L E T E******************************/
//b8.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x1=C_A.getSource();
//        if(x1.equals(b8))
//        {   
//                 //Employee_DashBoard em=new Employee_DashBoard();
//                 Panel7_Delete_Employee panel7_Delete_Employee = new Panel7_Delete_Employee();
//         }
//         }}) ; 
//        
         
/***********************************************************************/ 

/***********************************************************************/
/***********************************************************************/

/*************************B I L L I N G S******************************/

/*************************M A I N _ P A N E L******************************/

i2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent C_A) {
             Object x1=C_A.getSource();
        if(x1.equals(i2))
        {   
                 //Employee_DashBoard em=new Employee_DashBoard();
                 Main_Panel_Billings_Button main_Panel_Billings_Button = new Main_Panel_Billings_Button();
         }
         }

        
      }) ; 
     
/***********************************************************************/

/*************************P A N E L 9 _ A D D******************************/

//b11.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x1=C_A.getSource();
//        if(x1.equals(b11))
//        {   
//                 //Employee_DashBoard em=new Employee_DashBoard();
//                 Panel9_Add_Employee panel9_Add_Employee = new Panel9_Add_Employee();
//         }
//         }}) ; 
//     
///***********************************************************************/
//
///*************************P A N E L 10 _ L I S T******************************/
//b12.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent C_A) {
//             Object x1=C_A.getSource();
//        if(x1.equals(b12))
//        {   
//             //Employee_DashBoard em=new Employee_DashBoard();
//            new Panel10_List_Employee();
//         }
//         }}) ; 
/***********************************************************************/

/*******************************************************************************************************************/
/*******************************************************************************************************************/
                                            /* D O N E !*/     
/*******************************************************************************************************************/
/*******************************************************************************************************************/
    } 
}
