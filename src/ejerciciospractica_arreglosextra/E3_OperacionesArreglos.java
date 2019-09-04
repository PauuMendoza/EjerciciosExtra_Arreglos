/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica_arreglosextra;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Paulina
 * Ejercicio 3: Pedir 10 números por teclado y obtener la suma, media aritmética,
 * el número menor, el número  mayor y cuántas veces se repite cada número.
 */
public class E3_OperacionesArreglos {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int array[]= new int[10];
        float sum=0, prom=0;
        int count=0;
        
        System.out.println("***ENTERING NUMBERS***");
        for(int index=0;index<10;index++){
            System.out.print((index+1)+". Enter the number: ");
            array[index]=input.nextInt();
        }
        //sum and count
        for(int index=0;index<array.length;index++){
            sum+=array[index];
            count++;
        }
        //medium
        prom = sum/count;
        
        //max and min
        int numMax=0;
        int numMin=0;
        
        for(int index=0;index<array.length;index++){
            if(array[index]>numMax){
                numMax=array[index];
            }
        }
        numMin = numMax;
        for(int index=0;index<array.length;index++){
            if(array[index]<numMin){
                numMin = array[index];
            }
        }
        
        //repetead numbers
        Arrays.sort(array);//order numbers
        for(int index = 1; index <array.length; index++){
            if(array[index] == array[index - 1]){
                System.out.println("\n***The number that is repeated is: " + array[index]+"***"); 
            }
        }
        
        System.out.println("The sum of the numbers entered is: "+sum);
        System.out.println("The medium of the numbers is: "+prom);
        System.out.println("The max number is: "+numMax);
        System.out.println("The minimum number is: "+numMin);
        
        
        /*
        //CODE BAD, FUNCTIONAL
        
        //count same numbers
        int index, count;
        for(index=0;index<4;index++){
           count=0;
            //array[index]=number;
            for(int x=index;x<4;x++){
                if(array[index]==array[x]){
                    count++;
                }    
            } 
           System.out.println("El numero  "+array[index]+ " se repite "
                    + "numero de veces "+count);
        }
        */
        
     
   }
       
}
       
        
    
    

