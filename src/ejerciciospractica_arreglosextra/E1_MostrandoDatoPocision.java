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
 *  EJERCICIO 1

Crea un array numérico con 5 elementos. Los números de cada elemento deben ser 
* valores pedidos por teclado al usuario. Muestra por consola el índice y el 
* valor al que corresponde. Debes utiliza bucles tanto para pedir los valores
* de los elementos del array como para mostrar su contenido por pantalla.

Ejemplo: Introducimos los valores 2, 4, 5, 8 y 10 .Lo que se tiene que mostrar por consola  sería:

En el indice 0 esta el valor 2
En el indice 1 esta el valor 4
En el indice 2 esta el valor 5
En el indice 3 esta el valor 8
En el indice 4 esta el valor 10
 */
public class E1_MostrandoDatoPocision {

  
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       int array[]=new int[5];
       
        System.out.println("***INGRESANDO LOS DATOS***");
        for(int i=0;i<5;i++){
            System.out.print("Enter the value of the array "+(i+1+":"));
            array[i]=input.nextInt();
        }
        
        System.out.println("\n***SHOWING THE DATA***");
        for(int i=0;i<array.length;i++){
            System.out.println("In the index "+i+" is the value "+array[i]);
        }
    }
    
}
