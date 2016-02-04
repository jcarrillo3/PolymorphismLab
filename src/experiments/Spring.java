/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author Juan
 */
public class Spring implements Season {
    private int avgTemperature = 65;
    
    
    @Override
    public int getTemperature() {
        System.out.print("Spring ");
        return avgTemperature;
    }
    
}
