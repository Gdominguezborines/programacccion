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
public class boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //pasarle dos numeros y que realioce la suma la resta multiplicaccion y division
    
    
    double numero1;
    double numero2;
    double suma;
    double resta;
    double multiplicaccion;
    double division;
    
    
    Scanner entrada2= new Scanner(System.in);     /* funcion que solicitanumero hay que cambiar 
                                                  numero a variablke entarda en mismo codigo 
                                                no puede estar dos veces el mismo nombre de variable*/
    
         System.out.println("ingrese el primer numero ="); // solicita entrada de numero
        numero1=entrada2.nextDouble();                       // almacena dato metido en variable
     
        System.out.println("ingrese el primer numero =");   // solicita entrada de numero
        numero2=entrada2.nextDouble();                       // almacena dato metido en variable
    
    
    suma=numero1+numero2;
    resta=numero1-numero2;
    multiplicaccion=numero1*numero2;
    division=numero1/numero2;
    
        System.out.println(" La suma es ="+suma+"\n La resta es ="+resta+"\n La multiplicaccion es ="+multiplicaccion+"\n La division es ="+division+"\n");
    
        
    }
    
}
