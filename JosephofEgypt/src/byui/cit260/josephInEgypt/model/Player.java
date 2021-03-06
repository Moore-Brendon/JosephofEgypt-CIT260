/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * 
 * @author Brendon.Moore
 */
public class Player implements Serializable{
    
    //class intance variables
    private String name;
    private double bestHarvest;
    private Point coordinates;
// add locations
    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestHarvest() {
        return bestHarvest;
    }

    public void setBestHarvest(double bestHarvest) {
        this.bestHarvest = bestHarvest;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

   

   
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.bestHarvest) ^ (Double.doubleToLongBits(this.bestHarvest) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestHarvest) != Double.doubleToLongBits(other.bestHarvest)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestHarvest=" + bestHarvest + '}';
    }
    
    
    
    
    
    
}
