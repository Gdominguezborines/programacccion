/**
 * 1. Calcula a cantidade de números negativos, positivos e, ceros 
 * que hai nun grupo de 10 numeros . 
 */
package Boletin9_1;

import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class Contador {
    
    public void  Conta(){
        
        int num,cero=0, Numn=0,Nump=0;
       
        for (int i=0; i<10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero a comprovar"));
           if(num>=0)
               if(num==0)
                   cero++;
               else 
                   Nump=Nump+1;
           else
               Numn=Numn+1;
         }
        JOptionPane.showMessageDialog(null,"La cantidad de positivos es de= "+Nump+", la cantidad de valor cero es= "+cero+ " y la cantidad denegativo es= "+Numn+".");
    }
    
    
    
    
    
    
    
    
    
    
}
