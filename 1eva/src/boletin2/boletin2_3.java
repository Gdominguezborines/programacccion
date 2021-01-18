package boletin2;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author cambes
 */
public class boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
         //Algoritmo que cambia de euros a dolares    
    
    double euros;
    double valordolar=1.18;
    double resultado;
        
        
    Scanner entrada= new Scanner(System.in);                // funcion que solicitanumero
        
                
        System.out.println("ingrese el importe en euros =");    // solicita entrada de numero
        euros=entrada.nextDouble();                             // almacena dato metido en variable
        
        resultado=(euros*valordolar);
        System.out.println("La cantidda de ="+euros+"E en dolares son ="+resultado+"$\n");
       
        
    }
    
}
