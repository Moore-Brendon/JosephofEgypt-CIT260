/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.util.ArrayList;


/**
 *
 * 
 * @author User
 */
public class Location {
    private int column;
    private int row;
    private RegularScene scene;
    private ArrayList < Actor > actors;
    private boolean visited;
    

    public Location() {
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.column;
        hash = 97 * hash + this.row;
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
        final Location other = (Location) obj;
        if (this.column != other.column) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "column=" + column + ", row=" + row + '}';
    }

   
    public void setScene(RegularScene scene) {
       this.scene = scene;
    }

    void setVisited(boolean b) {
        this.visited = b;
    }
    
    
            
    
}
