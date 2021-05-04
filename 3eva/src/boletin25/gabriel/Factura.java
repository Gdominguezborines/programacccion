package com.gabriel;

import java.util.ArrayList;

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
        
        System.out.println(listaB);
    }
    
       
}
