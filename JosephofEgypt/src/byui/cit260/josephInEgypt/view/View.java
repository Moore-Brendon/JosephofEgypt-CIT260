/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import JosephofEgypt.JosephofEgypt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = JosephofEgypt.getInFile();
    protected final PrintWriter console = JosephofEgypt.getOutFile();
    
    
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override 
    public void display(){
        String value = "";
        boolean done = false;
        
        do{
            
            this.console.println(this.promptMessage);
            value = this.getInput();
            done = this.doAction(value);
            
            
        } while (!done);
    }
    
    @Override
    public String getInput(){
    
    boolean valid = false;
    String value = null;
    
    
        try {
            while (!valid){
            
            value = this.keyboard.readLine();
            value = value.trim();
            
            if (value.length()<1){
                System.out.println("You must enter a value.");
                continue;
                
            }
            break;
            }
        } catch (Exception e) {
System.out.println("Error Reading Input" + e.getMessage());        }
        
    return value;
}

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
    
}