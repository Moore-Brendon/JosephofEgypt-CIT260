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
public class InventoryMenuView extends View {
    
     public InventoryMenuView(){
         super("\n"
            + "\n----------------------------"
            + "\n| Help Menu                |"
            + "\n----------------------------"
            + "\nB - How many Barrels"
            + "\nC - How many carts"
            + "\nH - How many harvest"
            + "\nW - How many wagons"
            + "\nQ - Quit"
            + "\n----------------------------");
            
     }
    @Override    
    public boolean doAction(Object obj) {
        String value =(String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
  
            
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
                return false;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
        return false;
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
