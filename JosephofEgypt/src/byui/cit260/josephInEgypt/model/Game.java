/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

/**
 *
 * 
 * @author User
 */
public class Game {
    
     // totalTime
    private int noPeople;
    private int totalHarvestInPounds;
    private int noOfMen;    //How many men would be assigned to work?
    private int noOfWagons;//How many wagons will be assigned to work on this project? or would we want to construct it?
    private long totalTime;
    private int savedGame;
    public Game() {
    }
    public long savedGame(){
        return savedGame;
    }
    
    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    
    public double getTotalHarvestInPounds() {
        return totalHarvestInPounds;
    }

    public void setTotalHarvestInPounds(int totalHarvestInPounds) {
        this.totalHarvestInPounds = totalHarvestInPounds;
    }

    public double getNoOfMen() {
        return noOfMen;
    }

    public void setNoOfMen(int noOfMen) {
        this.noOfMen = noOfMen;
    }

    public double getNoOfWagons() {
        return noOfWagons;
    }

    public void setNoOfWagons(int noOfWagons) {
        this.noOfWagons = noOfWagons;
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalHarvestInPounds) ^ (Double.doubleToLongBits(this.totalHarvestInPounds) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.noOfMen) ^ (Double.doubleToLongBits(this.noOfMen) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.noOfWagons) ^ (Double.doubleToLongBits(this.noOfWagons) >>> 32));
        hash = 23 * hash + (int) (this.totalTime ^ (this.totalTime >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalHarvestInPounds) != Double.doubleToLongBits(other.totalHarvestInPounds)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noOfMen) != Double.doubleToLongBits(other.noOfMen)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noOfWagons) != Double.doubleToLongBits(other.noOfWagons)) {
            return false;
        }
        if (this.totalTime != other.totalTime) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + ", totalHarvestInPounds=" + totalHarvestInPounds + ", noOfMen=" + noOfMen + ", noOfWagons=" + noOfWagons + ", totalTime=" + totalTime + '}';
    }

    

    
    
    
    
}
