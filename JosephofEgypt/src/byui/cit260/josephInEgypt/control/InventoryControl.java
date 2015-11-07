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

    public static void savePyramid() {
        System.out.println("\n*** savePyramid stub function called ***"); 
    }
    
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
        
        
public static double calcResourcesNeeded (int dailyCons, int totalDaysOfDrought, int noOfPeople){
    if (dailyCons != 1 ){
     return -1;
    }
    
    if (totalDaysOfDrought < 2555 || totalDaysOfDrought > 2556){
     return -1;
    }
    
    if (noOfPeople != 100000){
        return -1;
    }
    double amountResourcesNeeded = dailyCons*totalDaysOfDrought*noOfPeople;

    
     return amountResourcesNeeded;
    }

}
