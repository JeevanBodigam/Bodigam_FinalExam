/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeevan Bodigam
 */
public class RandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        // TODO code application logic here
        try {
            Random random = new Random();
            Scanner scan = new Scanner(System.in);
            int[] randomArray = new int[100];

            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = random.nextInt(500) + 1;
            }
            System.out.println("Enter Index you want to find......");
            int randomIndex = scan.nextInt();
            System.out.println("The Element at Index "
                    + randomIndex + " is " + randomArray[randomIndex]);

        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
