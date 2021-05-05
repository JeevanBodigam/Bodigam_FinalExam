/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.ArrayList;

/**
 *
 * @author Jeevan Bodigam
 */
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] geoArray = new GeometricObject[5];
        Square geoObj1 = new Square(true, 3, "Square-1", 4);
        GeometricObject geoObj2 = new Square(false, 4.5, "Square-2", 4);
        GeometricObject geoObj3 = new Square(true, 10, "Square-3", 4);
        GeometricObject geoObj4 = new Square(false, 12.2, "Square-4", 4);
        GeometricObject geoObj5 = new Square(true, 14.3, "Square-5", 4);

        geoArray[0] = geoObj5;
        geoArray[1] = geoObj1;
        geoArray[2] = geoObj2;
        geoArray[3] = geoObj4;
        geoArray[4] = geoObj3;

        for (GeometricObject go : geoArray) {
            Square s = (Square) (go);
            if (s.isColorable()) {
                s.howToColor();
                System.out.println("The Area of " + s.getGeometricObjectName() + " is "
                        + Math.round(s.calcArea() * 100) / 100.0);
            } else {
                System.out.println(go);

            }
        }

    }

}
