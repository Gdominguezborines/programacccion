
package boletin3;

import java.util.Scanner;

/**
 *
 * @author cambes
 */
public class boletin3_4 {

   
    
    public static void main(String[] args){
        /* Realiza un algoritmo e codifica o programa correspondente 
            que lea, dende o teclado, unha cantidade enteira en euros e 
            amose , por pantalla, o seu desglose en billetes de 100, 20, 5
            e moedas de 1 € .  */
    
    
        int b100, b20, b5, m1, resto=0;
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresa dinero que quieras desglosar= ");
        resto=ingreso.nextInt();
              
        
        // calcula billetes de 100
        b100=resto/100;  // divide la cantidad pasada 
        resto=resto-(b100*100);  //resta la cantidad anterior que son los billetes de 100 y deja el resto
    
        b20=resto/20;
        resto=resto-(b20*20);
        
        b5=resto/5;
        resto=resto-(b5*5);
    
        m1=resto/1;
        resto=resto-(m1*1);
        
        System.out.println();
       
     
        
        if(b100 > 0){
        System.out.println("El numero de billetes de 100E es de "+b100);
                        }
        
        if(b20 > 0){
        System.out.println("El numero de billetes de 20E es de  "+b20);
                         }
        
        if(b5 > 0){
        System.out.println("El numero de billetes de 5E es de   "+b5);
                         }
        if(m1 > 0){
        System.out.println("El numero de monedas de 1E es de    "+m1);
                         }
                       
        
        
    }
 
}
  
