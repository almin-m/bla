
package javaapplication4;

import java.util.Arrays; 
public class drugiassignment {

    
    public static void main(String[] args) {
       
        
    int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
    
   Arrays.sort (array);
   
        System.out.println("Ovo je pocetni niz kada ga sortiramo: " + Arrays.toString(array));
        
      
         System.out.println("Brojevi koji se ponavljaju su: ");
        for (int i = 1; i < array.length; i++) 
            if (array [i-1]== array [i])
          
                System.out.println(array[i]);
        
       
        int [] negativni;
        int [] pozitivni;
        int counter =0;
        
        for (int i = 0; i <array.length; i++) {
            if (array[i]<0){
                counter++;
                
            }
          
            
        }
        negativni = new int [counter];
        pozitivni = new int [array.length-counter];
        for (int i = 0, n=0, p=0; i <array.length; i++) {
            
            
            if(array[i]==0) continue;
                else if(array[i]<0) negativni[n++]=array[i];
                else pozitivni[p++]=array[i];
        }
        
        
        
//            if (array[i]<0){
//                negativni[n++] = array[i];
//                
//                
//            }
//            
//            else{
//                pozitivni [p++] = array[i];
//            }
//                
//          
//            
//        }
        
       
        
        System.out.println("Ovo je pozitivni niz:" +Arrays.toString(pozitivni));
        System.out.println("Ovo je negativni niz:" + Arrays.toString(negativni));
        
        
        
        
        
      

        
      
  
              
      
       
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    
}
