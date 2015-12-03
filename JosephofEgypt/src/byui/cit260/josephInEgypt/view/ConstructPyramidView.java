/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.control.InventoryControl;
import byui.cit260.josephInEgypt.exceptions.InventoryControlExceptions;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.GameMenuView;
import byui.cit260.josephInEgypt.model.Pyramid;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            + "\n----------------------------");
          
    }
        
    
    
    
    @Override
       public String getInput(){
            
        try {
            System.out.println(" Please Enter Pyramid length : ");
            String length = this.keyboard.readLine();
            int intLength = parseInt(length);
            
            if (intLength < 1 | intLength > 50 ){
                System.out.println ("Length must be greater than 0 and less than 50.");
            }
            
            
            System.out.println(" Please Enter Pyramid width : ");
            int intWidth = parseInt(this.keyboard.readLine());
            
            if (intWidth < 1 | intWidth > 50  ){
                System.out.println ("Width must be greater than 0 and less than 50.");
                
            }
            System.out.println(" Please Enter Pyramid height : ");       
            int intHeight = parseInt(this.keyboard.readLine());
            
            if (intHeight < 1 | intHeight > 50 ){
                System.out.println ("Height must be greater than 0 and less than 50.");
                        
            }
            
           InventoryControl.calcDesignPyramid(intLength, intWidth, intHeight);
           
                    
            
        } catch (IOException ex) {
            Logger.getLogger(ConstructPyramidView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(ConstructPyramidView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
       
        
     }
       
        
         
   
        @Override
    public boolean doAction(Object obj){
     Pyramid pyramid = (Pyramid) obj;
     int volume = pyramid.getVolume();
     pyramid.getVolume();
        return false;
    }
    
    
   
    
    
    private void savePyramid() {
        InventoryControl.savePyramid();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
   
}


        
