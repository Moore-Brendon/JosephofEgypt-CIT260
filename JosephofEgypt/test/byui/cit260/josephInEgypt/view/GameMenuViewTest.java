/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GameMenuViewTest {
    
    public GameMenuViewTest() {
    }

    /**
     * Test of displayMenu method, of class GameMenuView.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        GameMenuView instance = new GameMenuView();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    

    /**
     * Test of doAction method, of class GameMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        char selection = ' ';
        GameMenuView instance = new GameMenuView();
        instance.doAction(selection);
        // TODO review the generated test code and fail("The test case is a prototype.");
    }
    
}
