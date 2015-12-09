/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import byui.cit260.josephInEgypt.exceptions.InventoryControlExceptions;

/**
 *
 * @author Brendon.Moore
 */
public class InventoryControl {
    
    private double pLength;
    private double pWidth ;
    private double pHeight;
    private double pVolume;

    
    
    public static void savePyramid() {
        System.out.println("\n*** savePyramid stub function called ***"); 
    }
    
    public double calcVolumeOfBarrel(double height, double radius) throws InventoryControlExceptions{
    
        if (height < 0 || height > 48){
            throw new InventoryControlExceptions("Height must be more than 0 and less than 48");
    }
        if (radius < 0 || radius > 15){
             throw new InventoryControlExceptions("Radius must be more than 0 and less than 15");
        }
        double volume = (Math.PI * radius * radius * height) / 1728;
        
        return volume;



    }
    
        public static double calcDesignPyramid (double pLength, double pWidth, double pHeight)throws InventoryControlExceptions {
    
            
            
        if (pLength < 0 || pLength > 50){
            throw new InventoryControlExceptions("Length must be more than 0 and less than 50");
        }
       
        
        if (pWidth < 0 || pWidth > 50){
           throw new InventoryControlExceptions("Width must be more than 0 and less than 50");
         
        }
        
        if (pHeight < 0 || pHeight > 50){
            throw new InventoryControlExceptions("Height must be more than 0 and less than 50");
        }
               
    double volume = (pLength * pWidth * pHeight) / 3;
    
    return volume;
       
        
}
        
        
public static int calcResourcesNeeded (int dailyCons, int totalDaysOfDrought, int noOfPeople) throws InventoryControlExceptions{
   
    
    if (dailyCons != 1 ){
     throw new InventoryControlExceptions("Cons cannot equal 1");
    }
    
    if (totalDaysOfDrought < 2555 || totalDaysOfDrought > 2556){
     throw new InventoryControlExceptions("Days of drought must be more than 2555 and less than 2556");
    }
    
    if (noOfPeople != 100000){
        throw new InventoryControlExceptions("People cannot total 100000.");
    }
    int amountResourcesNeeded = dailyCons*totalDaysOfDrought*noOfPeople;

    
     return amountResourcesNeeded;
    }

    @Override
    public String toString() {
        return "InventoryControl{" + "pLength=" + pLength + ", pWidth=" + pWidth + ", pHeight=" + pHeight + ", pVolume=" + pVolume + '}';
    }


    
    
}


