/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

/**
 *
 * @author User
 */
public class HarvestView extends View {
    
    public HarvestView(){
            super("\nO - Ore"
                + "\nT - Timber"
                + "\nS - Stone"
                + "\nG - Grain"
                + "\nQ - Quit ");
            
    }
    
    @Override 
    public boolean doAction(Object obj){
        String value =(String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
         switch (choice) {
            case 'O':
                this.harvestOre();
                break;
            case 'T':
                this.harvestTimber();
                break;
            case 'G':
                this.harvestGrain();
                break;
            case 'S':
                this.harvestStone();
                break;
            case 'Q':
                return true;
                
         }
        return false;
        
    }

    private void harvestOre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void harvestTimber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void harvestGrain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void harvestStone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
