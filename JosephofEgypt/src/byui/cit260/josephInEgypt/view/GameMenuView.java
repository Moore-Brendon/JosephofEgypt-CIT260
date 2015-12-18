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
import byui.cit260.josephInEgypt.model.Actor;

import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.InventoryItem;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Map;
import java.io.IOException;
import static java.lang.Integer.parseInt;
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
            + "\nR - Print Inventory Report  "
            + "\nA - Print Actor Report"
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
            {try{ 
                this.constructBarrels();
            } catch (InventoryControlExceptions me){
                System.out.println(me.getMessage());}
            }
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
                this.viewGameMap();
                break;
            case 'I':
                this.showCurrentInventory();
                break;
            case 'R':
        {
            try {
                this.displayPrintReport();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());            
            }
        }
                break;
            case 'A':
                this.printActorReport();
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
        return false;
    }

    private void moveToNewLocation() {
        GameMapView mapView = new GameMapView();
        mapView.doAction(this);
        MoveMenuView moveMenuView = new MoveMenuView();
        moveMenuView.display();
        
        
        
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
        
      // ExploreLocationView exploreView = new ExploreLocationView();
      // exploreView.display();
    }

    private void calculateHarvest() throws InventoryControlExceptions {
        // display banner instructing user what to do
        System.out.println("\nTo calculate harvest several values must be known:"
                + "\nThe daily consumption number and the number of people."
                + "\nBe sure to know these numbers, as the game will require an exact amount. "
                + "\nIf you don't remember these numbers go to the help menu to receive more"
                + "\nassistance and to the city territory to explore the amount of people in the city."        
        );
        
        int dailyCons = this.getDailyCons();
        int noOfPeople = this.getNoOfPeople();
        int totalDays = 2555;
        int totalHarvestNeeded = InventoryControl.calcResourcesNeeded(dailyCons, totalDays, noOfPeople);
        // set harvest objective
        this.saveHarvestObj();
        //display harvest objective
        System.out.println("The game harvest objective is: " + totalHarvestNeeded + " pounds of grain.");
        this.display();
    }

    private void constructPyramid() throws InventoryControlExceptions {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    ConstructPyramidView constructPyramidView = new ConstructPyramidView();
    
    constructPyramidView.display();
    this.display();
    }
    

    

    private void constructTools() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void constructBarrels()throws InventoryControlExceptions  {
         // display banner instructing user what to do
        System.out.println("\nEnter the dimensions and quantity for the barrels:"
                       
        );
        
        double radius = this.getBarrelRadius();
        double height = this.getBarrelHeight();
        double quantity = this.getBarrelQuantity();
        
        double totalBarrelVolume = InventoryControl.calcVolumeOfBarrel(height, radius, quantity);
        // set harvest objective
        this.saveBarrels();
        //display harvest objective
        System.out.println("The total volume of your barrels can hold : " + totalBarrelVolume + " pounds of grain.");
        this.display();
        

    }

    private void transportGoods() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deliverGoods() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void viewGameMap() {
        
        
        GameMapView gameMapView = new GameMapView();
        gameMapView.display();
        
        
        
      
    }  
    

    private void showCurrentInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                            "Required" + "\t" +
                            "In Stock");
       for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getInventoryItem() + "\t      " +
                                inventoryItem.getRequiredAmount() + "\t       " +
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
                valid = true;
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
            System.out.println("Enter daily consumption per person (in pounds): ");
            dailyCons = keyboard.nextInt();
            if(dailyCons!=1){
                valid = true;
                }
        }
         return dailyCons;
        
    }

    private void saveHarvestObj() {
       HarvestControl.saveHarvestObj();
    }

 
 
   
    /*
    public double doAction(double length, double width, double height) throws InventoryControlExceptions {
       InventoryControl inventoryControl = new InventoryControl();
       double volume = inventoryControl.calcDesignPyramid (length, width, height);
       return volume;
    }
    */
   

   private void displayPrintReport() throws IOException {
            
        PrintReportView printReport = new PrintReportView();
        printReport.display();    


    }

    private double getBarrelRadius() {
        boolean valid = false;
        int input = 0;
        double radius = 0;
        
    try{    
        while (!valid) {
            System.out.println("Radius:");
            input = parseInt(this.keyboard.readLine());
            radius = (double) input;
                
        break;
    }
    }catch (IOException | NumberFormatException e){
            System.out.println("Error reading input" + e.getMessage());
            }
        
    
        return radius;    }

    private double getBarrelHeight() {
        boolean valid = false;
        int input = 0;
        double height = 0;
        
    try{    
        while (!valid) {
            System.out.println("Height:");
            input = parseInt(this.keyboard.readLine());
            height = (double) input;
                
        break;
    }
    }catch (IOException | NumberFormatException e){
            System.out.println("Error reading input" + e.getMessage());
            }
        
    
        return height;     }

    private double getBarrelQuantity() {
boolean valid = false;
        int input = 0;
        double quantity = 0;
        
    try{    
        while (!valid) {
            System.out.println("Quantity:");
            input = parseInt(this.keyboard.readLine());
            quantity = (double) input;
                
        break;
    }
    }catch (IOException | NumberFormatException e){
            System.out.println("Error reading input" + e.getMessage());
            }
        
    
        return quantity;     }

    private void saveBarrels() {
//save barrels
    }

    private void printActorReport() {
        ActorReportView actorReport = new ActorReportView();
        actorReport.display();
    }

    
}
