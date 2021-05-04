package com.gabriel;

/**
 * @author cambes
 */

public abstract class Barco {
    
    public int eslora;
    public String matricula;

    public Barco() {
    }

    public Barco(int eslora, String matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

   

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

  
    

    @Override
    public String toString() {
        return "eslora= " + eslora +" matricula= "+ matricula ;
    }
    
    
    
    
    
    public abstract int modulo();
}
