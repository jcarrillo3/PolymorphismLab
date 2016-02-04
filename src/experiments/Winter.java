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
public class Winter implements Season {
    private int avgTemperature = 15;
    
    
    @Override
    public int getTemperature() {
        System.out.print("Winter ");
        return avgTemperature;
    }
}
