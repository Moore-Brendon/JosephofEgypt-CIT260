/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.InventoryControl;
import byui.cit260.josephInEgypt.exceptions.InventoryControlExceptions;
import byui.cit260.josephInEgypt.model.GameMenuView;
import java.util.Scanner;

/**
 *
 * @author Brendon.Moore
 */

// THIS VIEW IS NO LONGER BEING USED. CODE WAS MOVED TO GAMEMENUVIEW
public class ConstructPyramidView extends View {
    
   
    
   
    public ConstructPyramidView(){
          super("\n----------------------------"
            + "\n| Enter dimensions of pyramid.|"
            + "\n----------------------------"
            + "\n----------------------------"
               + "\nSelect and option below"
                  + "\nL - Enter Length"
                  + "\nW - Enter Width"
                  + "\nH - Enter Height"
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
             case 'E':
                return true;            
            default :
            System.out.println("Enter a valid option");
              
         }
        return false;
    }
    /*
    private double calcVolume(double length, double width, double height) throws InventoryControlExceptions{
        
        length = this.getPLength();
        width = this.getPWidth();
        height = this.getPHeight();
        
        volume = InventoryControl.calcDesignPyramid(length, width, height);
        
        return volume;
    }
    */
    
    
     private double getPLength() {
        boolean valid = false;
        double input = 0;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Length:");
            input = keyboard.nextDouble();
                      
        break;
            }
        return input;
        }
    
     
     private double getPWidth() {
        boolean valid = false;
        double input = 0;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Width:");
            input = keyboard.nextDouble();
                     
        break;
            }
        return input;
        }
     
         private double getPHeight() {
        boolean valid = false;
        double input = 0;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Height:");
            input = keyboard.nextDouble();
                      
        break;
            }
        return input;
    }
   
    
   /* 
    private void savePyramid() {
        InventoryControl.savePyramid();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
   */
}


        
