/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.exceptions.InventoryControlExceptions;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Pyramid;

/**
 *
 * @author Brendon.Moore
 */
public class InventoryControl {
    
    

    
    
    public static void savePyramid (double length,double width,double height) {
      Game game = JosephofEgypt.getCurrentGame();
       Pyramid pyramid = game.getPyramid();
        
        pyramid.setHeight(height);
        pyramid.setLength(length);
        pyramid.setWidth(width);
        
        System.out.println("Saved Pyramid with values length = " + length + "width = " + width 
        + "height = " + height);
    }
    
    public static double calcVolumeOfBarrel(double height, double radius, double quantity) throws InventoryControlExceptions{
    
        if (height < 0 || height > 48){
            throw new InventoryControlExceptions("Height must be more than 0 and less than 48");
    }
        if (radius < 0 || radius > 15){
             throw new InventoryControlExceptions("Radius must be more than 0 and less than 15");
        }
        if (quantity < 0 || quantity > 10000){
             throw new InventoryControlExceptions("Quantity must be more than 0 and less than 10000");
        }
        //the volume is multiplied by 5 to convert volume into pounds
        double volume = (Math.PI * radius * radius * height * quantity * 5) / 1728;
       
        
        return volume;



    }
    
        public static double calcDesignPyramid (double pLength, double pWidth, double pHeight)throws InventoryControlExceptions {
    
          Game game = JosephofEgypt.getCurrentGame(); 
          Pyramid pyramid = game.getPyramid();
          
          
            
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

        pyramid.setHeight(pHeight);
        pyramid.setLength(pLength);
        pyramid.setWidth(pWidth);
        pyramid.setVolume(volume);


        return volume;


    }
        
        
public static int calcResourcesNeeded (int dailyCons, int totalDaysOfDrought, int noOfPeople) throws InventoryControlExceptions{
   
    
    if (dailyCons <= 0 || dailyCons > 5 ){
     throw new InventoryControlExceptions("Consumption cannot be equal to or less than 0 or greater than 5.");
    }
    
    //if (totalDaysOfDrought < 2555 || totalDaysOfDrought > 2556){
    //throw new InventoryControlExceptions("Days of drought must be more than 2555 and less than 2556");
    //}
    
    if (noOfPeople > 100000 || noOfPeople <=0){
        throw new InventoryControlExceptions("People cannot total more than 100000 or less than or equal to zero.");
    }
    int amountResourcesNeeded = dailyCons*totalDaysOfDrought*noOfPeople;

    
     return amountResourcesNeeded;
    }

   

    
    
}


