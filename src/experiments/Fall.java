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
    private int temperature;
    
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    
    @Override
    public int getTemperature() {
        return 50;
    }
}
