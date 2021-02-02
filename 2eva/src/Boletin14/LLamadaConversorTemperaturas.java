/*	BOLETIN 14
Nunha empresa utilizan uns aparellos que traballan a temperaturas expresadas en graos Fherenheit e graos reamur .Para axudalos, decidimos  facer unha aplicación “ conversor de temperaturas”.
De xeito que unha persoa teclea a temperatura, en graos centigrados, e o conversor devolvenos a temperatura en graos Fharenheit e Reamur. Pero o aparello non pode traballar con temperaturas < 80 ºC .
    Crea unha aplicación cas seguintes clases :
•	A clase TemperaturaErradaExcepcion  que represente a nosa excepción ( recorda que a temperatura non pode ser < 80 ºC )
•	A clase ConversorTemperaturas . Nesta clase :
1-	Declara unha constante  co valor 80 ºC
2-	Un método centigradosAFharenheit  que reciba unha temperatura, tipo float, en graos centígrados e calcula e retorne o valor correspondente en graos fharenheit 

     º Fharenheir = 9,0 / 5, 0 * centígrados + 32, 4

   Este método non tratará a excepción ( TemperaturaErradaExcepcion ), e, se a temperatura é < 80 º centígrados  lanzará a excepción que será capturada e tratada na clase principal . 

3-Un método centígradosAReamur  que reciba unha temperatura, tipo float, en graos centígrados e calcula e non retorne o valor correspondente en graos Reamur .

     º Reamur = 4,0 / 5,0 * centígrados 

   Este método non tratara a excepción . A lanzará ao método de chamada
*/
package Boletin14;

import javax.swing.JOptionPane;
/**
 * @author cambes
 */
public class LLamadaConversorTemperaturas {

    public static void main(String[] args) {
      float respuesta;
           
        ConversorTemperaturas  Temp1 = new ConversorTemperaturas();
        ConversorTemperaturas Temp2 = new ConversorTemperaturas();
        
        //ya que en el primer metodo no se captura la excepccion hay que hacerlo desde aqui
        
        //use do while para inicializar el programa tantas veces como se quiera sin tener que ejecutarlo
        do {            
    
        
        try {
             float temp,temp2;  
                            
                  temp=Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en grados centrigados para comvertir a Farenheit"));
               //llamo al metodo pasando la temperatura     
            System.out.println("Los grados centigrados "+temp+ " en faranheit son "+  Temp1.centigrAFarenh(temp)+" F");
               
                              
            temp2=Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en grados centrigados para convertir a REamur"));
            //llamo al metodo pasando la temperatura
                
                    Temp2.centiAReamur(temp2);
                
                       
                 
            } catch (TemperaturaErradaExcepcion e) {
                    System.out.println(e.getMessage());
                   }
      
         //con esto saco si =0   no = 1 y asi se realizara el bucle o no
               respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres volver a ejecutar el conversor de temperatura?", "Elige tu opcion", JOptionPane.YES_NO_OPTION,3);
        
        } while (respuesta ==0);

    
    }
    
}
