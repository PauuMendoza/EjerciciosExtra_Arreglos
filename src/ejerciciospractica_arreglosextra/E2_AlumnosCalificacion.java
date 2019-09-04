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
 * EJERCICIO 2 Crea un programa en el que se pida por consola el nombre de 2 
 * alumnos y la nota de cada uno de ellos como  valor  numérico.  El  resultado
 * que  debe  mostrarse  es  el  nombre  de  cada  alumno,  su  nota  y  su  
 * calificacion como texto (Sobresaliente, Notable, Bien o Suspenso). 
 * 
 * Para  ello crea  un  array  numérico  y  otro  de  String  (ambos  unidimensionales). 
 * En  el  array  numérico  se  insertarán  las  calificaciones  facilitadas  
 * por  el  usuario  entre  0  y  10  (debemos  controlar  que  inserte  una 
 * nota valida), pudiendo ser decimal. En el array de Strings se insertarán los
 * nombres de los alumnos. 
 * 
 * Crea también un array de String donde insertaremos el resultado de la nota
 * con palabras admitiéndose estos valores: Sobresaliente, 
 * Notable, Bien o Suspenso. El programa debe comprobar la nota de cada alumno 
 * teniendo en cuenta esta equivalencia: Si la nota está entre 0 y 4,99 será un 
 * Suspenso. Si la nota está entre 5 y 6,99 será un Bien. Si la nota está entre 
 * 7 y 8,99 será un Notable. Si la nota está entre 9 y 10 será un Sobresaliente.
 * Muestra por pantalla, el alumno su nota y su resultado en palabras utilizando bucles.
 */
public class E2_AlumnosCalificacion {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        String student[]= new String[2];
        float note[]=new float[2];
        String calification[]= {"Sobresaliente","Notable","Bien","Suspenso"};
        
        System.out.println("***NAMES OF THE SUDENTES***");
        for(int i=0;i<2;i++){
            System.out.print("Enter the name of the student "+(i+1)+":");
            student[i]=input.nextLine();
        }
        
        System.out.println("***NOTES***");
        
        for(int i=0;i<2;i++){
            System.out.print("Enter the note of the student "+(i+1)+":");
            note[i]=input.nextFloat();
            while(note[i]<0 || note[i]>10){
                System.out.print("Enter the note of the student "+(i+1)+":");
                note[i]=input.nextFloat();
            }
        }
        
        System.out.println("***CALIFICATION***");
        
        
        for(int i=0;i<note.length;i++){
             if(note[i]>=0 && note[i]<=4.99){
                 System.out.println("The student "+student[i]+" is "+calification[3]); 
             }else if(note[i]>=5 && note[i]<=6.99){
                 System.out.println("The student "+student[i]+" is "+calification[2]);
             }else if(note[i]>=7 && note[i]<=8.99){
                 System.out.println("The student "+student[i]+" is "+calification[1]);
             }else{
                 System.out.println("The student "+student[i]+" is "+calification[0]);
             }
            
        }
      
    
    }
        
}
    

