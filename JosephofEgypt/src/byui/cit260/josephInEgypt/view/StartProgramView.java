/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.ProgramControl;
import byui.cit260.josephInEgypt.model.Player;
import java.util.Scanner;

/**
 *
 * @author Brendon.Moore
 */
    public class StartProgramView {


    public StartProgramView(){

    }

    public void startProgram(){

        this.displayBanner();
        String playersName = this.getPlayersName();
        Player player = ProgramControl.createPlayer(playersName);
        this.displayWelcomeMessage(player);
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
        
        

    }   

    private void displayBanner() {
        System.out.println("\n\n****************************************");
        
        System.out.println("*                                            *"
                        + "\n* This is the game of Joseph in Egypt.      *"
                        + "\n* In this game you will help Joseph prepare *"
                        + "\n* for the famine that is coming in 7 years. *");
        
        System.out.println("*                                            *"
                        + "\n* You will first need to                    *"
                        + "\n*                                          *");
        
        
        System.out.println("\n\n****************************************");
        
    }

    private String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Enter the player's name below:");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            if (playersName.length() < 2 ){
                System.out.println("Invalid name - the name must not be blank");
                continue;
            }
        break;
            }
        return playersName;
        }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        
    
    
    }
    
    
    

}