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
    
        public double calcDesignPyramid (double length, double width, double height) {
    
        if (length < 0 || length > 50){
            return -1;
        }
        
        if (width < 0 || width > 50){
            return -1;
                    
        }
        
        if (height < 0 || height > 50){
            return -1;
        }
        
    double volume = (length * width * height) / 3;
    
    return volume;
       
        
}


}
