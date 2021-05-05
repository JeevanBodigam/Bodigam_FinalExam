/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Example1;

import java.util.Random;

/**
 *
 * @author Jeevan Bodigam
 */
public class LotteryDriver {

    public int getLottery(int number) {
        if (number < 10) {
            return 1;
        } else {
            Random r = new Random();
            int attemptPoints = r.nextInt(13) + 1;
            return 1 + getLottery(number + attemptPoints - 10);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LotteryDriver ld = new LotteryDriver();
        System.out.println("With your total points you played " + ld.getLottery(100) + " times ");
    }

}
