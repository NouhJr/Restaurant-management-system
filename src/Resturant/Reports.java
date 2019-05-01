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
public class Reports implements Serializable{
    String Description;
    int code;
    File_manager FManger = new File_manager();
    private final String Reportsemp_filename = "Reportsemp.bin";
    private final String Reportscust_filename = "Reportscust.bin";
    public static ArrayList<Reports> Report = new ArrayList<Reports>();
    
    public void setCode(int code) 
    {
        this.code = code;
    }
    public void setDescription(String Description) 
    {
        this.Description = Description;
    }

    public String getDescription() 
    {
        return Description;
    }
    public int getCode() 
    {
        return code;
    }
    public Reports(String Description ,int code)
    {
        this.Description = Description;
        this.code=code;
    }
    public Reports(int code)
    {
        this.code=code;
    }
    public Reports()
    {}
    //---------------------------------
    //-------------------------------------------------------//
    //add rep to employee
    public boolean addReportsemp()
    {
        //loadFromFileemp();
        Report.add(this);
        return commitToFileemp();
    }
    public boolean commitToFileemp() {
        return FManger.write(Reportsemp_filename, Report);
    }

    public void loadFromFileemp()
    {
        Report = (ArrayList<Reports>)FManger.read(Reportsemp_filename);
    }
    
    public void loadFromFilecust()
    {
        Report = (ArrayList<Reports>)FManger.read(Reportscust_filename);
    }
    //-------------------------------------------------------//
    //index of employee report
    private int ReportsIndexemp(int code) {
        for (int x = 0; x < Report.size(); x++) {
            if (Report.get(x).getCode() == code) {
                return x;
            }
        }
        return -1;
    }
    // report employee of index #
    public String searchReportsemp(int code) {
        loadFromFileemp();
        int index = ReportsIndexemp(code);
        if (index != -1) {
            return "\nFound ...!" + Report.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }
    //List Customer
    
     public ArrayList<Reports> listReportcus()
    {
        loadFromFilecust();
        return Report ;
    }
    
    public ArrayList<Reports> listReportemp()
    {
        loadFromFileemp() ;
        return Report ;
    } 
    
    public String listReportsemp() {
        loadFromFileemp(); 
        String S = "\nAll Reports Employees Data:\n";
        for (Reports m : Report) {
            S = S + m.toString();
        }
        return S;
    } 
    
     public String listReportscust() {
        loadFromFilecust();
        String S = "\nAll Reports Customers Data:\n";
        for (Reports m : Report) {
            S = S + m.toString();
        }
        return S;
    }
    //---------------------------------
    //-------------------------------------------------------//
    //---------------------------------
    //-------------------------------------------------------//
    //add rep to customer
    public boolean addReportscust()
    {
        loadFromFileemp();
        Report.add(this);
        return commitToFileemp();
    }
    public boolean commitToFilecust() {
        return FManger.write(Reportscust_filename, Report);
    }

    
    //-------------------------------------------------------//
    //index of customer report
    private int ReportsIndexcust(int code) {
        for (int x = 0; x < Report.size(); x++) {
            if (Report.get(x).getCode() == code) {
                return x;
            }
        }
        return -1;
    }
    // customer report of index #
    public String searchReportscust(int code) {
        loadFromFilecust();
        int index = ReportsIndexemp(code);
        if (index != -1) {
            return "\nFound ...!" + Report.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }
   
    
    //---------------------------------
    //-------------------------------------------------------
    @Override
    public String toString() //override 
    {
        return "\nDescription: "+Description+"\t code: "+code+"\n";
    }
}
