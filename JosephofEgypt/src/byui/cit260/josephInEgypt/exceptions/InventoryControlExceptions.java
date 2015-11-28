/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.exceptions;

/**
 *
 * @author Brendon.Moore
 */
public class InventoryControlExceptions extends Exception {

    public InventoryControlExceptions() {
    }

    public InventoryControlExceptions(String string) {
        super(string);
    }

    public InventoryControlExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InventoryControlExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public InventoryControlExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
