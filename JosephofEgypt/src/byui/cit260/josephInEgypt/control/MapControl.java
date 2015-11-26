/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.exceptions.MapControlExceptions;
import byui.cit260.josephInEgypt.model.Actor;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Map;
import byui.cit260.josephInEgypt.model.RegularScene;
import byui.cit260.josephInEgypt.model.SceneType;
import java.awt.Point;

/**
 *
 * @author juan
 */
class MapControl {
     public static   Map map;

    static Map createMap() {
        map = new Map(20, 20);
        RegularScene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }
    public Map regresar(){
        return map;
    }

    static void moveActorsToStartingLocation(Map map) throws MapControlExceptions {
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors ) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
            }
        


    }
    
    private static RegularScene[] createScenes(){
        
        Game game = JosephofEgypt.getCurrentGame();
        
        RegularScene[] scenes = new RegularScene[SceneType.values().length];
        
        RegularScene startingScene= new RegularScene();
        startingScene.setDescription("\nJoseph has seven years to prepare for the famine");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        RegularScene mountainScene= new RegularScene();
        mountainScene.setDescription("\nYou have arrived at the top of the mountain where you can recieve help from the Lord");
        mountainScene.setMapSymbol("MT");
        mountainScene.setBlocked(false);
        mountainScene.setTravelTime(200);
        scenes[SceneType.mountain.ordinal()] = mountainScene;
        
        RegularScene resourceScene= new RegularScene();
        resourceScene.setDescription("\nHere you can mine ore and manage our labor forces.");
        resourceScene.setMapSymbol("RS");
        resourceScene.setBlocked(false);
        resourceScene.setTravelTime(300);
        scenes[SceneType.resource.ordinal()] = resourceScene;
            
        RegularScene storageScene= new RegularScene();
        storageScene.setDescription("\nThis is where you are able to store your grain.");
        storageScene.setMapSymbol("ST");
        storageScene.setBlocked(false);
        storageScene.setTravelTime(300);
        scenes[SceneType.storage.ordinal()] = storageScene;
        
        RegularScene regularScene= new RegularScene();
        regularScene.setDescription("\nSelect your next plan of action.");
        regularScene.setMapSymbol("RG");
        regularScene.setBlocked(false);
        regularScene.setTravelTime(300);
        scenes[SceneType.regular.ordinal()] = regularScene;
        
        RegularScene finishScene= new RegularScene();
        finishScene.setDescription("\nYou did it! You prepared enough food to survive the famine.");
        finishScene.setMapSymbol("FS");
        finishScene.setBlocked(false);
        finishScene.setTravelTime((int) Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
        
    }
        
    public static void moveActorToLocation(Actor actor, Point coordinates) throws MapControlExceptions{
        
        Map map = JosephofEgypt.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        if (newRow <0 || newRow >= map.getNoOfRows() ||
                newColumn <0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlExceptions("Can not move actor to location "
                                            + coordinates.x + ", " + coordinates.y
                                            + " because that location is outside "
                                            + " the bounds of the map.");
            
        }
        
    }
    
}
