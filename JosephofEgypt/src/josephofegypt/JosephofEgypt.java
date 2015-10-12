/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephofegypt;

import byui.cit260.josephInEgypt.model.Barrel;
import byui.cit260.josephInEgypt.model.InventoryItem;
import byui.cit260.josephInEgypt.model.MountainScene;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.model.Pyramid;
import byui.cit260.josephInEgypt.model.ResourceScene;
import byui.cit260.josephInEgypt.model.Wagon;


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
        
        
        Pyramid pyramidOne = new Pyramid();
        pyramidOne.setLength(25);
        pyramidOne.setWidth(25);
        pyramidOne.setHeight(20);
        pyramidOne.setVolume(450);
        
        String pyramidInfo = pyramidOne.toString();
        System.out.println(pyramidInfo);
     
        
        Barrel barrelOne = new Barrel();
        barrelOne.setDiameter(5);
        barrelOne.setHeight(15);
        barrelOne.setVolume(65.4);
        
        String barrelInfo = barrelOne.toString();
        System.out.println(barrelInfo);
        
        
        Wagon wagonOne = new Wagon();
        wagonOne.setMaxWeight(2000);
        wagonOne.setAmountLoaded(500);
        wagonOne.setLoadedWeight(1800);
        
        String wagonInfo = wagonOne.toString();
        System.out.println(wagonInfo);
        
        ResourceScene rSceneOne = new ResourceScene();
        rSceneOne.setDescription("Iron");
        rSceneOne.setAmountAvailable(45);
        rSceneOne.setResourceType("Metals");
        rSceneOne.setTravelTime(20);
        
        String rSceneInfo = rSceneOne.toString();
        System.out.println(rSceneInfo);
        
        MountainScene mSceneOne = new MountainScene();
        mSceneOne.setDescription("The Great Plains");
        mSceneOne.setHint("Here is a hint.");
        mSceneOne.setTravelTime(23);
        mSceneOne.setSymbol("Wheats");
        mSceneOne.setRequiredTime(12);
        
        String mSceneInfo = mSceneOne.toString();
        System.out.println(mSceneInfo);
        
        
    }
    
}
