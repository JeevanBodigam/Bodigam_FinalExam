/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Jeevan Bodigam
 */
public class FruitDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fruit fruit = new GoldenDelicious();
        Apple orange = new McIntosh();
        
        Fruit f=new Apple();
       fruit.makeAppleCider();

        System.out.println("fruit instanceof Fruit "+(fruit instanceof Fruit));
        System.out.println("fruit instanceof Orange "+ (fruit instanceof Orange));
        System.out.println("fruit instanceof Apple "+(fruit instanceof Apple));
        System.out.println("fruit instanceof GoldenDelicious "+(fruit instanceof GoldenDelicious));
        System.out.println("fruit instanceof McIntosh "+(fruit instanceof McIntosh));
//        System.out.println("orange instanceof Orange "+(orange instanceof Orange));
        System.out.println("orange instanceof Fruit "+(orange instanceof Fruit));
//        System.out.println(orange instanceof Apple);
        
    }

}
