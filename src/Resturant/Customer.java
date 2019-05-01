package Resturant;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author a7med
 */
public class Customer extends Person implements Serializable {
    
    private String DoJ;
    private String wallet;
    private final String Customer_filename = "customer.bin";
    public static ArrayList<Customer> Customers = new ArrayList<Customer>();
    
    public Customer(String fname, String lname, int age, int id) 
    {
        super(fname, lname, age, id);
    }
    public Customer(String fname, String lname, int age, int id,String DoJ,String wallet) 
    {
        super(fname, lname, age, id);
        this.DoJ = DoJ;
        this.wallet = wallet;
    }
    public Customer()
    {}
    public Customer(int id)
    {
        this.id=id;
    }
    
    //Setter
    
    public void setDoJ(String DoJ) {
        this.DoJ = DoJ;
    }
    public void setWallet(String wallet) {
        this.wallet = wallet;
    }
    
    // Getter
    
    public String getDoJ() {
        return DoJ;
    }

    public String getWallet() {
        return wallet;
    }
    //---------------------------------
    //-------------------------------------------------------//
    //Add Customer
    public boolean addcustomer()
    {
        //loadFromFile();
        Customers.add(this);
        return commitToFile();
    }
    public boolean commitToFile() {
        return FManger.write(Customer_filename, Customers);
    }

    public void loadFromFile()
    {
        Customers = (ArrayList<Customer>)FManger.read(Customer_filename);
    }
    //-------------------------------------------------------//
    //index of employee
    private int CustomerIndex(int id) {
        for (int x = 0; x < Customers.size(); x++) {
            if (Customers.get(x).getId() == id) {
                return x;
            }
        }
        return -1;
    }
    // employee of index #
 public Customer searchcustomer(int id) {
        Customer temp = new Customer();
        loadFromFile();
        int index = CustomerIndex(id);
        if (index != -1) {
            return Customers.get(index);
            //return true;
        } else {
            return temp;
            //return false
        }
    }
    //------------------------------------------------------//
    // Update Employee
    public boolean updateCustomer(int id, Customer c) {
        loadFromFile();
        int index = CustomerIndex(id);

        if (index != -1) {
            Customers.set(index, c);

            return commitToFile();
        }
        return false;
    }
    //-----------------------------------------------------//
    //delete Employee
    public boolean deleteCustomer(int id) {
        loadFromFile();
        int index = CustomerIndex(id);

        if (index != -1) {
            Customers.remove(index);

            return commitToFile();
        }
        return false;
    }
    //List Customer
//    public String listCustomer() {
//        loadFromFile();
//        String S = "\nAll Customers Data:\n";
//        for (Customer c : Customers) {
//            S = S + c.toString();
//        }
//        return S;
//    }
        public ArrayList<Customer> listCustomer()
    {
        loadFromFile();
        return Customers;
    }
    
//    //---------------------------------
    //-------------------------------------------------------//
    @Override
    public String toString() //override 
    {
        return "\nfirst name: "+fname+"\t last name : "+lname+"\t age: "+age+"\t id: "+id+
                "\t date of join: "+DoJ+"\t wallet: "+wallet+"\n";
    }
}
