
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.view.StartProgramView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brendon.Moore
 */
public class JosephofEgypt {
    private static Game currentGame = null;
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setCurrentGame(Game currentGame) {
        JosephofEgypt.currentGame = currentGame;
    }

    public static void setPlayer(Player player) {
        JosephofEgypt.player = player;
    }
    
    
    
    
}
