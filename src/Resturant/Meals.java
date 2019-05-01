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
public class Meals implements Serializable {
    String meal_name;
    double price;
    int id;
    
    File_manager FManger = new File_manager();
    final String Meals_filename = "Meals.bin";
    public static ArrayList<Meals> Meal = new ArrayList<Meals>();
    
    public Meals(int id)
    {
        this.id = id;
    }
    public Meals(String meal_name,double price, int id)
    {
        this.id = id;
        this.meal_name = meal_name;
        this.price = price;
    }
    public Meals()
    {}
    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
    //---------------------------------
    //-------------------------------------------------------//
    //Add Meal
    public boolean addMeals()
    {
        //loadFromFile();
        Meal.add(this);
        return commitToFile();
    }
    public boolean commitToFile() {
        return FManger.write(Meals_filename, Meal);
    }

    public void loadFromFile()
    {
        Meal = (ArrayList<Meals>)FManger.read(Meals_filename);
    }
    //-------------------------------------------------------//
    //index of employee
    private int MealsIndex(int id) {
        for (int x = 0; x < Meal.size(); x++) {
            if (Meal.get(x).getId() == id) {
                return x;
            }
        }
        return -1;
    }
    // employee of index #
//    public String searchMeals(int id) {
//        loadFromFile();
//        int index = MealsIndex(id);
//        if (index != -1) {
//            return "\nFound ...!" + Meal.get(index).toString();
//        } 
//        else {
//            return "\nNot Found ...!";
//        }
//    }
        public Meals searchMeals(int id) {
        Meals temp = new Meals();
        loadFromFile();
        int index = MealsIndex(id);
        if (index != -1) {
            return Meal.get(index);
        } 
        else {
            return temp;
        }
    }
    //------------------------------------------------------//
    // Update Employee
    public boolean updateMeals(int id, Meals m) {
        loadFromFile();
        int index = MealsIndex(id);

        if (index != -1) {
            Meal.set(index, m);

            return commitToFile();
        }
        return false;
    }
    //-----------------------------------------------------//
    //delete Employee
    public boolean deleteMeals(int id) {
        loadFromFile();
        int index = MealsIndex(id);

        if (index != -1) {
            Meal.remove(index);

            return commitToFile();
        }
        return false;
    }
    //List Customer
//    public String listMeals() {
//        loadFromFile();
//        String S = "\nAll Customers Data:\n";
//        for (Meals m : Meal) {
//            S = S + m.toString();
//        }
//        return S;
//    }
    public ArrayList<Meals> listMeals()
    {
        loadFromFile();
        return Meal;
    }
    
    //---------------------------------
    //-------------------------------------------------------//
    @Override
    public String toString() //override 
    {
        return "\nMeal name: "+meal_name+"\t price: "+price+"\t id: "+id+"\n";
    }
}
