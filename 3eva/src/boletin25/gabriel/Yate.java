package com.gabriel;

/**
 * @author cambes
 */
public class Yate extends Barco {
    private int potencia ;
    private int Camarotes ;

    public Yate() {
    }

    public Yate(int potencia, int Camarotes, int eslora, String matricula) {
        super(eslora, matricula);
        this.potencia = potencia;
        this.Camarotes = Camarotes;
    }

 

    public int getPotencia() {
        return potencia;
    }

    public int getCamarotes() {
        return Camarotes;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setNºCamarotes(int Camarotes) {
        this.Camarotes = Camarotes;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + " ,potencia= " + potencia + " ,Camarotes= " + Camarotes;
    }

    @Override
    public int modulo() {

        int modulo = 10*eslora;

        return modulo;
    }
}
