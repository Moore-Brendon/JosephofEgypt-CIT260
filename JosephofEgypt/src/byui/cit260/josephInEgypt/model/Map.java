/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import byui.cit260.josephInEgypt.control.GameControl;
import java.io.Serializable;
import java.util.Objects;

/**
 
 * 
 * @author User
 */
public class Map implements Serializable {

    private int rowCount;
    private int columnCount;
    private Location [][] locations;

    public Map() {
    }
    
    public Map(int noOfRows,int noOfColumns){
    
        if(noOfRows < 1 || noOfColumns < 1){
            System.out.println("the number of rows and columns must be grater than zero");
            return;
            
        }
            this.columnCount = noOfColumns;
            this.rowCount = noOfRows;
            this.locations = new Location[noOfRows][noOfColumns];
            for(int row = 0; row< noOfRows; row++ ){
                for(int column = 0; column < noOfColumns; column++){                                  
                
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
               // location.setVisited(false);
                locations[row][column] = location;
                
                
                
             }
          }
    }
       
    public int getColumnCount() {
        return columnCount;
    }
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.rowCount);
        hash = 37 * hash + Objects.hashCode(this.columnCount);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    public Location[][] getLocations() {
        
        return locations;
        
    }

       
}
