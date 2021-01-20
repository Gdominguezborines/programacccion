/**
 * Codifica un programa que  Lea o soldo de cada un dos traballadores
 * dunha empresa e obteña o número deles que ganan entre 1000 e 1750 €, 
 * ámbolos dous incluidos e, a porcentaje de traballadores que ganan 
 * menos de 1000 €.Tendo en conta que non se coñece con antelación o 
 * numero de traballadores da empresa e non se admiten os soldos negativos.
 * ( utiliza como condidión de fin un soldo 0 ). 
 */
package Boletin9_5;

import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class Trabajadores {
    
 
    private int Sueldo=0;

    
    public int sueldo(){
        Sueldo=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce sueldo"));
        return Sueldo;
    }
    
    
    public void comprovacion(){
          int NumeroDeSueldosAltos=0;
          int NumeroDeSueldosBajos=0; 
       
          int NumTrabajadores=0;
         
        
        do{  
         
            Sueldo=sueldo();
            
            
          //  System.out.println(Sueldo);
            if(Sueldo>0){
               NumTrabajadores++;
              //  System.out.println(NumTrabajadores);
                   
                if(Sueldo>=1000  &&Sueldo<=1750){
                    NumeroDeSueldosAltos++;
                }
                else if (Sueldo<1000 && Sueldo>0){
                    NumeroDeSueldosBajos++;
                }
                
             }
   
        }while(Sueldo !=0);
              
        
     int a=(100*NumeroDeSueldosBajos)/NumTrabajadores;
      
               System.out.println("La cantidad de trabajadores son "+NumTrabajadores+" y el numero de trabajadores con sueldo alto son de "+NumeroDeSueldosAltos+ " Y el porcentaje de sueldos bajos son del "+a+" %" );
  
         
     //  JOptionPane.showInputDialog(""+NumeroDeSueldosAltos+" mas "+NumeroDeSueldosBajos);
             
    }
    
}
