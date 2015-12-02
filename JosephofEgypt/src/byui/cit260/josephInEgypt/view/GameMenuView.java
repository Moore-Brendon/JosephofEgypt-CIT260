/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.control.HarvestControl;
import byui.cit260.josephInEgypt.control.InventoryControl;
import byui.cit260.josephInEgypt.exceptions.InventoryControlExceptions;

import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.InventoryItem;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class GameMenuView extends View{
    
    
       
    public GameMenuView(){
     super("\n"
            + "\n----------------------------"
            + "\n| Game Menu                |"
            + "\n----------------------------"
            + "\nM - Move to a new location"
            + "\nX - Explore location"
            + "\nC - Calculate Harvest"
            + "\nP - Construct Pyramid"
            + "\nT - Construct Tools "
            + "\nB - Construct  Barrels "
            + "\nH - Harvest Resource "
            + "\nG - Transport Goods "
            + "\nD - Deliver Goods "
            + "\nV - View Game Map "
            + "\nI - Show Current Inventory  "
            + "\nE - Exit "
            + "\n----------------------------");
}
         
    
    
    
   @Override
    
    public boolean doAction(Object obj) {
        String value =(String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {

            case 'M':
                this.moveToNewLocation();
                break;
            case 'X':
                this.exploreLocation();
                break;
            case 'C':
        {
            try {
                this.calculateHarvest();
            } catch (InventoryControlExceptions me) {
                System.out.println(me.getMessage());
            }
        }
                break;
            case 'P':
        {
            try {
                this.constructPyramid();
            } catch (InventoryControlExceptions me) {
                System.out.println(me.getMessage());            }
        }
                break;
            case 'T':
                this.constructTools();
                break;
            case 'B':
                this.constructBarrels();
                break;
            case 'H':
                this.HarvestResource();
                break;
            case 'G':
                this.transportGoods();
                break; 
            case 'D':
                this.deliverGoods();
                break;
            case 'V':
                this.viewGameMap(GameControl.map);
                break;
            case 'I':
                this.showCurrentInventory();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
        return false;
    }

    private void moveToNewLocation() {
        //display banner with a graphical map, the map needs a symbol to distinguish territories
        //prompt user to enter coordinates
        //validate input with if ladder
        //display time to travel
        //promt user to accept time
        //add time to the time class interface
    }

    private void exploreLocation() {
        /*Display the current position territory  
        * sorted list of resources availble for harvest
        * progress status
        * time left to complete task
        */
    }

    private void calculateHarvest() throws InventoryControlExceptions {
        // display banner instructing user what to do
        System.out.println("\nTo calculate harvest several values must be known"
                + "\nthe daily ingest number and the number of people"
                + "\nbe sure to know this numbers, game will require an exact amount. "
                + "\nif you don't remember this numbers go to help menu to receive more"
                + "\nasistance and to the city territory to explore amount of people in the city."        
        );
        
        int dailyCons = this.getDailyCons();
        int noOfPeople = this.getNoOfPeople();
        int totalDays = this.getTotalDays();
        int totalHarvestNeeded = InventoryControl.calcResourcesNeeded(dailyCons, totalDays, noOfPeople);
        // set harvest objective
        this.saveHarvestObj();
        //display harvest objective
        System.out.println("The game harvest objective is: " + totalHarvestNeeded);
        this.display();
    }

    private void constructPyramid() throws InventoryControlExceptions {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        System.out.println( "\n"
            + "\n----------------------------"
            + "\n| Enter dimensions of pyramid.              |"
            + "\n----------------------------"
            + "\n----------------------------");
          
        
        double length;
	double width;
	double height;
        double volume;
        //System.out.println(MENU);
        length = this.getPLength();
        width = this.getPWidth();
        height = this.getPHeight();
        volume = this.doPAction(length,width,height);
        this.savePyramid();
        System.out.println("Pyramid saved. Volume:" + volume);
        
    
    }

    

    private void constructTools() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void constructBarrels() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void transportGoods() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deliverGoods() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void viewGameMap(Map map) {
          Location[][] locations = map.getLocations();
        
      
    }  
    

    private void showCurrentInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                            "Required" + "\t" +
                            "In Stock");
       for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getInventoryItem() + "\t   " +
                                inventoryItem.getRequiredAmount() + "\t    " +
                                inventoryItem.getQuantityInStock());
}
}

    private void HarvestResource() {
    
        //display banner prompting user to enter resource(switch)
        //get input and asign value to resource
        //test if resource is a valid option
        //test if resource is available
        //test if amount harvest is less than or equal to the available
        //test if amount desired harvest can be stored in barrels available
        //display banner to confrm action yes no filter
        //set time to perform action set status to active
        
    }
    
    private int getNoOfPeople(){
      
        boolean valid = false;
        int noOfPeople = 0;
        Scanner keyboard = new Scanner(System.in);
        //validate input by comparing with stablished parameters
        while(!valid){
        System.out.println("Enter total amount of people: ");    
        noOfPeople = keyboard.nextInt();
          
            if (noOfPeople != 100000){
                valid = false;
                }
        
        }
        
         return noOfPeople;
        
        }
    private int getTotalDays(){
        
        boolean valid = false;
        int totalDays = 0;
        Scanner keyboard = new Scanner(System.in);
        //validate input by comparing with stablished parameters
        while(!valid){
        System.out.println("Enter total amount of days: ");    
        totalDays = keyboard.nextInt();
          
        if (totalDays < 2555 || totalDays > 2556){
            valid = true;
        }
        }
        
         return totalDays;
        
        
    }

    private int getDailyCons() {
        boolean valid = false;
        int dailyCons = 0;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter daily consumprion per person: ");
            dailyCons = keyboard.nextInt();
            if(dailyCons!=1){
                valid = false;
                }
        }
         return dailyCons;
        
    }

    private void saveHarvestObj() {
       HarvestControl.saveHarvestObj();
    }
 private double getPLength() {
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
 
 private double getPWidth() {
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
    private double getPHeight() {
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
    public double doPAction(double length, double width, double height) throws InventoryControlExceptions {
       InventoryControl inventoryControl = new InventoryControl();
       double volume = inventoryControl.calcDesignPyramid (length, width, height);
       return volume;
    }
    private void savePyramid() {
        InventoryControl.savePyramid();
        this.display();
    }

   
}
