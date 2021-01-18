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
public class boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*	Realiza o ordinograma  correspondente a un programa que saque
        por pantalla a porcentaxe descontada nunha compra. Introducindo, 
        por teclado, o prezo da tarifa e o prezo pagado.
      Fai un proxecto, de nome boletin2_1, para executar o programa */


    float tarifa,descuento,pagado,calculo;
    

          Scanner entrada= new Scanner(System.in);                // funcion que solicitanumero

             System.out.println("ingrese el importe pagado =");    // solicita entrada de numero
             pagado=entrada.nextFloat();                             // almacena dato metido en variable
        
             System.out.println("ingrese el importe tarifa =");    // solicita entrada de numero
             tarifa=entrada.nextFloat();                             // almacena dato metido en variable
        
             calculo=(pagado*100)/tarifa;
             descuento=100-calculo;
             
             System.out.println("El descuento es de ="+descuento);
             

    
    
    
    }
    
}
