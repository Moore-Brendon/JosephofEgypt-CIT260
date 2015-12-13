/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;


import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.model.GameMenuView;
import java.util.Scanner;
//public class Josematrizjmv {

    /**
     * @param args the command line arguments
     */
    

//public class MoveMenuView extends View {
  
     
    
// TODO code application logic here
        
//}

//movemenuview and mapcontrol and viegamemap

 /*
 /* @author Brendon.Moore
 */
public class MoveMenuView extends View {
    public MoveMenuView (){
        super("There are several places that you need to go"
                + "\nfirst, you must go to every one, so"
                + "\nplease enter two numbers; if you are in a MISSING PLACE"
                + "\nyou need enter other place. There are 12 places");
          
            
    }
   
    @Override
   public String getInput(){
       return null;
   }
     @Override
    public boolean doAction(Object obj) {
      // public class Josematrizjmv {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        
//String Matriz1[][] = new String[2][3];

String[][] Matriz1 = {


    {"Satart","Mountain","Resource","MISSING PLACE"},
    {"MISSING PLACE","pyramid","MISSING PLACE","Storage"},
    {"Missing Place","Regular","Missing place","Finish"},
};
 
  //  for(int i=0; i<3; i++){
    //    for(int j= 0; j<4; j++){
    
      //  System.out.print(Matriz1[i][j] +"\t");
        
       // }
        //System.out.println();
//}
   
        
        
        
        
        
        
        Scanner sc =new Scanner(System.in);
        int n = 0;
        int m = 0;
        int finish = 2 ;
     boolean comprobacion = true;
do{
    comprobacion = true;
    try{
        try{   
System.out.println("introduce the row?");

 n = sc.nextInt();

System.out.println("introduce the column?");
    //int m = sc.nextInt();
      m = sc.nextInt();
      System.out.println("Introduce cero to finish one to continue");
      finish = sc.nextInt();
       System.out.print("you are in :" + Matriz1[n][m]);
    
// }catch(java.lang.ArithmeticException e) { 
       }catch(java.lang.ArrayIndexOutOfBoundsException e) {              
            
         System.out.println("sorry out of range");
           comprobacion = false;
        }
        
        }catch(java.lang.NumberFormatException e){
        
        
          System.out.println("no se pueden ingresar letras");
          comprobacion = false;
          
        }
    if(finish == 1){
        comprobacion = false;
    }if(finish == 0){
        comprobacion = true;
    }
    

}while (comprobacion != true);
 
//    }
    

return true;	
    
    } 
    
}