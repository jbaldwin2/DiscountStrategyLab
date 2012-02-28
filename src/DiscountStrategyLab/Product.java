/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategyLab;

/**
 *
 * @author jbaldwin2
 */
public class Product {
    private DiscountStrategy discount;
    private int productId;

    public Product(int productId) {
       
        this.productId = productId;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    
   
}
