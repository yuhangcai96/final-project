/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class OrderSystem {
    public static void main(String[] args)
    {
        CustomerArray CustomerArray = new CustomerArray();
        ProductArray ProductArray = new ProductArray();
        OrderArray OrderArray = new OrderArray();
        OrderItemArray OrderItemArray = new OrderItemArray();
        
        Customer DavidSolomon = new Customer("David", "Solomon", "233-404-4555", 1);
        CustomerArray.add(DavidSolomon);
        Customer MarkCuban = new Customer("Mark", "Cuban", "401-668-8474", 2);
        CustomerArray.add(MarkCuban);
        Customer TaylorSwift = new Customer("Taylor", "Swift", "808-555-7789", 3);
        CustomerArray.add(TaylorSwift);
        
        Product shirt = new Product(1, "Polo shirt", 50, 20.00);
        ProductArray.add(shirt);
        Product tie = new Product(2, "Black tie", 100, 5.00);
        ProductArray.add(tie);
        Product shoe = new Product(3, "Dress shoe", 45, 15.00);
        ProductArray.add(shoe);
        Product skirt = new Product(4, "Pleated skirt", 35, 10.00);
        ProductArray.add(skirt);
        Product dshirt = new Product(5, "Dress shirt", 60, 25.00);
        ProductArray.add(dshirt);
        Product suit = new Product(6, "Suit", 20, 45.00);
        ProductArray.add(suit);
        
        OrderItem shirtItem1 = new OrderItem(1, 1, shirt.getProductId(), 2, shirt.getPrice(), shirt.getDescription());
        OrderItemArray.add(shirtItem1);
        OrderItem tieItem1 = new OrderItem(1, 2, tie.getProductId(), 5, tie.getPrice(), tie.getDescription());
        OrderItemArray.add(tieItem1);
        OrderItem shirtItem2 = new OrderItem(2, 1, shirt.getProductId(), 1, shirt.getPrice(), shirt.getDescription());
        OrderItemArray.add(shirtItem2);
        OrderItem tieItem2 = new OrderItem(2, 2, tie.getProductId(), 4, tie.getPrice(), tie.getDescription());
        OrderItemArray.add(tieItem2);
        
        OrderItem shirtItem3 = new OrderItem(3, 1, shirt.getProductId(), 3, shirt.getPrice(), shirt.getDescription());
        OrderItemArray.add(shirtItem3);
        OrderItem tieItem3 = new OrderItem(3, 2, tie.getProductId(), 7, tie.getPrice(), tie.getDescription());
        OrderItemArray.add(tieItem3);
        
        Order DavidsOrder1 = new Order(1, 1, "5-8-2020");
        DavidsOrder1.addOrderItem(DavidsOrder1.getordernumb(), 1, shirt.productId, 3, shirt.price, shirt.description);
        DavidsOrder1.addOrderItem(DavidsOrder1.getordernumb(), 2, shoe.productId, 4, shoe.price, shoe.description);
        Order DavidsOrder2 = new Order(2, 1, "5-15-2020");
        DavidsOrder2.addOrderItem(DavidsOrder2.getordernumb(), 1, tie.productId, 7, tie.price, tie.description);
        OrderArray.add(DavidsOrder2);
        OrderArray.add(DavidsOrder2);
        
        Order MarkCubansOrder1 = new Order(1, 2, "5-1-2020");
        MarkCubansOrder1.addOrderItem(MarkCubansOrder1.getordernumb(), 1, skirt.productId, 5, skirt.price, skirt.description);
        OrderArray.add(MarkCubansOrder1);
        
        Order TaylorSwiftsOrder1 = new Order(1, 3, "5-8-2020");
        TaylorSwiftsOrder1.addOrderItem(TaylorSwiftsOrder1.getordernumb(), 1, tie.productId, 12, tie.price, tie.description);
        OrderArray.add(TaylorSwiftsOrder1);
        Order TaylorSwiftsOrder2 = new Order(2, 3, "5-9-2020");
        TaylorSwiftsOrder2.addOrderItem(TaylorSwiftsOrder2.getordernumb(), 1, shirt.productId, 7, shirt.price, shirt.description);
        OrderArray.add(TaylorSwiftsOrder2);
        Order TaylorSwiftsOrder3 = new Order(3, 3, "5-15-2020");
        TaylorSwiftsOrder3.addOrderItem(TaylorSwiftsOrder3.getordernumb(), 1, shoe.productId, 10, shoe.price, shoe.description);
        OrderArray.add(TaylorSwiftsOrder3);
        Order TaylorSwiftsOrder4 = new Order(4, 3, "5-19-2020");
        TaylorSwiftsOrder4.addOrderItem(TaylorSwiftsOrder4.getordernumb(), 1, skirt.productId, 2, skirt.price, skirt.description);
        OrderArray.add(TaylorSwiftsOrder4);
        
        DavidSolomon.addOrder(DavidsOrder1);
        DavidSolomon.addOrder(DavidsOrder2);
        MarkCuban.addOrder(MarkCubansOrder1);
        TaylorSwift.addOrder(TaylorSwiftsOrder1);
        TaylorSwift.addOrder(TaylorSwiftsOrder2);
        TaylorSwift.addOrder(TaylorSwiftsOrder3);
        TaylorSwift.addOrder(TaylorSwiftsOrder4);
        
        for (int i = 0; i < CustomerArray.size(); i++)
        {
            System.out.printf("The customer with id: %d is %n", i+1);
            System.out.println(CustomerArray.get(i));
            System.out.println("------------------------------------------------");
        }        
    }
}
