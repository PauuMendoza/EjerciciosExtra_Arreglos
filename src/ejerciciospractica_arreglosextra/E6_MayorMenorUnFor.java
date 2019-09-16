/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica_arreglosextra;

import java.util.Scanner;

/**
 *
 * @author Paulina
 * Ejercicio 6 porpuesto por DAVID: Crear un programa que muestre el numero
 * mayor y menor pero con la condicion de solo utilizar un bucle for.
 */
public class E6_MayorMenorUnFor {
    
    public static void main(String args[]){
        
        int  max=0, min=0, temporal;
        
        int array[]={1,46,9,88,6};

        for(int index=0;index<array.length;index++){
            if(array[index]>max){
                max=array[index];   
            }
            if(min==0){
                min=array[index];   
                }else if(array[index]<min){
                    min=array[index];
            }
        }
        
        /*
        for(int index=0;index<array.length;index++){
            if(max!=0 && min!=0){
                if(array[index]>max){
                    max=array[index];
                }if(array[index]<min){
                    min=array[index];
                }
            }else{
                max=array[index];
                min=array[index];
            }
        }*/
         
        System.out.println("el mayor es: "+max);
        System.out.println("el menor es: "+min);
                
                
         
        
    }
    
}
