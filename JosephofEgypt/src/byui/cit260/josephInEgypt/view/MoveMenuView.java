/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;


import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.model.GameMenuView;
import java.util.Scanner;

/**
 *
 * @author Brendon.Moore
 */
public class MoveMenuView extends View {
    public MoveMenuView (){
        super("\n"
            + "\n----------------------------"
            + "\n| Select destination territory              |"
            + "\n----------------------------"
            + "\nR - Riverside"
            + "\nM - Mineral"
            + "\nC - City"
            + "\nV - Village"
            + "\nT - Cattle"
            + "\nW - Warehouse"
            + "\nN - Mountain"
            + "\nX - Exit"
            + "\n----------------------------");
          
            
    }
   
    
   
     @Override
    public boolean doAction(Object obj) {
        String value =(String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
  
            
            case 'R':
                this.moveRiverside();
                break;
            case 'M':
                this.moveMineral();
                break;
            case 'C':
                this.moveCity();
                break;
            case 'V':
                this.moveVillage();
                break;
            case 'T':
                this.moveCattle();
                break;
            case 'W':
                this.moveWarehouse();
                break;
            case 'N':
                this.moveMountain();
                break;
				
            case 'X':
                return true;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
        return false;
    }

    private void moveRiverside() {
        GameControl.moveRiverside();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
	private void moveMineral() {
        GameControl.moveMineral();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
	private void moveCity() {
        GameControl.moveCity();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
        private void moveVillage() {
        GameControl.moveVillage();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
	private void moveCattle() {
        GameControl.moveCattle();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
	private void moveWarehouse() {
        GameControl.moveWarehouse();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
	private void moveMountain() {
        GameControl.moveMountain();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
	
	
    
    
    
    
    
}


        
