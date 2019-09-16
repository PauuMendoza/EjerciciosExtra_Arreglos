/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica_arreglosextra;

/**
 *
 * @author Paulina
 * Ejercicio 7 propuesto por DAVID: Crear un arreglo 
 */
public class E7_AprobadosReprobados {
    
    public static void main(String args[]){
        
        int countA=0, countR=0;
        
        int notes[]={8,7,9,4,5};
        
        for(int index=0;index<notes.length;index++){
            if(notes[index]>=6){
                countA++;
            }else{
                countR++;
            }
        }
        
        int approved[]=new int[countA]; 
        int failed[]=new int[countR]; 
        
        int x=0;
        for(int index=0;index<notes.length;index++){
            if(notes[index]>=6){
                approved[index]=notes[index];
                //System.out.println(approved[index]);
            }else{
                failed[x]=notes[index];
               // System.out.println(failed[x]);
                x++;
            }
        }
        
        System.out.println("THE PASSING NOTES ARE:");
        for(int index=0;index<approved.length;index++){
            System.out.print(approved[index]+" ");
        }
        System.out.println("\nTHE FAILED NOTES ARE:");
        for(int index=0;index<failed.length;index++){
            System.out.print(failed[index]+" ");
        }
        
       
        
        
    }
    
}
