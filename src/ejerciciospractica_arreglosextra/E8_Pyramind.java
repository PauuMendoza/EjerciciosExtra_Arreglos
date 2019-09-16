/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica_arreglosextra;

/**
 *
 * @author Paulina
 * //Imprimir una piramide con el siguiente arreglo
 */
public class E9_Pyramind {
    
    public static void main(String args[]){
        
        char array[]={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,
            8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10};
        
        int ten=10,nine=9, eight=8, seven=7, six=6, five=5, four=4, three=3, two=2, one=1;
        
        for(int index=0;index<array.length;index++){
            if(array[index]==one){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
        for(int index=0;index<array.length;index++){
            if(array[index]==two){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
        
        for(int index=0;index<array.length;index++){
            if(array[index]==three){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
        for(int index=0;index<array.length;index++){
            if(array[index]==four){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
        for(int index=0;index<array.length;index++){
            if(array[index]==five){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
        for(int index=0;index<array.length;index++){
            if(array[index]==six){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
       
        for(int index=0;index<array.length;index++){
            if(array[index]==seven){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
        for(int index=0;index<array.length;index++){
            if(array[index]==eight){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
        for(int index=0;index<array.length;index++){
            if(array[index]==nine){
                System.out.print(" "+array[index]);
            }
        }
        System.out.println("");
        for(int index=0;index<array.length;index++){
            if(array[index]==ten){
                System.out.print(array[index]);
            }
        }
    }
    
    
}
