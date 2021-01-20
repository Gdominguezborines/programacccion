package boletin7_4;

import javax.swing.JOptionPane;

/**
 * @author cambes
 * Coñecidos o nome e o peso de dúas persoas, queremos escribir os
 * datos da que pesa máis e, a diferenza de peso entre elas 
 */
public class bascula {
    
    //creo variable nombre y masa
    
    private String nombre;
    private float masa;
 
    /**
     * creo constructor por defecto y parametrizado
     */
    
       public bascula() {
    }

    public bascula(String nombre, float masa) {
        this.nombre = nombre;
        this.masa = masa;
    }

    /**
     * 
     * @return  creo metodo  para retornar los valores de nombre y masa
     */
    public String getNombre() {
        return nombre;
    }

    public float getMasa() {
        return masa;
    }

    
    
    /**
     * creo metodo  para comprovar quien pesa mas 
     */
    
    public void ComprovarPeso(bascula persona1,bascula persona2){
        if(persona1.getMasa() == persona2.getMasa())
           JOptionPane.showMessageDialog(null,persona1.getNombre()+" Pesa lo mismo que "+persona2.getNombre());
    
        else if (persona1.getMasa()>persona2.getMasa())
           JOptionPane.showMessageDialog(null,persona1.getNombre()+" pesa mas que "+persona2.getNombre()+" con una diferencia de "+(persona1.getMasa()-persona2.getMasa())+"kg");
    
        else
           JOptionPane.showMessageDialog(null,persona2.getNombre()+" pesa mas que "+persona1.getNombre()+" con una diferencia de "+(persona2.getMasa()-persona1.getMasa())+"kg");
}
}