/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Map;
import byui.cit260.josephInEgypt.model.Player;

/**
 *
 * @author User
 */
public class GameMapView extends View {

    public GameMapView() {
        super("");
    }
    
    @Override
    public String getInput(){
        return null;
    }
    

    @Override
    public boolean doAction(Object obj) {
        this.displayMap();   
    
        return true;   
    }

    private void displayMap() {
        
        Game game = JosephofEgypt.getCurrentGame();
        Map map = game.getMap();        
        Location [][] locations = map.getLocations();
        Player player = game.getPlayer();
        
        String title = "\nThis is the Joseph of Egypt Map ";
        char rowDivider = '_';
        char columnDivider = '|';
        String symbol = "";
        
        System.out.println(title);
        
        System.out.println("   1  2  3  4  5  6  7  8  9  10 ");
           for(int i = 1;i<11;i++){
            
            System.out.print(i);
            if(i< 10)
                System.out.print(" ");
            for(int j = 1;j<11;j++){
                System.out.print(columnDivider);
                if(locations[i][j].isVisited())
                    System.out.print("vv");
                else if(locations[i][j].getScene() != null)
                    System.out.print(locations[i][j].getScene().getSymbol());
                               
                else 
                    System.out.print("??");//needs more logic
                
            }
                System.out.println(columnDivider);
                
        }
        
        
                
    }
    
    
}
