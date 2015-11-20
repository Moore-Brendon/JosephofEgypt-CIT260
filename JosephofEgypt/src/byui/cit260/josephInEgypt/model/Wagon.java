/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.io.Serializable;

/**
 *
 * 
 * author Brendon.Moore
 */
public class Wagon implements Serializable{

   
    
    
    private double maxWeight;
    private double amountLoaded;
    private double loadedWeight;
    
    
     public Wagon() {
         
         this.amountLoaded = 0;
         this.maxWeight = 0;
         this.loadedWeight = 0;
         
    }
    
    

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getAmountLoaded() {
        return amountLoaded;
    }

    public void setAmountLoaded(double amountLoaded) {
        this.amountLoaded = amountLoaded;
    }

    public double getLoadedWeight() {
        return loadedWeight;
    }

    public void setLoadedWeight(double loadedWeight) {
        this.loadedWeight = loadedWeight;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.maxWeight) ^ (Double.doubleToLongBits(this.maxWeight) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.amountLoaded) ^ (Double.doubleToLongBits(this.amountLoaded) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.loadedWeight) ^ (Double.doubleToLongBits(this.loadedWeight) >>> 32));
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
        final Wagon other = (Wagon) obj;
        if (Double.doubleToLongBits(this.maxWeight) != Double.doubleToLongBits(other.maxWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountLoaded) != Double.doubleToLongBits(other.amountLoaded)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loadedWeight) != Double.doubleToLongBits(other.loadedWeight)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wagon{" + "maxWeight=" + maxWeight + ", amountLoaded=" + amountLoaded + ", loadedWeight=" + loadedWeight + '}';
    }
    
    
    
    
}
