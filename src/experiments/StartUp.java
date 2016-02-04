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
public class StartUp {
    public static void main(String[] args) {
        
        Season[] Seasons = {new Spring(), new Summer(), 
        new Fall(), new Winter()};
        
        for (Season s: Seasons){
            System.out.print( "Temperature: " +s.getTemperature());
        }
    }
}
