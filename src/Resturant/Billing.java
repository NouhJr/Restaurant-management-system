package Resturant;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author a7med
 */
public class Billing implements Serializable {
    private String date;
    private double code;
    private double price;
    File_manager FManger = new File_manager();
    private final String Billing_filename = "Biling.bin";
    public static ArrayList<Billing> Billings = new ArrayList<Billing>();
    
    public Billing(String date , double code)
    {
        this.date = date;
        this.code = code;
    }
    public Billing (double code)
    {
        this.code = code;
    }
    public Billing ()
    {}
    
    //Setter
    
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setCode(double code) {
        this.code = code;
    }
    // Getter

    public double getPrice() {
        return price;
    }
    
    public double getCode() {
        return code;
    }
    public String getDate() {
        return date;
    }
    //---------------------------------
    //-------------------------------------------------------//
    //Add Customer
    public boolean addbilling()
    {
        //loadFromFile();
        Billings.add(this);
        return commitToFile();
    }
    public boolean commitToFile() {
        return FManger.write(Billing_filename, Billings);
    }

    public void loadFromFile()
    {
        Billings = (ArrayList<Billing>)FManger.read(Billing_filename);
    }
    //-------------------------------------------------------//
    //index of billing
    private int BillingIndex(int code) {
        for (int x = 0; x < Billings.size(); x++) {
            if (Billings.get(x).getCode() == code) {
                return x;
            }
        }
        return -1;
    }
    // search for billing
    public String searchbycode(int code) {
        loadFromFile();
        int index = BillingIndex(code);
        if (index != -1) {
            return "\nFound ...!" + Billings.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }
    //------------------------------------------------------//
    //List Customer
//    public String listBilling() {
//        loadFromFile();
//        String S = "\nAll Customers Data:\n";
//        for (Billing b : Billings) {
//            S = S + b.toString();
//        }
//        return S;
//    }
    public ArrayList<Billing> listBilling()
    {
        loadFromFile();
        return Billings;
    }
    //---------------------------------
    //-------------------------------------------------------//
    @Override
    public String toString() //override 
    {
        return "\nDate: "+date+"\t code: "+code+"\n";
    }
    
}
