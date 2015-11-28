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
    //assign correct coordinates to actors
    Joseph("He is the leader of the project",2,3),
    Pharaoh("He is the ruler and owner of all Egypt",1,2),
    Malaky("Resource officer",0,2),
    Boze("Harvest officer",0,3),
    Manassah("Storage officer",1,2),
    Lord("THE LORD",0,2);
    
    
            
   
    private final String description;
    private final Point coordinates;

    Actor(String description, int x, int y) {

        this.description = description;
           coordinates = new Point(x,y);
            

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
