/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Jeevan Bodigam
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public double getAreaParent() {
        return Math.round(super.getArea()*100)/100.0;
    }

    @Override
    public int compareTo(ComparableCircle cCircle) {
        return Double.compare(cCircle.getAreaParent(), this.getAreaParent());
    }

}
