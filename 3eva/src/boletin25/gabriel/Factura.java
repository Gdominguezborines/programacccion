package com.gabriel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class Factura {
      
    
    public void Factura(){
    
      ArrayList<Barco>  listaB = new ArrayList<>();
         
        EmbarcacionDeportiva obxED = new EmbarcacionDeportiva(250,12,"Pepon");
        Velero obxVe =new Velero(2,15,"El mejor");
        Yate obxYa = new Yate(5000,5,22,"Grandioso");
        
        listaB.add(obxED);
        listaB.add(obxVe);
        listaB.add(obxYa);
        
    
     
        int dias=0,precio=0,eslora=0;
        String matricula="";
         String[] botones = {"Embarcacion Deportiva", "Velero", "Yate"};
    
                int ventana = JOptionPane.showOptionDialog(null,"Pulsa un boton para selecionar tu embarcaccion:","Elige tu opcion:",0,3, null,botones, botones[0]);
     
            if(ventana == 0){ 
                     dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias que quieres alquilar"));
                     precio=((obxED.modulo()*dias)+(2*obxED.getPotencia()));
                     matricula=obxED.getMatricula();
                     eslora=obxED.getEslora();
                   
                }
                else if(ventana == 1){
                     dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias que quieres alquilar"));
                     precio=((obxVe.modulo()*dias)+(obxVe.getMastiles()*8));
                     matricula=obxVe.getMatricula();
                     eslora=obxVe.getEslora();
                }
                else if(ventana == 2){
                     dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias que quieres alquilar"));
                     precio=((obxYa.modulo()*dias)+(2*obxYa.getPotencia()+(25*obxYa.getCamarotes())));
                     matricula=obxYa.getMatricula();
                     eslora=obxYa.getEslora();
                }
            
            
            
            
            JOptionPane.showMessageDialog(null,"Factura: " + "\n matricula: "+ matricula +"\n eslora: "+ eslora +" Metros"+ "\n precio: " + precio +" Euros" );
        
    }
    
       
}
