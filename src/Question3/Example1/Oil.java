/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
public class Oil {
    private double fatContent;
    private String oilType;

    public Oil(double fatContent, String oilType) {
        this.fatContent = fatContent;
        this.oilType = oilType;
    }

    public double getFatContent() {
        return fatContent;
    }

    public String getOilType() {
        return oilType;
    }
    
    @Override
    public String toString(){
        return "The fat content of "+ this.getOilType()
                +" is "+this.getFatContent();
    }
    
    
    
    
}
