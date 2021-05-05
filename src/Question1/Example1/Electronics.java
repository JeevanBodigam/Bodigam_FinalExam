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
public abstract class Electronics {

    private String electronicName;

    public Electronics(String electronicName) {
        this.electronicName = electronicName;
    }

    String getElectronicName() {
        return this.electronicName;
    }

    abstract String electronicNameShortForm();

    @Override
    public String toString() {
        return "The Electronic Name is " + this.getElectronicName()
                + " And its short form is " + this.electronicNameShortForm();
    }

}
