/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JosephofEgypt;

import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brendon.Moore
 */
public class JosephofEgypt {

    private static Game currentGame = null;
    private static Player player = null;
    private static Game savedGame = null;
    private static Game savedReport = null;
    /**
     * @param args the command line arguments
     */
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    
    
    public static void main(String[] args){
        try {
            JosephofEgypt.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            JosephofEgypt.outFile = new PrintWriter(System.out, true);
            
            
            String filePath = "log.txt";
            JosephofEgypt.logFile = new PrintWriter(filePath);
            
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
    } catch (Throwable te) {
       
        System.out.println(te.getMessage());
        te.printStackTrace();
        
        }
        
        finally {
            try {
                if (JosephofEgypt.inFile != null)
                    JosephofEgypt.inFile.close();
                
                if (JosephofEgypt.outFile != null)
                    JosephofEgypt.outFile.close();
                
                if  (JosephofEgypt.logFile != null)
                    JosephofEgypt.logFile.close();
                
            } catch (IOException ex) {
              System.out.println("Error closing files");
                return;
            }
          
        }
        
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
    
    public static Game saveGame(Game game, String filepath ){
       return savedGame;
    }
    public static Game saveReport(Game report, String filepath ){
        
       return savedReport;
    }   
    public static Game getSavedGame() {
        return savedGame;
    }

    public static void setSavedGame(Game savedGame) {
        JosephofEgypt.savedGame = savedGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        JosephofEgypt.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        JosephofEgypt.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        JosephofEgypt.logFile = logFile;
    }

    public static Game saveReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
