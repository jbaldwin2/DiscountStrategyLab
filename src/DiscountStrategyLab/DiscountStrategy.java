/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategyLab;

/**
 *
 * @author jbaldwin2
 */
public interface DiscountStrategy {

    public double getDiscount();

    public double getQty();

    public double getDiscountRate();

    public void setDiscount(double discount);

    public void setDiscountRate(double discountRate);

    public void setQty(double qty);
}
