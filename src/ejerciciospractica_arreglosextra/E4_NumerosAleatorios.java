/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica_arreglosextra;

/**
 *
 * @author Paulina
 * Ejercicio 4: Llenar un arreglo de tamaño 20 con números aleatorios en el mismo rango 
 * usando Math.random, luego, mostrar el mayor número de todos.
 */
public class E4_NumerosAleatorios {
    
    public static void main(String args[]){
        int higher=0;
        
        int array[]=new int[20];
        
        for(int index=0;index<=19;index++){
            array[index]=(int) ((Math.random()*20)+1);
        }
        
        for(int index=0;index<20;index++){
            if(array[index]>higher){
                higher=array[index];
            }
        }
        
        System.out.println("**RANDOM NUMBERS**");
        for(int index=0;index<=19;index++){
            System.out.println(array[index]);
        }
        
        System.out.println("\n*** The HIGHER number is: "+higher+"**");
        
        
     
        
    }
    
}
