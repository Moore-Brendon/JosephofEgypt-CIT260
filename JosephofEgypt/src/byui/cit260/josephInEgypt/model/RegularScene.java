/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.util.Objects;

/**
 *
 * 
 * @author User
 */
public class RegularScene {
    
    private String description;
    private int travelTime;
    private String resourceType;
    private double amountAvailable;
    private String symbol;
    private boolean blocked;
   
    
    
    public RegularScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (int) (this.travelTime ^ (this.travelTime >>> 32));
        hash = 67 * hash + Objects.hashCode(this.resourceType);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.amountAvailable) ^ (Double.doubleToLongBits(this.amountAvailable) >>> 32));
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
        final RegularScene other = (RegularScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.travelTime != other.travelTime) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountAvailable) != Double.doubleToLongBits(other.amountAvailable)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + ", travelTime=" + travelTime + ", resourceType=" + resourceType + ", amountAvailable=" + amountAvailable + '}';
    }
    
   
   
    public void setBlocked(boolean b) {
      blocked = b;
    }

    public boolean isBlocked() {
        return blocked;
    }
    
    public void setMapSymbol(String st) {
        symbol = st;    
    }

    public String getSymbol() {
        return symbol;
    }
    
    
    
}
