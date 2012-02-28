/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategyLab;

/**
 *
 * @author jbaldwin2
 */
public class Customer {
    
    private String lastName;
    private String firstName;
    private String accountNo;

    public Customer(String lastName, String firstName, String accountNo) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
}
