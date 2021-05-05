/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
public class ElectronicsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Electronics e=new Electronics(); //Cannot be Instantiated
//        ElectronicsInterface ef=new ElectronicsInterface(); cannot create instance
        Mobile mobile = new Mobile(1988, "Mclaren On plus 7 pro");
        System.out.println(mobile);
        System.out.println(mobile.getMyParentToString());
    }

}
