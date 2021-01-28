package EjArrayObjetos;

import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class EjArrayObjetos {

  
    public static void main(String[] args) {
       
        Metodos obx = new Metodos();
       
        
  

  
  
        int nunelementos=Integer.parseInt(JOptionPane.showInputDialog("Teclea numero de elementos"));
  Alumno[]lista=new Alumno[nunelementos];   
  lista[0]=new Alumno("aaa",3,"fdsa");
 int a=1;
        do {            
          
     String[] botones = {"crear Lista", "Enseñar lista", "salir"};
      
   int ventana = JOptionPane.showOptionDialog(null,"Pulsa un boton para realizar laoperacion deseada:","Elige tu opcion:",0,3, null,botones, botones[0]);
                //System.out.println(ventana);
        switch (ventana) {
            case 0:
               lista= obx.creaArray(nunelementos);
               
                break;
            case 1:
                obx.amosar(lista);
                break;
            case 2:
                a=0;
              
           
             }
         
        
            } while (a !=0);       
    }
        
    }
    
    

