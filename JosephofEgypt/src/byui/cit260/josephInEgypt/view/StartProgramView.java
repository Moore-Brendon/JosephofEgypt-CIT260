/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.ProgramControl;
import byui.cit260.josephInEgypt.model.Player;

/**
 *
 * @author Brendon.Moore
 */
    public class StartProgramView  extends View{


    public StartProgramView(){

        super("\n* This is the game of Joseph in Egypt.      *"
            + "\n* In this game you will help Joseph prepare *"
            + "\n* for the famine that is coming in 7 years. *"

            + "\n*********************************************"
            + "\n* Please enter your name. *");

    }
     @Override

    public boolean doAction(Object obj){
        String playersName = (String) obj;
        
        //playersName = this.getInput();

        Player player = ProgramControl.createPlayer(playersName);
               
        this.displayWelcomeMessage(player);
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        return true;
        
        
        

    }   

   

   

    private void displayWelcomeMessage(Player player) {
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        
    
    
    }
    
    
    

}
