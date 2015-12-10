/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.InventoryControl;
import byui.cit260.josephInEgypt.exceptions.InventoryControlExceptions;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brendon.Moore
 */

// THIS VIEW IS NO LONGER BEING USED. CODE WAS MOVED TO GAMEMENUVIEW
public class ConstructPyramidView extends View{

    public ConstructPyramidView() {
        super("Enter the Dimensions***********");
    }
    
   
    
   
    /*public ConstructPyramidView(){
          super("\n----------------------------"
            + "\n| Enter dimensions of pyramid.|"
            + "\n----------------------------"
            + "\n----------------------------"
               + "\nSelect and option below"
                  + "\nL - Enter Length"
                  + "\nW - Enter Width"
                  + "\nH - Enter Height"
                  + "\nV - Display Volume"
                  + "\nE - Exit");
          
    }
        
    
    
    
    
    @Override
    public boolean doAction(Object obj){
      String value =(String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'L':
                this.getPLength();
            break;
            
            case 'W':
                this.getPWidth();
            break;
            
            case 'H':
                this.getPHeight();
            case 'V':
                this.displayVolume();
                break;
                
             case 'E':
                return true;            
            default :
            System.out.println("Enter a valid option");
              
         }
        return false;
    }
    */
    @Override
     public String getInput(){
        
        return null;
         
     }
    
    
   public void calcVolume() throws InventoryControlExceptions{
       
        double length;
        double width;
        double height;
        
        
        length = this.getPLength();
        width = this.getPWidth();
        height = this.getPHeight();
        
        double volume = InventoryControl.calcDesignPyramid(length, width, height);
        
        System.out.println("The volume of the pyramid is: " + volume);    
       
    }
    
    
    
     private double getPLength() {
        boolean valid = false;
        int input = 0;
        double pLength = 0;
        
    try{    
        while (!valid) {
            System.out.println("Length:");
            input = parseInt(this.keyboard.readLine());
            pLength = (double) input;
                
        break;
    }
    }catch (IOException | NumberFormatException e){
            System.out.println("Error reading input" + e.getMessage());
            }
    
        return pLength;
     }    
    
     
     private double getPWidth() {
       boolean valid = false;
        int input = 0;
        double pWidth = 0;
        
    try{    
        while (!valid) {
            System.out.println("Width:");
            input = parseInt(this.keyboard.readLine());
            pWidth = (double) input;
                
        break;
    }
    }catch (IOException | NumberFormatException e){
            System.out.println("Error reading input" + e.getMessage());
            }
    
        return pWidth;
        }
     
         private double getPHeight() {
         boolean valid = false;
        int input = 0;
        double pHeight = 0;
        
    try{    
        while (!valid) {
            System.out.println("Height:");
            input = parseInt(this.keyboard.readLine());
            pHeight = (double) input;
                
        break;
    }
    }catch (IOException | NumberFormatException e){
            System.out.println("Error reading input" + e.getMessage());
            }
    
        return pHeight;
    }
   
    
   /* 
    private void savePyramid() {
        InventoryControl.savePyramid();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
   */

    @Override
    public boolean doAction(Object obj) {
        try {
            this.calcVolume();
        } catch (InventoryControlExceptions ex) {
             ErrorView.display("GameMenuView", ex.getMessage());
        }
    return true;
    }

   
}


        
