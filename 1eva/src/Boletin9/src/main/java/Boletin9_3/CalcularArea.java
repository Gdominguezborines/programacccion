/**
 * 3- Implementa un programa que calcule o área dun rectángulo cuxa base
 * e altura pides por teclado . Asegurate que estos valores sexan positivos
 * , para eso valida os datos 
 */
package Boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author cambes
 */
public class CalcularArea {
    
    // declaro variables
    private int area;
    private int altura;
    private int base;
    
    
    //declaro metodo para pedir datos de altura y base
    
    public int pedirAltura(){
        altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la altura "));
        return altura;
    }
    public int pedirBase(){
         base=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la base "));
         return base;
    }
    
    
    // declaro metodo comprovar
    public void comprobar( ){
    
        do { altura=pedirAltura();
             base=pedirBase();
            if(altura<=0 || base<=0){
                JOptionPane.showMessageDialog(null,"Los datos introducidos tienen que ser mayor que cero" );
             
             }
             
    }
  while(altura<=0 || base<=0);
        area=altura*base;
        JOptionPane.showMessageDialog(null,"El area del rectangulo es de "+area);
        
  }      
}
