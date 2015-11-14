/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.view.GameMenuView;
import java.util.Scanner;

/**
 *
 * @author Brendon.Moore
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
            + "\n----------------------------"
            + "\n| Main Menu                |"
            + "\n----------------------------"
            + "\nN - Start new game"
            + "\nG - Start existing game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n----------------------------");
          
            
    
    }
    
    
    @Override
    public boolean doAction(Object obj) {
        String value =(String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
  
            
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
                return true ;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(JosephofEgypt.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        GameControl.openSavedGame(JosephofEgypt.getCurrentGame());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        SaveGameView saveGame = new SaveGameView();
        saveGame.display();    }
    
    
    
    
    
}


        
