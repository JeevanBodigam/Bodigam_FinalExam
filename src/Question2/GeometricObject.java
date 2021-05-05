/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Jeevan Bodigam
 */
public class GeometricObject {

    private String geometricObjectName;
    private int noOfSides;

    public GeometricObject(String geometricObjectName, int noOfSides) {
        this.geometricObjectName = geometricObjectName;
        this.noOfSides = noOfSides;
    }

    public String getGeometricObjectName() {
        return geometricObjectName;
    }

    public int getNoOfSides() {
        return noOfSides;
    }
    
    @Override
    public String toString() {
        return "The Geometric Object name is " + this.geometricObjectName
                + ". But "+ this.getGeometricObjectName() +" is not colorable!!!!";
    }

}
