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
public class boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // programa que lea distancia en millas y la de en metros
    
       
    
    double metros;
    final double millasvalor=0.000621371;
    double resultado2;
        
        

     Scanner entrada3= new Scanner(System.in);                // funcion que solicitanumero
        
                
        System.out.println("ingrese los metros =");    // solicita entrada de numero
        metros=entrada3.nextDouble();                             // almacena dato metido en variable
         
        resultado2=(metros*millasvalor);
        System.out.println("La distancia de ="+metros+"metros en millas es de ="+resultado2);
       
    
        
    }
    
}
