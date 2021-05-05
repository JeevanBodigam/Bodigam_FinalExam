/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
public class Mobile extends Electronics implements ElectronicsInterface {

    private int year;

    public Mobile(int year, String electronicName) {
        super(electronicName);
        this.year = year;
    }

    @Override
    String electronicNameShortForm() {
        return super.getElectronicName().substring(0, 2);
    }

    @Override
    public int getElectronicYear() {
        return this.year;
    }

    @Override
    public String getElectronicBrand() {
        return "OnePlus";
    }

    @Override
    public String getElectronicType() {
        return "Mobile";
    }

    public String getMyParentToString() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "The Electronic Type is " + this.getElectronicType()
                + ". Brand is " + this.getElectronicBrand()
                + ". Year is " + this.getElectronicYear() + ". Its short form is "
                + this.electronicNameShortForm();

    }

}
