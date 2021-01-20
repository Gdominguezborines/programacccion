package boletin7_4;

import javax.swing.JOptionPane;

/**
 * @author cambes
 * Coñecidos o nome e o peso de dúas persoas, queremos escribir os
 * datos da que pesa máis e, a diferenza de peso entre elas 
 */
public class ComprovarPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desde aqui llamo a ComprovarPeso para saber quien pesa mas
        
        String nombre;
        Float peso;
        
        
        nombre=JOptionPane.showInputDialog("Escribe tu nombre");
        peso=Float.parseFloat(JOptionPane.showInputDialog("Escribe tu peso"));
    
   
        bascula persona1 =new bascula(nombre,peso);
       
        
        
        nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        peso=Float.parseFloat(JOptionPane.showInputDialog("Introduce tu peso"));
       
        bascula persona2 =new bascula(nombre,peso);
       
        persona1.ComprovarPeso(persona1, persona2);
    
    
    
    
    
    
    }
    
}
