/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
public class MemoryRam {
    
    private int ram;
    private int memory;

    public MemoryRam(int ram, int memory) {
        this.ram = ram;
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public int getMemory() {
        return memory;
    }
    
    @Override
    public String toString(){
        return "The Ram is "+ram + " GB And Memory is "+ memory +" GB ";
    }
    
}
