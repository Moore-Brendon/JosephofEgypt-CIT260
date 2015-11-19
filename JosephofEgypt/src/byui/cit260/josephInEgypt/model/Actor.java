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
 * @author User
 * This is a test of Github
 */
public enum Actor implements Serializable{
    
    Joseph("He is the leader of the project"),
    Pharaoh("He is the ruler and owner of all Egypt"),
    Malaky("Resource officer"),
    Boze("Harvest officer"),
    Manassah("Storage officer"),
    Lord("THE LORD");
    
    
            
   
    private final String description;
    private final Point coordinates;

    Actor(String description) {

        this.description = description;
           coordinates = new Point(1,1);
            

    }
    
  

  
    public String getDescription() {
        return description;
    }

  
    public Point getCoordinates() {
        return coordinates;
    }

 
  

   

    @Override
    public String toString() {
        return "Actor{"   + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    
    
}
