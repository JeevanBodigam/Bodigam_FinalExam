/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeevan Bodigam
 */
public class IOExceptionDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        try {
            Scanner scan = new Scanner(new File("dummy.txt"));
            ArrayList<MemoryRam> memRam = new ArrayList<>();
            while (scan.hasNext()) {
                MemoryRam mr = new MemoryRam(scan.nextInt(), scan.nextInt());
                memRam.add(mr);
            }
            System.out.println(memRam.get(0).toString());
            System.out.println(memRam.get(1).toString());
            System.out.println(memRam.get(2).toString());
            Scanner scan1 = new Scanner(new File("dummy1.txt"));
        } catch (FileNotFoundException fnfe) {
            System.out.println(""
                    + fnfe);
        }

    }

}
