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
public class ProductArray extends ArrayList{
    
    static ArrayList<Product> products = new ArrayList<>();
    public static void createProduct(Product prod) {
        products.add(prod);
    }
    
    public static String getAllProducts() {
        String prd = "";
        for (int i = 0; i < products.size(); i++) {
            prd += products.get(i)+"\n";
        }
        return prd;
    }
}
