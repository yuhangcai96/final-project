import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class Customer {
    private String fname;
    private String lname;
    private int id;
    private String phonenumber;
    private ArrayList<Order> orderArray1 = new ArrayList<Order>();
    public static int numberOfOrders = 0;
    double TotalCost = 0;
    
    public Customer(String fname, String lname, String phonenumber, int id)
    {
        this.fname = fname;
        this.lname = lname;
        this.phonenumber = phonenumber;
        this.id = id;
    }
    public Customer()
    {}
    
    public String getfname()
    {
        return fname;
    }
    
    public void setfname(String fname)
    {
        this.fname = fname;
    }
    
    public String getlname()
    {
        return lname;
    }
    
    public void setlname(String lname)
    {
        this.lname = lname;
    }
    
    public String getphonenumber()
    {
        return phonenumber;
    }
    
    public void setphonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    
    
    public int getid()
    {
        return id;
    }
    
    public void setid(int id)
    {
        this.id = id;
    }
    
    public int getnumberoforder() {
        return orderArray1.size();
    }

    public String getOrderAt(int index) {
        if (orderArray1.get(index) != null) 
        {
            return orderArray1.get(index).toString();
        } 
        else {
            return "";
        }
    }
    
    public void addOrder(Order ord) {
        orderArray1.add( ord);
        numberOfOrders++;
    }

    public void DelOrderAt(int index) {
        orderArray1.remove(index);
        numberOfOrders--;
    }
    
    public String toString()
    {
        String cst = " First Name: "+fname+"\n"+" Last Name: "+lname+"\n"+" Phone Number: "+phonenumber+"\n"
                +" Number of Orders is: "+getnumberoforder()+"\n"+"\n";
        for (int i = 0; i < getnumberoforder(); i++){
            cst += getOrderAt(i);
            for (int j = 0; j < orderArray1.get(i).getNumberofOrderItems(); j++){
                cst += orderArray1.get(i).getOrderItemAt(j)+"\n";
            }}
        return cst;
    }
    
} 