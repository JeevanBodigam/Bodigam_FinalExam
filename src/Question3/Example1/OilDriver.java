/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
public class OilDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassCastException {
        // TODO code application logic here
        Oil eo = new EdibleOil(true, 11.6, "Cooking Purpose");
        Oil o = eo;   //implicit conversion parent type will automatically hold child object
        try {
            System.out.println("o is parent object but calling childs");
            System.out.println(o.toString());

            System.out.println("ediOil is child object but calling childs");
            Oil oil = new Oil(12.3, "Food");
            EdibleOil ediOil = (EdibleOil) eo; //Explict COnversion of parent to child type
            System.out.println(ediOil.toString());
            EdibleOil ediOil1 = (EdibleOil) oil; 
            //we get an exception here because we are converting from parent to child
            System.out.println(ediOil1.toString());
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }

}
