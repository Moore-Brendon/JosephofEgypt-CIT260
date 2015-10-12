/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Map {
    
    private String rowCount;
    private String columnCount;

    public Map() {
    }
       
    public String getColumnCount() {
        return columnCount;
    }
    public void setColumnCount(String columnCount) {
        this.columnCount = columnCount;
    }

    public String getRowCount() {
        return rowCount;
    }
    public void setRowCount(String rowCount) {
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

    
}
