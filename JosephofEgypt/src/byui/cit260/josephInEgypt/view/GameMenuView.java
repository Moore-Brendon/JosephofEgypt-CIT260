/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.HarvestControl;
import byui.cit260.josephInEgypt.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GameMenuView {
    
     private final String MENU = "\n"
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
            + "\n----------------------------";
          
            
    
    public void displayMenu(){
        char selection = ' ';
        do{
            
            System.out.println(MENU);
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
        } while (selection != 'E');
    }
    
    
    private String getInput() {
        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Select a menut item:");
            selection = keyboard.nextLine();
            selection = selection.toUpperCase();
            
        break;
            }
        return selection;
        }
    
    public void doAction(char selection) {
        switch (selection) {
  
            
            case 'M':
                this.moveToNewLocation();
                break;
            case 'X':
                this.exploreLocation();
                break;
            case 'C':
                this.calculateHarvest();
                break;
            case 'P':
                this.constructPyramid();
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
                this.viewGameMap();
                break;
            case 'I':
                this.showCurrentInventory();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
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

    private void calculateHarvest() {
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
        this.displayMenu();
    }

    private void constructPyramid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    private void viewGameMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showCurrentInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
