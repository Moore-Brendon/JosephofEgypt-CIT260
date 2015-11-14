/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;
import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.control.GameControl;


/**
 *
 * @author Brendon.Moore
 */
public class SaveGameView extends View{
    public SaveGameView(){
        super("\n"
        + "\n Enter game name:");
    }
  @Override
  public boolean doAction(Object obj){
      String value =(String) obj;
      switch (value) {
        case "":
            System.out.println("\n*** You must enter a game name, or 'C' to cancel.");
            break;
        case "C":
        case "c":
            return true;
        default:
                this.saveGame();
            break;
        
            
            
      }
      return false;
  }
    private void saveGame() {
        GameControl.saveGame(JosephofEgypt.saveGame(JosephofEgypt.saveGame(null)));
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();    }
}
