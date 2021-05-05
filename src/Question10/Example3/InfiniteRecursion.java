/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Example3;

/**
 *
 * @author Jeevan Bodigam
 */
public class InfiniteRecursion {

    static int count = 0;

    static void infiniteMethod() {
        System.out.println("This is occuring infinite times..");
        infiniteMethod();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        infiniteMethod();
    }
}
