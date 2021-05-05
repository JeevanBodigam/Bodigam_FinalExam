/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Jeevan Bodigam
 */
class Moisturiser {

    private int quantity;
    private String Moistname;

    public Moisturiser(int quantity, String Moistname) {
        this.quantity = quantity;
        this.Moistname = Moistname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMoistname() {
        return Moistname;
    }

    public void setMoistname(String Moistname) {
        this.Moistname = Moistname;
    }

    @Override
    public String toString() {
        return "Moisturiser{" + "quantity=" + quantity + ", Moistname=" + Moistname + '}';
    }

    //This method returns the hashcode for every object created for this class.
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.Moistname);
        return hash;
    }

    //this method takes obj which is the object for comparing class. Here we are 
    // checking only for name hence if 2 objects has same name then they are 
    //equal.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Moisturiser other = (Moisturiser) obj; //type casting the obj into required class
        return Objects.equals(this.Moistname, other.Moistname);
    }

}

public class MoisturiserDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creating objects for Mosituriser class
        Moisturiser moist1 = new Moisturiser(300, "Nivea");
        Moisturiser moist2 = new Moisturiser(500, "Ponds");
        Moisturiser moist3 = new Moisturiser(200, "Nivea");

        //We have moist1 and moist3 with same name "Nivea", In the mosituriser 
        //class we had hascode and equals for name attribute hence if we use 
        // hashcode method on these objects we get same hashcode  
        System.out.println("**** HashCodes ****");
        System.out.println(moist1.hashCode());
        System.out.println(moist3.hashCode());
        System.out.println(moist2.hashCode() + "--- Different Code");

        /**
         * Though we are checking only name attribute even if the quantity is
         * different it returns same hash code But the objects are 2 new
         * references hence their addresses are different
         *
         */
        System.out.println("**** .equals ****");
        System.out.println(moist1.equals(moist3));
        //The above statements prints true since we have same name.
        System.out.println(moist3.equals(moist2));
        // The above statement prints false because their names are different 
        // and having different references
        System.out.println(moist2.equals(moist1));
        //This also prints false.

    }

}
