/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategyLab;

/**
 *
 * @author jbaldwin2
 */
public class NoDiscount implements DiscountStrategy {

    private double discount;
    private double discountRate = 0;
    private double qty;

    public NoDiscount(double discountRate, double qty) {
        this.discountRate = discountRate;
        this.qty = qty;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public double getDiscount() {
        return discountRate;
    }

    @Override
    public double getQty() {
        return qty;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }
}
