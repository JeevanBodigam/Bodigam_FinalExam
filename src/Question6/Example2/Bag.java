/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
public class Bag {

    private String color;
    private int compartments;

    public Bag(String color, int compartments) {
        this.color = color;
        this.compartments = compartments;
    }

    public String getColor() {
        return color;
    }

    public int getCompartments() {
        return compartments;
    }

    public int validCompartments() {
        if (this.compartments == 0 || this.compartments > 6) {
            throw new IllegalArgumentException("Compartments"
                    + " cannot be 0 or greater than 6");
        }else{
            return compartments*3;
        }
    }

}
