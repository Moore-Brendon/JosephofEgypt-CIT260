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
 * 
 * @author Brendon.Moore
 */
public class MountainScene implements Serializable{

    public MountainScene() {
    }
    
    
    private String description;
    private double travelTime;
    private String symbol;
    private String hint;
    private double requiredTime;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public double getRequiredTime() {
        return requiredTime;
    }

    public void setRequiredTime(double requiredTime) {
        this.requiredTime = requiredTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.symbol);
        hash = 53 * hash + Objects.hashCode(this.hint);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.requiredTime) ^ (Double.doubleToLongBits(this.requiredTime) >>> 32));
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
        final MountainScene other = (MountainScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.hint, other.hint)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredTime) != Double.doubleToLongBits(other.requiredTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MountainScene{" + "description=" + description + ", travelTime=" + travelTime + ", symbol=" + symbol + ", hint=" + hint + ", requiredTime=" + requiredTime + '}';
    }
    
    
    
    
}
