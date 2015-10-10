/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Brendon.Moore
 */
public class InventoryItem implements Serializable {

    public InventoryItem() {
    }
    
    private String inventoryItem;
    private double quantityInStock;
    private double requiredAmount;

    public String getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(String inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.inventoryItem);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryItem=" + inventoryItem + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }
    
    
    
    
    
  
}
