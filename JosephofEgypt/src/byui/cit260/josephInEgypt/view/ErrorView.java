/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import JosephofEgypt.JosephofEgypt;
import java.io.PrintWriter;

/**
 *
 * @author User
 */
public class ErrorView {
    private static final PrintWriter errorFile = JosephofEgypt.getOutFile();
    private static final PrintWriter logFile = JosephofEgypt.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println("\n- ERROR - " + errorMessage);
    
        //log error
        logFile.println(className + "-" + errorMessage);
    }
    
}
