/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
class Donate {

    public int donateAmount(int amount) {
        if (amount <= 0) {
            throw new ArithmeticException("If you wish to Donate, please Donate atleast 1 dollar!!");

        } else {
            return 1;
        }
    }
}

public class DonateAmount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Donate d = new Donate();
            System.out.println(d.donateAmount(102));
            System.out.println(d.donateAmount(0)); //this statement will throw exception because amount is 0
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }

}
