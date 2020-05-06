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
public class Order {
    private int ordernumb;
    private int customerId;
    private String date;
    private ArrayList<OrderItem> orderItemArray1 = new ArrayList<>();
    public static int numberOfOrderItems = 0;
    
    public Order(int ordernumb, int customerId, String date)
    {
        this.ordernumb = ordernumb;
        this.customerId = customerId;
        this.date = date;
    }
    public Order()
    {}
    public int getordernumb()
    {
        return ordernumb;
    }
    public void setordernumb(int ordernumb)
    {
        this.ordernumb = ordernumb;
    }
    public int getcustomerId()
    {
        return customerId;
    }
    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public int getNumberofOrderItems() {
        return orderItemArray1.size();
    }
    public String getOrderItemAt(int index) {
        if (orderItemArray1.get(index) != null) 
        {
            return orderItemArray1.get(index).toString();
        }
        else {
            return "";
        }
    }
    public void addOrderItem(int ordernumb, int lineNumber, int productId, int quantity, double price, String productDescription) {
        orderItemArray1.add( new OrderItem(ordernumb, lineNumber, productId, quantity, price, productDescription));
        numberOfOrderItems++;
    }
    public void DelOrderItemAt(int index) {
        orderItemArray1.remove(index);
        numberOfOrderItems--;
    }
    public String orderItemAt(int Rl) {
        return orderItemArray1.get(Rl).toString();
    }
    public String toString()
    {
        return "  Order Number: "+ordernumb+"\n"+"  Customer Id: "+customerId+"\n"+"  Date: "+date+"\n";
    }
}
