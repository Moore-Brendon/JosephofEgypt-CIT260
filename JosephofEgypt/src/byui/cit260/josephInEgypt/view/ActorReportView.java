/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.exceptions.GameControlExceptions;
import byui.cit260.josephInEgypt.exceptions.InventoryControlExceptions;
import byui.cit260.josephInEgypt.model.Actor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
class ActorReportView extends View{

    public ActorReportView() {
        super("Enter File Path: ");
    }

    @Override
    public boolean doAction(Object obj) {
        
        Actor[]actors = Actor.values();
        String filePath = (String) obj;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            String writableString = " ";
            
            writableString = "\nList of Actors" + "\n";
            writableString += "Name" + "\t" +
                              "Description" + "\t" +
                              "Coordinates" + "\n";
            
            for (Actor actor : actors) {
             writableString += actor.name() + "\t          " +
                               actor.getDescription()+ "\t          " +
                               actor.getCoordinates()+ "\n";
            }
            
       GameControl.saveReport(writableString, filePath);
       this.console.println("\nReport saved sucessfully. Preview shown below.\n");
       this.console.println(writableString);
            
            
            
       } catch (IOException ex) {
             ErrorView.display("HelpMenuView", ex.getMessage());
        } catch (GameControlExceptions ex) {
            ErrorView.display("HelpMenuView", ex.getMessage());
        }
        
        return true;

    }
    
    
    
}
