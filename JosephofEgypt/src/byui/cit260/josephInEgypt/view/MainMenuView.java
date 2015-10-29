/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.model.GameMenuView;
import java.util.Scanner;

/**
 *
 * @author Brendon.Moore
 */
public class MainMenuView {
    private final String MENU = "\n"
            + "\n----------------------------"
            + "\n| Main Menu                |"
            + "\n----------------------------"
            + "\nG - Start game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
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
            case 'N':
                this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
    }

    private void startNewGame() {
        GameControl.createNewGame(JosephofEgypt.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** saveGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** displayHelpMenu function called ***");
    }
    
    
    
    
    
}


        