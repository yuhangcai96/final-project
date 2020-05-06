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
public class CustomerArray extends ArrayList{
    static ArrayList<Customer> customers ;
    
    public static void CreateCustomer(Customer cust) {
        customers.add(cust);
    }
    
    public static String GetCustomers() {
        String cus = "";
        for (int i = 0; i < customers.size(); i++) {
            cus += customers.get(i)+"\n";
        }
        return cus;
    }
}