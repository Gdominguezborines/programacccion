package com.gabriel;

/**
 * @author cambes
 */
public class EmbarcacionDeportiva extends Barco{

    
    private int potencia;
    
    
    public EmbarcacionDeportiva() {
    }

    public EmbarcacionDeportiva(int potencia, int eslora, String matricula) {
        super(eslora, matricula);
        this.potencia = potencia;
    }
     

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }



    @Override
    public String toString() {
        return super.toString() + " ,potencia =" + potencia;
    }
    
    
    @Override
    public int modulo() {

        return 10 *eslora;
    }
    
       
}
