/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class InventoryMenuView {
    
     private final String MENU = "\n"
            + "\n----------------------------"
            + "\n| Help Menu                |"
            + "\n----------------------------"
            + "\nB - How many Barrels"
            + "\nC - How many carts"
            + "\nH - How many harvest"
            + "\nW - How many wagons"
            + "\nQ - Quit"
            + "\n----------------------------";
     public void displayMenu(){
        char selection = ' ';
        do{
            
            System.out.println(MENU);
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
        } while (selection != 'E');
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
  
            
            case 'B':
                this.displayBarrels();
                break;
            case 'C':
                this.displayCarts();
                break;
            case 'H':
                this.displayHarvest();
                break;
            case 'W':
                this.displayWagons();
                break;
                      
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
    }
      private void displayBarrels() {
        System.out.println("\n"
                +"\n----------------------------------"
                
                + "\n----------------------------------"
                + "\nTotal of barrels "
                + "\nwith others playersdisplayGoal function called");
    }

    private void displayCarts() {
        System.out.println("\n "
                + "\n---------------------------------"
                + "\nTotal of Carts"
                + "\n------------------------------------"
                + "\ndisplayHowToMove function called");    }

    private void displayWagons() {
        System.out.println("\n"
                + "\nTotal of Harvest "
                + "\nin ten daysdisplayHowToConstruct function called");    }

    private void displayHarvest() {
        System.out.println("\n "
                + "\nTotal of Wagons"
                + "\nin 7 years one peodisplayHowToConstruct function called");    

   
}
  //this place is for desingBarrelFuntion()  
       
    
    
}
