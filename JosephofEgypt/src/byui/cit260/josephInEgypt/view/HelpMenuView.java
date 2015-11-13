/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

/**
 *
 * @author User
 */
public class HelpMenuView extends View {
    
     public HelpMenuView(){
         super( "\n"
            + "\n----------------------------"
            + "\n| Help Menu                |"
            + "\n----------------------------"
            + "\nG - Game goal"
            + "\nM - How to move"
            + "\nC - Construct items"
            + "\nH - Harvesting"
            + "\nD - Deliver Resources"
            + "\nQ - Quit"
            + "\n----------------------------");
     }
     
      
    @Override   
    public boolean doAction(Object obj ) {
        String value =(String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
  
            
            case 'G':
                this.displayGoal();
                break;
            case 'M':
                this.displayHowToMove();
                break;
            case 'C':
                this.displayHowToConstruct();
                break;
            case 'H':
                this.displayHowToHarvest();
                break;
            case 'D':
                this.displayHowToDeliver();
                break;
            case 'Q':
                return false;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
                
        }
        return false;
    }

    private void displayGoal() {
        System.out.println("\n"
                +"\n----------------------------------"
                + "\nThe player win when have compled"
                + "\n all assignments correctly and"
                + "\nhaving a good administration"
                + "\nand reaching the requared quantity"
                + "\nin less time"
                + "\n----------------------------------"
                + "\nThere will be competition "
                + "\nwith others playersdisplayGoal function called");
    }

    private void displayHowToMove() {
        System.out.println("\n "
                + "\n---------------------------------"
                + "\nJoseph needs to travel along the "
                + "\nterritory,chose principals and "
                + "\ngive them instruction respect the goals"
                + "\nthat they need to accomplish"
                + "\nThe principals must be to Construc,"
                + "\nto Harvest, to Deliver"
                + "\nJoseph needs to go from the city "
                + "\nto the places where get metals and stons"
                + "\nwhere get the woods "
                + "\n------------------------------------"
                + "\ndisplayHowToMove function called");    }

    private void displayHowToConstruct() {
        System.out.println("\n"
                + "\nJoseph decided to construct"
                + "\nonly one big pyramid to store"
                + "\nthe grains and have the total"
                + "\ncontrol over the grains"
                + "\nJoseph knows that in average needs 50 men"
                + "\nto construct one square yard "
                + "\nin ten daysdisplayHowToConstruct function called");    }

    private void displayHowToHarvest() {
        System.out.println("\n "
                + "\nJoseph needs to have spetialist "
                + "\nto have a very good harvest and he needs "
                + "\nto sow very well and get the best seeds"
                + "\nand manteinance the grains in good state"
                + "\nJoseph knows that in average"
                + "\na person needs 2 pounds of grains to survive"
                + "\none day, and Joseph expect 20000 people"
                + "\nin 7 years one peodisplayHowToConstruct function called");    }

    private void displayHowToDeliver() {
        System.out.println("\n"
                + "\nJoseph needs to deliver the grain "
                + "\nto send the grain needs carts"
                + "\nand people to drive the carts and care the grain"
                + "\nWhile the pyramid is constructing"
                + "\nthe graing will be store in barrels"
                + "\nand Joseph will send them with carts"
                + "\ndisplayHowToDeliver function called");
    }
}
    

