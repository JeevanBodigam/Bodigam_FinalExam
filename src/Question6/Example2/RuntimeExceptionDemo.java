/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.Example2;

import java.util.ArrayList;

/**
 *
 * @author Jeevan Bodigam
 */
public class RuntimeExceptionDemo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Bag> bagsList = new ArrayList<>();
        Bag bag = new Bag("blue", 2);
        Bag bag1 = new Bag("green", 1);
        Bag bag2 = new Bag("red", 4);
        Bag bag3 = new Bag("brown", 5);
        Bag bag4 = new Bag("violet", 0);

        bagsList.add(bag);
        bagsList.add(bag1);
        bagsList.add(bag2);
        bagsList.add(bag3);
        bagsList.add(bag4);

        try {
            bagsList.forEach(bagObj -> {
                System.out.println(bagObj.validCompartments()
                        + " Litres Capacity");
            });

        } catch (IllegalArgumentException ie) {
            System.out.println(ie);
        }
        try {
            System.out.println(bagsList.get(10));
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        } catch (RuntimeException re) {
            System.out.println(re);
        }
    }

}
