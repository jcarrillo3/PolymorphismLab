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
public class Fall implements Season {
    private int avgTemperature = 50;
    
    
    @Override
    public int getTemperature() {
        System.out.print("Fall ");
        return avgTemperature;
    }
}
