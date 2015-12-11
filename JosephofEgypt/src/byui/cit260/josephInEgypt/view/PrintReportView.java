/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import JosephofEgypt.JosephofEgypt;
import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.InventoryItem;
import static java.awt.SystemColor.window;

/**
 *
 * @author Brendon.Moore
 */
public class PrintReportView extends View{
    public PrintReportView(){
        super("\n"
        + "\nEnter report name:");
    }
  @Override
  public boolean doAction(Object obj){
      String value =(String) obj;
      switch (value) {
        case "":
            this.console.println("\n*** You must enter a report name, or 'C' to cancel.");
            break;
        case "C":
        case "c":
            return true;
        default:
                this.saveReport();
            break;
        
            
            
      }
      return true;
  }
    private void saveReport() {
        this.console.println("\n\nEnter the file path where you would like to save.");
        String filePath = this.getInput();
        try{
            
            InventoryItem[] inventory = GameControl.getSortedInventoryList();
            
        String saveReport = "\nList of Inventory Items" + "\n";
        saveReport = saveReport + "Description" + "\t" +
                            "Required" + "\t" +
                            "In Stock" + "\n";
       for (InventoryItem inventoryItem : inventory) {
            saveReport = saveReport + inventoryItem.getInventoryItem() + "\t          " +
                                inventoryItem.getRequiredAmount() + "\t          " +
                                inventoryItem.getQuantityInStock() + "\n";
            
            
            
           
       }  
       GameControl.saveReport(saveReport, filePath);
       this.console.println("\nReport saved sucessfully. Preview shown below.\n");
       this.console.println(saveReport);
        
        } catch (Exception ex){
            
            
            ErrorView.display("HelpMenuView", ex.getMessage());
            
        }
        
    }
}
