/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brendon.Moore
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfBarrel method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfBarrel1() {
        System.out.println("calcVolumeOfBarrel");
        /****************************
         * Test case #1
         ***************************/
        System.out.println("\tTest case #1");
        // input values for test case 1
        double height = 36;
        double radius = 10;
        InventoryControl instance = new InventoryControl();
        double expResult = 6.54;
        double result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.01);
        
    
        
    
        
        /****************************
         * Test case #2
         ****************************/
        System.out.println("\tTest case #2");
        // input values for test case 1
         height = 50;
         radius = 4;
        
        expResult = -1;
        result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.01);
        
         /****************************
         * Test case #3
         ****************************/
        System.out.println("\tTest case #3");
        // input values for test case 1
         height = 44;
         radius = 66;
        
        expResult = -1;
        result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.01);
    
         /****************************
         * Test case #4
         ****************************/
        System.out.println("\tTest case #4");
        // input values for test case 1
         height = -4;
         radius = 6;
        
        expResult = -1;
        result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.01);
        
         /****************************
         * Test case #5
         ****************************/
        System.out.println("\tTest case #5");
        // input values for test case 1
         height = 36;
         radius = -7;
        
        expResult = -1;
        result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.01);
        
        
         /****************************
         * Test case #6
         ****************************/
        System.out.println("\tTest case #6");
        // input values for test case 1
         height = 0;
         radius = 15;
        
        expResult = 0;
        result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.01);
        
         /****************************
         * Test case #7
         ****************************/
        System.out.println("\tTest case #7");
        // input values for test case 1
         height = 48;
         radius = 0;
        
        expResult = 0;
        result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.01);
        
         /****************************
         * Test case #8
         ****************************/
        System.out.println("\tTest case #8");
        // input values for test case 1
         height = 48;
         radius = 15;
        
        expResult = 19.63;
        result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.01);
        
        
        
        
    }
    
}
