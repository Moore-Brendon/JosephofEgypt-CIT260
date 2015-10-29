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
        System.out.println("\n displayGoal function called");
    }

    private void displayHowToMove() {
        System.out.println("\n displayHowToMove function called");    }

    private void displayHowToConstruct() {
        System.out.println("\n displayHowToConstruct function called");    }

    private void displayHowToHarvest() {
        System.out.println("\n displayHowToConstruct function called");    }

    private void displayHowToDeliver() {
        System.out.println("\n displayHowToDeliver function called");
    }
}
    

