
package Boletin14;

/**
 * @author cambes
 */

//Al poner (extends Exception le estoy dicienbdo que es una clase hija de exception asi que ya por eso sera una excepcionm
public class TemperaturaErradaExcepcion extends Exception {
    
    public  TemperaturaErradaExcepcion(String mensaje){
        //con super inicializo los atributos de la clase padre
        super("Se a introducido una temperatura inferior a 80º "+(mensaje));
    }
    
    
}
