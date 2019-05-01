package Resturant;


import static Resturant.Employee.Employees;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a7med
 */
public class Admin extends Person implements Serializable{
    private String username;
    private String password;
    //Constructors
    public Admin (){}
    public Admin(String fname, String lname, int age, int id) {
        super(fname, lname, age, id);
    }
    public Admin(String fname, String lname, int age, int id,String username,String password) {
        super(fname, lname, age, id);
        username=this.username;
        password=this.password;
    }
    @Override
    public String toString() //override 
    {
        return "\nfirst name: "+fname+"\t last name : "+lname+"\t age: "+age+"\t id: "+id+
                "\t username: "+username+"\t password: "+password+"\n";
    }
    //setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    //update username and password
    public void updateusername(String username) 
    {
        this.username=username;
    }
    public void updatepassword(String password) 
    {
        this.password=password;
    }
    
    //Update data
    //login
    public boolean login (String username, String password)
    {
        if(username.equals("Admin@yahoo.com")&& password.equals("admin"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //---------------------------------------------------------
    //-----------------------------------
    //employee
    public void add_new_employee (String fname, String lname, int age, int id,String username,String password)
    {
        Employee e = new Employee(fname,lname,age,id,username,password);
        if(e.addemployee())
        {
            System.out.println(e.toString()+"Added Successufully");
        }
        else
        {
            System.out.println("Faild to added");
        }
    }
    public void ListEmployee()
    {
        Employee e = new Employee();
        System.out.println(e.listEmployee());
    }
    public void searchForEmployee(int id) {
        Employee e = new Employee(id);
        System.out.println(e.searchEmployee(id));
    }

//    public void updateEmployee(int id, Employee newid) {
//        Employee x = new Employee(id);
//        if (x.updateEmployee(id, newid)) {
//            System.out.println(newid.toString() + "Updated Successfully ... !");
//        } else {
//            System.out.println("Failed to Updated ... !");
//        }
//    }
  
    public void deleteEmployee(int Id) {
        Employee x = new Employee(id);
        if (x.deleteEmployee(Id)) {
           System.out.println("Employee: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    //---------------------------------------------------------
    //-----------------------------------
    //Meals
    public void add_new_Meal (String meal_name,double price, int id)
    {
        Meals m = new Meals(meal_name,price, id);
        if(m.addMeals())
        {
            System.out.println(m.toString()+"\nAdded Successufully");
        }
        else
        {
            System.out.println("\nFaild to added");
        }
    }
    public void ListMeals()
    {
        Meals m = new Meals();
        System.out.println(m.listMeals());
    }
    public void searchForMeals(int id) {
        Meals m = new Meals(id);
        System.out.println(m.searchMeals(id));
    }

    public void updateMeals(int id, Meals newid) {
        Meals x = new Meals(id);
        if (x.updateMeals(id, newid)) {
            System.out.println(newid.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteMeals(int Id) {
        Meals m = new Meals(id);
        if (m.deleteMeals(Id)) {
           System.out.println("Employee: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    //---------------------------------------------------------
    //-----------------------------------
    //report for employee
    public void add_new_employeereport (String Description ,int code)
    {
        Reports r = new Reports(Description ,code);
        if(r.addReportsemp())
        {
            System.out.println(r.toString()+"Added Successufully to Employees Reports");
        }
        else
        {
            System.out.println("Faild to added");
        }
    }
    public void ListReportsEmployee()
    {
        Reports r = new Reports();
        System.out.println(r.listReportsemp());
    }
    public void searchReportsEmployee(int id) {
        Reports r = new Reports(id);
        System.out.println(r.searchReportsemp(id));
    }
    //---------------------------------------------------------
    //-----------------------------------
    //report for Customer
    public void add_new_customerreport (String Description ,int code)
    {
        Reports r = new Reports(Description ,code);
        if(r.addReportscust())
        {
            System.out.println(r.toString()+"Added Successufully to Customers Reports");
        }
        else
        {
            System.out.println("Faild to added");
        }
    }
    public void ListReportsCustomer()
    {
        Reports r = new Reports();
        System.out.println(r.listReportcus());
    }
    public void searchReportsCustomer(int id) {
        Reports r = new Reports(id);
        System.out.println(r.searchReportscust(id));
    }
    //---------------------------------------------------------
    //-----------------------------------   
    public void PrintAllInfo(Employee e){
      System.out.println(e.getFname()+e.getLname()+"\n"+e.getId()+"\n"+e.getAge()+"\n"); 
  }
     public void PrintMealsInfo(Meals e){
      System.out.println(e.getMeal_name()+"\n"+e.getId()+"\n"+e.getPrice()+"\n");  
  }
}

