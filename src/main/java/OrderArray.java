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
public class OrderArray extends ArrayList{
    static ArrayList<Order> orders;
    public OrderArray()
    {orders = new ArrayList<Order>();}
    public static void createOrder(Order ord) {
        orders.add(ord);
    }
    public static String getAllOrders() {
        String ord = "";
        for (int i = 0; i < orders.size(); i++) {
            ord += orders.get(i)+"\n";
        }
        return ord;
    }
}
