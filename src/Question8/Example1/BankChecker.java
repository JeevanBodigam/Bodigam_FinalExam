/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
public class BankChecker {

    private double amount;

    public BankChecker(double amt) {
        this.amount = amt;
    }

    public int checkAmountTax() {
        if (this.amount < 400) {
            throw new IllegalArgumentException("Check is valid only for 400$ above");
        } else {
            return (int) ((amount * 105) / 100);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException {
        // TODO code application logic here
        BankChecker bc = new BankChecker(700);
        System.out.println("Amount after tax is " + bc.checkAmountTax());
        try {
            BankChecker bc1 = new BankChecker(200);
            System.out.println("Amount after tax is " + bc1.checkAmountTax());

        } catch (IllegalArgumentException ie) {
            System.out.println(ie.getMessage());
        }
        try {
            System.out.println(bc.checkAmountTax() / 0);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

    }

}
