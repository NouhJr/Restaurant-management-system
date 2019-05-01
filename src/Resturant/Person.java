package Resturant;

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
public class Person implements Serializable{
    protected int id;
    protected int age;
    protected String fname;
    protected String lname;
    File_manager FManger = new File_manager();
    public Person (String fname, String lname, int age, int id )
    {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.id = id;
    }
    public Person()
    {
        
    }
    // Setter 
    public void setId(int id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    // Getter 

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
    
}
