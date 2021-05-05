/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
public class GameDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cricket cric = new Cricket();
        System.out.println(cric);
        cric.playGame();
        Checkers check=new Checkers();
        check.playGame();

    }

}
