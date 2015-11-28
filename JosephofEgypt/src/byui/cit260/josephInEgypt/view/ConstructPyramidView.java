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
public class ConstructPyramidView {
    private final String MENU = "\n"
            + "\n----------------------------"
            + "\n| Enter dimensions of pyramid.              |"
            + "\n----------------------------"
            + "\n----------------------------";
          
            
    
    public void displayMenu() throws InventoryControlExceptions{
        double length;
	double width;
	double height;
        double volume;
        System.out.println(MENU);
        length = this.getLength();
        width = this.getWidth();
        height = this.getHeight();
        volume = this.doAction(length,width,height);
        this.savePyramid();
        System.out.println("Pyramid saved. Volume:" + volume);
        
    }
    
    
    private double getLength() {
        boolean valid = false;
        double input = 0;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Length:");
            input = keyboard.nextDouble();
            if (input < 1 | input > 50 ){
            System.out.println ("Length must be greater than 0 and less than 50.");
            continue;
            }
            
        break;
            }
        return input;
        }
    
    private double getWidth() {
        boolean valid = false;
        double input = 0;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Width:");
            input = keyboard.nextDouble();
            if (input < 1 | input > 50  ){
            System.out.println ("Width must be greater than 0 and less than 50.");
            continue;
            }
            
        break;
            }
        return input;
        }
    private double getHeight() {
        boolean valid = false;
        double input = 0;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Height:");
            input = keyboard.nextDouble();
            if (input < 1 | input > 50 ){
            System.out.println ("Height must be greater than 0 and less than 50.");
            continue;
            }
            
        break;
            }
        return input;
        }
    
    public double doAction(double length, double width, double height) throws InventoryControlExceptions {
       InventoryControl inventoryControl = new InventoryControl();
       double volume = inventoryControl.calcDesignPyramid (length, width, height);
       return volume;
    }

    private void savePyramid() {
        InventoryControl.savePyramid();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
   
}


        
