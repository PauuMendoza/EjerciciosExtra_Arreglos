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
 * 2.- Construir un programa en java que permita encontrar el número mayor y el
 * número menor de una serie de números ingresados por teclado, como primera
 * entrada se le dará el tamaño del arreglo y luego los datos, también se debe 
 * indicar cuantas veces se repiten tanto el mayor como el menor.
 */
public class E5_MayorMenorRepetecion {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int size, max=0, min=0, countMx=0, countMn=0;
        
        System.out.print("**Enter the size of the array: ");
        size=input.nextInt();
        
        int array[]=new int[size];
        
        System.out.println("**DATA**");
        for(int index=0;index<array.length;index++){
            System.out.print((index+1)+". Enter a number: ");
            array[index]=input.nextInt();
        }
        
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
        
        for(int index=0;index<array.length;index++){
            if(array[index]==max){
                countMx++;
            }
            if(array[index]==min){
                countMn++;
            }
        }
        
        System.out.println("\n***RESULT***");
        System.out.println("The MAX number is: "+ max+" and repeats "+countMx+" times");
        System.out.println("The MINIMUN number is: "+ min+" and repeats "+countMn+" times");
        
        
        
    }
    
    
    
}
