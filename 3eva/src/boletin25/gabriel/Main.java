package com.gabriel;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * @author cambes
 */
public class Main {
   
        public static void main(String[] args) {
        
        
     Factura obx =new Factura();
           
       obx.Factura();
        int dias;
         String[] botones = {"Embarcacion Deportiva", "Velero", "Yate"};
    
                int ventana = JOptionPane.showOptionDialog(null,"Pulsa un boton para selecionar tu embarcaccion:","Elige tu opcion:",0,3, null,botones, botones[0]);
     
            if(ventana == 0){ 
                     dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias que quieres alquilar"));
                     
                }
                else if(ventana == 1){
                     dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias que quieres alquilar"));
               
                }
                else if(ventana == 2){
                     dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias que quieres alquilar"));
                
                }
  
        }
            
}
