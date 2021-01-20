package boletin7_3;

import javax.swing.JOptionPane;

/**
 * @author cambes
 * Teclear un número e sacar por consola o signo “ + “ se o nº é positivo,
 * o signo “ –“ se é negativo e “ 0 “ se é cero .
 */
public class PositivoNegativoCero {
    
    /**
     * Creo variable numero
     */
    private int numero;

   
   /**
    * Creo construyctor por defecto y parametrizado
    */ 
    
     public PositivoNegativoCero() {
    }

    public PositivoNegativoCero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Creo el metodo para saber si es Positivo negativo o cero
     */
    
    public void comprovar(){
        if (numero < 0)
                JOptionPane.showMessageDialog(null, "El "+numero+" es -");
             
        else if (numero > 0)
                JOptionPane.showMessageDialog(null,"El "+numero+" es +");
        else
            JOptionPane.showMessageDialog(null,"El "+numero+" es 0");
    }
        
}
