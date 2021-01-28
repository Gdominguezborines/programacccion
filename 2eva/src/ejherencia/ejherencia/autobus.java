/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejherencia.ejherencia;

/**
 *
 * @author cambes
 */
public class autobus extends vehiculo{

private  int nunPlazas;

// al ser clase descenciente poner super o no en el por defecto es lo mismo ya que va abuscar el de la superclase
    public autobus() {
    super();
    }

    public autobus(int nunPlazas, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.nunPlazas = nunPlazas;
    }

    public int getNunPlazas() {
        return nunPlazas;
    }

    public void setNunPlazas(int nunPlazas) {
        this.nunPlazas = nunPlazas;
    }

    @Override
    public String toString() {
        return super.toString()+ " nunPlazas= " + nunPlazas  ;
    }







    
}
