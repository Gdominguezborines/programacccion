package ejherencia.ejherencia;

/**
 * @author cambes
 */
public class taxi extends vehiculo{
    
    private String numLicencia;

    public taxi() {
    }

    public taxi(String numLicencia, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numLicencia = numLicencia;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    @Override
    public String toString() {
        return  super.toString()+ "numLicencia=" + numLicencia ;
    
    
    }
// muestra la superclase con super y esta clase con this
/*
public void amosar(){
    System.out.println(super.toString()+this.toString());
}
  */  
    
    
            
            
    
    
    
}
