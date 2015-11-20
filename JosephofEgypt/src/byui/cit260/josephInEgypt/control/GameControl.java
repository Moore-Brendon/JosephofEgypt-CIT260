/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.InventoryItem;
import byui.cit260.josephInEgypt.model.Item;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Map;
import byui.cit260.josephInEgypt.model.Pyramid;
import byui.cit260.josephInEgypt.model.RegularScene;
import byui.cit260.josephInEgypt.model.SceneType;
import byui.cit260.josephInEgypt.model.Wagon;

/**
 *
 * @author Brendon.Moore
 */
public class GameControl {
    
   

    public static void createNewGame(Player player) {
        Game game = new Game();
    JosephofEgypt.setCurrentGame(game);
    game.setPlayer(player);
    InventoryItem[] inventoryList = GameControl.createInventoryList();
    game.setInventory(inventoryList);
    Pyramid pyramid = new Pyramid();
    game.setPyramid(pyramid);
    Wagon wagon = new Wagon();
    game.setWagon(wagon);
    Map map = MapControl.createMap();
    game.setMap(map);
    MapControl.moveActorsToStartingLocation(map);
    
    }
    
    public static void openSavedGame(Game currentGame){
        System.out.println("\n*** openSavedGame stub function called ***"); 

    }
    public static void saveGame(Game currentGame){
        System.out.println("\n*** saveGame stub function called ***"); 

    }

    public static void moveRiverside() {
        System.out.println("\n*** moveRiverside stub function called ***"); 
    }

    public static void moveMineral() {
        System.out.println("\n*** moveMineral stub function called ***");
    }

    public static void moveCity() {
        System.out.println("\n*** moveCity stub function called ***");
    }

    public static void moveVillage() {
        System.out.println("\n*** moveVillage stub function called ***");
    }
    
    public static void moveCattle() {
        System.out.println("\n*** moveCattle stub function called ***"); 
    }
    
    public static void moveWarehouse() {
        System.out.println("\n*** moveWarehouse stub function called ***"); 
    }
    
    public static void moveMountain() {
        System.out.println("\n*** moveMountain stub function called ***"); 
}

    private static InventoryItem[] createInventoryList() {
        
        InventoryItem[] inventory = new InventoryItem[8];
        
        InventoryItem wood = new InventoryItem();
        wood.setDescription("Wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmounts(0);
        inventory[Item.wood.ordinal()] = wood;
        
         InventoryItem ore = new InventoryItem();
        ore.setDescription("Ore");
        ore.setQuantityInStock(0);
        ore.setRequiredAmounts(0);
        inventory[Item.wood.ordinal()] = ore;
        
         InventoryItem grain = new InventoryItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmounts(0);
        inventory[Item.grain.ordinal()] = grain;
        
         InventoryItem hammer = new InventoryItem();
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmounts(0);
        inventory[Item.hammer.ordinal()] = hammer;
        
         InventoryItem chisel = new InventoryItem();
        chisel.setDescription("Chisel");
        chisel.setQuantityInStock(0);
        chisel.setRequiredAmounts(0);
        inventory[Item.chisel.ordinal()] = chisel;
        
         InventoryItem saw = new InventoryItem();
        saw.setDescription("Saw");
        saw.setQuantityInStock(0);
        saw.setRequiredAmounts(0);
        inventory[Item.saw.ordinal()] = saw;
        
         InventoryItem carts = new InventoryItem();
        carts.setDescription("Carts");
        carts.setQuantityInStock(0);
        carts.setRequiredAmounts(0);
        inventory[Item.carts.ordinal()] = carts;
        
         InventoryItem barrels = new InventoryItem();
        barrels.setDescription("Barrels");
        barrels.setQuantityInStock(0);
        barrels.setRequiredAmounts(0);
        inventory[Item.barrels.ordinal()] = barrels;
        return inventory;
        
        
        
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
    
    private static void assignScenesToLoactions(Map map, RegularScene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.resource.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.storage.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.regular.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.finish.ordinal()]);
        
        
       

        
    }

    public static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static InventoryItem[] getSortedInventoryList() {
        InventoryItem[] originalInventoryList =
                JosephofEgypt.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        InventoryItem tempInventoryItem;
        
        for (int i = 1; i< inventoryList.length; i++){
            for(int j = i ; j>0; j--){
                if(inventoryList[j-1].getDescription().compareToIgnoreCase(inventoryList[j].getDescription()) > 0){
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j-1];
                    inventoryList[j-1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
        }
    
    
    
}
