/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_7;

import javax.swing.JOptionPane;

/**
 *
 * @author cambes
 */
public class LlamadasAFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        figuras  obx= new figuras();
        
        
    String respuesta;
    
    do{
        respuesta=JOptionPane.showInputDialog("Menu \nTeclea una opcion:\n1 =Area Triangulo \n2 =Area Cuadrado \n3 = Area Circulo");   
            
            
        switch(respuesta){
            case "1":obx.areaTriangulo();
                break;
            case "2": obx.areaCuadrado();
                break;
            case"3": obx.areaCirculo();
                break;
                
            default: JOptionPane.showMessageDialog(null,"¡¡Opcion incorrecta!! Selecione opccion 1,2,3.");
            
              }
       }   
            
    while(respuesta!="Rematar");
          
    
    }
    
}
