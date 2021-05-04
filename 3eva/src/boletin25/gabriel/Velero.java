package com.gabriel;

/**
 * @author cambes
 */
public class Velero extends Barco {
   int Mastiles = 1;

    public Velero() {
    }

    public Velero(int Mastiles,int eslora,String matricula){

        super(eslora,matricula);
        this.Mastiles=Mastiles;

    }

    public int getMastiles() {
        return Mastiles;
    }

    public void setMastiles(int Mastiles) {
        this.Mastiles = Mastiles;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+" ,Mastiles= " + Mastiles ;
    }

 
    @Override
    public int modulo() {

        int modulo = 10*eslora;

        return modulo;

    }
}
