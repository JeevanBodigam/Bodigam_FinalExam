/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
public class PlayingTimeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double playingTime = 35.6;
        System.out.println("******************************************");
        System.out.println("Explicit Type Casting");
        System.out.println("The value of double before conversion is "
                + playingTime);

        int playingInt = (int) playingTime;
        //explicit conversion of double to  int
        System.out.println("The value of int after conversion is "
                + playingInt);

        int playersCost = 10;

        System.out.println("******************************************");
        System.out.println("Implicit Type Casting");
        System.out.println("The value of int before conversion " + playersCost);
        double playersCostDouble = playersCost;
        //implicit conversion int directly converted to double,
        // becuase double has higher datatype.

        System.out.println("The value of double after conversion "
                + playersCostDouble);
        System.out.println("******************************************");

    }

}
