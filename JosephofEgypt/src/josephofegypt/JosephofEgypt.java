/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephofegypt;

import byui.cit260.josephInEgypt.model.InventoryItem;
import byui.cit260.josephInEgypt.model.Player;

/**
 *
 * @author Brendon.Moore
 */
public class JosephofEgypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player(); 
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestHarvest(150000);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        InventoryItem itemOne = new InventoryItem();
        itemOne.setInventoryItem("Corn");
        itemOne.setQuantityInStock(34000);
        itemOne.setRequiredAmount(250000);
        
        String inventoryInfo = itemOne.toString();
        System.out.println(inventoryInfo);
        
        
        
        
        
    }
    
}
