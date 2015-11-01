/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class HelpMenuView {
    
      private final String MENU = "\n"
            + "\n----------------------------"
            + "\n| Help Menu                |"
            + "\n----------------------------"
            + "\nG - Game goal"
            + "\nM - How to move"
            + "\nC - Construct items"
            + "\nH - Harvesting"
            + "\nD - Deliver Resources"
            + "\nQ - Quit"
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
  
            
            case 'G':
                this.displayGoal();
                break;
            case 'M':
                this.displayHowToMove();
                break;
            case 'C':
                this.displayHowToConstruct();
                break;
            case 'H':
                this.displayHowToHarvest();
                break;
            case 'D':
                this.displayHowToDeliver();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
    }

    private void displayGoal() {
        System.out.println("\n"
                +"----------------------------------"
                + "The player win when have compled"
                + " all assignments correctly and"
                + "having a good administration"
                + "and reaching the requared quantity"
                + "in less time"
                + "----------------------------------"
                + "There will be competition "
                + "with others playersdisplayGoal function called");
    }

    private void displayHowToMove() {
        System.out.println("\n "
                + "---------------------------------"
                + "Joseph needs to travel along the "
                + "territory,chose principals and "
                + "give them instruction respect the goals"
                + "that they need to accomplish"
                + "The principals must be to Construc,"
                + "to Harvest, to Deliver"
                + "Joseph needs to go from the city "
                + "to the places where get metals and stons"
                + "where get the woods "
                + "------------------------------------"
                + "displayHowToMove function called");    }

    private void displayHowToConstruct() {
        System.out.println("\n"
                + "Joseph decided to construct"
                + "only one big pyramid to store"
                + "the grains and have the total"
                + "control over the grains"
                + "Joseph knows that in average needs 50 men"
                + "to construct one square yard "
                + "in ten daysdisplayHowToConstruct function called");    }

    private void displayHowToHarvest() {
        System.out.println("\n "
                + "Joseph needs to have spetialist "
                + "to have a very good harvest and he needs "
                + "to sow very well and get the best seeds"
                + "and manteinance the grains in good state"
                + "Joseph knows that in average"
                + "a person needs 2 pounds of grains to survive"
                + "one day, and Joseph expect 20000 people"
                + "in 7 years one peodisplayHowToConstruct function called");    }

    private void displayHowToDeliver() {
        System.out.println("\n"
                + "Joseph needs to deliver the grain "
                + "to send the grain needs carts"
                + "and people to drive the carts and care the grain"
                + "While the pyramid is constructing"
                + "the graing will be store in barrels"
                + "and Joseph will send them with carts"
                + " displayHowToDeliver function called");
    }
}
    

