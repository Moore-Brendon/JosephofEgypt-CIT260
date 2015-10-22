/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

/**
 *
 * @author Brendon.Moore
 */
public class InventoryControl {
    
    public double calcVolumeOfBarrel(double height, double radius){
    
        if (height < 0 || height > 48){
            return -1;
    }
        if (radius < 0 || radius > 15){
             return -1;
        }
        double volume = (Math.PI * radius * radius * height) / 1728;
        
        return volume;



    }
}
