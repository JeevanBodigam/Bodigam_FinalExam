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
public class EdibleOil extends Oil {

    private boolean humanConsumable;

    public EdibleOil(boolean humanConsumable, double fatContent, String oilType) {
        super(fatContent, oilType);
        this.humanConsumable = humanConsumable;
    }

    public boolean isHumanConsumable() {
        return humanConsumable;
    }
    
    @Override
    public String toString(){
        String safe="";
        if(humanConsumable){
            safe="Safe";
        }else{
            safe="Not Safe";
        }
        return super.toString()+
                " and it is "
                + safe;
    }

}
