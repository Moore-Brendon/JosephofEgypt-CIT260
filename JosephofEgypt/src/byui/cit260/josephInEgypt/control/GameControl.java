/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.exceptions.GameControlExceptions;
import byui.cit260.josephInEgypt.exceptions.MapControlExceptions;
import byui.cit260.josephInEgypt.model.Actor;
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Brendon.Moore
 */
public class GameControl {
    
   
    public static Map map;
    public static void createNewGame(Player player) throws MapControlExceptions {
        Game game = new Game();
    JosephofEgypt.setCurrentGame(game);
    game.setPlayer(player);
    InventoryItem[] inventoryList = GameControl.createInventoryList();
    game.setInventory(inventoryList);
    Pyramid pyramid = new Pyramid();
    game.setPyramid(pyramid);
    Wagon wagon = new Wagon();
    game.setWagon(wagon);
    map = MapControl.createMap();
    game.setMap(map);
    Actor[] actors = new Actor[6];
    MapControl.moveActorsToStartingLocation(map);
    
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlExceptions {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(currentGame);
            
        }
        catch(IOException e) {
            throw new GameControlExceptions(e.getMessage());
        }
   
    }
    public Map regreso(){
        return map;
    }
    public static void openSavedGame(String filepath) throws GameControlExceptions{
        Game game = null;
        try(FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            game = (Game) output.readObject();
        }
        catch(FileNotFoundException fnfe){
            throw new GameControlExceptions(fnfe.getMessage());
        }
        catch(Exception e){
            throw new GameControlExceptions(e.getMessage());
        }
        JosephofEgypt.setCurrentGame(game);
        
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
        wood.setInventoryItem("Wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmounts(0);
        inventory[Item.wood.ordinal()] = wood;
        
         InventoryItem ore = new InventoryItem();
        ore.setInventoryItem("Ore");
        ore.setQuantityInStock(0);
        ore.setRequiredAmounts(0);
        inventory[Item.ore.ordinal()] = ore;
        
         InventoryItem grain = new InventoryItem();
        grain.setInventoryItem("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmounts(0);
        inventory[Item.grain.ordinal()] = grain;
        
         InventoryItem hammer = new InventoryItem();
        hammer.setInventoryItem("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmounts(0);
        inventory[Item.hammer.ordinal()] = hammer;
        
         InventoryItem chisel = new InventoryItem();
        chisel.setInventoryItem("Chisel");
        chisel.setQuantityInStock(0);
        chisel.setRequiredAmounts(0);
        inventory[Item.chisel.ordinal()] = chisel;
        
         InventoryItem saw = new InventoryItem();
        saw.setInventoryItem("Saw");
        saw.setQuantityInStock(0);
        saw.setRequiredAmounts(0);
        inventory[Item.saw.ordinal()] = saw;
        
         InventoryItem carts = new InventoryItem();
        carts.setInventoryItem("Carts");
        carts.setQuantityInStock(0);
        carts.setRequiredAmounts(0);
        inventory[Item.carts.ordinal()] = carts;
        
         InventoryItem barrels = new InventoryItem();
        barrels.setInventoryItem("Barrels");
        barrels.setQuantityInStock(0);
        barrels.setRequiredAmounts(0);
        inventory[Item.barrels.ordinal()] = barrels;
        return inventory;
             
    }
       
    
          public static InventoryItem[] getSortedInventoryList() {
       // we need a try catch if View inventory list is called before there is anything here KSH
              InventoryItem[] originalInventoryList =
                JosephofEgypt.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        InventoryItem tempInventoryItem;
        
        for (int i = 1; i< inventoryList.length; i++){
            for(int j = i ; j>0; j--){
                if(inventoryList[j-1].getInventoryItem().compareToIgnoreCase(inventoryList[j].getInventoryItem()) > 0){
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j-1];
                    inventoryList[j-1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
        }
     public static String getBarrelTotal() {
        InventoryItem[] originalInventoryList =
                JosephofEgypt.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        double quantity = 0;
        double required = 0;
        double volume = 0;
        String returnString;
        for (int i = 1; i< inventoryList.length; i++){
            
                if("Barrels".equals(inventoryList[i].getInventoryItem())){
                    quantity = inventoryList[i].getQuantityInStock();
                    required = inventoryList[i].getRequiredAmount();
                    volume = quantity * 35;
                }
            
        }
        returnString = "You currently have " + quantity + " barrels which equates " + volume + " pounds of grain. You still need " + required + ".";
        return returnString;
    }
        static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.resource.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.storage.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.regular.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.finish.ordinal()]);
        
        
       

        
    }
    
    
}
