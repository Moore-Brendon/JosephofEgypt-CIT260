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
public class StorageScene {
    
    private String description;
    private long travelTime;
    private String symbol;
    private long noOfItems;

    public StorageScene() {
    }

       
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(long travelTime) {
        this.travelTime = travelTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public long getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(long noOfItems) {
        this.noOfItems = noOfItems;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + (int) (this.travelTime ^ (this.travelTime >>> 32));
        hash = 31 * hash + Objects.hashCode(this.symbol);
        hash = 31 * hash + (int) (this.noOfItems ^ (this.noOfItems >>> 32));
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
        final StorageScene other = (StorageScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.travelTime != other.travelTime) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (this.noOfItems != other.noOfItems) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StorageScene{" + "description=" + description + ", travelTime=" + travelTime + ", symbol=" + symbol + ", noOfItems=" + noOfItems + '}';
    }
    
    
    
}
