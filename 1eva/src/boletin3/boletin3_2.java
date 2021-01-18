/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

import java.util.Scanner;

/**
 *
 * @author cambes
 */
public class boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Realiza o ordinograma e,despois codifica un programa que representa 
            un algoritmo, que reciba como dato de entrada o valor dunha 
            temperatura expresada en graos centígrados e calcule o seu 
            equivalente en graos Fahrenheit e graos Kelvin. */
    
    float tempc;               // declaro variables
    float tempf=32;
    double tempk=273.15;
    double resultadof;
    double resultadok;
    
    Scanner entrada = new Scanner(System.in);                        // escaneo los datos introducidos 
    
            System.out.println("introduce temperatura en grados celsius= ");  // pide los datos
                tempc=entrada.nextFloat();                                     // meto los datos en la variable tempc
                
                 resultadof=tempc*tempf;                                        //  hgao las operacciones oportunas
                 resultadok=tempc*tempk;
                 
                 System.out.println("La temperatura de "+tempc+"grados Cº\nen "         // saco por pantalla los datos
                 +"grados fahrenheit es de "+resultadof+"°F\ny en grados kelvin es de "+resultadok+" K");
                
           
    
    }
    
}
