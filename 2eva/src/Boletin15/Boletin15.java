
package Boletin15;

/**
 *
 * @author Cambes
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int[]numeros ={(int)(Math.random()*(50-1)+1)};
        
        Metodos obx= new Metodos();
        
        obx.amosarArray(numeros);     //1  ejer
        obx.notasArray();                  //2  ejer
        obx.nomeArray();                   //3  ejer

        validaDni obx3 = new validaDni();
        obx3.validaDNI();                   //4 ejer valida
    }
    
}
