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
public class MoveMenuView {
    private final String MENU = "\n"
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
            + "\n----------------------------";
          
            
    
    public void displayMenu(){
        char selection = ' ';
        do{
            
            System.out.println(MENU);
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
        } while (selection != 'X');
    }
    
    
    private String getInput() {
        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Select a menut item:");
            selection = keyboard.nextLine();
            selection = selection.toUpperCase();
            
        break;
            }
        return selection;
        }
    
    public void doAction(char selection) {
        switch (selection) {
  
            
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
                return;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
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


        
