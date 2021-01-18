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
public class boletin3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Fai o algoritmo e programa  que calcule o soldo bruto e 
        líquido, a percibir, por unha persoa .Sabendo que o soldo total 
                inclue os seguintes conceptos :

                    Soldo fixo. 
                    Comisión : 5% sobre importe total de vendas
                    Quilometraxe : 2 € por km
                    Dietas : 30 € por día de desprazamento .
        Para calcular o soldo líquido debemos descontarlle ao soldo bruto :
                    I.R.P.F. = 18 % do soldo total .
                    Retención a seguridade social : 36 € .      */
        
        float soldoFixo, soldoBruto, soldoLiquido, kms, Ventas, diasFuera, 
                quilometraxe=2, dietasdia=30;
        double comision=0.05, irpf=0.18;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce soldo= ");
        soldoFixo=entrada.nextFloat();
        
        
        System.out.println("Introduce km recorridos= ");
        kms=entrada.nextFloat();
        
        System.out.println("Numero total de ventas= ");
        Ventas=entrada.nextFloat();
        
    
        System.out.println("Numero total de dias fuera= ");
        diasFuera=entrada.nextFloat();
        
         
        soldoBruto =(float) (soldoFixo+(comision*Ventas)+(quilometraxe*kms)
                +(dietasdia*diasFuera));
               
        soldoLiquido = (float) (soldoBruto-(irpf*soldoBruto)-36);
        
        System.out.println("Tu sueldo bruto es de  "+soldoBruto+" Euros\ny "
                + "tu sueldo neto es de "+soldoLiquido+"Euros"); 
    
    
    
    
    
    
    
    
    
    
    }
    
}
