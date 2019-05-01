package Resturant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author a7med
 */
public class Employee extends Person {
    private final String employee_filename = "employee.bin";
    public static ArrayList<Employee> Employees = new ArrayList<Employee>();
    public static ArrayList<Order> orders = new ArrayList<Order>();
    private String username;
    private String password;

    
    
    
    
    public Employee()
    {
    }
    public Employee(String fname, String lname, int age, int id,String username,String password) {
        super(fname, lname, age, id);
        this.username=username;
        this.password=password;
    }
    public Employee(String fname, String lname, int age, int id) {
        super(fname, lname, age, id);
    }
    public Employee(int id)
    {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    //---------------------------------------------------------
    //-----------------------------------
    //Employee Functions
    //make order
    public void setOrders(ArrayList<Order> orders)
    {
        Employee.orders = orders;
    }
    
    //remove order -> GUI
    
    //---------------------------------------------------------
    @Override
    public String toString() //override 
    {
        return "\nfirst name: "+fname+"\t last name : "+lname+"\t age: "+age+"\t id: "+id+
                "\t username: "+username+"\t password: "+password+"\n";
    }
    //-----------------------------------
    //Add Employee
    public boolean addemployee()
    {
        //loadFromFile();
        Employees.add(this);
        return commitToFile();
    }
    public boolean commitToFile() {
        return FManger.write(employee_filename, Employees);
    }

    public void loadFromFile()
    {
        Employees = (ArrayList<Employee>)FManger.read(employee_filename);
    }
    //-------------------------------------------------------//
    //index of employee
    private int EmployeeIndex(int id) {
        for (int x = 0; x < Employees.size(); x++) {
            if (Employees.get(x).getId() == id) {
                return x;
            }
        }
        return -1;
    }
    // employee of index #
    public Employee searchEmployee(int id) {
        Employee temp = new Employee();
        loadFromFile();
        int index = EmployeeIndex(id);
        if (index != -1) {
            return Employees.get(index);
            //return true;
        } else {
            return temp;
            //return false
        }
    }
    //------------------------------------------------------//
    // Update Employee
    public boolean updateEmployee(Employee e) {
        loadFromFile();
        int index = EmployeeIndex(this.getId());

        if (index != -1) {
            Employees.set(index, e);

            return commitToFile();
        }
        return false;
    }
    //-----------------------------------------------------//
    //delete Employee
    public boolean deleteEmployee(int id) {
        loadFromFile();
        int index = EmployeeIndex(id);

        if (index != -1) {
            Employees.remove(index);

            return commitToFile();
        }
        return false;
    }
  /*public String listEmployee() {
        loadFromFile();
        String S = "\nAll Employees Data:\n";
        int i = 1;
        for (Employee e : Employees) {
            S = S +"\nEmployee"+i+ e.toString();
            i++;
        }
        return S;
    }*/
    public ArrayList<Employee> listEmployee()
    {
        loadFromFile();
        return Employees;
    }
    //---------------------------------------------------------
    //-----------------------------------
    // Customers
    public void add_new_customer ()
    {
        Customer c = new Customer();
        if(c.addcustomer())
        {
            System.out.println(c.toString()+"Added Successufully");
        }
        else
        {
            System.out.println("Faild to added");
        }
    }
    public void ListCustomer()
    {
        Customer c = new Customer();
        System.out.println(c.listCustomer());
    }
    public void searchForCustomer(int id) {
        Customer c = new Customer(id);
        System.out.println(c.searchcustomer(id));
    }

    public void updateCustomer(int id, Customer newid) {
        Customer x = new Customer(id);
        if (x.updateCustomer(id, newid)) {
            System.out.println(newid.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteCustomer(int Id) {
        Customer x = new Customer(id);
        if (x.deleteCustomer(Id)) {
           System.out.println("Customer: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    //---------------------------------------------------------
    //-----------------------------------
    //Meals
    public void add_billing (String date , int code)
    {
        Billing B = new Billing(date, code);
        if(B.addbilling())
        {
            System.out.println(B.toString()+"Billing Added Successufully");
        }
        else
        {
            System.out.println("Faild to added");
        }
    }
    public void Listbilling()
    {
        Billing B = new Billing();
        System.out.println(B.listBilling());
    }
    public void searchbyCode(int code) {
        Billing B = new Billing(code);
        System.out.println(B.searchbycode(code));
    }
    //login
    public boolean login (String username, String password)
    {
        if(username.equals("employee@yahoo.com")&& password.equals("employee"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}