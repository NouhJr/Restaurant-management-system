package Resturant;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a7med
 */
public class Order implements Serializable{
    protected double code; 
    protected String pay_date;
    Meals[] item;
    protected int num_of_meals ; 
    File_manager FManger = new File_manager();
    private final String Order_filename = "Orders.bin";
    public static ArrayList<Order> Orders = new ArrayList<Order>();
    
    
    //setter
    public void setCode(double code) {
        this.code = code;
    }

    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }

    public void setNum_of_meals(int num_of_meals) {
        this.num_of_meals = num_of_meals;
    }   
    
    //getter
    public double getCode() {
        return code;
    }

    public String getPay_date() {
        return pay_date;
    }

    public int getNum_of_meals() {
        return num_of_meals;
    }
    
    public boolean addorder()
    {
        loadFromFile();
        Orders.add(this);
        return commitToFile();
    }
    private int OrderIndex(int id) {
        for (int x = 0; x < Orders.size(); x++) {
            if (Orders.get(x).getCode() == id) {
                return x;
            }
        }
        return -1;
    }
    public Order searchorder(int id) {
        Order temp = new Order();
        loadFromFile();
        int index = OrderIndex(id);
        if (index != -1) {
            return Orders.get(index);
            //return true;
        } else {
            return temp;
            //return false
        }
    }
    public boolean deleteOrder(int code) {
        loadFromFile();
        int index = (code);

        if (index != -1) {
            Orders.remove(index);

            return commitToFile();
        }
        return false;
    }
    public boolean commitToFile() {
        return FManger.write(Order_filename, Orders);
    }

    public void loadFromFile()
    {
        Orders = (ArrayList<Order>)FManger.read(Order_filename);
    }
    
    public double calculate_price(Meals[] item)
    {
        double total_price=0;
        for(Meals x : item)
            total_price = x.getPrice()+total_price;
        return total_price;
    }
    @Override
    public String toString() //override 
    {
        return "\nCode: "+code+"\t Pay date: "+pay_date+"\t Number Of Meals: "+num_of_meals+"\n";
    }
}
