/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import byui.cit260.josephInEgypt.exceptions.InventoryControlExceptions;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void testCalcVolumeOfBarrel() {
      System.out.println("calcVolumeOfBarrel");
        /****************************
         * Test case #1
         ***************************/
        System.out.println("\tTest case #1");
        // input values for test case 1
        double height = 36;
        double radius = 10;
        double quantity = 1;
        InventoryControl instance = new InventoryControl();
        double expResult = 6.54;
        double result = 0;
        try {
            result = instance.calcVolumeOfBarrel(height, radius, quantity);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);


           /****************************
         * Test case #2
         ****************************/
        System.out.println("\tTest case #2");
        // input values for test case 1
         height = 50;
         radius = 4;
        
        expResult = -1;
        try {
            result = instance.calcVolumeOfBarrel(height, radius, quantity);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
         /****************************
         * Test case #3
         ****************************/
        System.out.println("\tTest case #3");
        // input values for test case 1
         height = 44;
         radius = 66;
        
        expResult = -1;
        try {
            result = instance.calcVolumeOfBarrel(height, radius, quantity);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
    
         /****************************
         * Test case #4
         ****************************/
        System.out.println("\tTest case #4");
        // input values for test case 1
         height = -4;
         radius = 6;
        
        expResult = -1;
        try {
            result = instance.calcVolumeOfBarrel(height, radius, quantity);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
         /****************************
         * Test case #5
         ****************************/
        System.out.println("\tTest case #5");
        // input values for test case 1
         height = 36;
         radius = -7;
        
        expResult = -1;
        try {
            result = instance.calcVolumeOfBarrel(height, radius, quantity);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
        
         /****************************
         * Test case #6
         ****************************/
        System.out.println("\tTest case #6");
        // input values for test case 1
         height = 0;
         radius = 15;
        
        expResult = 0;
        try {
            result = instance.calcVolumeOfBarrel(height, radius, quantity);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
         /****************************
         * Test case #7
         ****************************/
        System.out.println("\tTest case #7");
        // input values for test case 1
         height = 48;
         radius = 0;
        
        expResult = 0;
        try {
            result = instance.calcVolumeOfBarrel(height, radius, quantity);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
         /****************************
         * Test case #8
         ****************************/
        System.out.println("\tTest case #8");
        // input values for test case 1
         height = 48;
         radius = 15;
        
        expResult = 19.63;
        try {
            result = instance.calcVolumeOfBarrel(height, radius, quantity);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);

    
    }

    /**
     * Test of calcDesignPyramid method, of class InventoryControl.
     */
    @Test
    public void testCalcDesignPyramid() {
      
        System.out.println("calcVolumeOfPyramid");
        /****************************
         * Test case #1
         ***************************/
        System.out.println("\tTest Pyramid case #1");
        // input values for test case 1
        double length = 44;
        double  width = 44;
        double height = 20;
        InventoryControl instance = new InventoryControl();
        double expResult = 12906.67;
        double result = 0;
        try {
            result = instance.calcDesignPyramid (length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
        
          /****************************
         * Test case #2
         ****************************/
        System.out.println("\tTest Pyramid case #2");
        // input values for test case 1
         length = 60;
         width = 34;
         height = 4;
        expResult = -1;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);

        /****************************
         * Test case #2
         ****************************/
        System.out.println("\tTest Pyramid case #2");
        // input values for test case 1
         length = 60;
         width = 34;
         height = 4;
        expResult = -1;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
          /****************************
         * Test case #3
         ****************************/
        System.out.println("\tTest Pyramid case #3");
        // input values for test case 1
         length = 44;
         width = 23;
         height = 66;
        expResult = -1;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
          /****************************
         * Test case #4
         ****************************/
        System.out.println("\tTest Pyramid case #4");
        // input values for test case 1
         length = 23;
         width = -5;
         height = 34;
        expResult = -1;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
          /****************************
         * Test case #5
         ****************************/
        System.out.println("\tTest Pyramid case #5");
        // input values for test case 1
         length = -4;
         width = 44;
         height = 6;
        expResult = -1;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
          /****************************
         * Test case #6
         ****************************/
        System.out.println("\tTest Pyramid case #6");
        // input values for test case 1
         length = 36;
         width = 23;
         height = -7;
        expResult = -1;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
          /****************************
         * Test case #7
         ****************************/
        System.out.println("\tTest Pyramid case #7");
        // input values for test case 1
         length = 0;
         width = 33;
         height = 15;
        expResult = 0;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
          /****************************
         * Test case #8
         ****************************/
        System.out.println("\tTest Pyramid case #8");
        // input values for test case 1
         length = 34;
         width = 0;
         height = 5;
        expResult = 0;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
          /****************************
         * Test case #9
         ****************************/
        System.out.println("\tTest Pyramid case #9");
        // input values for test case 1
         length = 48;
         width = 4;
         height = 0;
        expResult = 0;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
        
          /****************************
         * Test case #10
         ****************************/
        System.out.println("\tTest Pyramid case #10");
        // input values for test case 1
         length = 50;
         width = 50;
         height = 50;
        expResult = 41666.67;
        try {
            result = instance.calcDesignPyramid(length, width, height);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.01);
}

    /**
     * Test of calcResourcesNeeded method, of class InventoryControl.
     */
    @Test
    public void testCalcResourcesNeeded() throws InventoryControlExceptions {
        
        System.out.println("calcResourcesNeeded");
        /****************************
         * Test case #1
         ***************************/
        System.out.println("\tTest calcResourcesNeeded case #1");
        
        int dailyCons = 1;
        int totalDaysOfDrought = 2555;
        int noOfPeople = 100000;
        InventoryControl instance = new InventoryControl();
        double expResult = 255500000.0;
        double result = 0;
        try {
            result = instance.calcResourcesNeeded(dailyCons, totalDaysOfDrought, noOfPeople);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        
        /****************************
         * Test case #2
         ***************************/
        System.out.println("\tTest calcResourcesNeeded case #2");
        
        dailyCons = 2;
        totalDaysOfDrought = 2555;
        noOfPeople = 100000;
        expResult = -1;
        try {
            result = instance.calcResourcesNeeded(dailyCons, totalDaysOfDrought, noOfPeople);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /****************************
         * Test case #3
         ***************************/
        System.out.println("\tTest calcResourcesNeeded case #3");
        
        dailyCons = -1;
        totalDaysOfDrought = 2555;
        noOfPeople = 100000;
        expResult = -1;
        try {
            result = instance.calcResourcesNeeded(dailyCons, totalDaysOfDrought, noOfPeople);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        
        /****************************
         * Test case #4
         ***************************/
        System.out.println("\tTest calcResourcesNeeded case #4");
        
        dailyCons = 1;
        totalDaysOfDrought = 2601;
        noOfPeople = 100000;
        expResult = -1;
        try {
            result = instance.calcResourcesNeeded(dailyCons, totalDaysOfDrought, noOfPeople);
        } catch (InventoryControlExceptions ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
         /****************************
         * Test case #5
         ***************************/
        System.out.println("\tTest calcResourcesNeeded case #5");
        
        dailyCons = 1;
        totalDaysOfDrought = 2555;
        noOfPeople = 101000;
        expResult = -1;
        result = instance.calcResourcesNeeded(dailyCons, totalDaysOfDrought, noOfPeople);
        assertEquals(expResult, result, 0.0);
        
         /****************************
         * Test case #6
         ***************************/
        System.out.println("\tTest calcResourcesNeeded case #6");
        
        dailyCons = 1;
        totalDaysOfDrought = 2556;
        noOfPeople = 100000;
        expResult = 255600000;
        result = instance.calcResourcesNeeded(dailyCons, totalDaysOfDrought, noOfPeople);
        assertEquals(expResult, result, 0.0);
        
         /****************************
         * Test case #7
         ***************************/
        System.out.println("\tTest calcResourcesNeeded case #7");
        
        dailyCons = 1;
        totalDaysOfDrought = 2555;
        noOfPeople = 100000;
        expResult = 255500000;
        result = instance.calcResourcesNeeded(dailyCons, totalDaysOfDrought, noOfPeople);
        assertEquals(expResult, result, 0.0);
    }
}
